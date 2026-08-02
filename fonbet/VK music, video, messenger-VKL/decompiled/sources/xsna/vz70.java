package xsna;

import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.appmetrica.analytics.BuildConfig;
import kotlin.LazyThreadSafetyMode;

/* compiled from: OldPostingFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class vz70 implements kk6 {
    public final a b = new a(PostingFragment.class, null, null);
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new c950(this, 6));

    /* compiled from: OldPostingFragmentBuilder.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.kk6
    public final kk6 a(UserId userId, String str, boolean z) {
        n().a.putParcelable("uid", userId);
        n().f();
        if (z) {
            n().b();
        } else {
            n().i();
            n().h();
            n().g();
        }
        n().d();
        n().e(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        return this;
    }

    @Override // xsna.kk6
    public final kk6 b(PostingVisibilityMode postingVisibilityMode) {
        n().b();
        n().d();
        n().e("newsfeed");
        return this;
    }

    @Override // xsna.kk6
    public final kk6 c() {
        n().a.putBoolean("fromPlusNavigate", true);
        return this;
    }

    @Override // xsna.kk6
    public final void d(u90 u90Var, int i) {
        this.b.i(u90Var, i);
    }

    @Override // xsna.kk6
    public final kk6 f() {
        n().a.putBoolean("imVideo", true);
        return this;
    }

    @Override // xsna.kk6
    public final kk6 g(UserId userId, ExtendedUserProfile extendedUserProfile) {
        Integer num;
        n().a.putParcelable("uid", userId);
        boolean z = extendedUserProfile instanceof ExtendedCommunityProfile;
        ExtendedCommunityProfile extendedCommunityProfile = z ? (ExtendedCommunityProfile) extendedUserProfile : null;
        boolean z2 = false;
        boolean z3 = extendedCommunityProfile != null ? extendedCommunityProfile.s2 : false;
        kdc0 n = n();
        UserId e = fkq0.e(extendedUserProfile.a.c);
        UserProfile userProfile = extendedUserProfile.a;
        n.c(extendedUserProfile.a0, e, userProfile.e, userProfile.h, z3, extendedUserProfile.L1, userProfile.Y);
        n().i();
        n().d();
        boolean z4 = extendedUserProfile.a0 >= 2;
        int i = extendedUserProfile.d0;
        boolean z5 = i == 1;
        boolean z6 = i == 2;
        boolean z7 = extendedUserProfile.g0;
        if (extendedUserProfile.Y == 2 || !extendedUserProfile.f0) {
            n().a.putBoolean(BuildConfig.SDK_BUILD_FLAVOR, true);
            n().f();
            if (z4) {
                n().a();
                if (z5 || z6) {
                    n().b();
                }
            } else {
                n().g();
            }
            if (z7) {
                n().e(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                return this;
            }
            n().a.putBoolean("suggest", true);
            n().e("suggest");
            return this;
        }
        ExtendedCommunityProfile extendedCommunityProfile2 = z ? (ExtendedCommunityProfile) extendedUserProfile : null;
        if (extendedCommunityProfile2 != null && (num = extendedCommunityProfile2.E2) != null && num.intValue() == 0) {
            z2 = true;
        }
        if (z4) {
            if (!z5) {
                n().a();
                n().f();
            }
            if (z5 || z6) {
                n().b();
                if (z2) {
                    n().a.putBoolean("initialAuthorGroup", true);
                }
            }
            s3q0 s3q0Var = s3q0.a;
        } else {
            n().f();
            n().g();
            if (!z7) {
                n().a.putBoolean("suggest", true);
                n().e("suggest");
                return this;
            }
            n().h();
        }
        n().e(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        return this;
    }

    @Override // xsna.kk6
    public final kk6 h(long j) {
        kdc0 n = n();
        n.a.putLong("draft", j);
        n.b();
        return this;
    }

    @Override // xsna.kk6
    public final kk6 i(PostingCreationEntryPoint postingCreationEntryPoint) {
        n().a.putString("creationEntryPoint", postingCreationEntryPoint.name());
        return this;
    }

    @Override // xsna.kk6
    public final kk6 j() {
        n().a.putBoolean("postingSuccessToastRequired", false);
        return this;
    }

    @Override // xsna.kk6
    public final kk6 k() {
        n().a.putBoolean("imPhoto", true);
        return this;
    }

    @Override // xsna.kk6
    public final void l(Context context) {
        this.b.k(context);
    }

    public final void m() {
        n().a.putBoolean("initialAuthorGroup", true);
        n().f();
        n().a.putBoolean("withoutGood", true);
        n().a.putBoolean("withoutService", true);
        n().a.putBoolean("posterAllowed", false);
        n().a.putBoolean("withoutLocation", true);
        n().a.putBoolean("withoutAlbum", true);
        n().a.putBoolean("withoutDocument", false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final kdc0 n() {
        return (kdc0) this.c.getValue();
    }

    @Override // xsna.kk6
    public final kk6 e(String str) {
        return this;
    }
}
