package defpackage;

import com.yandex.messaging.input.c;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;

/* loaded from: classes15.dex */
public final class in3 extends al3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ in3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.al3
    public final void a(AuthorizationObservable$AuthState authorizationObservable$AuthState) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x6f0) ((y6f0) obj)).d(authorizationObservable$AuthState);
                break;
            default:
                ((c) obj).c();
                break;
        }
    }
}
