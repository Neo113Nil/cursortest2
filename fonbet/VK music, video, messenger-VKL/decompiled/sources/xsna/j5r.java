package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;

/* compiled from: FeedWallProfileHandler.kt */
/* loaded from: classes7.dex */
public final class j5r implements fhd0, lao0 {
    public final ProfileFragmentProviderComponent a;

    public j5r(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        WallGetMode wallGetMode = epx.f(fgxVar.a("own"), "1") ? WallGetMode.OWNER : epx.f(fgxVar.a("donut"), "1") ? WallGetMode.DONUT : epx.f(fgxVar.a("archive"), "1") ? WallGetMode.ARCHIVED : WallGetMode.ALL;
        UserId userId = new UserId(cqm0.l(fgxVar.c("userId")));
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.a.ye(userId, null).N(wallGetMode).K(blk.O(fgxVar).h).k(fgxVar.e);
        blk.P(fgxVar).onSuccess();
    }
}
