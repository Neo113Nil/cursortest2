package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: UserProfileUtilImpl.kt */
/* loaded from: classes5.dex */
public final class evq0 implements dvq0 {
    public final Context a;
    public final b25 b;
    public final baq0 c;
    public final pkd d;
    public final gd60 e;

    public evq0(Context context, b25 b25Var, baq0 baq0Var, pkd pkdVar, gd60 gd60Var, sdy sdyVar) {
        this.a = context;
        this.b = b25Var;
        this.c = baq0Var;
        this.d = pkdVar;
        this.e = gd60Var;
    }

    @Override // xsna.dvq0
    public final boolean a(UserId userId) {
        b25 b25Var = this.b;
        return b25Var.b() && b25Var.a(userId);
    }

    @Override // xsna.dvq0
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i0q0.f(new defpackage.e0(28, this, str));
    }

    @Override // xsna.dvq0
    public final UserId c() {
        return this.b.c();
    }

    @Override // xsna.dvq0
    public final boolean d(ExtendedUserProfile extendedUserProfile) {
        return extendedUserProfile.m || extendedUserProfile.g();
    }

    @Override // xsna.dvq0
    public final ImageStatus e() {
        return (ImageStatus) ((bxx) this.e.a().a(m6r0.E0));
    }

    @Override // xsna.dvq0
    public final boolean f() {
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return TimeUnit.DAYS.toSeconds(30L) + this.b.o().g > ((long) pvo0.a());
    }

    @Override // xsna.dvq0
    public final String g(ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile instanceof ExtendedCommunityProfile) {
            ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) extendedUserProfile;
            if (drm0.D(extendedCommunityProfile.T2, "https://", false)) {
                return extendedCommunityProfile.T2;
            }
        }
        String str = null;
        String str2 = extendedUserProfile != null ? extendedUserProfile.A0 : null;
        String str3 = "https://" + a0a.d + '/' + str2;
        if (str2 != null && !drm0.N(str2)) {
            str = str3;
        }
        return str == null ? "" : str;
    }

    @Override // xsna.dvq0
    public final String getString(int i, Object... objArr) {
        return this.a.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.dvq0
    public final UserProfile h() {
        return this.b.o().b();
    }

    @Override // xsna.dvq0
    public final long i() {
        return this.a.getResources().getInteger(R.integer.fr_animation_mediumAnimTime) * 2;
    }

    @Override // xsna.dvq0
    public final defpackage.f0 j(MviImplFragment mviImplFragment) {
        vbs Ln = mviImplFragment.Ln();
        return new defpackage.f0(28, new WeakReference(mviImplFragment), new WeakReference(Ln != null ? Ln.h : null));
    }

    @Override // xsna.dvq0
    public final boolean k(ExtendedUserProfile extendedUserProfile) {
        ArrayList<String> arrayList = extendedUserProfile.t1;
        return arrayList == null || arrayList.contains("city");
    }

    @Override // xsna.dvq0
    public final void l(String str) {
        this.c.a(str);
    }

    @Override // xsna.dvq0
    public final boolean m() {
        return this.d.getExperiments().c();
    }

    @Override // xsna.dvq0
    public final boolean n() {
        return this.e.S(this.a);
    }
}
