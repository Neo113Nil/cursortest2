package xsna;

import com.vk.log.L;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import xsna.r7y0;

/* compiled from: ZstdDictManager.kt */
/* loaded from: classes3.dex */
public final class s7y0 implements r7y0.a {
    public static final byte[] g;
    public final String a;
    public final r7y0 b;
    public final ExecutorService c;
    public volatile eoi0 d;
    public final File e;
    public final File f;

    static {
        byte[] bArr = new byte[4];
        int i = 0;
        while (i < 4) {
            bArr[i] = i != 0 ? i != 1 ? i != 2 ? (byte) -20 : (byte) 48 : (byte) -92 : (byte) 55;
            i++;
        }
        g = bArr;
    }

    public s7y0(File file, String str, r7y0 r7y0Var, ExecutorService executorService) {
        this.a = str;
        this.b = r7y0Var;
        this.c = executorService;
        this.e = new File(file, "zstd.dict");
        this.f = new File(file, "zstd.dict.temp");
    }

    @Override // xsna.r7y0.a
    public final void a(bn8 bn8Var, String str) {
        File file = this.f;
        d8f0 d8f0Var = new d8f0(mq9.c(file));
        try {
            d8f0Var.L2(bn8Var);
            d8f0Var.flush();
            s3q0 s3q0Var = s3q0.a;
            d8f0Var.close();
            e();
            CRC32 crc32 = new CRC32();
            crc32.update(nbr.p(file));
            String valueOf = String.valueOf(crc32.getValue());
            if (!str.equals(valueOf)) {
                file.delete();
                throw new IOException(new IllegalArgumentException(y57.a("Zstd dict file crc missmatch expected:", str, " actual:", valueOf)));
            }
            file.renameTo(this.e);
            d();
        } finally {
        }
    }

    @Override // xsna.r7y0.a
    public final String b() {
        eoi0 eoi0Var = this.d;
        if (eoi0Var != null) {
            return eoi0Var.b;
        }
        return null;
    }

    @Override // xsna.r7y0.a
    public final void c(long j) {
        if (j == Long.MIN_VALUE) {
            return;
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        if (0 <= currentTimeMillis) {
            currentTimeMillis = 0;
        }
        r7y0 r7y0Var = this.b;
        r7y0Var.b.schedule(new ues(r7y0Var, this.a, this, 3), currentTimeMillis, TimeUnit.MILLISECONDS);
    }

    public final void d() {
        if (!this.e.exists()) {
            L.e("Zstd dict file doesn't exist. Nothing to init");
            return;
        }
        byte[] p = nbr.p(this.e);
        byte[] bArr = g;
        int length = p.length;
        int i = -1;
        if (length > 0) {
            byte b = bArr[0];
            int i2 = length - 4;
            int i3 = 0;
            while (true) {
                if (i3 > i2) {
                    break;
                }
                if (p[i3] != b) {
                    do {
                        i3++;
                        if (i3 > i2) {
                            break;
                        }
                    } while (p[i3] != b);
                }
                if (i3 <= i2) {
                    int i4 = i3 + 1;
                    int i5 = i3 + 4;
                    for (int i6 = 1; i4 < i5 && p[i4] == bArr[i6]; i6++) {
                        i4++;
                    }
                    if (i4 == i5) {
                        i = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        byte[] l = i <= 0 ? new byte[0] : jw5.l(0, i, p);
        if (l.length == 0) {
            L.e("there is no version in a dictionary");
            e();
            return;
        }
        try {
            String str = new String(l, emb.b);
            this.d = new eoi0(str, jw5.l(l.length, p.length, p));
            L.e("Zstd dictionary id initialized with version " + str);
        } catch (Throwable th) {
            e();
            L.i(new IllegalArgumentException("cant't initialize zstd dictionary!", th));
        }
    }

    public final void e() {
        this.d = null;
        this.e.delete();
    }
}
