package xsna;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.friends.groupinvite.api.di.InviteFriendsComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.story.api.di.StoriesComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ zef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((VkOnboardingComponent) this.c.a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 1:
                return ((InviteFriendsComponent) this.c.mo408a(fpf0.a(InviteFriendsComponent.class))).a();
            case 2:
                return ((StoriesComponent) this.c.a(fpf0.a(StoriesComponent.class))).w();
            default:
                return ((LinksBridgeComponent) this.c.a(fpf0.a(LinksBridgeComponent.class))).p().a();
        }
    }
}
