package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityProfileTrustMarksFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class luh {
    public final u9e a;

    public luh(u9e u9eVar) {
        this.a = u9eVar;
    }

    public final void a(CommunityProfileAction.e.j jVar, CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        boolean z = jVar instanceof CommunityProfileAction.e.j.a;
        u9e u9eVar = this.a;
        if (z) {
            if (extendedCommunityProfile == null) {
                return;
            }
            g2h g2hVar = new g2h(extendedCommunityProfile.a.c);
            CommunityProfileAction.e.j.a aVar = (CommunityProfileAction.e.j.a) jVar;
            g2hVar.e = aVar.c.toLowerCase(Locale.ROOT);
            g2hVar.b = "phone";
            g2hVar.c = "tap";
            g2hVar.a();
            u9eVar.invoke(new d.j.C1597j(aVar.b));
            return;
        }
        if (jVar instanceof CommunityProfileAction.e.j.b) {
            if (extendedCommunityProfile == null) {
                return;
            }
            u9eVar.invoke(new d.j.a0(extendedCommunityProfile));
        } else {
            if (!(jVar instanceof CommunityProfileAction.e.j.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (extendedCommunityProfile == null) {
                return;
            }
            u9eVar.invoke(new d.j.i(extendedCommunityProfile, ((CommunityProfileAction.e.j.c) jVar).b));
        }
    }
}
