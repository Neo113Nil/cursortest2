package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.friends.api.FollowersInitialTab;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.u;

/* compiled from: UserDetailsItemCallbackImpl.kt */
/* loaded from: classes5.dex */
public final class khq0 implements jhq0 {
    public final ExtendedUserProfile a;
    public final a13 b;
    public final q3s c;

    public khq0(ExtendedUserProfile extendedUserProfile, a13 a13Var, q3s q3sVar) {
        this.a = extendedUserProfile;
        this.b = a13Var;
        this.c = q3sVar;
    }

    @Override // xsna.jhq0
    public final void a(FragmentActivity fragmentActivity) {
        this.c.a(fragmentActivity, this.a, FollowersInitialTab.FOLLOWERS);
    }

    @Override // xsna.jhq0
    public final void b(FragmentActivity fragmentActivity, long j) {
        this.b.b(fragmentActivity, new UserId(j));
    }

    @Override // xsna.jhq0
    public final a13 c() {
        return this.b;
    }

    @Override // xsna.jhq0
    public final void d(FragmentActivity fragmentActivity) {
        ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        ExtendedUserProfile extendedUserProfile = this.a;
        if (!a || bwd0.d(extendedUserProfile)) {
            this.b.d(fragmentActivity, extendedUserProfile, false);
        } else {
            this.c.a(fragmentActivity, extendedUserProfile, FollowersInitialTab.FRIENDS);
        }
    }

    @Override // xsna.jhq0
    public final void e(Context context, String str) {
        int i = u.h1;
        u.a.a(context, str, new r(0));
    }

    @Override // xsna.jhq0
    public final void f(FragmentActivity fragmentActivity) {
        this.b.e(fragmentActivity, bwd0.i(this.a));
    }
}
