package xsna;

import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import xsna.mkq;
import xsna.pox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class okq implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;

    public /* synthetic */ okq(Object obj, Object obj2, boolean z, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = z;
        this.g = xzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.d;
        xzs xzsVar = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((rkq) obj4).i((mkq.b) obj3, this.c, (izs) xzsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                ((Integer) obj2).intValue();
                int i3 = VideoProfileCreatorOnboardingItemsView.q;
                ((VideoProfileCreatorOnboardingItemsView) obj4).D((VideoProfileCreatorOnboardingItemType) obj3, this.c, (gzs) xzsVar, aVar, ne7.I(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(i2 | 1);
                boolean z = this.c;
                hnx0.b((pox0.b.C3524b) obj4, z, (q630) obj3, (izs) xzsVar, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ okq(pox0.b.C3524b c3524b, boolean z, q630 q630Var, izs izsVar, int i) {
        this.b = 2;
        this.e = c3524b;
        this.c = z;
        this.f = q630Var;
        this.g = izsVar;
        this.d = i;
    }
}
