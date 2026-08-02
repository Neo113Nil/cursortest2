package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaCodec;
import com.google.android.gms.internal.mlkit_vision_barcode.k;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class f381 implements nvb1 {
    public long a;
    public final Object b;
    public final Object c;
    public Object w;
    public Object x;
    public Object y;

    public f381(xi71 xi71Var) {
        this.b = xi71Var;
        xi71Var.getClass();
        this.c = new dl81(32);
        zer zerVar = new zer(0L);
        this.w = zerVar;
        this.x = zerVar;
        this.y = zerVar;
    }

    public static zer a(zer zerVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= zerVar.b) {
            zerVar = (zer) zerVar.w;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (zerVar.b - j));
            byteBuffer.put(((j191) zerVar.c).a, (int) (j - zerVar.a), min);
            i -= min;
            j += min;
            if (j == zerVar.b) {
                zerVar = (zer) zerVar.w;
            }
        }
        return zerVar;
    }

    public static zer b(zer zerVar, long j, byte[] bArr, int i) {
        while (j >= zerVar.b) {
            zerVar = (zer) zerVar.w;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zerVar.b - j));
            System.arraycopy(((j191) zerVar.c).a, (int) (j - zerVar.a), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zerVar.b) {
                zerVar = (zer) zerVar.w;
            }
        }
        return zerVar;
    }

    public static zer c(zer zerVar, yh81 yh81Var, f681 f681Var, dl81 dl81Var) {
        if (yh81Var.c(1073741824)) {
            long j = f681Var.b;
            int i = 1;
            dl81Var.i(1);
            zer b = b(zerVar, j, dl81Var.a, 1);
            long j2 = j + 1;
            byte b2 = dl81Var.a[0];
            boolean z = (b2 & DerValue.TAG_CONTEXT) != 0;
            int i2 = b2 & Byte.MAX_VALUE;
            l271 l271Var = yh81Var.b;
            byte[] bArr = l271Var.a;
            if (bArr == null) {
                l271Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zerVar = b(b, j2, l271Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                dl81Var.i(2);
                zerVar = b(zerVar, j3, dl81Var.a, 2);
                j3 += 2;
                i = dl81Var.x();
            }
            int[] iArr = l271Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = l271Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                dl81Var.i(i3);
                zerVar = b(zerVar, j3, dl81Var.a, i3);
                j3 += i3;
                dl81Var.m(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = dl81Var.x();
                    iArr2[i4] = dl81Var.v();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = f681Var.a - ((int) (j3 - f681Var.b));
            }
            v781 v781Var = f681Var.c;
            int i5 = rf71.a;
            byte[] bArr2 = v781Var.b;
            byte[] bArr3 = l271Var.a;
            int i6 = v781Var.a;
            int i7 = v781Var.c;
            int i8 = v781Var.d;
            l271Var.f = i;
            l271Var.d = iArr;
            l271Var.e = iArr2;
            l271Var.b = bArr2;
            l271Var.a = bArr3;
            l271Var.c = i6;
            l271Var.g = i7;
            l271Var.h = i8;
            MediaCodec.CryptoInfo cryptoInfo = l271Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (rf71.a >= 24) {
                tcf tcfVar = l271Var.j;
                tcfVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = tcfVar.b;
                pattern.set(i7, i8);
                tcfVar.a.setPattern(pattern);
            }
            long j4 = f681Var.b;
            int i9 = (int) (j3 - j4);
            f681Var.b = j4 + i9;
            f681Var.a -= i9;
        }
        if (!yh81Var.c(SelfTester_JCP.IMITA)) {
            yh81Var.g(f681Var.a);
            return a(zerVar, f681Var.b, yh81Var.c, f681Var.a);
        }
        dl81Var.i(4);
        zer b3 = b(zerVar, f681Var.b, dl81Var.a, 4);
        int v = dl81Var.v();
        f681Var.b += 4;
        f681Var.a -= 4;
        yh81Var.g(v);
        zer a = a(b3, f681Var.b, yh81Var.c, v);
        f681Var.b += v;
        int i10 = f681Var.a - v;
        f681Var.a = i10;
        ByteBuffer byteBuffer = yh81Var.y;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            yh81Var.y = ByteBuffer.allocate(i10);
        } else {
            yh81Var.y.clear();
        }
        return a(a, f681Var.b, yh81Var.y, f681Var.a);
    }

    public void d(long j) {
        zer zerVar;
        if (j == -1) {
            return;
        }
        while (true) {
            zerVar = (zer) this.w;
            if (j < zerVar.b) {
                break;
            }
            xi71 xi71Var = (xi71) this.b;
            j191 j191Var = (j191) zerVar.c;
            synchronized (xi71Var) {
                j191[] j191VarArr = xi71Var.d;
                int i = xi71Var.c;
                xi71Var.c = i + 1;
                j191VarArr[i] = j191Var;
                xi71Var.b--;
                xi71Var.notifyAll();
            }
            zer zerVar2 = (zer) this.w;
            zerVar2.c = null;
            zer zerVar3 = (zer) zerVar2.w;
            zerVar2.w = null;
            this.w = zerVar3;
        }
        if (((zer) this.x).a < zerVar.a) {
            this.x = zerVar;
        }
    }

    public void e(zer zerVar) {
        if (((j191) zerVar.c) == null) {
            return;
        }
        xi71 xi71Var = (xi71) this.b;
        synchronized (xi71Var) {
            zer zerVar2 = zerVar;
            while (zerVar2 != null) {
                try {
                    j191[] j191VarArr = xi71Var.d;
                    int i = xi71Var.c;
                    xi71Var.c = i + 1;
                    j191 j191Var = (j191) zerVar2.c;
                    j191Var.getClass();
                    j191VarArr[i] = j191Var;
                    xi71Var.b--;
                    zerVar2 = (zer) zerVar2.w;
                    if (zerVar2 == null || ((j191) zerVar2.c) == null) {
                        zerVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xi71Var.notifyAll();
        }
        zerVar.c = null;
        zerVar.w = null;
    }

    @Override // defpackage.nvb1
    public o3 t() {
        int limit;
        yra1 yra1Var = (yra1) this.b;
        long j = this.a;
        zzrb zzrbVar = (zzrb) this.c;
        k kVar = (k) this.w;
        k kVar2 = (k) this.x;
        xzv xzvVar = (xzv) this.y;
        slb1 slb1Var = new slb1();
        yhb1 yhb1Var = new yhb1();
        yhb1Var.a = Long.valueOf(j & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        yhb1Var.b = zzrbVar;
        yhb1Var.c = Boolean.valueOf(yra1.j);
        Boolean bool = Boolean.TRUE;
        yhb1Var.d = bool;
        yhb1Var.e = bool;
        slb1Var.a = new hib1(yhb1Var);
        slb1Var.b = e891.a(yra1Var.d);
        slb1Var.c = kVar.c();
        slb1Var.d = kVar2.c();
        int i = xzvVar.g;
        if (i == -1) {
            Bitmap bitmap = xzvVar.a;
            cvw.l(bitmap);
            limit = bitmap.getAllocationByteCount();
        } else if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = xzvVar.b;
            cvw.l(byteBuffer);
            limit = byteBuffer.limit();
        } else if (i != 35) {
            limit = 0;
        } else {
            Image.Plane[] a = xzvVar.a();
            cvw.l(a);
            limit = (a[0].getBuffer().limit() * 3) / 2;
        }
        dhb1 dhb1Var = new dhb1();
        dhb1Var.a = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21 : zzqi.NV16 : zzqi.YV12 : zzqi.YUV_420_888 : zzqi.BITMAP;
        dhb1Var.b = Integer.valueOf(limit & Integer.MAX_VALUE);
        slb1Var.e = new mhb1(dhb1Var);
        ekb1 ekb1Var = new ekb1();
        ekb1Var.c = yra1Var.i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
        ekb1Var.d = new cmb1(slb1Var);
        return new o3(ekb1Var, 0);
    }

    public /* synthetic */ f381(yra1 yra1Var, long j, zzrb zzrbVar, k kVar, k kVar2, xzv xzvVar) {
        this.b = yra1Var;
        this.a = j;
        this.c = zzrbVar;
        this.w = kVar;
        this.x = kVar2;
        this.y = xzvVar;
    }
}
