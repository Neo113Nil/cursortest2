package xsna;

import com.ironsource.X3;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class nbn implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final b q = new b();
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final long g;
    public final int h;
    public BufferedWriter j;
    public int l;
    public long i = 0;
    public final LinkedHashMap<String, d> k = new LinkedHashMap<>(0, 0.75f, true);
    public long m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final a o = new a();
    public final int f = 1;

    /* compiled from: DiskLruCache.java */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (nbn.this) {
                try {
                    nbn nbnVar = nbn.this;
                    if (nbnVar.j == null) {
                        return null;
                    }
                    nbnVar.v();
                    if (nbn.this.m()) {
                        nbn.this.r();
                        nbn.this.l = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.c ? null : new boolean[nbn.this.h];
        }

        public final void a() throws IOException {
            nbn.b(nbn.this, this, false);
        }

        public final void b() throws IOException {
            boolean z = this.c;
            nbn nbnVar = nbn.this;
            if (!z) {
                nbn.b(nbnVar, this, true);
            } else {
                nbn.b(nbnVar, this, false);
                nbnVar.s(this.a.a);
            }
        }

        public final OutputStream c(int i) throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i >= 0) {
                nbn nbnVar = nbn.this;
                if (i < nbnVar.h) {
                    synchronized (nbnVar) {
                        try {
                            d dVar = this.a;
                            if (dVar.d != this) {
                                throw new IllegalStateException();
                            }
                            if (!dVar.c) {
                                this.b[i] = true;
                            }
                            File b = dVar.b(i);
                            try {
                                fileOutputStream = new FileOutputStream(b);
                            } catch (FileNotFoundException unused) {
                                nbn.this.b.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(b);
                                } catch (FileNotFoundException unused2) {
                                    return nbn.q;
                                }
                            }
                            aVar = new a(fileOutputStream);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return aVar;
                }
            }
            StringBuilder b2 = ji.b(i, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            b2.append(nbn.this.h);
            throw new IllegalArgumentException(b2.toString());
        }

        /* compiled from: DiskLruCache.java */
        /* loaded from: classes18.dex */
        public class a extends FilterOutputStream {
            public a(FileOutputStream fileOutputStream) {
                super(fileOutputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class d {
        public final String a;
        public final long[] b;
        public boolean c;
        public c d;
        public long e;

        public d(String str) {
            this.a = str;
            this.b = new long[nbn.this.h];
        }

        public final File a(int i) {
            return new File(nbn.this.b, this.a + "." + i);
        }

        public final File b(int i) {
            return new File(nbn.this.b, this.a + "." + i + ".tmp");
        }

        public final String c() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e implements Closeable {
        public final String b;
        public final long c;
        public final File[] d;
        public final InputStream[] e;

        public e(String str, long j, File[] fileArr, InputStream[] inputStreamArr) {
            this.b = str;
            this.c = j;
            this.d = fileArr;
            this.e = inputStreamArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.e) {
                Charset charset = v2r0.a;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public nbn(File file, int i, long j) {
        this.b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.h = i;
        this.g = j;
    }

    public static void b(nbn nbnVar, c cVar, boolean z) {
        synchronized (nbnVar) {
            d dVar = cVar.a;
            if (dVar.d != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.c) {
                for (int i = 0; i < nbnVar.h; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.b(i).exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < nbnVar.h; i2++) {
                File b2 = dVar.b(i2);
                if (!z) {
                    c(b2);
                } else if (b2.exists()) {
                    File a2 = dVar.a(i2);
                    b2.renameTo(a2);
                    long j = dVar.b[i2];
                    long length = a2.length();
                    dVar.b[i2] = length;
                    nbnVar.i = (nbnVar.i - j) + length;
                }
            }
            nbnVar.l++;
            dVar.d = null;
            if (dVar.c || z) {
                dVar.c = true;
                nbnVar.j.write("CLEAN " + dVar.a + dVar.c() + '\n');
                if (z) {
                    long j2 = nbnVar.m;
                    nbnVar.m = 1 + j2;
                    dVar.e = j2;
                }
            } else {
                nbnVar.k.remove(dVar.a);
                nbnVar.j.write("REMOVE " + dVar.a + '\n');
            }
            nbnVar.j.flush();
            if (nbnVar.i > nbnVar.g || nbnVar.m()) {
                nbnVar.n.submit(nbnVar.o);
            }
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static nbn n(File file, int i, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                t(file2, file3, false);
            }
        }
        nbn nbnVar = new nbn(file, i, j);
        if (nbnVar.c.exists()) {
            try {
                nbnVar.p();
                nbnVar.o();
                return nbnVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                nbnVar.close();
                v2r0.a(nbnVar.b);
            }
        }
        file.mkdirs();
        nbn nbnVar2 = new nbn(file, i, j);
        nbnVar2.r();
        return nbnVar2;
    }

    public static void t(File file, File file2, boolean z) throws IOException {
        if (z) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void w(String str) {
        if (!p.matcher(str).matches()) {
            throw new IllegalArgumentException(zr.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
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
                c cVar = ((d) it.next()).d;
                if (cVar != null) {
                    cVar.a();
                }
            }
            v();
            this.j.close();
            this.j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized c h(long j, String str) throws IOException {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
        w(str);
        d dVar = this.k.get(str);
        if (j != -1 && (dVar == null || dVar.e != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(str);
            this.k.put(str, dVar);
        } else if (dVar.d != null) {
            return null;
        }
        c cVar = new c(dVar);
        dVar.d = cVar;
        this.j.write("DIRTY " + str + '\n');
        this.j.flush();
        return cVar;
    }

    public final synchronized e i(String str) throws IOException {
        Throwable th;
        InputStream inputStream;
        try {
            try {
                if (this.j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                w(str);
                d dVar = this.k.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.c) {
                    return null;
                }
                int i = this.h;
                File[] fileArr = new File[i];
                InputStream[] inputStreamArr = new InputStream[i];
                for (int i2 = 0; i2 < this.h; i2++) {
                    try {
                        try {
                            fileArr[i2] = dVar.a(i2);
                            inputStreamArr[i2] = new FileInputStream(dVar.a(i2));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i3 = 0; i3 < this.h && (inputStream = inputStreamArr[i3]) != null; i3++) {
                            Charset charset = v2r0.a;
                            try {
                                inputStream.close();
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    }
                }
                this.l++;
                this.j.append((CharSequence) ("READ " + str + '\n'));
                if (m()) {
                    this.n.submit(this.o);
                }
                return new e(str, dVar.e, fileArr, inputStreamArr);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final boolean m() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public final void o() throws IOException {
        c(this.d);
        Iterator<d> it = this.k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.d;
            int i = this.h;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.i += next.b[i2];
                    i2++;
                }
            } else {
                next.d = null;
                while (i2 < i) {
                    c(next.a(i2));
                    c(next.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void p() throws IOException {
        File file = this.c;
        qpm0 qpm0Var = new qpm0(new FileInputStream(file), v2r0.a);
        try {
            String m = qpm0Var.m();
            String m2 = qpm0Var.m();
            String m3 = qpm0Var.m();
            String m4 = qpm0Var.m();
            String m5 = qpm0Var.m();
            if (!"libcore.io.DiskLruCache".equals(m) || !"1".equals(m2) || !Integer.toString(this.f).equals(m3) || !Integer.toString(this.h).equals(m4) || !"".equals(m5)) {
                throw new IOException("unexpected journal header: [" + m + ", " + m2 + ", " + m4 + ", " + m5 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    q(qpm0Var.m());
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.k.size();
                    if (qpm0Var.f == -1) {
                        r();
                    } else {
                        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), v2r0.a));
                    }
                    try {
                        qpm0Var.close();
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
                qpm0Var.close();
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
                dVar.d = new c(dVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.c = true;
        dVar.d = null;
        if (split.length != nbn.this.h) {
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
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), v2r0.a));
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
                    if (dVar.d != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.c() + '\n');
                    }
                }
                bufferedWriter2.close();
                if (this.c.exists()) {
                    t(this.c, this.e, true);
                }
                t(this.d, this.c, false);
                this.e.delete();
                this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), v2r0.a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void s(String str) throws IOException {
        try {
            if (this.j == null) {
                throw new IllegalStateException("cache is closed");
            }
            w(str);
            d dVar = this.k.get(str);
            if (dVar != null && dVar.d == null) {
                for (int i = 0; i < this.h; i++) {
                    File a2 = dVar.a(i);
                    if (a2.exists() && !a2.delete()) {
                        throw new IOException("failed to delete " + a2);
                    }
                    long j = this.i;
                    long[] jArr = dVar.b;
                    this.i = j - jArr[i];
                    jArr[i] = 0;
                }
                this.l++;
                this.j.append((CharSequence) ("REMOVE " + str + '\n'));
                this.k.remove(str);
                if (m()) {
                    this.n.submit(this.o);
                }
            }
        } finally {
        }
    }

    public final void v() throws IOException {
        while (this.i > this.g) {
            s(this.k.entrySet().iterator().next().getKey());
        }
    }

    /* compiled from: DiskLruCache.java */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    }
}
