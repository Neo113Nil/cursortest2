package xsna;

import android.app.Activity;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.concurrent.TimeUnit;

/* compiled from: UserProfileContentBaseFeatureDelegate.kt */
/* loaded from: classes5.dex */
public abstract class wmq0<T extends CommunityProfileContentItem, Action> implements huq, rgq0<T> {
    public final dvq0 b;
    public final r0e0 c;
    public final boolean d;
    public io.reactivex.rxjava3.disposables.b e;
    public u5p0 f;
    public fpq0 g;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> h;
    public boolean i;
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();
    public boolean k = true;
    public defpackage.t l;

    public wmq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z) {
        this.b = dvq0Var;
        this.c = r0e0Var;
        this.d = z;
    }

    public static /* synthetic */ void B(wmq0 wmq0Var, CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        wmq0Var.A(communityProfileContentItem, state, state2);
    }

    public static CommunityProfileContentItem.d u(wmq0 wmq0Var, ExtendedUserProfile.m mVar, int i, int i2, boolean z, int i3) {
        com.vk.profile.core.tabs.state.a aVar;
        com.vk.profile.core.tabs.state.b bVar;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = R.string.community_profile_fab_add;
        }
        int i4 = (i3 & 8) != 0 ? 0 : R.string.community_profile_fab_open_music;
        if ((i3 & 64) != 0) {
            z = false;
        }
        wmq0Var.getClass();
        boolean z2 = mVar.d;
        boolean z3 = mVar.c;
        if (!z3 || z) {
            aVar = null;
        } else {
            if (z2 || i == 0) {
                i = i2;
            }
            aVar = new com.vk.profile.core.tabs.state.a(i, 0, null);
        }
        if (mVar.a.equals("short_videos") || !z2) {
            bVar = null;
        } else {
            if (z3 || i4 == 0) {
                i4 = R.string.community_profile_fab_open;
            }
            bVar = new com.vk.profile.core.tabs.state.b(i4);
        }
        if (aVar == null && bVar == null) {
            return null;
        }
        return new CommunityProfileContentItem.d(aVar, bVar, 4);
    }

    public static CommunityProfileContentItem.b y(wmq0 wmq0Var, ExtendedUserProfile.m mVar, int i, Integer num, boolean z, String str, int i2) {
        Integer valueOf = Integer.valueOf(R.string.community_content_open_photos_section);
        if ((i2 & 2) != 0) {
            num = null;
        }
        boolean z2 = (i2 & 4) != 0 ? false : z;
        Integer num2 = (i2 & 8) != 0 ? null : valueOf;
        String str2 = (i2 & 16) != 0 ? null : str;
        wmq0Var.getClass();
        return new CommunityProfileContentItem.b(i, (!mVar.c || z2) ? null : num, num2, str2, null, 16);
    }

    public abstract void A(T t, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2);

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.g = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.h;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    @Override // xsna.rgq0
    public final void a(T t, ExtendedUserProfile extendedUserProfile) {
        h(t, extendedUserProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(T t, ExtendedUserProfile extendedUserProfile) {
        CommunityProfileContentItem q = q(t);
        z(q);
        if (this.k) {
            h(q, extendedUserProfile);
        } else {
            this.l = new defpackage.t(this, q, extendedUserProfile, 2);
        }
    }

    @Override // xsna.rgq0
    public final void d(T t, ExtendedUserProfile extendedUserProfile) {
        b(t);
    }

    public void h(T t, ExtendedUserProfile extendedUserProfile) {
        this.j.e();
        if (!this.i) {
            this.i = true;
            x(t);
        }
        this.l = null;
        B(this, t, CommunityProfileContentItem.State.LOADING, null, 4);
        w(t);
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.e = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.f = u5p0Var;
    }

    @Override // xsna.huq
    public final void onPause() {
        this.k = false;
    }

    @Override // xsna.huq
    public final void onResume() {
        this.k = true;
        defpackage.t tVar = this.l;
        if (tVar != null) {
            tVar.invoke();
        }
        this.l = null;
    }

    public final void p(io.reactivex.rxjava3.core.x xVar, izs izsVar, izs izsVar2) {
        io.reactivex.rxjava3.disposables.c subscribe = xVar.subscribe(new ttc0(izsVar, 1), new o3y(izsVar2, 27));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
        this.j.b(subscribe);
    }

    public abstract CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem);

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.h = r9c0Var;
    }

    public abstract T s(ExtendedUserProfile.m mVar, boolean z, boolean z2);

    public io.reactivex.rxjava3.core.q<Action> t() {
        return null;
    }

    public abstract String v();

    public abstract void w(CommunityProfileContentItem communityProfileContentItem);

    public void x(T t) {
        io.reactivex.rxjava3.disposables.c subscribe;
        io.reactivex.rxjava3.core.q<Action> t2 = t();
        if (t2 == null || (subscribe = t2.v0(500L, TimeUnit.MILLISECONDS).subscribe(new le50(new il7(21, this, t), 20))) == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    public void z(T t) {
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.h;
        if (izsVar == null) {
            izsVar = null;
        }
        izsVar.invoke(new b.c(t));
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public void onDestroy() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    public void b(CommunityProfileContentItem communityProfileContentItem) {
    }

    public void e(T t) {
    }

    @Override // xsna.huq
    public void m(Activity activity) {
    }

    public void o(CommunityProfileContentItem communityProfileContentItem) {
    }

    @Override // xsna.huq
    public void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }

    public void f(T t, ExtendedUserProfile extendedUserProfile) {
    }

    public void g(T t, ExtendedUserProfile extendedUserProfile) {
    }

    public void l(T t, ExtendedUserProfile extendedUserProfile) {
    }

    public void n(T t, ExtendedUserProfile extendedUserProfile) {
    }
}
