package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes15.dex */
public final class pe51 implements k120 {
    public final MessengerEnvironment a;
    public final b220 b;

    public pe51(MessengerEnvironment messengerEnvironment, b220 b220Var) {
        this.a = messengerEnvironment;
        this.b = b220Var;
    }

    @Override // defpackage.k120
    public final Object j() {
        String str;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        b5o e = this.b.e();
        if (e == null || (str = e.a) == null) {
            str = "push.yandex.ru";
        }
        jwuVar.h(str);
        return jwuVar;
    }

    @Override // defpackage.k120
    public final Object k() {
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h("push.yandex-team.ru");
        return jwuVar;
    }

    @Override // defpackage.k120
    public final Object l() {
        String str;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        b5o e = this.b.e();
        if (e == null || (str = e.b) == null) {
            str = "push-sandbox.yandex.ru";
        }
        jwuVar.h(str);
        return jwuVar;
    }

    @Override // defpackage.k120
    public final Object m() {
        String str;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        b5o e = this.b.e();
        if (e == null || (str = e.a) == null) {
            str = "push.yandex.ru";
        }
        jwuVar.h(str);
        return jwuVar;
    }

    @Override // defpackage.k120
    public final Object o() {
        String str;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        b5o e = this.b.e();
        if (e == null || (str = e.b) == null) {
            str = "push-sandbox.yandex.ru";
        }
        jwuVar.h(str);
        return jwuVar;
    }

    @Override // defpackage.k120
    public final Object s() {
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h("push.yandex-team.ru");
        return jwuVar;
    }
}
