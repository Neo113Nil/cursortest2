package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfileContentMainWallFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class kjh extends nfh<lg00, s3q0> {
    public final ynh j;
    public final Object k;

    public kjh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
        this.k = msy.a(LazyThreadSafetyMode.NONE, new x0(7));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ((p870) this.j.J0.getValue()).c(159);
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.nfh, xsna.jxg
    public final void k(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        lg00 lg00Var = (lg00) communityProfileContentItem;
        super.k(lg00Var, extendedCommunityProfile);
        this.c.invoke(new d.f(lg00.i(lg00Var, CommunityProfileContentItem.State.LOADED, 27)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(wjs0.b.a0(asu0.a.d()), new do3(new l5(this, 27), 9)).U(new dn(new d40(20)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean r(VideoFile videoFile) {
        if (videoFile != null) {
            return ((Boolean) this.k.getValue()).booleanValue() || videoFile.C2();
        }
        return false;
    }
}
