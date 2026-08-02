package xsna;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.util.Size;
import xsna.io40;

/* compiled from: MusicMixShader.kt */
/* loaded from: classes3.dex */
public final class co40 extends lsj0 {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public io40.a L;
    public Float M;
    public final int m;
    public final int n;
    public final int o;
    public final int[] p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public co40(int i, int i2) {
        super(i, i2);
        this.m = GLES20.glGetUniformLocation(this.b, "u_MusicMix_time");
        this.n = GLES20.glGetUniformLocation(this.b, "u_MusicMix_swipe");
        this.o = GLES20.glGetUniformLocation(this.b, "u_MusicMix_gyro");
        this.p = new int[]{GLES20.glGetUniformLocation(this.b, "u_Shape_idleMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_playMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_loveMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_cheerMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_joyMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_sadMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_calmMul"), GLES20.glGetUniformLocation(this.b, "u_Shape_newYearMul")};
        this.q = GLES20.glGetUniformLocation(this.b, "u_Shape_type");
        this.r = GLES20.glGetUniformLocation(this.b, "u_Circle_pos");
        this.s = GLES20.glGetUniformLocation(this.b, "u_Circle_rad");
        this.t = GLES20.glGetUniformLocation(this.b, "u_BackgroundPalette_top");
        this.u = GLES20.glGetUniformLocation(this.b, "u_BackgroundPalette_mid");
        this.v = GLES20.glGetUniformLocation(this.b, "u_BackgroundPalette_bot");
        this.w = GLES20.glGetUniformLocation(this.b, "u_WavePalette_base");
        this.x = GLES20.glGetUniformLocation(this.b, "u_WavePalette_inGlow");
        this.y = GLES20.glGetUniformLocation(this.b, "u_WavePalette_outGlow");
        this.z = GLES20.glGetUniformLocation(this.b, "u_ShapePalette_base");
        this.A = GLES20.glGetUniformLocation(this.b, "u_ShapePalette_inGlow");
        this.B = GLES20.glGetUniformLocation(this.b, "u_ShapePalette_outGlow");
        this.C = GLES20.glGetUniformLocation(this.b, "u_TextureSize");
        this.D = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsIdle");
        this.E = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsPlay");
        this.F = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsLove");
        this.G = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsCheer");
        this.H = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsJoy");
        this.I = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsSad");
        this.J = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsCalm");
        this.K = GLES20.glGetUniformLocation(this.b, "u_IsShapeTypeContainsNewYear");
    }

    @Override // xsna.lsj0
    public final void a(Size size) {
        io40.a aVar = this.L;
        if (aVar == null) {
            return;
        }
        ao40 ao40Var = aVar.d;
        do40 do40Var = aVar.h;
        Float f = this.M;
        if (f != null) {
            GLES20.glUniform1f(this.m, f.floatValue());
            GLES20.glUniform1f(this.n, aVar.a);
            GLES20.glUniform2f(this.o, aVar.b, aVar.c);
            int[] iArr = this.p;
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                GLES20.glUniform1f(iArr[i], do40Var.a[i2]);
                i++;
                i2++;
            }
            GLES20.glUniform1i(this.q, do40Var.b);
            PointF pointF = ao40Var.a;
            GLES20.glUniform2f(this.r, pointF.x, pointF.y);
            GLES20.glUniform1f(this.s, ao40Var.b);
            zn40 zn40Var = aVar.e;
            float[] fArr = (float[]) zn40Var.a;
            float[] fArr2 = (float[]) zn40Var.b;
            float[] fArr3 = (float[]) zn40Var.c;
            eo40 eo40Var = aVar.f;
            float[] fArr4 = (float[]) eo40Var.a;
            float[] fArr5 = (float[]) eo40Var.b;
            float[] fArr6 = (float[]) eo40Var.c;
            eo40 eo40Var2 = aVar.g;
            float[] fArr7 = (float[]) eo40Var2.a;
            float[] fArr8 = (float[]) eo40Var2.b;
            float[] fArr9 = (float[]) eo40Var2.c;
            GLES20.glUniform3f(this.t, fArr[0], fArr[1], fArr[2]);
            GLES20.glUniform3f(this.u, fArr2[0], fArr2[1], fArr2[2]);
            GLES20.glUniform3f(this.v, fArr3[0], fArr3[1], fArr3[2]);
            GLES20.glUniform3f(this.w, fArr4[0], fArr4[1], fArr4[2]);
            GLES20.glUniform3f(this.x, fArr5[0], fArr5[1], fArr5[2]);
            GLES20.glUniform3f(this.y, fArr6[0], fArr6[1], fArr6[2]);
            GLES20.glUniform3f(this.z, fArr7[0], fArr7[1], fArr7[2]);
            GLES20.glUniform3f(this.A, fArr8[0], fArr8[1], fArr8[2]);
            GLES20.glUniform3f(this.B, fArr9[0], fArr9[1], fArr9[2]);
            int i3 = do40Var.b;
            int i4 = (i3 & 1) != 0 ? 1 : 0;
            int i5 = (i3 & 2) != 0 ? 1 : 0;
            int i6 = (i3 & 4) != 0 ? 1 : 0;
            int i7 = (i3 & 8) != 0 ? 1 : 0;
            int i8 = (i3 & 16) != 0 ? 1 : 0;
            int i9 = (i3 & 32) != 0 ? 1 : 0;
            int i10 = (i3 & 64) != 0 ? 1 : 0;
            int i11 = (i3 & 128) == 0 ? 0 : 1;
            GLES20.glUniform1i(this.D, i4);
            GLES20.glUniform1i(this.E, i5);
            GLES20.glUniform1i(this.F, i6);
            GLES20.glUniform1i(this.G, i7);
            GLES20.glUniform1i(this.H, i8);
            GLES20.glUniform1i(this.I, i9);
            GLES20.glUniform1i(this.J, i10);
            GLES20.glUniform1i(this.K, i11);
            GLES20.glUniform2f(this.C, size.getWidth(), size.getHeight());
        }
    }
}
