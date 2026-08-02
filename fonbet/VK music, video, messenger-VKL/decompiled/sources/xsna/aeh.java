package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.it80;

/* compiled from: CommunityProfileAdBannerFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class aeh {
    public final UserId a;
    public final Context b;
    public final ynh c;
    public final zqu d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final tw4 f;

    public aeh(UserId userId, Context context, ynh ynhVar, zqu zquVar, io.reactivex.rxjava3.disposables.b bVar, tw4 tw4Var) {
        this.a = userId;
        this.b = context;
        this.c = ynhVar;
        this.d = zquVar;
        this.e = bVar;
        this.f = tw4Var;
    }

    public final void a(CommunityProfileAction.a aVar, CommunityProfileState communityProfileState) {
        if (aVar instanceof CommunityProfileAction.a.c) {
            b(((CommunityProfileAction.a.c) aVar).b, communityProfileState);
            return;
        }
        if (aVar instanceof CommunityProfileAction.a.d) {
            b(((CommunityProfileAction.a.d) aVar).b, communityProfileState);
            return;
        }
        if (aVar instanceof CommunityProfileAction.a.C1567a) {
            String str = ((CommunityProfileAction.a.C1567a) aVar).b;
            this.e.b(itg0.m(rsg0.y0(yfb.x(this.d.q(fkq0.a(this.a), str)), null, null, 3)));
            this.f.invoke(d.b.a.b);
            return;
        }
        if (!(aVar instanceof CommunityProfileAction.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((CommunityProfileAction.a.b) aVar).b;
        maz.c(this.c.f(), this.b, str2, LaunchContext.A, null, null, 24);
    }

    public final void b(boolean z, CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile == null) {
            return;
        }
        ComFeatures comFeatures = ComFeatures.COM_ADVERT_BANNER;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures) && extendedCommunityProfile.s2 && extendedCommunityProfile.K2 == null && !z) {
            io.reactivex.rxjava3.internal.operators.single.y l = rsg0.W(yfb.x(this.d.p(fkq0.a(this.a), 29)), 7).l(new l7(new wh6(18), 14));
            it80.b.getClass();
            this.e.b(l.o(it80.a.a()).subscribe(new ji3(new nvg(this, 4), 17)));
        }
    }
}
