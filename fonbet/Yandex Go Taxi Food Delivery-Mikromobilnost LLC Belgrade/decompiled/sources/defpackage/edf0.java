package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c;
import com.yandex.go.zone.repository.r;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.profile.d;
import com.yandex.messaging.profile.g;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import java.util.HashSet;
import ru.yandex.taxi.map_common.map.utils.b;

/* loaded from: classes8.dex */
public final class edf0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ edf0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        MessengerEnvironment messengerEnvironment;
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new bdf0((Context) xvf0Var.get());
            case 1:
                return new o370((ref0) xvf0Var.get());
            case 2:
                return new d((vse) xvf0Var.get());
            case 3:
                return ((vdf0) xvf0Var.get()).a();
            case 4:
                return ((vdf0) xvf0Var.get()).c();
            case 5:
                return ((vdf0) xvf0Var.get()).b();
            case 6:
                return new zef0((pho) xvf0Var.get());
            case 7:
                return (sb7) xvf0Var.get();
            case 8:
                return (el21) xvf0Var.get();
            case 9:
                return (cae) xvf0Var.get();
            case 10:
                return new a((xdf0) xvf0Var.get());
            case 11:
                return new f3c((Context) xvf0Var.get());
            case 12:
                SharedPreferences sharedPreferences = (SharedPreferences) xvf0Var.get();
                int i2 = sharedPreferences.getInt(WebViewActivity.KEY_ENVIRONMENT, -1);
                int i3 = sharedPreferences.getInt("passport_user_env", -1);
                if (i2 != -1) {
                    messengerEnvironment = MessengerEnvironment.values()[i2];
                    if (messengerEnvironment == MessengerEnvironment.PRODUCTION && i3 == AuthEnvironment.TeamProduction.getInteger()) {
                        messengerEnvironment = MessengerEnvironment.PRODUCTION_TEAM;
                    }
                } else {
                    messengerEnvironment = i3 == AuthEnvironment.TeamProduction.getInteger() ? MessengerEnvironment.PRODUCTION_TEAM : MessengerEnvironment.PRODUCTION;
                }
                q5z.i(messengerEnvironment);
                return messengerEnvironment;
            case 13:
                return new eff0((xqi0) xvf0Var.get());
            case 14:
                return (g) xvf0Var.get();
            case 15:
                return new lff0((Context) xvf0Var.get());
            case 16:
                return new wff0(i5m.a(xvf0Var));
            case 17:
                return new zff0((Context) xvf0Var.get());
            case 18:
                return new ckf0((Activity) xvf0Var.get());
            case 19:
                return new b(i5m.a(xvf0Var));
            case 20:
                return new kmf0((lmf0) xvf0Var.get());
            case 21:
                return new lmf0((dne0) xvf0Var.get());
            case 22:
                return new va90((rqo) xvf0Var.get());
            case 23:
                return new smf0((dne0) xvf0Var.get());
            case 24:
                return new c((r) xvf0Var.get());
            case 25:
                return new co40((pho) xvf0Var.get());
            case 26:
                return new cug((pho) xvf0Var.get());
            case 27:
                return new hof0((eex) xvf0Var.get());
            case 28:
                kf00 kf00Var = (kf00) xvf0Var.get();
                nfh nfhVar = new nfh();
                nfhVar.a = kf00Var;
                nfhVar.b = new HashSet();
                nfhVar.c = new HashSet();
                return nfhVar;
            default:
                return new sof0(0, (pof0) xvf0Var.get());
        }
    }

    public /* synthetic */ edf0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
