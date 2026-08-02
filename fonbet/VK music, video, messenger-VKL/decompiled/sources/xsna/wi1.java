package xsna;

import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wi1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wi1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                xi1.g((tl1) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                com.vk.profile.community.impl.ui.trust_mark.e.h((CommunityTrustMarksArgs.TrustMarkData) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.c | 1);
                ((dai) this.d).c(this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((pqv) this.d).a((lgu0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((n030) this.d).g((gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                zma0.a((gna0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wi1(pqv pqvVar, lgu0 lgu0Var, int i) {
        this.b = 3;
        this.d = pqvVar;
        this.e = lgu0Var;
        this.c = i;
    }
}
