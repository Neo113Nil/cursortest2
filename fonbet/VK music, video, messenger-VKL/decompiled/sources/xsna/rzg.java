package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rzg implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rzg(CommunityCreationOnboardingFinishState.SubscribeStatus subscribeStatus, String str, izs izsVar, int i) {
        this.e = subscribeStatus;
        this.f = str;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                uzg.c((CommunityCreationOnboardingFinishState.SubscribeStatus) this.e, (String) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nu80.b((gww) this.e, (izs) this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ecm0.c((String) this.f, (Cell$Middle.Size) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rzg(String str, Cell$Middle.Size size, q630 q630Var, int i) {
        this.f = str;
        this.e = size;
        this.c = q630Var;
        this.d = i;
    }

    public /* synthetic */ rzg(gww gwwVar, izs izsVar, q630 q630Var, int i) {
        this.e = gwwVar;
        this.c = izsVar;
        this.f = q630Var;
        this.d = i;
    }
}
