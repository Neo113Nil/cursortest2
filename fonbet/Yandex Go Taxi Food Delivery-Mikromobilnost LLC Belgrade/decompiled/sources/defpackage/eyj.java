package defpackage;

import android.os.StrictMode;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class eyj implements Closeable {
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
    public final ThreadPoolExecutor F = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new jxj());
    public final ixj G = new ixj(0, this);
    public final int z = 1;

    public eyj(File file, int i, long j) {
        this.a = file;
        this.x = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.w = new File(file, "journal.bkp");
        this.y = j;
    }

    public static void P(File file, File file2, boolean z) {
        if (z) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(eyj eyjVar, mxj mxjVar, boolean z) {
        pxj pxjVar;
        mxj mxjVar2;
        boolean z2;
        String str;
        String str2;
        String str3;
        long[] jArr;
        long[] jArr2;
        boolean z3;
        boolean[] zArr;
        synchronized (eyjVar) {
            pxjVar = mxjVar.a;
            mxjVar2 = pxjVar.f;
            if (mxjVar2 != mxjVar) {
                throw new IllegalStateException();
            }
            if (z) {
                z3 = pxjVar.e;
                if (!z3) {
                    for (int i = 0; i < eyjVar.z; i++) {
                        zArr = mxjVar.b;
                        if (!zArr[i]) {
                            mxjVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                        if (!pxjVar.j(i).exists()) {
                            mxjVar.a();
                            return;
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < eyjVar.z; i2++) {
                File j = pxjVar.j(i2);
                if (!z) {
                    d(j);
                } else if (j.exists()) {
                    File i3 = pxjVar.i(i2);
                    j.renameTo(i3);
                    jArr = pxjVar.b;
                    long j2 = jArr[i2];
                    long length = i3.length();
                    jArr2 = pxjVar.b;
                    jArr2[i2] = length;
                    eyjVar.A = (eyjVar.A - j2) + length;
                }
            }
            eyjVar.D++;
            pxjVar.f = null;
            z2 = pxjVar.e;
            if (z2 || z) {
                pxjVar.e = true;
                eyjVar.B.append((CharSequence) "CLEAN");
                eyjVar.B.append(HexString.CHAR_SPACE);
                BufferedWriter bufferedWriter = eyjVar.B;
                str3 = pxjVar.a;
                bufferedWriter.append((CharSequence) str3);
                eyjVar.B.append((CharSequence) pxjVar.k());
                eyjVar.B.append('\n');
                if (z) {
                    long j3 = eyjVar.E;
                    eyjVar.E = 1 + j3;
                    pxj.c(pxjVar, j3);
                }
            } else {
                LinkedHashMap linkedHashMap = eyjVar.C;
                str = pxjVar.a;
                linkedHashMap.remove(str);
                eyjVar.B.append((CharSequence) "REMOVE");
                eyjVar.B.append(HexString.CHAR_SPACE);
                BufferedWriter bufferedWriter2 = eyjVar.B;
                str2 = pxjVar.a;
                bufferedWriter2.append((CharSequence) str2);
                eyjVar.B.append('\n');
            }
            k(eyjVar.B);
            if (eyjVar.A > eyjVar.y || eyjVar.o()) {
                eyjVar.F.submit(eyjVar.G);
            }
        }
    }

    public static void c(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void k(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static eyj v(File file, int i, long j) {
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
                P(file2, file3, false);
            }
        }
        eyj eyjVar = new eyj(file, i, j);
        if (eyjVar.b.exists()) {
            try {
                eyjVar.B();
                eyjVar.w();
                return eyjVar;
            } catch (IOException unused) {
                PrintStream printStream = System.out;
                Objects.toString(file);
                printStream.getClass();
                eyjVar.close();
                ow21.a(eyjVar.a);
            }
        }
        file.mkdirs();
        eyj eyjVar2 = new eyj(file, i, j);
        eyjVar2.G();
        return eyjVar2;
    }

    public final void B() {
        File file = this.b;
        hsu0 hsu0Var = new hsu0(new FileInputStream(file), ow21.a, 1);
        try {
            String c = hsu0Var.c();
            String c2 = hsu0Var.c();
            String c3 = hsu0Var.c();
            String c4 = hsu0Var.c();
            String c5 = hsu0Var.c();
            if (!"libcore.io.DiskLruCache".equals(c) || !"1".equals(c2) || !Integer.toString(this.x).equals(c3) || !Integer.toString(this.z).equals(c4) || !"".equals(c5)) {
                throw new IOException("unexpected journal header: [" + c + Extension.FIX_SPACE + c2 + Extension.FIX_SPACE + c4 + Extension.FIX_SPACE + c5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    D(hsu0Var.c());
                    i++;
                } catch (EOFException unused) {
                    this.D = i - this.C.size();
                    if (hsu0Var.a()) {
                        G();
                    } else {
                        this.B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), ow21.a));
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

    public final void D(String str) {
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
        pxj pxjVar = (pxj) linkedHashMap.get(substring);
        if (pxjVar == null) {
            pxjVar = new pxj(this, substring);
            linkedHashMap.put(substring, pxjVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            pxjVar.e = true;
            pxjVar.f = null;
            pxj.h(pxjVar, split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            pxjVar.f = new mxj(this, pxjVar);
        } else {
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            ny61.v("unexpected journal line: ".concat(str));
        }
    }

    public final synchronized void G() {
        mxj mxjVar;
        String str;
        String str2;
        try {
            BufferedWriter bufferedWriter = this.B;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), ow21.a));
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
                for (pxj pxjVar : this.C.values()) {
                    mxjVar = pxjVar.f;
                    if (mxjVar != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        str = pxjVar.a;
                        sb.append(str);
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        str2 = pxjVar.a;
                        sb2.append(str2);
                        sb2.append(pxjVar.k());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                c(bufferedWriter2);
                if (this.b.exists()) {
                    P(this.b, this.w, true);
                }
                P(this.c, this.b, false);
                this.w.delete();
                this.B = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), ow21.a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void I(String str) {
        mxj mxjVar;
        long[] jArr;
        long[] jArr2;
        try {
            if (this.B == null) {
                throw new IllegalStateException("cache is closed");
            }
            pxj pxjVar = (pxj) this.C.get(str);
            if (pxjVar != null) {
                mxjVar = pxjVar.f;
                if (mxjVar == null) {
                    for (int i = 0; i < this.z; i++) {
                        File i2 = pxjVar.i(i);
                        if (i2.exists() && !i2.delete()) {
                            throw new IOException("failed to delete " + i2);
                        }
                        long j = this.A;
                        jArr = pxjVar.b;
                        this.A = j - jArr[i];
                        jArr2 = pxjVar.b;
                        jArr2[i] = 0;
                    }
                    this.D++;
                    this.B.append((CharSequence) "REMOVE");
                    this.B.append(HexString.CHAR_SPACE);
                    this.B.append((CharSequence) str);
                    this.B.append('\n');
                    this.C.remove(str);
                    if (o()) {
                        this.F.submit(this.G);
                    }
                }
            }
        } finally {
        }
    }

    public final void R() {
        while (this.A > this.y) {
            I((String) ((Map.Entry) this.C.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        mxj mxjVar;
        mxj mxjVar2;
        try {
            if (this.B == null) {
                return;
            }
            Iterator it = new ArrayList(this.C.values()).iterator();
            while (it.hasNext()) {
                pxj pxjVar = (pxj) it.next();
                mxjVar = pxjVar.f;
                if (mxjVar != null) {
                    mxjVar2 = pxjVar.f;
                    mxjVar2.a();
                }
            }
            R();
            c(this.B);
            this.B = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final mxj e(String str) {
        mxj mxjVar;
        synchronized (this) {
            try {
                if (this.B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                pxj pxjVar = (pxj) this.C.get(str);
                if (pxjVar == null) {
                    pxjVar = new pxj(this, str);
                    this.C.put(str, pxjVar);
                } else {
                    mxjVar = pxjVar.f;
                    if (mxjVar != null) {
                        return null;
                    }
                }
                mxj mxjVar2 = new mxj(this, pxjVar);
                pxjVar.f = mxjVar2;
                this.B.append((CharSequence) "DIRTY");
                this.B.append(HexString.CHAR_SPACE);
                this.B.append((CharSequence) str);
                this.B.append('\n');
                k(this.B);
                return mxjVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized zch n(String str) {
        boolean z;
        if (this.B == null) {
            throw new IllegalStateException("cache is closed");
        }
        pxj pxjVar = (pxj) this.C.get(str);
        if (pxjVar == null) {
            return null;
        }
        z = pxjVar.e;
        if (!z) {
            return null;
        }
        for (File file : pxjVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.D++;
        this.B.append((CharSequence) "READ");
        this.B.append(HexString.CHAR_SPACE);
        this.B.append((CharSequence) str);
        this.B.append('\n');
        if (o()) {
            this.F.submit(this.G);
        }
        return new zch(pxjVar.c);
    }

    public final boolean o() {
        int i = this.D;
        return i >= 2000 && i >= this.C.size();
    }

    public final void w() {
        mxj mxjVar;
        long[] jArr;
        d(this.c);
        Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            pxj pxjVar = (pxj) it.next();
            mxjVar = pxjVar.f;
            int i = this.z;
            int i2 = 0;
            if (mxjVar == null) {
                while (i2 < i) {
                    long j = this.A;
                    jArr = pxjVar.b;
                    this.A = j + jArr[i2];
                    i2++;
                }
            } else {
                pxjVar.f = null;
                while (i2 < i) {
                    d(pxjVar.i(i2));
                    d(pxjVar.j(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }
}
