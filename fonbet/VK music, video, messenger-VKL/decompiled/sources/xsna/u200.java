package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.multiaccount.api.SessionUnavailableType;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.i9r0;
import xsna.k840;
import xsna.usi0;

/* compiled from: LogoutDelegate.kt */
/* loaded from: classes7.dex */
public final class u200 {
    public final mui0 a;
    public final sxi0 b;
    public final mxi0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i = new bpn0(new pvh(this, 12));

    public u200(mui0 mui0Var, sxi0 sxi0Var, mxi0 mxi0Var, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5) {
        this.a = mui0Var;
        this.b = sxi0Var;
        this.c = mxi0Var;
        this.d = bpn0Var;
        this.e = bpn0Var2;
        this.f = bpn0Var3;
        this.g = bpn0Var4;
        this.h = bpn0Var5;
    }

    public final void a(UserId userId, String str) {
        int hashCode = str.hashCode();
        bpn0 bpn0Var = this.e;
        switch (hashCode) {
            case -1770111376:
                if (!str.equals("deactivated")) {
                    return;
                }
                break;
            case -1396343010:
                if (str.equals("banned")) {
                    ((com.vk.superapp.multiaccount.api.d) bpn0Var.getValue()).e(userId, SessionUnavailableType.BANNED);
                    return;
                }
                return;
            case -88001629:
                if (!str.equals("api_error")) {
                    return;
                }
                ((com.vk.superapp.multiaccount.api.d) bpn0Var.getValue()).e(userId, SessionUnavailableType.VALIDATION_REQUIRED);
                return;
            case 473720653:
                if (!str.equals("invalid_refresh_token")) {
                    return;
                }
                ((com.vk.superapp.multiaccount.api.d) bpn0Var.getValue()).e(userId, SessionUnavailableType.VALIDATION_REQUIRED);
                return;
            case 964636668:
                if (!str.equals("user_deactivated")) {
                    return;
                }
                break;
            case 1265069091:
                if (!str.equals("empty_refresh_token")) {
                    return;
                }
                ((com.vk.superapp.multiaccount.api.d) bpn0Var.getValue()).e(userId, SessionUnavailableType.VALIDATION_REQUIRED);
                return;
            default:
                return;
        }
        ((com.vk.superapp.multiaccount.api.d) bpn0Var.getValue()).e(userId, SessionUnavailableType.DEACTIVATED);
    }

    public final synchronized void b(t200 t200Var) {
        try {
            L.o(new qfj(t200Var, 16));
            if (this.a.a().b != t200Var.d.b) {
                ca70 ca70Var = ca70.a;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                sv1.C();
                ca70.f(context).cancelAll();
            }
            usi0.a a = o240.a(new o240(this.a, this.b, (mp) this.f.getValue(), (com.vk.superapp.multiaccount.api.a) this.d.getValue()), t200Var.d, epx.f(t200Var.a, "multiaccount_logout"));
            a(t200Var.d, t200Var.a);
            i9r0.a aVar = i9r0.a;
            File a2 = i9r0.a.a(t200Var.d);
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(a2);
            if (a != null) {
                ArrayList c = an00.c(this.a.e());
                vx2.a.getClass();
                vx2.b().j(c);
                kke0 kke0Var = (kke0) this.h.getValue();
                String str = a.a().a;
                jg0 jg0Var = new jg0(25);
                EmptyList emptyList = EmptyList.b;
                kke0Var.b(str, jg0Var);
                ((r200) this.i.getValue()).a(t200Var);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"LogoutDelegate Logout completed from unactive account: UserId - " + t200Var.d});
                }
                return;
            }
            k840.a.i.clear();
            L l2 = L.a;
            l2.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l2, L.LogType.i, new Object[]{"LogoutDelegate Logout from active account STARTED: UserId - " + t200Var.d});
            }
            new hvs(this.g, this.c).a(t200Var.a, t200Var.b, t200Var.c, t200Var.e);
            ((r200) this.i.getValue()).a(t200Var);
            o6i G = j6i.a().G();
            Context context2 = e43.a;
            G.b(context2 != null ? context2 : null, "com.vk.companion.ACTION_LOGOUT");
            l2.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l2, L.LogType.i, new Object[]{"LogoutDelegate Logout from active account COMPLETED: UserId - " + t200Var.d});
            }
        } finally {
        }
    }
}
