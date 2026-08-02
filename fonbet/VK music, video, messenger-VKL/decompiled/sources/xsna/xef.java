package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent;
import com.vk.story.api.di.StoriesComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ xef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class));
            case 1:
                return ((StoriesComponent) this.c.a(fpf0.a(StoriesComponent.class))).b7();
            default:
                return (CreationOnboardingComponent) this.c.mo408a(fpf0.a(CreationOnboardingComponent.class));
        }
    }
}
