package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.auth.AuthTheme;
import com.yandex.messaging.auth.passport.b;
import com.yandex.passport.api.e;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.f;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class oo90 {
    public final ol3 a;
    public final xqi0 b;
    public final qp90 c;
    public final xh3 d;

    public oo90(ol3 ol3Var, xqi0 xqi0Var, qp90 qp90Var, xh3 xh3Var) {
        this.a = ol3Var;
        this.b = xqi0Var;
        this.c = qp90Var;
        this.d = xh3Var;
    }

    public final Intent a(String str) {
        xqi0 xqi0Var = this.b;
        xqi0Var.getClass();
        tje.e();
        yk3 yk3Var = xqi0Var.p;
        if (yk3Var == null) {
            ny61.k();
            return null;
        }
        wl3 c = yk3Var.c();
        AuthTheme a = this.a.a();
        qp90 qp90Var = this.c;
        b bVar = qp90Var.b;
        if (bVar == null) {
            qp90Var.b("createBindPhoneIntent");
            return null;
        }
        Context context = qp90Var.a;
        e eVar = bVar.c;
        BindPhoneProperties.a aVar = new BindPhoneProperties.a();
        aVar.b = jjo.f(c);
        aVar.a = gob1.d(a);
        aVar.c = str;
        BindPhoneProperties.Companion.getClass();
        return eVar.e(context, f.a(aVar));
    }

    public final Intent b(String str) {
        hj3 hj3Var = new hj3(c(), this.a.a(), new bm3(false), str);
        qp90 qp90Var = this.c;
        b bVar = qp90Var.b;
        if (bVar == null) {
            qp90Var.b("createLoginIntent");
            return null;
        }
        return bVar.c.i(qp90Var.a, mtf0.a(hj3Var));
    }

    public final vh3 c() {
        Pair pair;
        xh3 xh3Var = this.d;
        switch (wh3.a[xh3Var.a.ordinal()]) {
            case 1:
            case 2:
                pair = new Pair(MessengerEnvironment.TESTING, MessengerEnvironment.TESTING_TEAM);
                break;
            case 3:
            case 4:
                pair = new Pair(MessengerEnvironment.ALPHA, MessengerEnvironment.ALPHA_TEAM);
                break;
            case 5:
            case 6:
                pair = new Pair(MessengerEnvironment.PRODUCTION, MessengerEnvironment.PRODUCTION_TEAM);
                break;
            default:
                w511.b();
                return null;
        }
        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) pair.getFirst();
        MessengerEnvironment messengerEnvironment2 = (MessengerEnvironment) pair.getSecond();
        AuthEnvironment a = messengerEnvironment.a();
        messengerEnvironment2.a();
        xh3Var.b.getClass();
        return new vh3(a, null);
    }
}
