package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.view.avatar.UserProfileAvatarView;

/* compiled from: UserProfileAvatarView.kt */
/* loaded from: classes5.dex */
public final class mmq0 implements dyl0 {
    public boolean a;
    public final Object b;

    public mmq0(og0 og0Var) {
        og0Var.getClass();
        this.a = false;
        this.b = (sws0) og0Var.b;
    }

    @Override // xsna.dyl0
    public void b() {
        UserProfileAvatarView userProfileAvatarView = (UserProfileAvatarView) this.b;
        if (this.a) {
            userProfileAvatarView.f.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            userProfileAvatarView.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            userProfileAvatarView.f.animate().alpha(1.0f).start();
            userProfileAvatarView.g.animate().alpha(1.0f).start();
        }
    }

    @Override // xsna.dyl0
    public void onStart() {
        UserProfileAvatarView userProfileAvatarView = (UserProfileAvatarView) this.b;
        userProfileAvatarView.f.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
        userProfileAvatarView.g.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
    }

    public mmq0(UserProfileAvatarView userProfileAvatarView, boolean z) {
        this.b = userProfileAvatarView;
        this.a = z;
    }

    @Override // xsna.dyl0
    public void a() {
    }
}
