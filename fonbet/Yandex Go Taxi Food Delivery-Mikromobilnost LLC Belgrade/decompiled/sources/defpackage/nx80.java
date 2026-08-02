package defpackage;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.graphics.Path$Direction;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class nx80 {
    public final Outline a;
    public ix80 b;
    public jb2 c;
    public rq90 d;
    public boolean e;
    public boolean f;
    public rq90 g;
    public sxk0 h;
    public float i;
    public long j;
    public long k;
    public boolean l;

    public nx80() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.a = outline;
        this.j = 0L;
        this.k = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (r5.e >> 32)) == r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i28 i28Var) {
        h();
        rq90 rq90Var = this.d;
        if (rq90Var != null) {
            i28Var.k(rq90Var);
            return;
        }
        float f = this.i;
        if (f <= 0.0f) {
            i28Var.b(Float.intBitsToFloat((int) (this.j >> 32)), Float.intBitsToFloat((int) (this.j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (this.k >> 32)) + Float.intBitsToFloat((int) (this.j >> 32)), Float.intBitsToFloat((int) (this.k & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat((int) (this.j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), 1);
            return;
        }
        rq90 rq90Var2 = this.g;
        sxk0 sxk0Var = this.h;
        if (rq90Var2 != null) {
            long j = this.j;
            long j2 = this.k;
            if (sxk0Var != null && ora1.d(sxk0Var)) {
                int i = (int) (j >> 32);
                if (sxk0Var.a == Float.intBitsToFloat(i)) {
                    float f2 = sxk0Var.b;
                    int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    if (f2 == Float.intBitsToFloat(i2)) {
                        if (sxk0Var.c == Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i)) {
                            if (sxk0Var.d == Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat(i2)) {
                            }
                        }
                    }
                }
            }
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (this.j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.k >> 32)) + Float.intBitsToFloat((int) (this.j >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (this.k & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat((int) (this.j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float f3 = this.i;
        sxk0 c = ora1.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (rq90Var2 == null) {
            rq90Var2 = nb2.a();
        } else {
            ((jb2) rq90Var2).o();
        }
        ((jb2) rq90Var2).f(c, Path$Direction.CounterClockwise);
        this.h = c;
        this.g = rq90Var2;
        i28Var.k(rq90Var2);
    }

    public final Outline b() {
        h();
        if (this.l) {
            return this.a;
        }
        return null;
    }

    public final boolean c() {
        return this.e;
    }

    public final rq90 d() {
        h();
        return this.d;
    }

    public final boolean e() {
        return !this.f;
    }

    public final boolean f(long j) {
        ix80 ix80Var;
        if (this.l && (ix80Var = this.b) != null) {
            return mbb1.g(ix80Var, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
        return true;
    }

    public final boolean g(ix80 ix80Var, float f, boolean z, float f2, long j) {
        this.a.setAlpha(f);
        boolean l = jl40.l(this.b, ix80Var);
        boolean z2 = !l;
        if (!l) {
            this.b = ix80Var;
            this.e = true;
        }
        this.k = j;
        boolean z3 = ix80Var != null && (z || f2 > 0.0f);
        if (this.l != z3) {
            this.l = z3;
            this.e = true;
        }
        return z2;
    }

    public final void h() {
        if (this.e) {
            this.j = 0L;
            this.i = 0.0f;
            this.d = null;
            this.e = false;
            this.f = false;
            ix80 ix80Var = this.b;
            Outline outline = this.a;
            if (ix80Var == null || !this.l || Float.intBitsToFloat((int) (this.k >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.k & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            if (ix80Var instanceof gx80) {
                zii0 zii0Var = ((gx80) ix80Var).a;
                float f = zii0Var.a;
                float f2 = zii0Var.b;
                this.j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float f3 = zii0Var.c;
                float f4 = zii0Var.d;
                this.k = (Float.floatToRawIntBits(f4 - f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f3 - f) << 32);
                outline.setRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f4));
                return;
            }
            if (!(ix80Var instanceof hx80)) {
                if (ix80Var instanceof fx80) {
                    i(((fx80) ix80Var).a);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            sxk0 sxk0Var = ((hx80) ix80Var).a;
            float intBitsToFloat = Float.intBitsToFloat((int) (sxk0Var.e >> 32));
            float f5 = sxk0Var.a;
            float f6 = sxk0Var.b;
            this.j = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float h = sxk0Var.h();
            float c = sxk0Var.c();
            this.k = (Float.floatToRawIntBits(c) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(h) << 32);
            if (ora1.d(sxk0Var)) {
                this.a.setRoundRect(Math.round(f5), Math.round(f6), Math.round(sxk0Var.c), Math.round(sxk0Var.d), intBitsToFloat);
                this.i = intBitsToFloat;
                return;
            }
            jb2 jb2Var = this.c;
            if (jb2Var == null) {
                jb2Var = nb2.a();
                this.c = jb2Var;
            }
            jb2Var.o();
            jb2Var.f(sxk0Var, Path$Direction.CounterClockwise);
            i(jb2Var);
        }
    }

    public final void i(rq90 rq90Var) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.a;
        if (i >= 30) {
            ox80.a.a(outline, rq90Var);
        } else {
            if (!(rq90Var instanceof jb2)) {
                w511.x("Unable to obtain android.graphics.Path");
                return;
            }
            outline.setConvexPath(((jb2) rq90Var).a);
        }
        this.f = !outline.canClip();
        this.d = rq90Var;
    }
}
