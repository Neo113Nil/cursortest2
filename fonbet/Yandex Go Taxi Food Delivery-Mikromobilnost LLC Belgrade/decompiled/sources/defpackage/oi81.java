package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class oi81 implements uv81 {
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final bpz c;
    public final int d;

    public oi81(File file, int i) {
        this.c = new bpz(file);
        this.d = i;
    }

    public static int b(o77 o77Var) {
        int read = o77Var.read();
        if (read == -1) {
            ny61.b();
            return 0;
        }
        int read2 = o77Var.read();
        if (read2 == -1) {
            ny61.b();
            return 0;
        }
        int i = read | (read2 << 8);
        int read3 = o77Var.read();
        if (read3 == -1) {
            ny61.b();
            return 0;
        }
        int i2 = i | (read3 << 16);
        int read4 = o77Var.read();
        if (read4 != -1) {
            return (read4 << 24) | i2;
        }
        ny61.b();
        return 0;
    }

    public static void c(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void d(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static byte[] e(o77 o77Var, long j) {
        long j2 = o77Var.b - o77Var.c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(o77Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder w = unr0.w(j, "streamToBytes length=", ", maxLength=");
        w.append(j2);
        throw new IOException(w.toString());
    }

    public static long f(o77 o77Var) {
        int read = o77Var.read();
        if (read == -1) {
            ny61.b();
            return 0L;
        }
        long j = read & 255;
        int read2 = o77Var.read();
        if (read2 == -1) {
            ny61.b();
            return 0L;
        }
        long j2 = j | ((read2 & 255) << 8);
        int read3 = o77Var.read();
        if (read3 == -1) {
            ny61.b();
            return 0L;
        }
        long j3 = j2 | ((read3 & 255) << 16);
        int read4 = o77Var.read();
        if (read4 == -1) {
            ny61.b();
            return 0L;
        }
        long j4 = j3 | ((read4 & 255) << 24);
        int read5 = o77Var.read();
        if (read5 == -1) {
            ny61.b();
            return 0L;
        }
        long j5 = j4 | ((read5 & 255) << 32);
        int read6 = o77Var.read();
        if (read6 == -1) {
            ny61.b();
            return 0L;
        }
        long j6 = j5 | ((read6 & 255) << 40);
        int read7 = o77Var.read();
        if (read7 == -1) {
            ny61.b();
            return 0L;
        }
        long j7 = j6 | ((read7 & 255) << 48);
        int read8 = o77Var.read();
        if (read8 != -1) {
            return ((read8 & 255) << 56) | j7;
        }
        ny61.b();
        return 0L;
    }

    @Override // defpackage.uv81
    public final synchronized void a(String str, et81 et81Var) {
        BufferedOutputStream bufferedOutputStream;
        cc81 cc81Var;
        long j = this.b;
        byte[] bArr = et81Var.a;
        long length = j + bArr.length;
        int i = this.d;
        if (length <= i || bArr.length <= i * 0.9f) {
            File file = this.c.a;
            int length2 = str.length() / 2;
            File file2 = new File(file, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                cc81Var = new cc81(str, et81Var);
            } catch (IOException unused) {
                if (!file2.delete()) {
                    file2.getAbsolutePath();
                    boolean z = ew71.a;
                }
                if (!this.c.a.exists()) {
                    boolean z2 = ew71.a;
                    this.a.clear();
                    this.b = 0L;
                    a();
                }
            }
            if (!cc81Var.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                file2.getAbsolutePath();
                boolean z3 = ew71.a;
                throw new IOException();
            }
            bufferedOutputStream.write(et81Var.a);
            bufferedOutputStream.close();
            cc81Var.a = file2.length();
            if (this.a.containsKey(str)) {
                this.b = (cc81Var.a - ((cc81) this.a.get(str)).a) + this.b;
            } else {
                this.b += cc81Var.a;
            }
            this.a.put(str, cc81Var);
            g();
        }
    }

    public final void g() {
        long j = this.b;
        int i = this.d;
        if (j < i) {
            return;
        }
        boolean z = ew71.a;
        SystemClock.elapsedRealtime();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            cc81 cc81Var = (cc81) ((Map.Entry) it.next()).getValue();
            String str = cc81Var.b;
            File file = this.c.a;
            int length = str.length() / 2;
            StringBuilder t = qv10.t(String.valueOf(str.substring(0, length).hashCode()));
            t.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, t.toString()).delete()) {
                this.b -= cc81Var.a;
            } else {
                cc81Var.b.getClass();
            }
            it.remove();
            if (this.b < i * 0.9f) {
                break;
            }
        }
        if (ew71.a) {
            SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.uv81
    public final synchronized et81 get(String str) {
        cc81 cc81Var = (cc81) this.a.get(str);
        if (cc81Var == null) {
            return null;
        }
        File file = this.c.a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            o77 o77Var = new o77(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, cc81.a(o77Var).b)) {
                    return cc81Var.b(e(o77Var, o77Var.b - o77Var.c));
                }
                file2.getAbsolutePath();
                boolean z = ew71.a;
                cc81 cc81Var2 = (cc81) this.a.remove(str);
                if (cc81Var2 != null) {
                    this.b -= cc81Var2.a;
                }
                return null;
            } finally {
                o77Var.close();
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z2 = ew71.a;
            h(str);
            return null;
        }
    }

    public final synchronized void h(String str) {
        try {
            File file = this.c.a;
            int length = str.length() / 2;
            boolean delete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            cc81 cc81Var = (cc81) this.a.remove(str);
            if (cc81Var != null) {
                this.b -= cc81Var.a;
            }
            if (!delete) {
                boolean z = ew71.a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.uv81
    public final synchronized void a(String str) {
        et81 et81Var = get(str);
        if (et81Var != null) {
            et81Var.f = 0L;
            et81Var.e = 0L;
            a(str, et81Var);
        }
    }

    @Override // defpackage.uv81
    public final synchronized void a() {
        File file = this.c.a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z = ew71.a;
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                try {
                    long length = file2.length();
                    o77 o77Var = new o77(new BufferedInputStream(new FileInputStream(file2)), length);
                    try {
                        cc81 a = cc81.a(o77Var);
                        a.a = length;
                        String str = a.b;
                        if (this.a.containsKey(str)) {
                            this.b = (a.a - ((cc81) this.a.get(str)).a) + this.b;
                        } else {
                            this.b += a.a;
                        }
                        this.a.put(str, a);
                        o77Var.close();
                    } catch (Throwable th) {
                        o77Var.close();
                        throw th;
                    }
                } catch (Throwable unused) {
                }
            } catch (IOException unused2) {
                file2.delete();
            } catch (Throwable unused3) {
                file2.delete();
            }
        }
    }
}
