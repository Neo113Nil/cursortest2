package defpackage;

import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import com.yandex.messaging.internal.suspend.a;
import com.yandex.messaging.isolated.c;

/* loaded from: classes15.dex */
public final class pzw extends al3 {
    public final /* synthetic */ c a;

    public pzw(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.al3
    public final void a(AuthorizationObservable$AuthState authorizationObservable$AuthState) {
        AuthorizationObservable$AuthState authorizationObservable$AuthState2 = AuthorizationObservable$AuthState.AuthorizedPassport;
        c cVar = this.a;
        if (authorizationObservable$AuthState == authorizationObservable$AuthState2) {
            cVar.q(null);
            return;
        }
        if (authorizationObservable$AuthState == AuthorizationObservable$AuthState.LimitedPassport && cVar.E.a(tz10.j)) {
            cVar.q(null);
            return;
        }
        if (authorizationObservable$AuthState == AuthorizationObservable$AuthState.Syncing || authorizationObservable$AuthState == AuthorizationObservable$AuthState.Upgrading) {
            return;
        }
        if (!cVar.A.d) {
            sfl0 sfl0Var = cVar.D;
            new vi3(e520.d, MessagingAction.OpenChatList.a, true);
            sfl0Var.getClass();
            return;
        }
        if (!cVar.K) {
            j1q j1qVar = (j1q) cVar.G;
            if (j1qVar.a != null && ((Boolean) j1qVar.b.e.getValue()).booleanValue()) {
                a.b(cVar.C.f(true), cVar.getBrickScope());
            }
            cVar.K = true;
        }
        cVar.q(null);
    }
}
