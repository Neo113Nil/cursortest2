package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AvatarEvent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.atq0;
import xsna.moq0;
import xsna.nyd0;

/* compiled from: UserProfileAvatarFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class jmq0 implements huq {
    public final r0e0 b;
    public final dvq0 c;
    public final fzd0 d;
    public final ouq0 e;
    public final lyd0 f;
    public final String g;
    public io.reactivex.rxjava3.disposables.b h;
    public u5p0 i;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> j;
    public fpq0 k;
    public io.reactivex.rxjava3.disposables.c l;

    public jmq0(r0e0 r0e0Var, dvq0 dvq0Var, fzd0 fzd0Var, ouq0 ouq0Var, lyd0 lyd0Var, String str) {
        this.b = r0e0Var;
        this.c = dvq0Var;
        this.d = fzd0Var;
        this.e = ouq0Var;
        this.f = lyd0Var;
        this.g = str;
    }

    public static moq0.a b(ExtendedUserProfile extendedUserProfile, i0u0 i0u0Var) {
        ArrayList<StoriesContainer> arrayList = extendedUserProfile.v1;
        if (!arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (fsk.x((StoriesContainer) it.next())) {
                    return new moq0.a.d(i0u0Var);
                }
            }
        }
        return extendedUserProfile.c() == 1 ? new moq0.a.g(i0u0Var) : new moq0.a.f(i0u0Var);
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.k = fpq0Var;
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
        Bundle extras;
        String str = this.g;
        int m = xo9.m(3901, hashCode(), str != null ? Integer.valueOf(str.hashCode()) : null, true);
        L.o(new h59(aVar, this, m));
        if (aVar.a() && aVar.b == m) {
            Intent intent = aVar.d;
            Boolean valueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("is_from_gallery"));
            if (valueOf != null) {
                boolean booleanValue = valueOf.booleanValue();
                lyd0 lyd0Var = this.f;
                if (booleanValue) {
                    nyd0.c k = lyd0Var.k();
                    k.getClass();
                    k.a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CHANGE_AVATAR_GALLERY, null);
                } else {
                    nyd0.c k2 = lyd0Var.k();
                    k2.getClass();
                    k2.a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CHANGE_AVATAR_CAMERA, null);
                }
            }
            fzd0.b(this.d, xo9.m(3901, hashCode(), str != null ? Integer.valueOf(str.hashCode()) : null, false), aVar.c, aVar.d, new imq0(this), null, gVar.v, 48);
        }
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.j;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(ExtendedUserProfile extendedUserProfile, moq0.a.c cVar) {
        String str = cVar.f;
        if (str != null) {
            u5p0 u5p0Var = this.i;
            if (u5p0Var == null) {
                u5p0Var = null;
            }
            u5p0Var.invoke(new UserProfileAction.a0(str));
        }
        this.f.k().b();
        String str2 = this.g;
        int m = xo9.m(3901, hashCode(), str2 != null ? Integer.valueOf(str2.hashCode()) : null, true);
        L.o(new g9c0(this, m, 1));
        fpq0 fpq0Var = this.k;
        (fpq0Var != null ? fpq0Var : null).B(new f.e.l(extendedUserProfile, m));
    }

    public final void c() {
        fpq0 fpq0Var = this.k;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.h(new atq0.f(Integer.valueOf(R.string.user_profile_no_avatar_photos), null, null, 14)));
    }

    public final void d() {
        nyd0.c k = this.f.k();
        k.getClass();
        k.a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CLICK_TO_OPEN_PHOTO, null);
        io.reactivex.rxjava3.disposables.c subscribe = super.K(this.e.l(), b.r.a.b).subscribe(new hmq0(new v53(25, this, new gj80(this, 27)), 0), new tmz(new l850(this, 24), 22));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        (bVar != null ? bVar : null).b(subscribe);
    }

    public final void e(ExtendedUserProfile extendedUserProfile, i0u0 i0u0Var, qvl0 qvl0Var) {
        nyd0.c k = this.f.k();
        k.getClass();
        k.a(MobileOfficialAppsProfileStat$AvatarEvent.AvatarEventType.CLICK_TO_VIEW_STORY, null);
        fpq0 fpq0Var = this.k;
        (fpq0Var != null ? fpq0Var : null).B(new f.e.q1(new cwl0(extendedUserProfile.a.c, ((StoriesContainer) j5g.Y(extendedUserProfile.v1)).Ob(), extendedUserProfile.v1, i0u0Var, new yei0(qvl0Var, 10), new mwm0(qvl0Var, 3), MobileOfficialAppsConStoriesStat$ViewEntryPoint.PROFILE, null)));
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.h = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.i = u5p0Var;
    }

    @Override // xsna.huq
    public final void onStart() {
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.d2 c = this.e.c();
        zk30 zk30Var = new zk30(new fuc0(this, 18), 22);
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = c.subscribe(zk30Var, new iwg0());
        this.l = subscribe;
        if (subscribe != null) {
            io.reactivex.rxjava3.disposables.b bVar = this.h;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(subscribe);
        }
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.j = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }
}
