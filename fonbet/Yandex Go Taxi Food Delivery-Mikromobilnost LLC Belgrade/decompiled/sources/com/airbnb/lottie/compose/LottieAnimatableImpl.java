package com.airbnb.lottie.compose;

import androidx.compose.foundation.j;
import androidx.compose.runtime.f;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qxi;
import defpackage.sls;
import defpackage.y6i0;
import defpackage.yrz;

/* loaded from: classes10.dex */
public final class LottieAnimatableImpl implements yrz {
    public final qxi A;
    public final oz40 B;
    public final oz40 C;
    public final oz40 D;
    public final oz40 E;
    public final qxi F;
    public final j G;
    public final oz40 a;
    public final oz40 b;
    public final oz40 c;
    public final oz40 w;
    public final oz40 x;
    public final oz40 y;
    public final oz40 z;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.a = f.j(bool);
        this.b = f.j(1);
        this.c = f.j(1);
        this.w = f.j(bool);
        this.x = f.j(null);
        this.y = f.j(Float.valueOf(1.0f));
        this.z = f.j(bool);
        this.A = f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Float.valueOf((((Boolean) LottieAnimatableImpl.this.w.getValue()).booleanValue() && LottieAnimatableImpl.this.e() % 2 == 0) ? -((Number) LottieAnimatableImpl.this.y.getValue()).floatValue() : ((Number) LottieAnimatableImpl.this.y.getValue()).floatValue());
            }
        });
        this.B = f.j(null);
        Float valueOf = Float.valueOf(0.0f);
        this.C = f.j(valueOf);
        this.D = f.j(valueOf);
        this.E = f.j(Long.MIN_VALUE);
        this.F = f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float f = 0.0f;
                if (((nsz) LottieAnimatableImpl.this.B.getValue()) != null) {
                    float floatValue = ((Number) LottieAnimatableImpl.this.y.getValue()).floatValue();
                    LottieAnimatableImpl lottieAnimatableImpl = LottieAnimatableImpl.this;
                    if (floatValue < 0.0f) {
                        if (lottieAnimatableImpl.x.getValue() != null) {
                            ny61.u();
                            return null;
                        }
                    } else {
                        if (lottieAnimatableImpl.x.getValue() != null) {
                            ny61.u();
                            return null;
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            }
        });
        f.d(new sls() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Boolean.valueOf(LottieAnimatableImpl.this.e() == ((Number) LottieAnimatableImpl.this.c.getValue()).intValue() && ((Number) LottieAnimatableImpl.this.D.getValue()).floatValue() == LottieAnimatableImpl.this.d());
            }
        });
        this.G = new j();
    }

    public static final boolean a(LottieAnimatableImpl lottieAnimatableImpl, int i, long j) {
        oz40 oz40Var = lottieAnimatableImpl.B;
        oz40 oz40Var2 = lottieAnimatableImpl.C;
        oz40 oz40Var3 = lottieAnimatableImpl.x;
        qxi qxiVar = lottieAnimatableImpl.A;
        oz40 oz40Var4 = lottieAnimatableImpl.E;
        nsz nszVar = (nsz) oz40Var.getValue();
        if (nszVar == null) {
            return true;
        }
        long longValue = ((Number) oz40Var4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) oz40Var4.getValue()).longValue();
        oz40Var4.setValue(Long.valueOf(j));
        if (oz40Var3.getValue() != null) {
            ny61.u();
            return false;
        }
        if (oz40Var3.getValue() != null) {
            ny61.u();
            return false;
        }
        float floatValue = ((Number) qxiVar.getValue()).floatValue() * ((longValue / 1000000) / nszVar.b());
        float floatValue2 = ((Number) qxiVar.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) oz40Var2.getValue()).floatValue() + floatValue) : (((Number) oz40Var2.getValue()).floatValue() + floatValue) - 1.0f;
        if (floatValue2 < 0.0f) {
            lottieAnimatableImpl.g(y6i0.c(((Number) oz40Var2.getValue()).floatValue(), 0.0f, 1.0f) + floatValue);
            return true;
        }
        int i2 = (int) (floatValue2 / 1.0f);
        int i3 = i2 + 1;
        if (lottieAnimatableImpl.e() + i3 > i) {
            lottieAnimatableImpl.g(lottieAnimatableImpl.d());
            lottieAnimatableImpl.f(i);
            return false;
        }
        lottieAnimatableImpl.f(lottieAnimatableImpl.e() + i3);
        float f = floatValue2 - (i2 * 1.0f);
        lottieAnimatableImpl.g(((Number) qxiVar.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    public static final void b(LottieAnimatableImpl lottieAnimatableImpl, boolean z) {
        lottieAnimatableImpl.a.setValue(Boolean.valueOf(z));
    }

    public final float d() {
        return ((Number) this.F.getValue()).floatValue();
    }

    public final int e() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final void f(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    public final void g(float f) {
        nsz nszVar;
        this.C.setValue(Float.valueOf(f));
        if (((Boolean) this.z.getValue()).booleanValue() && (nszVar = (nsz) this.B.getValue()) != null) {
            f -= f % (1.0f / nszVar.n);
        }
        this.D.setValue(Float.valueOf(f));
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return Float.valueOf(((Number) this.D.getValue()).floatValue());
    }
}
