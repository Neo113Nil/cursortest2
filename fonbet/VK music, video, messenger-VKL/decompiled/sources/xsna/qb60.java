package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qb60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ bpn0 c;

    public /* synthetic */ qb60(bpn0 bpn0Var, int i) {
        this.b = i;
        this.c = bpn0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        bpn0 bpn0Var = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                AudienceResearchComponent audienceResearchComponent = (AudienceResearchComponent) bpn0Var.getValue();
                return new eto(audienceResearchComponent.Z2(), audienceResearchComponent.b());
            default:
                return (efr) bpn0Var.getValue();
        }
    }
}
