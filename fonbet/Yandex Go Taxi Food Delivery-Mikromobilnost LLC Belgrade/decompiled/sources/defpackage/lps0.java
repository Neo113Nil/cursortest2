package defpackage;

import android.graphics.RectF;

/* loaded from: classes12.dex */
public final class lps0 implements qrv {
    public final /* synthetic */ int a;
    public final zrv b;
    public float c;
    public final RectF w;
    public float x;
    public float y;
    public final bb1 z;

    public lps0(zrv zrvVar, int i) {
        bb1 p0;
        bb1 p02;
        this.a = i;
        switch (i) {
            case 1:
                this.b = zrvVar;
                this.w = new RectF();
                sb2 sb2Var = zrvVar.c;
                if (sb2Var instanceof xrv) {
                    p0 = ((xrv) sb2Var).y;
                } else {
                    if (!(sb2Var instanceof yrv)) {
                        w511.b();
                        throw null;
                    }
                    yrv yrvVar = (yrv) sb2Var;
                    wrv wrvVar = yrvVar.y;
                    float f = wrvVar.f;
                    float f2 = yrvVar.z;
                    p0 = wrv.p0(wrvVar, f + f2, wrvVar.g + f2, 4);
                }
                this.z = p0;
                return;
            default:
                this.b = zrvVar;
                this.w = new RectF();
                sb2 sb2Var2 = zrvVar.c;
                if (sb2Var2 instanceof xrv) {
                    p02 = ((xrv) sb2Var2).y;
                } else {
                    if (!(sb2Var2 instanceof yrv)) {
                        w511.b();
                        throw null;
                    }
                    yrv yrvVar2 = (yrv) sb2Var2;
                    wrv wrvVar2 = yrvVar2.y;
                    float f3 = wrvVar2.f;
                    float f4 = yrvVar2.z;
                    p02 = wrv.p0(wrvVar2, f3 + f4, wrvVar2.g + f4, 4);
                }
                this.z = p02;
                return;
        }
    }

    @Override // defpackage.qrv
    public final void a(float f) {
        switch (this.a) {
            case 0:
                this.x = f;
                break;
            default:
                this.x = f;
                break;
        }
    }

    @Override // defpackage.qrv
    public final RectF c(float f, float f2, float f3, boolean z) {
        int i = this.a;
        RectF rectF = this.w;
        zrv zrvVar = this.b;
        switch (i) {
            case 0:
                sb2 sb2Var = zrvVar.b;
                float f4 = this.y;
                if (f4 == 0.0f) {
                    f4 = sb2Var.t().u();
                }
                float f5 = this.x;
                if (z) {
                    float f6 = this.c * f5;
                    if (f6 <= f5) {
                        f5 = f6;
                    }
                    float f7 = f4 / 2.0f;
                    rectF.left = (f - f5) - f7;
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    rectF.right = (f - f6) + f7;
                } else {
                    float f8 = this.c * f5;
                    float f9 = f4 / 2.0f;
                    rectF.left = ((f8 < 0.0f ? 0.0f : f8) + f) - f9;
                    if (f8 <= f5) {
                        f5 = f8;
                    }
                    rectF.right = f + f5 + f9;
                }
                rectF.top = f2 - (sb2Var.t().s() / 2.0f);
                rectF.bottom = (sb2Var.t().s() / 2.0f) + f2;
                float f10 = rectF.left;
                if (f10 < 0.0f) {
                    rectF.offset(-f10, 0.0f);
                }
                float f11 = rectF.right;
                if (f11 > f3) {
                    rectF.offset(-(f11 - f3), 0.0f);
                    break;
                }
                break;
            default:
                sb2 sb2Var2 = zrvVar.b;
                float f12 = this.y;
                if (f12 == 0.0f) {
                    f12 = sb2Var2.t().u();
                }
                rectF.top = f2 - (sb2Var2.t().s() / 2.0f);
                float f13 = this.x;
                if (z) {
                    float f14 = this.c;
                    float f15 = (f14 - 0.5f) * f13 * 2.0f;
                    if (f15 < 0.0f) {
                        f15 = 0.0f;
                    }
                    float f16 = f12 / 2.0f;
                    rectF.right = (f - f15) + f16;
                    float f17 = f14 * f13 * 2.0f;
                    if (f17 <= f13) {
                        f13 = f17;
                    }
                    rectF.left = (f - f13) - f16;
                } else {
                    float f18 = this.c;
                    float f19 = f13 * f18 * 2.0f;
                    if (f19 > f13) {
                        f19 = f13;
                    }
                    float f20 = f12 / 2.0f;
                    rectF.right = f19 + f + f20;
                    float f21 = (f18 - 0.5f) * f13 * 2.0f;
                    if (f21 < 0.0f) {
                        f21 = 0.0f;
                    }
                    rectF.left = (f + f21) - f20;
                }
                rectF.bottom = (sb2Var2.t().s() / 2.0f) + f2;
                float f22 = rectF.left;
                if (f22 < 0.0f) {
                    rectF.offset(-f22, 0.0f);
                }
                float f23 = rectF.right;
                if (f23 > f3) {
                    rectF.offset(-(f23 - f3), 0.0f);
                    break;
                }
                break;
        }
        return rectF;
    }

    @Override // defpackage.qrv
    public final void d(float f) {
        switch (this.a) {
            case 0:
                this.y = f;
                break;
            default:
                this.y = f;
                break;
        }
    }

    @Override // defpackage.qrv
    public final float e(int i) {
        int i2 = this.a;
        zrv zrvVar = this.b;
        switch (i2) {
            case 0:
                sb2 sb2Var = zrvVar.c;
                if (sb2Var instanceof yrv) {
                    return ((yrv) sb2Var).z;
                }
                return 0.0f;
            default:
                sb2 sb2Var2 = zrvVar.c;
                if (sb2Var2 instanceof yrv) {
                    return ((yrv) sb2Var2).z;
                }
                return 0.0f;
        }
    }

    @Override // defpackage.qrv
    public final bb1 f(int i) {
        switch (this.a) {
        }
        return this.z;
    }

    @Override // defpackage.qrv
    public final int g(int i) {
        int i2 = this.a;
        zrv zrvVar = this.b;
        switch (i2) {
            case 0:
                sb2 sb2Var = zrvVar.c;
                if (sb2Var instanceof yrv) {
                    return ((yrv) sb2Var).A;
                }
                return 0;
            default:
                sb2 sb2Var2 = zrvVar.c;
                if (sb2Var2 instanceof yrv) {
                    return ((yrv) sb2Var2).A;
                }
                return 0;
        }
    }

    @Override // defpackage.qrv
    public final void h(float f, int i) {
        switch (this.a) {
            case 0:
                this.c = f;
                break;
            default:
                this.c = f;
                break;
        }
    }

    @Override // defpackage.qrv
    public final int j(int i) {
        int i2 = this.a;
        zrv zrvVar = this.b;
        switch (i2) {
        }
        return zrvVar.c.r();
    }
}
