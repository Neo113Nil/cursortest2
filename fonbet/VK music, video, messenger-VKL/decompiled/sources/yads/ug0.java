package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.fw3;

/* loaded from: classes10.dex */
public final class ug0 implements mr {
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final rg0 c;
    public final int d;

    public ug0(File file, int i) {
        this.c = new rg0(file);
        this.d = i;
    }

    @Override // yads.mr
    public final synchronized void a() {
        File file = this.c.a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z = pn3.a;
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
                    tg0 tg0Var = new tg0(new BufferedInputStream(new FileInputStream(file2)), length);
                    try {
                        sg0 a = sg0.a(tg0Var);
                        a.a = length;
                        String str = a.b;
                        if (this.a.containsKey(str)) {
                            this.b = (a.a - ((sg0) this.a.get(str)).a) + this.b;
                        } else {
                            this.b += a.a;
                        }
                        this.a.put(str, a);
                        tg0Var.close();
                    } catch (Throwable th) {
                        tg0Var.close();
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

    public final void b() {
        if (this.b < this.d) {
            return;
        }
        boolean z = pn3.a;
        SystemClock.elapsedRealtime();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            sg0 sg0Var = (sg0) ((Map.Entry) it.next()).getValue();
            String str = sg0Var.b;
            File file = this.c.a;
            int length = str.length() / 2;
            StringBuilder e = fw3.e(String.valueOf(str.substring(0, length).hashCode()));
            e.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, e.toString()).delete()) {
                this.b -= sg0Var.a;
            } else {
                String str2 = sg0Var.b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
            }
            it.remove();
            if (this.b < this.d * 0.9f) {
                break;
            }
        }
        if (pn3.a) {
            SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.mr
    public final synchronized lr get(String str) {
        sg0 sg0Var = (sg0) this.a.get(str);
        if (sg0Var == null) {
            return null;
        }
        File file = this.c.a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            tg0 tg0Var = new tg0(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, sg0.a(tg0Var).b)) {
                    return sg0Var.a(a(tg0Var, tg0Var.a - tg0Var.b));
                }
                file2.getAbsolutePath();
                boolean z = pn3.a;
                sg0 sg0Var2 = (sg0) this.a.remove(str);
                if (sg0Var2 != null) {
                    this.b -= sg0Var2.a;
                }
                return null;
            } finally {
                tg0Var.close();
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z2 = pn3.a;
            b(str);
            return null;
        }
    }

    @Override // yads.mr
    public final synchronized void a(String str) {
        lr lrVar = get(str);
        if (lrVar != null) {
            lrVar.f = 0L;
            lrVar.e = 0L;
            a(str, lrVar);
        }
    }

    public static long b(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            long j = read & 255;
            int read2 = inputStream.read();
            if (read2 != -1) {
                long j2 = j | ((read2 & 255) << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    long j3 = j2 | ((read3 & 255) << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        long j4 = j3 | ((read4 & 255) << 24);
                        int read5 = inputStream.read();
                        if (read5 != -1) {
                            long j5 = j4 | ((read5 & 255) << 32);
                            int read6 = inputStream.read();
                            if (read6 != -1) {
                                long j6 = j5 | ((read6 & 255) << 40);
                                int read7 = inputStream.read();
                                if (read7 != -1) {
                                    long j7 = j6 | ((read7 & 255) << 48);
                                    int read8 = inputStream.read();
                                    if (read8 != -1) {
                                        return ((read8 & 255) << 56) | j7;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // yads.mr
    public final synchronized void a(String str, lr lrVar) {
        BufferedOutputStream bufferedOutputStream;
        sg0 sg0Var;
        long j = this.b;
        byte[] bArr = lrVar.a;
        long length = j + bArr.length;
        int i = this.d;
        if (length <= i || bArr.length <= i * 0.9f) {
            File file = this.c.a;
            int length2 = str.length() / 2;
            File file2 = new File(file, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                sg0Var = new sg0(str, lrVar.b, lrVar.c, lrVar.d, lrVar.e, lrVar.f, sg0.a(lrVar));
            } catch (IOException unused) {
                if (!file2.delete()) {
                    file2.getAbsolutePath();
                    boolean z = pn3.a;
                }
                if (!this.c.a.exists()) {
                    boolean z2 = pn3.a;
                    this.a.clear();
                    this.b = 0L;
                    a();
                }
            }
            if (sg0Var.a(bufferedOutputStream)) {
                bufferedOutputStream.write(lrVar.a);
                bufferedOutputStream.close();
                sg0Var.a = file2.length();
                if (!this.a.containsKey(str)) {
                    this.b += sg0Var.a;
                } else {
                    this.b = (sg0Var.a - ((sg0) this.a.get(str)).a) + this.b;
                }
                this.a.put(str, sg0Var);
                b();
                return;
            }
            bufferedOutputStream.close();
            file2.getAbsolutePath();
            boolean z3 = pn3.a;
            throw new IOException();
        }
    }

    public final synchronized void b(String str) {
        try {
            File file = this.c.a;
            int length = str.length() / 2;
            boolean delete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            sg0 sg0Var = (sg0) this.a.remove(str);
            if (sg0Var != null) {
                this.b -= sg0Var.a;
            }
            if (!delete) {
                int length2 = str.length() / 2;
                String.valueOf(str.substring(0, length2).hashCode());
                String.valueOf(str.substring(length2).hashCode());
                boolean z = pn3.a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                int i = read | (read2 << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    int i2 = i | (read3 << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i2;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(tg0 tg0Var, long j) {
        long j2 = tg0Var.a - tg0Var.b;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(tg0Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder b = xsna.fp.b(j, "streamToBytes length=", ", maxLength=");
        b.append(j2);
        throw new IOException(b.toString());
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }
}
