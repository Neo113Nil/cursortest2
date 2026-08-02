package defpackage;

import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;

/* loaded from: classes15.dex */
public abstract class al3 implements cl3 {
    public abstract void a(AuthorizationObservable$AuthState authorizationObservable$AuthState);

    @Override // defpackage.cl3
    public final void b() {
        a(AuthorizationObservable$AuthState.LimitedAnonymous);
    }

    @Override // defpackage.cl3
    public final void d() {
        a(AuthorizationObservable$AuthState.Syncing);
    }

    @Override // defpackage.cl3
    public final void e() {
        a(AuthorizationObservable$AuthState.AuthorizedPassport);
    }

    @Override // defpackage.cl3
    public final void g() {
        a(AuthorizationObservable$AuthState.LimitedPassport);
    }

    @Override // defpackage.cl3
    public final void h() {
        a(AuthorizationObservable$AuthState.Upgrading);
    }
}
