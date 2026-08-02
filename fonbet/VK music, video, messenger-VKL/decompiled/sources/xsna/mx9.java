package xsna;

import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mx9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mx9(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ox9.c((CartItem.c.b.C0921b) this.e, (izs) this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                uzg.c((CommunityCreationOnboardingFinishState.SubscribeStatus) this.e, (String) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a3h.a((String) this.e, (q630) this.f, (wkj) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                sdy.g((androidx.compose.foundation.lazy.layout.b) this.e, this.c, this.d, this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((sdy) this.e).e((String) this.c, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                nu80.e((ns90) this.e, (izs) this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((com.vk.catalog.mvi.block.video.impl.video.list.a) this.e).c((vst0) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mx9(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    public /* synthetic */ mx9(androidx.compose.foundation.lazy.layout.b bVar, Object obj, int i, Object obj2, int i2) {
        this.b = 3;
        this.e = bVar;
        this.c = obj;
        this.d = i;
        this.f = obj2;
    }
}
