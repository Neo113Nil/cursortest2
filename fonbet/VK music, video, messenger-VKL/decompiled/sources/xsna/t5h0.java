package xsna;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.f4e0;

/* compiled from: SceneRenderer.java */
/* loaded from: classes12.dex */
public final class t5h0 implements gms0, kj9 {
    public int j;
    public SurfaceTexture k;

    @Nullable
    public byte[] n;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final h4e0 d = new h4e0();
    public final cgs e = new cgs();
    public final dwo0<Long> f = new dwo0<>();
    public final dwo0<f4e0> g = new dwo0<>();
    public final float[] h = new float[16];
    public final float[] i = new float[16];
    public volatile int l = 0;
    public int m = -1;

    @Override // xsna.gms0
    public final void a(long j, long j2, androidx.media3.common.a aVar, @Nullable MediaFormat mediaFormat) {
        int i;
        ArrayList<f4e0.a> arrayList;
        int p;
        this.f.a(j2, Long.valueOf(j));
        byte[] bArr = aVar.B;
        int i2 = aVar.C;
        byte[] bArr2 = this.n;
        int i3 = this.m;
        this.n = bArr;
        if (i2 == -1) {
            i2 = this.l;
        }
        this.m = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.n)) {
            return;
        }
        byte[] bArr3 = this.n;
        f4e0 f4e0Var = null;
        if (bArr3 != null) {
            int i4 = this.m;
            xi90 xi90Var = new xi90(bArr3);
            try {
                xi90Var.Q(4);
                p = xi90Var.p();
                xi90Var.P(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (p == 1886547818) {
                xi90Var.Q(8);
                int i5 = xi90Var.b;
                int i6 = xi90Var.c;
                while (i5 < i6) {
                    int p2 = xi90Var.p() + i5;
                    if (p2 <= i5 || p2 > i6) {
                        break;
                    }
                    int p3 = xi90Var.p();
                    if (p3 != 2037673328 && p3 != 1836279920) {
                        xi90Var.P(p2);
                        i5 = p2;
                    }
                    xi90Var.O(p2);
                    arrayList = g4e0.a(xi90Var);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = g4e0.a(xi90Var);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    f4e0.a aVar2 = arrayList.get(0);
                    f4e0Var = new f4e0(aVar2, aVar2, i4);
                } else if (size == 2) {
                    f4e0Var = new f4e0(arrayList.get(0), arrayList.get(1), i4);
                }
            }
        }
        if (f4e0Var == null || !h4e0.b(f4e0Var)) {
            int i7 = this.m;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    int i14 = i12;
                    float f6 = f5;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 0;
                    int i18 = 2;
                    while (i17 < i18) {
                        float f8 = i17 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i17) * f12) / f7;
                        if ((i13 != 0 || i17 != 0) && (i13 != 72 || i17 != 1)) {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                            i17++;
                            i18 = i;
                            radians2 = f9;
                            f4 = f11;
                            f = f12;
                        }
                        System.arraycopy(fArr, i15, fArr, i19, 3);
                        i15 += 6;
                        i = 2;
                        System.arraycopy(fArr2, i16, fArr2, i20, 2);
                        i16 += 4;
                        i17++;
                        i18 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    i12 = i14;
                    f5 = f6;
                    radians = f7;
                    radians2 = radians2;
                    f = f;
                }
                i8 = i12;
            }
            f4e0.a aVar3 = new f4e0.a(new f4e0.b(0, 1, fArr, fArr2));
            f4e0Var = new f4e0(aVar3, aVar3, i7);
        }
        this.g.a(j2, f4e0Var);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.d();
            this.d.a();
            GlUtil.d();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.d();
            int i = iArr[0];
            GlUtil.b(36197, i, 9729);
            this.j = i;
        } catch (GlUtil.GlException e) {
            ahn.o("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j);
        this.k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: xsna.s5h0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                t5h0.this.b.set(true);
            }
        });
        return this.k;
    }

    @Override // xsna.kj9
    public final void onCameraMotion(long j, float[] fArr) {
        this.e.c.a(j, fArr);
    }

    @Override // xsna.kj9
    public final void onCameraMotionReset() {
        this.f.b();
        cgs cgsVar = this.e;
        cgsVar.c.b();
        cgsVar.d = false;
        this.c.set(true);
    }
}
