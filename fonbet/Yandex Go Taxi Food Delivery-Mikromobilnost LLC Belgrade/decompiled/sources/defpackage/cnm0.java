package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.a;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class cnm0 implements xl31, qr7 {
    public int B;
    public SurfaceTexture C;
    public byte[] F;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final clf0 c = new clf0();
    public final hfs w = new hfs();
    public final w8z0 x = new w8z0();
    public final w8z0 y = new w8z0();
    public final float[] z = new float[16];
    public final float[] A = new float[16];
    public volatile int D = 0;
    public int E = -1;

    @Override // defpackage.qr7
    public final void a(long j, float[] fArr) {
        this.w.c.a(j, fArr);
    }

    @Override // defpackage.qr7
    public final void b() {
        this.x.b();
        hfs hfsVar = this.w;
        hfsVar.c.b();
        hfsVar.d = false;
        this.b.set(true);
    }

    @Override // defpackage.xl31
    public final void c(long j, long j2, a aVar, MediaFormat mediaFormat) {
        float f;
        float f2;
        ArrayList arrayList;
        int k;
        this.x.a(j2, Long.valueOf(j));
        byte[] bArr = aVar.z;
        int i = aVar.A;
        byte[] bArr2 = this.F;
        int i2 = this.E;
        this.F = bArr;
        if (i == -1) {
            i = this.D;
        }
        this.E = i;
        if (i2 == i && Arrays.equals(bArr2, this.F)) {
            return;
        }
        byte[] bArr3 = this.F;
        int i3 = 1;
        zkf0 zkf0Var = null;
        if (bArr3 != null) {
            int i4 = this.E;
            ef90 ef90Var = new ef90(bArr3);
            try {
                ef90Var.L(4);
                k = ef90Var.k();
                ef90Var.K(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (k == 1886547818) {
                ef90Var.L(8);
                int i5 = ef90Var.b;
                int i6 = ef90Var.c;
                while (i5 < i6) {
                    int k2 = ef90Var.k() + i5;
                    if (k2 <= i5 || k2 > i6) {
                        break;
                    }
                    int k3 = ef90Var.k();
                    if (k3 != 2037673328 && k3 != 1836279920) {
                        ef90Var.K(k2);
                        i5 = k2;
                    }
                    ef90Var.J(k2);
                    arrayList = i9a1.e(ef90Var);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = i9a1.e(ef90Var);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    xkf0 xkf0Var = (xkf0) arrayList.get(0);
                    zkf0Var = new zkf0(xkf0Var, xkf0Var, i4);
                } else if (size == 2) {
                    zkf0Var = new zkf0((xkf0) arrayList.get(0), (xkf0) arrayList.get(1), i4);
                }
            }
        }
        if (zkf0Var == null || !clf0.b(zkf0Var)) {
            int i7 = this.E;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f3 = radians / 36.0f;
            float f4 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < 36) {
                float f5 = radians / 2.0f;
                float f6 = (i8 * f3) - f5;
                int i11 = i8 + 1;
                float f7 = (i11 * f3) - f5;
                float f8 = radians;
                int i12 = 0;
                while (i12 < 73) {
                    float f9 = radians2;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        if (i13 == 0) {
                            f = f6;
                            f2 = f;
                        } else {
                            f = f7;
                            f2 = f6;
                        }
                        float f10 = i12 * f4;
                        float f11 = f3;
                        double d = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d2 = f;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i9 + 3;
                        int i16 = i11;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f10 / f9;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i8 + i13) * f11) / f8;
                        if ((i12 != 0 || i13 != 0) && (i12 != 72 || i13 != 1)) {
                            i14 = 2;
                            i9 = i15;
                            i10 = i17;
                            i13++;
                            f6 = f2;
                            i11 = i16;
                            f3 = f11;
                        }
                        System.arraycopy(fArr, i9, fArr, i15, 3);
                        i9 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i10, fArr2, i17, 2);
                        i10 += 4;
                        i13++;
                        f6 = f2;
                        i11 = i16;
                        f3 = f11;
                    }
                    i12++;
                    radians2 = f9;
                    i11 = i11;
                }
                radians = f8;
                i8 = i11;
                i3 = 1;
            }
            xkf0 xkf0Var2 = new xkf0(new ykf0(fArr, 0, fArr2, i3, 0));
            zkf0Var = new zkf0(xkf0Var2, xkf0Var2, i7);
        }
        this.y.a(j2, zkf0Var);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            lxa1.c();
            this.c.a();
            lxa1.c();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            lxa1.c();
            int i = iArr[0];
            lxa1.b(36197, i);
            this.B = i;
        } catch (GlUtil$GlException e) {
            lk91.f("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.B);
        this.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new vsr(1, this));
        return this.C;
    }
}
