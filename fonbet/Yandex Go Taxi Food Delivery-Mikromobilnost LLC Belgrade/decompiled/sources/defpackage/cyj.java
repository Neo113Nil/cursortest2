package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cyj implements Closeable {
    public static final n77 H = new n77(1);
    public BufferedWriter B;
    public int D;
    public final File a;
    public final File b;
    public final File c;
    public final File w;
    public final int x;
    public final long y;
    public long A = 0;
    public final LinkedHashMap C = new LinkedHashMap(0, 0.75f, true);
    public long E = 0;
    public final ThreadPoolExecutor F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final hxj G = new hxj(0, this);
    public final int z = 1;

    public cyj(File file, int i, long j) {
        this.a = file;
        this.x = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.w = new File(file, "journal.bkp");
        this.y = j;
    }

    public static void B(File file, File file2, boolean z) {
        if (z) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(cyj cyjVar, kzo kzoVar, boolean z) {
        synchronized (cyjVar) {
            qxj qxjVar = (qxj) kzoVar.c;
            if (qxjVar.d != kzoVar) {
                throw new IllegalStateException();
            }
            if (z && !qxjVar.c) {
                for (int i = 0; i < cyjVar.z; i++) {
                    if (!((boolean[]) kzoVar.w)[i]) {
                        kzoVar.h();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!qxjVar.b(i).exists()) {
                        kzoVar.h();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < cyjVar.z; i2++) {
                File b = qxjVar.b(i2);
                if (!z) {
                    c(b);
                } else if (b.exists()) {
                    File a = qxjVar.a(i2);
                    b.renameTo(a);
                    long j = qxjVar.b[i2];
                    long length = a.length();
                    qxjVar.b[i2] = length;
                    cyjVar.A = (cyjVar.A - j) + length;
                }
            }
            cyjVar.D++;
            qxjVar.d = null;
            if (qxjVar.c || z) {
                qxjVar.c = true;
                cyjVar.B.write("CLEAN " + qxjVar.a + qxjVar.c() + '\n');
                if (z) {
                    cyjVar.E++;
                }
            } else {
                cyjVar.C.remove(qxjVar.a);
                cyjVar.B.write("REMOVE " + qxjVar.a + '\n');
            }
            cyjVar.B.flush();
            if (cyjVar.A > cyjVar.y || cyjVar.d()) {
                cyjVar.F.submit(cyjVar.G);
            }
        }
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static cyj e(File file, int i, long j) {
        if (j <= 0) {
            ny61.g("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                B(file2, file3, false);
            }
        }
        cyj cyjVar = new cyj(file, i, j);
        if (cyjVar.b.exists()) {
            try {
                cyjVar.n();
                cyjVar.k();
                return cyjVar;
            } catch (IOException unused) {
                PrintStream printStream = System.out;
                Objects.toString(file);
                printStream.getClass();
                cyjVar.close();
                sw21.a(cyjVar.a);
            }
        }
        file.mkdirs();
        cyj cyjVar2 = new cyj(file, i, j);
        cyjVar2.v();
        return cyjVar2;
    }

    public final void D() {
        while (this.A > this.y) {
            w((String) ((Map.Entry) this.C.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.B == null) {
                return;
            }
            Iterator it = new ArrayList(this.C.values()).iterator();
            while (it.hasNext()) {
                kzo kzoVar = ((qxj) it.next()).d;
                if (kzoVar != null) {
                    kzoVar.h();
                }
            }
            D();
            this.B.close();
            this.B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        int i = this.D;
        return i >= 2000 && i >= this.C.size();
    }

    public final void k() {
        c(this.c);
        Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            qxj qxjVar = (qxj) it.next();
            kzo kzoVar = qxjVar.d;
            int i = this.z;
            int i2 = 0;
            if (kzoVar == null) {
                while (i2 < i) {
                    this.A += qxjVar.b[i2];
                    i2++;
                }
            } else {
                qxjVar.d = null;
                while (i2 < i) {
                    c(qxjVar.a(i2));
                    c(qxjVar.b(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void n() {
        File file = this.b;
        int i = 0;
        hsu0 hsu0Var = new hsu0(new FileInputStream(file), sw21.a, 0);
        try {
            String c = hsu0Var.c();
            String c2 = hsu0Var.c();
            String c3 = hsu0Var.c();
            String c4 = hsu0Var.c();
            String c5 = hsu0Var.c();
            if (!"libcore.io.DiskLruCache".equals(c) || !"1".equals(c2) || !Integer.toString(this.x).equals(c3) || !Integer.toString(this.z).equals(c4) || !"".equals(c5)) {
                throw new IOException("unexpected journal header: [" + c + Extension.FIX_SPACE + c2 + Extension.FIX_SPACE + c4 + Extension.FIX_SPACE + c5 + "]");
            }
            while (true) {
                try {
                    o(hsu0Var.c());
                    i++;
                } catch (EOFException unused) {
                    this.D = i - this.C.size();
                    if (hsu0Var.y == -1) {
                        v();
                    } else {
                        this.B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), sw21.a));
                    }
                    try {
                        hsu0Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                hsu0Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void o(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            ny61.v("unexpected journal line: ".concat(str));
            return;
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.C;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        qxj qxjVar = (qxj) linkedHashMap.get(substring);
        if (qxjVar == null) {
            qxjVar = new qxj(this, substring);
            linkedHashMap.put(substring, qxjVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                qxjVar.d = new kzo(this, qxjVar);
                return;
            } else {
                if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                ny61.v("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        qxjVar.c = true;
        qxjVar.d = null;
        if (split.length != qxjVar.e.z) {
            w511.r(Arrays.toString(split), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                qxjVar.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                w511.r(Arrays.toString(split), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void v() {
        try {
            BufferedWriter bufferedWriter = this.B;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), sw21.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.x));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (qxj qxjVar : this.C.values()) {
                    if (qxjVar.d != null) {
                        bufferedWriter2.write("DIRTY " + qxjVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + qxjVar.a + qxjVar.c() + '\n');
                    }
                }
                bufferedWriter2.close();
                if (this.b.exists()) {
                    B(this.b, this.w, true);
                }
                B(this.c, this.b, false);
                this.w.delete();
                this.B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), sw21.a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void w(String str) {
        try {
            if (this.B == null) {
                throw new IllegalStateException("cache is closed");
            }
            qxj qxjVar = (qxj) this.C.get(str);
            if (qxjVar != null && qxjVar.d == null) {
                for (int i = 0; i < this.z; i++) {
                    File a = qxjVar.a(i);
                    if (a.exists() && !a.delete()) {
                        throw new IOException("failed to delete " + a);
                    }
                    long j = this.A;
                    long[] jArr = qxjVar.b;
                    this.A = j - jArr[i];
                    jArr[i] = 0;
                }
                this.D++;
                this.B.append((CharSequence) ("REMOVE " + str + '\n'));
                this.C.remove(str);
                if (d()) {
                    this.F.submit(this.G);
                }
            }
        } finally {
        }
    }
}
