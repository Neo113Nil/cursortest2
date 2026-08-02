package xsna;

import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.niq0;

/* compiled from: NicknamePopupHandler.kt */
/* loaded from: classes5.dex */
public final class b270 implements s40<aiq0>, yp90<wiq0> {
    public final /* synthetic */ s40<aiq0> b;
    public final /* synthetic */ yp90<wiq0> c;
    public final f4z<ExternalEvent> d;
    public final dvq0 e;
    public final ExtendedUserProfile f;

    public b270(liq0 liq0Var, niq0.a aVar, f4z f4zVar, dvq0 dvq0Var, ExtendedUserProfile extendedUserProfile) {
        this.b = liq0Var;
        this.c = aVar;
        this.d = f4zVar;
        this.e = dvq0Var;
        this.f = extendedUserProfile;
    }

    @Override // xsna.yp90
    public final void a(wiq0 wiq0Var) {
        this.c.a(wiq0Var);
    }

    @Override // xsna.s40
    public final void e2(aiq0 aiq0Var) {
        this.b.e2(aiq0Var);
    }
}
