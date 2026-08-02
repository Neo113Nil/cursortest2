package xsna;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.rustore.sdk.appupdate.B;
import ru.rustore.sdk.appupdate.C;
import ru.rustore.sdk.appupdate.C5382b;
import ru.rustore.sdk.appupdate.C5383e;
import ru.rustore.sdk.appupdate.C5386o;
import ru.rustore.sdk.appupdate.C5389s;
import ru.rustore.sdk.appupdate.L;
import ru.rustore.sdk.appupdate.M;
import ru.rustore.sdk.appupdate.N;
import ru.rustore.sdk.appupdate.O;
import ru.rustore.sdk.appupdate.P;
import ru.rustore.sdk.appupdate.Q;
import ru.rustore.sdk.appupdate.S;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import xsna.dy5;
import xsna.r4y0;
import xsna.zh50;
import xsna.zh50.a;

/* loaded from: classes9.dex */
public final class mrn0 implements wqg0 {
    public final bpn0 a;
    public final CopyOnWriteArraySet<h6x> b = new CopyOnWriteArraySet<>();
    public final r9y0 c;
    public AppUpdateOptions d;

    public mrn0(Context context) {
        r4y0 r4y0Var;
        this.a = new bpn0(new N(context));
        zby zbyVar = new zby();
        new r4y0.a();
        synchronized (r4y0.a.class) {
            r4y0Var = r4y0.h;
            if (r4y0Var == null) {
                r4y0Var = new r4y0(context);
                r4y0.h = r4y0Var;
            }
        }
        r9y0 r9y0Var = (r9y0) r4y0Var.b.getValue();
        this.c = r9y0Var;
        r9y0Var.getClass();
        jiy0 jiy0Var = new jiy0("sdkInfo", (Map) r9y0Var.e.getValue());
        kyy0 kyy0Var = r9y0Var.a;
        kyy0Var.getClass();
        euj0 euj0Var = new euj0(new iuj0(new C5383e(kyy0Var, jiy0Var)), new ru.rustore.sdk.appupdate.f(kyy0Var));
        bpn0 bpn0Var = adn.a;
        qz9.f(new yuj0(new gwj0(euj0Var, adn.a()), ru.rustore.sdk.appupdate.g.i), C5382b.i);
        v7x v7xVar = zbyVar.b;
        dy5.a aVar = new dy5.a();
        zh50<T> zh50Var = ((yh50) v7xVar.c).b;
        zh50Var.getClass();
        zh50.a aVar2 = zh50Var.new a(aVar);
        synchronized (cdn.b) {
        }
        new uq70(aVar2, (pcn) adn.c.getValue(), new dy5.a()).r(new br70(ywp.a, ar70.i, new O(this)));
        anj.d(context, new L(zbyVar), new IntentFilter("rustore_app_downloading_state_" + context.getPackageName()), null, 2);
    }

    @Override // xsna.wqg0
    public final d5o0<AppUpdateInfo> a() {
        a4z0 a4z0Var = (a4z0) this.a.getValue();
        a4z0Var.getClass();
        suj0 a = a4z0Var.a(new ru.rustore.sdk.appupdate.v(a4z0Var));
        bpn0 bpn0Var = adn.a;
        return M.a(new gwj0(a, adn.a()));
    }

    @Override // xsna.wqg0
    public final d5o0<s3q0> b(AppUpdateOptions appUpdateOptions) {
        int appUpdateType = appUpdateOptions.getAppUpdateType();
        r9y0 r9y0Var = this.c;
        r9y0Var.getClass();
        jiy0 jiy0Var = new jiy0("updateStart.update", r9y0Var.a(appUpdateType));
        Context context = r9y0Var.d;
        xx1.A(context, context.getPackageName(), jiy0Var);
        a4z0 a4z0Var = (a4z0) this.a.getValue();
        a4z0Var.getClass();
        euj0 euj0Var = new euj0(a4z0Var.a(new C5386o(a4z0Var)), new C5389s(a4z0Var, appUpdateType));
        bpn0 bpn0Var = adn.a;
        return M.a(new gwj0(euj0Var, adn.a()));
    }

    @Override // xsna.wqg0
    public final void c(fsg0 fsg0Var) {
        this.b.remove(fsg0Var);
    }

    @Override // xsna.wqg0
    public final void d(fsg0 fsg0Var) {
        this.b.add(fsg0Var);
    }

    @Override // xsna.wqg0
    public final d5o0<Integer> e(AppUpdateInfo appUpdateInfo, AppUpdateOptions appUpdateOptions) {
        gwj0 gwj0Var;
        ctj0 ctj0Var;
        this.d = appUpdateOptions;
        int updateAvailability = appUpdateInfo.getUpdateAvailability();
        r9y0 r9y0Var = this.c;
        if (updateAvailability != 2) {
            r9y0Var.b(appUpdateOptions.getAppUpdateType(), "update not available");
            ctj0Var = new ntj0(new P());
        } else if (appUpdateInfo.isUsed$sdk_public_appupdate_release()) {
            r9y0Var.b(appUpdateOptions.getAppUpdateType(), "AppUpdateInfo object is already used. Call the method getAppUpdateInfo() again");
            ctj0Var = new ntj0(new Q());
        } else {
            int appUpdateType = appUpdateOptions.getAppUpdateType();
            r9y0Var.getClass();
            jiy0 jiy0Var = new jiy0("updateStart.request", r9y0Var.a(appUpdateType));
            Context context = r9y0Var.d;
            xx1.A(context, context.getPackageName(), jiy0Var);
            int appUpdateType2 = appUpdateOptions.getAppUpdateType();
            bpn0 bpn0Var = this.a;
            if (appUpdateType2 == 1) {
                a4z0 a4z0Var = (a4z0) bpn0Var.getValue();
                a4z0Var.getClass();
                ntj0 ntj0Var = new ntj0(new ru.rustore.sdk.appupdate.y(a4z0Var, appUpdateInfo));
                bpn0 bpn0Var2 = adn.a;
                gwj0Var = new gwj0(ntj0Var, adn.a());
            } else if (appUpdateType2 != 2) {
                a4z0 a4z0Var2 = (a4z0) bpn0Var.getValue();
                a4z0Var2.getClass();
                euj0 euj0Var = new euj0(a4z0Var2.a(new ru.rustore.sdk.appupdate.r(a4z0Var2)), new C(a4z0Var2, appUpdateInfo));
                bpn0 bpn0Var3 = adn.a;
                gwj0Var = new gwj0(euj0Var, adn.a());
            } else {
                a4z0 a4z0Var3 = (a4z0) bpn0Var.getValue();
                a4z0Var3.getClass();
                suj0 a = a4z0Var3.a(new B(a4z0Var3, appUpdateInfo));
                bpn0 bpn0Var4 = adn.a;
                ctj0Var = new ruj0(new gwj0(a, adn.a()), S.i);
            }
            ctj0Var = gwj0Var;
        }
        return M.a(ctj0Var);
    }
}
