package xsna;

import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t41 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t41(int i, androidx.compose.foundation.lazy.layout.b bVar, Object obj) {
        this.b = 6;
        this.d = bVar;
        this.c = i;
        this.e = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((com.vk.superapp.advertisement.b) this.d).e((AdvertisementType) obj, (WebAdConfig) this.e, ((Boolean) obj2).booleanValue(), this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((is5) this.d).d((ds5) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                fbc.h(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).intValue();
                uzg.b((CommunityCreationOnboardingFinishState) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((ebo) this.d).a((ksr) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.a.d) this.d).a((com.vk.core.compose.component.group.header.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(980966366, intValue, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
                    }
                    bVar.f(this.c, this.e, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t41(GroupHeader$Right.a.d dVar, com.vk.core.compose.component.group.header.b bVar, int i) {
        this.b = 5;
        this.d = dVar;
        this.e = bVar;
        this.c = i;
    }

    public /* synthetic */ t41(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
