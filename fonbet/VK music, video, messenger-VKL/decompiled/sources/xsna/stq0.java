package xsna;

import android.app.Activity;
import android.content.Intent;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.utils.Logger;

/* compiled from: UserProfilePrivacyFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class stq0 implements huq {
    public final ouq0 b;
    public final inj0 c;
    public io.reactivex.rxjava3.disposables.b d;
    public u5p0 e;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> f;
    public fpq0 g;
    public io.reactivex.rxjava3.disposables.c h;

    public stq0(ouq0 ouq0Var, inj0 inj0Var) {
        this.b = ouq0Var;
        this.c = inj0Var;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.g = fpq0Var;
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
        PhotoAlbum photoAlbum;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null) {
            return;
        }
        if (aVar.a() || aVar.c == 0) {
            switch (aVar.b) {
                case 3235:
                    io.reactivex.rxjava3.disposables.c subscribe = this.b.z().subscribe(new qtq0(new wze0(6, this, extendedUserProfile), 0), new cl30(new rtq0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 18));
                    io.reactivex.rxjava3.disposables.b bVar = this.d;
                    (bVar != null ? bVar : null).b(subscribe);
                    break;
                case 3236:
                    u5p0 u5p0Var = this.e;
                    if (u5p0Var == null) {
                        u5p0Var = null;
                    }
                    u5p0Var.invoke(new UserProfileAction.x(null, 15));
                    break;
                case 3237:
                    u5p0 u5p0Var2 = this.e;
                    if (u5p0Var2 == null) {
                        u5p0Var2 = null;
                    }
                    u5p0Var2.invoke(new UserProfileAction.x(null, 15));
                    break;
                case 3238:
                    u5p0 u5p0Var3 = this.e;
                    if (u5p0Var3 == null) {
                        u5p0Var3 = null;
                    }
                    u5p0Var3.invoke(new UserProfileAction.x(null, 15));
                    break;
                case 3239:
                    Intent intent = aVar.d;
                    if (intent != null && (photoAlbum = (PhotoAlbum) intent.getParcelableExtra("album")) != null) {
                        fpq0 fpq0Var = this.g;
                        (fpq0Var != null ? fpq0Var : null).B(new f.e.v0(photoAlbum));
                        break;
                    }
                    break;
            }
        }
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.f;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.s.e eVar) {
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null) {
            return;
        }
        if (eVar.equals(UserProfileAction.s.e.a.b)) {
            fpq0 fpq0Var = this.g;
            (fpq0Var != null ? fpq0Var : null).B(f.e.j1.a);
            return;
        }
        if (eVar.equals(UserProfileAction.s.e.c.b)) {
            io.reactivex.rxjava3.disposables.c subscribe = super.K(this.b.A(), b.r.a.b).subscribe(new nvm0(new cpo0(2, this, extendedUserProfile), 6));
            io.reactivex.rxjava3.disposables.b bVar = this.d;
            (bVar != null ? bVar : null).b(subscribe);
            return;
        }
        if (eVar.equals(UserProfileAction.s.e.b.b)) {
            io.reactivex.rxjava3.disposables.c subscribe2 = this.c.b().r0(asu0.a.c()).subscribe(new bdz(new svk0(this, 16), 28));
            io.reactivex.rxjava3.disposables.b bVar2 = this.d;
            if (bVar2 == null) {
                bVar2 = null;
            }
            bVar2.b(subscribe2);
            this.h = subscribe2;
            fpq0 fpq0Var2 = this.g;
            (fpq0Var2 != null ? fpq0Var2 : null).B(f.e.p1.a);
            return;
        }
        if (!(eVar instanceof UserProfileAction.s.e.d)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((extendedUserProfile.C1 > 0) != ((UserProfileAction.s.e.d) eVar).b) {
            u5p0 u5p0Var = this.e;
            if (u5p0Var == null) {
                u5p0Var = null;
            }
            u5p0Var.invoke(new UserProfileAction.x(null, 15));
        }
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.d = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.e = u5p0Var;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.f = r9c0Var;
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
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }
}
