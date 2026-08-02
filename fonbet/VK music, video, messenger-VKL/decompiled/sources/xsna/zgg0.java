package xsna;

import com.vk.avatarchange.OnboardingType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zgg0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gzs g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ zgg0(q630 q630Var, boolean z, OnboardingType onboardingType, boolean z2, boolean z3, gzs gzsVar, izs izsVar, int i) {
        this.c = q630Var;
        this.d = z;
        this.h = onboardingType;
        this.e = z2;
        this.f = z3;
        this.g = gzsVar;
        this.i = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1573249);
                ahg0.a(this.d, this.e, this.f, this.g, (gzs) this.h, this.c, (String) this.i, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                ecm0.a(this.c, this.d, (OnboardingType) this.h, this.e, this.f, this.g, (izs) this.i, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zgg0(boolean z, boolean z2, boolean z3, gzs gzsVar, gzs gzsVar2, q630 q630Var, String str, int i) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = gzsVar;
        this.h = gzsVar2;
        this.c = q630Var;
        this.i = str;
    }
}
