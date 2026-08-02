package xsna;

import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yn1 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ yn1(int i, hr1 hr1Var, izs izsVar, r820 r820Var, q630 q630Var, w4p0 w4p0Var) {
        this.f = hr1Var;
        this.g = w4p0Var;
        this.h = r820Var;
        this.d = q630Var;
        this.c = izsVar;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                hr1 hr1Var = (hr1) this.f;
                w4p0 w4p0Var = (w4p0) this.g;
                r820 r820Var = (r820) this.h;
                ((Integer) obj2).getClass();
                do1.b(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, hr1Var, this.c, r820Var, this.d, w4p0Var);
                break;
            default:
                ((Integer) obj2).getClass();
                uz40.a((wh50) this.f, (ivp) this.g, (KidsModeRestrictionRenderer) this.h, this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yn1(wh50 wh50Var, ivp ivpVar, KidsModeRestrictionRenderer kidsModeRestrictionRenderer, izs izsVar, q630 q630Var, int i) {
        this.f = wh50Var;
        this.g = ivpVar;
        this.h = kidsModeRestrictionRenderer;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }
}
