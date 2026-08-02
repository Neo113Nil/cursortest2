package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.profile.user.impl.ui.UserProfileAction;
import xsna.gs7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m74 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ m74(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(PostingAction.Navigation.OpenDonutTeaserModal.b);
                break;
            case 1:
                this.c.invoke(gs7.a.b);
                break;
            case 2:
                this.c.invoke(PostingAction.Hints.LoadRemoteDraftOnboardingHint.b);
                break;
            default:
                this.c.invoke(UserProfileAction.DonutBanner.b.b);
                break;
        }
        return s3q0.a;
    }
}
