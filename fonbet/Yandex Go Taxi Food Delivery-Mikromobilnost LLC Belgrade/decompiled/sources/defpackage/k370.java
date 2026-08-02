package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.domain.experiments.a;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class k370 extends yk3 implements kp90 {
    public final wl3 c;
    public final mp90 w;

    public k370(xqi0 xqi0Var, wl3 wl3Var) {
        super(xqi0Var, null);
        this.c = wl3Var;
        w040 d = xqi0Var.d();
        xm3 xm3Var = new xm3();
        tje.e();
        this.w = new mp90(d, wl3Var, xm3Var, this);
    }

    @Override // defpackage.kp90
    public final void a(PersonalUserData personalUserData, String str, GetExperimentsResponse getExperimentsResponse) {
        String str2 = personalUserData.userId;
        xqi0 xqi0Var = this.b;
        cxq0 cxq0Var = xqi0Var.h;
        long j = ((SharedPreferences) xqi0Var.c.get()).getLong("passport_user_uid", -1L);
        wl3 wl3Var = this.c;
        long j2 = wl3Var.b;
        AuthEnvironment authEnvironment = wl3Var.a;
        if (j != -1 && j2 != j) {
            HashMap hashMap = new HashMap();
            hashMap.put("oldUid", Long.valueOf(j));
            hashMap.put("newUid", Long.valueOf(j2));
            hashMap.put("authState", "OnlyUidRegistrationState");
            ((x22) ((z8g) cxq0Var.b).y.get()).reportEvent("Uid change is not allowed inside profile", hashMap);
            z83.j("Uid change is not allowed");
        }
        xqi0Var.c().putString("guid", str2).putInt("passport_user_env", authEnvironment.getInteger()).putString("passport_user_token", str).putLong("passport_user_uid", wl3Var.b).apply();
        sk7 sk7Var = new sk7(str2, wl3Var, cn3.g(str, authEnvironment));
        tje.e();
        ((a) xqi0Var.l.get()).e(getExperimentsResponse);
        xqi0Var.a(this, new yfy(xqi0Var, sk7Var, wl3Var));
        tje.e();
        Handler c = ((z8g) cxq0Var.b).c();
        p8g p8gVar = (p8g) cxq0Var.c;
        p03.a(c, i5m.a(p8gVar.w), p8gVar.m()).v(personalUserData);
    }

    @Override // defpackage.yk3
    public final wl3 c() {
        return this.c;
    }

    @Override // defpackage.yk3, defpackage.x08
    public final void cancel() {
        this.w.cancel();
    }

    @Override // defpackage.yk3
    public final void e(wl3 wl3Var) {
        if (Objects.equals(this.c, wl3Var)) {
            return;
        }
        this.w.cancel();
        xqi0 xqi0Var = this.b;
        if (wl3Var != null) {
            xqi0Var.a(this, new k370(xqi0Var, wl3Var));
        } else {
            xqi0Var.a(this, new uf60(xqi0Var, null));
        }
    }
}
