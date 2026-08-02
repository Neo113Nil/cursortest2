package xsna;

import android.annotation.TargetApi;
import android.os.StrictMode;
import com.ironsource.X3;
import io.jsonwebtoken.JwtParser;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: DiskLruCache.java */
/* loaded from: classes12.dex */
public final class ibn implements Closeable {
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final long g;
    public BufferedWriter j;
    public int l;
    public long i = 0;
    public final LinkedHashMap<String, d> k = new LinkedHashMap<>(0, 0.75f, true);
    public long m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a o = new a();
    public final int f = 1;
    public final int h = 1;

    /* compiled from: DiskLruCache.java */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (ibn.this) {
                try {
                    ibn ibnVar = ibn.this;
                    if (ibnVar.j == null) {
                        return null;
                    }
                    ibnVar.t();
                    if (ibn.this.m()) {
                        ibn.this.r();
                        ibn.this.l = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[ibn.this.h];
        }

        public final void a() throws IOException {
            ibn.b(ibn.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (ibn.this) {
                try {
                    d dVar = this.a;
                    if (dVar.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    ibn.this.b.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = ibn.this.h;
            File file = ibn.this.b;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public ibn(File file, long j) {
        this.b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.g = j;
    }

    public static void b(ibn ibnVar, c cVar, boolean z) throws IOException {
        synchronized (ibnVar) {
            d dVar = cVar.a;
            if (dVar.f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.e) {
                for (int i = 0; i < ibnVar.h; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < ibnVar.h; i2++) {
                File file = dVar.d[i2];
                if (!z) {
                    h(file);
                } else if (file.exists()) {
                    File file2 = dVar.c[i2];
                    file.renameTo(file2);
                    long j = dVar.b[i2];
                    long length = file2.length();
                    dVar.b[i2] = length;
                    ibnVar.i = (ibnVar.i - j) + length;
                }
            }
            ibnVar.l++;
            dVar.f = null;
            if (dVar.e || z) {
                dVar.e = true;
                ibnVar.j.append((CharSequence) "CLEAN");
                ibnVar.j.append(' ');
                ibnVar.j.append((CharSequence) dVar.a);
                ibnVar.j.append((CharSequence) dVar.a());
                ibnVar.j.append('\n');
                if (z) {
                    ibnVar.m++;
                }
            } else {
                ibnVar.k.remove(dVar.a);
                ibnVar.j.append((CharSequence) SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE);
                ibnVar.j.append(' ');
                ibnVar.j.append((CharSequence) dVar.a);
                ibnVar.j.append('\n');
            }
            j(ibnVar.j);
            if (ibnVar.i > ibnVar.g || ibnVar.m()) {
                ibnVar.n.submit(ibnVar.o);
            }
        }
    }

    @TargetApi(26)
    public static void c(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void h(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void j(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static ibn n(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                s(file2, file3, false);
            }
        }
        ibn ibnVar = new ibn(file, j);
        if (ibnVar.c.exists()) {
            try {
                ibnVar.p();
                ibnVar.o();
                return ibnVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                ibnVar.close();
                r2r0.a(ibnVar.b);
            }
        }
        file.mkdirs();
        ibn ibnVar2 = new ibn(file, j);
        ibnVar2.r();
        return ibnVar2;
    }

    public static void s(File file, File file2, boolean z) throws IOException {
        if (z) {
            h(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.j == null) {
                return;
            }
            Iterator it = new ArrayList(this.k.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            t();
            c(this.j);
            this.j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c i(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.k.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.k.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.j.append((CharSequence) "DIRTY");
                this.j.append(' ');
                this.j.append((CharSequence) str);
                this.j.append('\n');
                j(this.j);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e k(String str) throws IOException {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.l++;
        this.j.append((CharSequence) "READ");
        this.j.append(' ');
        this.j.append((CharSequence) str);
        this.j.append('\n');
        if (m()) {
            this.n.submit(this.o);
        }
        return new e(dVar.c);
    }

    public final boolean m() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public final void o() throws IOException {
        h(this.d);
        Iterator<d> it = this.k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.h;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.i += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    h(next.c[i2]);
                    h(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void p() throws IOException {
        File file = this.c;
        rpm0 rpm0Var = new rpm0(new FileInputStream(file), r2r0.a);
        try {
            String m = rpm0Var.m();
            String m2 = rpm0Var.m();
            String m3 = rpm0Var.m();
            String m4 = rpm0Var.m();
            String m5 = rpm0Var.m();
            if (!"libcore.io.DiskLruCache".equals(m) || !"1".equals(m2) || !Integer.toString(this.f).equals(m3) || !Integer.toString(this.h).equals(m4) || !"".equals(m5)) {
                throw new IOException("unexpected journal header: [" + m + ", " + m2 + ", " + m4 + ", " + m5 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    q(rpm0Var.m());
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.k.size();
                    if (rpm0Var.f == -1) {
                        r();
                    } else {
                        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), r2r0.a));
                    }
                    try {
                        rpm0Var.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                rpm0Var.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void q(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.k;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = linkedHashMap.get(substring);
        if (dVar == null) {
            dVar = new d(substring);
            linkedHashMap.put(substring, dVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.e = true;
        dVar.f = null;
        if (split.length != ibn.this.h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                dVar.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void r() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.j;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), r2r0.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.k.values()) {
                    if (dVar.f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.c.exists()) {
                    s(this.c, this.e, true);
                }
                s(this.d, this.c, false);
                this.e.delete();
                this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), r2r0.a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void t() throws IOException {
        while (this.i > this.g) {
            String key = this.k.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.j == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.k.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.h; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.i;
                            long[] jArr = dVar.b;
                            this.i = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.l++;
                        this.j.append((CharSequence) SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE);
                        this.j.append(' ');
                        this.j.append((CharSequence) key);
                        this.j.append('\n');
                        this.k.remove(key);
                        if (m()) {
                            this.n.submit(this.o);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
