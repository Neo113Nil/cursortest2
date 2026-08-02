package ru.mail.libverify.v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class a implements Closeable {
    static final Pattern o = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final OutputStream p = new b();
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private BufferedWriter i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, d> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> n = new CallableC2217a();
    private final int e = 1;
    private final int g = 1;
    private long f = 10311680;

    /* renamed from: ru.mail.libverify.v.a$a, reason: collision with other inner class name */
    public class CallableC2217a implements Callable<Void> {
        public CallableC2217a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.i == null) {
                        return null;
                    }
                    while (aVar.h > aVar.f) {
                        aVar.d((String) ((Map.Entry) aVar.j.entrySet().iterator().next()).getKey());
                    }
                    a aVar2 = a.this;
                    int i = aVar2.k;
                    if (i >= 2000 && i >= aVar2.j.size()) {
                        a.this.d();
                        a.this.k = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;
        private boolean d;

        /* renamed from: ru.mail.libverify.v.a$c$a, reason: collision with other inner class name */
        public class C2218a extends FilterOutputStream {
            public /* synthetic */ C2218a(c cVar, FileOutputStream fileOutputStream, int i) {
                this(fileOutputStream);
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

            private C2218a(FileOutputStream fileOutputStream) {
                super(fileOutputStream);
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

        public /* synthetic */ c(a aVar, d dVar, int i) {
            this(dVar);
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.c ? null : new boolean[a.this.g];
        }

        public final void a() {
            if (this.d) {
                return;
            }
            try {
                a.this.a(this, false);
            } catch (IOException unused) {
            }
        }

        public final void b() throws IOException {
            if (this.c) {
                a.this.a(this, false);
                a.this.d(this.a.a);
            } else {
                a.this.a(this, true);
            }
            this.d = true;
        }

        @NonNull
        public final OutputStream c() throws IOException {
            FileOutputStream fileOutputStream;
            C2218a c2218a;
            a aVar = a.this;
            if (aVar.g <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + a.this.g);
            }
            synchronized (aVar) {
                try {
                    d dVar = this.a;
                    if (dVar.d != this) {
                        throw new IllegalStateException();
                    }
                    int i = 0;
                    if (!dVar.c) {
                        this.b[0] = true;
                    }
                    File b = dVar.b(0);
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused) {
                        a.this.a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused2) {
                            return a.p;
                        }
                    }
                    c2218a = new C2218a(this, fileOutputStream, i);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c2218a;
        }
    }

    public final class d {
        private final String a;
        private final long[] b;
        private boolean c;
        private c d;

        public /* synthetic */ d(a aVar, String str, int i) {
            this(str);
        }

        private d(String str) {
            this.a = str;
            this.b = new long[a.this.g];
        }

        public final File a(int i) {
            return new File(a.this.a, this.a + "." + i);
        }

        public final File b(int i) {
            return new File(a.this.a, this.a + "." + i + ".tmp");
        }
    }

    public final class e implements Closeable {
        private final InputStream[] a;

        public /* synthetic */ e(InputStream[] inputStreamArr, int i) {
            this(inputStreamArr);
        }

        @NonNull
        public final InputStream a() {
            return this.a[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.a) {
                Charset charset = ru.mail.libverify.v.c.a;
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

        private e(InputStream[] inputStreamArr) {
            this.a = inputStreamArr;
        }
    }

    private a(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
    }

    @NonNull
    public static a a(@NonNull File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        a aVar = new a(file);
        if (aVar.b.exists()) {
            try {
                aVar.c();
                aVar.b();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.close();
                ru.mail.libverify.v.c.a(aVar.a);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file);
        aVar2.d();
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), ru.mail.libverify.v.c.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.j.values()) {
                    if (dVar.d != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(dVar.a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : dVar.b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.b.exists()) {
                    File file = this.b;
                    File file2 = this.d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.c.renameTo(this.b)) {
                    throw new IOException();
                }
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), ru.mail.libverify.v.c.a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).d;
                if (cVar != null) {
                    a.this.a(cVar, false);
                }
            }
            while (this.h > this.f) {
                d(this.j.entrySet().iterator().next().getKey());
            }
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b() throws IOException {
        File file = this.c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator<d> it = this.j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.g) {
                    File a = next.a(i);
                    if (a.exists() && !a.delete()) {
                        throw new IOException();
                    }
                    File b2 = next.b(i);
                    if (b2.exists() && !b2.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    private void c() throws IOException {
        ru.mail.libverify.v.b bVar = new ru.mail.libverify.v.b(new FileInputStream(this.b), ru.mail.libverify.v.c.a);
        try {
            String b2 = bVar.b();
            String b3 = bVar.b();
            String b4 = bVar.b();
            String b5 = bVar.b();
            String b6 = bVar.b();
            if (!"libcore.io.DiskLruCache".equals(b2) || !"1".equals(b3) || !Integer.toString(this.e).equals(b4) || !Integer.toString(this.g).equals(b5) || !"".equals(b6)) {
                throw new IOException("unexpected journal header: [" + b2 + ", " + b3 + ", " + b5 + ", " + b6 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    c(bVar.b());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (bVar.a()) {
                        d();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), ru.mail.libverify.v.c.a));
                    }
                    try {
                        bVar.close();
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
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    @Nullable
    public final synchronized e b(@NonNull String str) throws IOException {
        InputStream inputStream;
        if (this.i != null) {
            if (o.matcher(str).matches()) {
                d dVar = this.j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.g];
                int i = 0;
                for (int i2 = 0; i2 < this.g; i2++) {
                    try {
                        inputStreamArr[i2] = new FileInputStream(dVar.a(i2));
                    } catch (FileNotFoundException unused) {
                        while (i < this.g && (inputStream = inputStreamArr[i]) != null) {
                            Charset charset = ru.mail.libverify.v.c.a;
                            try {
                                inputStream.close();
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (Exception unused2) {
                            }
                            i++;
                        }
                        return null;
                    }
                }
                this.k++;
                this.i.append((CharSequence) ("READ " + str + '\n'));
                int i3 = this.k;
                if (i3 >= 2000 && i3 >= this.j.size()) {
                    this.m.submit(this.n);
                }
                return new e(inputStreamArr, i);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    @Nullable
    public final c a(@NonNull String str) throws IOException {
        synchronized (this) {
            try {
                if (this.i != null) {
                    if (o.matcher(str).matches()) {
                        d dVar = this.j.get(str);
                        int i = 0;
                        if (dVar != null) {
                            if (dVar.d != null) {
                                return null;
                            }
                        } else {
                            dVar = new d(this, str, i);
                            this.j.put(str, dVar);
                        }
                        c cVar = new c(this, dVar, i);
                        dVar.d = cVar;
                        this.i.write("DIRTY " + str + '\n');
                        this.i.flush();
                        return cVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE)) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = this.j.get(substring);
            int i2 = 0;
            if (dVar == null) {
                dVar = new d(this, substring, i2);
                this.j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.c = true;
                dVar.d = null;
                if (split.length == a.this.g) {
                    while (i2 < split.length) {
                        try {
                            dVar.b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.d = new c(this, dVar, i2);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    }

    public final synchronized boolean d(@NonNull String str) throws IOException {
        try {
            if (this.i != null) {
                if (o.matcher(str).matches()) {
                    d dVar = this.j.get(str);
                    if (dVar != null && dVar.d == null) {
                        for (int i = 0; i < this.g; i++) {
                            File a = dVar.a(i);
                            if (a.exists() && !a.delete()) {
                                throw new IOException("failed to delete " + a);
                            }
                            long j = this.h;
                            long[] jArr = dVar.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.j.remove(str);
                        int i2 = this.k;
                        if (i2 >= 2000 && i2 >= this.j.size()) {
                            this.m.submit(this.n);
                        }
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(c cVar, boolean z) throws IOException {
        int i;
        d dVar = cVar.a;
        if (dVar.d == cVar) {
            if (z && !dVar.c) {
                for (int i2 = 0; i2 < this.g; i2++) {
                    if (cVar.b[i2]) {
                        if (!dVar.b(i2).exists()) {
                            a.this.a(cVar, false);
                            return;
                        }
                    } else {
                        a.this.a(cVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.g; i3++) {
                File b2 = dVar.b(i3);
                if (z) {
                    if (b2.exists()) {
                        File a = dVar.a(i3);
                        b2.renameTo(a);
                        long j = dVar.b[i3];
                        long length = a.length();
                        dVar.b[i3] = length;
                        this.h = (this.h - j) + length;
                    }
                } else if (b2.exists() && !b2.delete()) {
                    throw new IOException();
                }
            }
            this.k++;
            dVar.d = null;
            if (!(dVar.c | z)) {
                this.j.remove(dVar.a);
                this.i.write("REMOVE " + dVar.a + '\n');
            } else {
                dVar.c = true;
                BufferedWriter bufferedWriter = this.i;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(dVar.a);
                StringBuilder sb2 = new StringBuilder();
                for (long j2 : dVar.b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    this.l++;
                }
            }
            this.i.flush();
            if (this.h > this.f || ((i = this.k) >= 2000 && i >= this.j.size())) {
                this.m.submit(this.n);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void a() throws IOException {
        try {
            if (this.i != null) {
                while (this.h > this.f) {
                    d(this.j.entrySet().iterator().next().getKey());
                }
                this.i.flush();
            } else {
                throw new IllegalStateException("cache is closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
