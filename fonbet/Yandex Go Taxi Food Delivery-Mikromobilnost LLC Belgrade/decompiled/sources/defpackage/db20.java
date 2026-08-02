package defpackage;

import io.appmetrica.analytics.RtmErrorEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class db20 implements x22 {
    public final xb20 a;

    public db20(xb20 xb20Var) {
        this.a = xb20Var;
        xb20Var.c("MessengerSdkVersion", "250.2");
    }

    @Override // defpackage.x22
    public final void a(Set set) {
        String str;
        xb20 xb20Var = this.a;
        if (set != null) {
            xb20Var.getClass();
            str = set.toString();
        } else {
            str = null;
        }
        xb20Var.a.getClass();
        xb20Var.c.putAppEnvironmentValue("experiments", str);
        synchronized (xb20Var) {
            xb20Var.f = set;
            xb20Var.a();
        }
    }

    @Override // defpackage.x22
    public final void b(String str) {
        xb20 xb20Var = this.a;
        xb20Var.a.getClass();
        xb20Var.c.setUserProfileID(str);
        synchronized (xb20Var) {
            xb20Var.e = str;
            xb20Var.a();
        }
    }

    @Override // defpackage.x22
    public final void c(String str, String str2, Object obj) {
        this.a.b(str, gw00.e(new Pair(str2, obj)));
    }

    @Override // defpackage.x22
    public final void d(String str, String str2, Integer num, Boolean bool, Boolean bool2) {
        this.a.b("tech_socket_connection_started", b.i(new Pair("source", str), new Pair("trace", str2), new Pair("currentStatus", num), new Pair("goOnline", bool), new Pair("syncRequired", bool2)));
    }

    @Override // defpackage.x22
    public final void e(String str, Throwable th) {
        this.a.c.reportRtmException(str, th);
    }

    @Override // defpackage.x22
    public final void f(String str, String str2, Object obj, String str3, Object obj2) {
        this.a.b(str, b.i(new Pair(str2, obj), new Pair(str3, obj2)));
    }

    @Override // defpackage.x22
    public final void g(String str, String str2, Object obj, String str3, Object obj2, String str4, Object obj3, String str5, Object obj4) {
        this.a.b(str, b.i(new Pair(str2, obj), new Pair(str3, obj2), new Pair(str4, obj3), new Pair(str5, obj4)));
    }

    @Override // defpackage.x22
    public final void h(String str, String str2, Object obj, String str3, Object obj2, String str4, Object obj3) {
        this.a.b(str, b.i(new Pair(str2, obj), new Pair(str3, obj2), new Pair(str4, obj3)));
    }

    @Override // defpackage.x22
    public final void i(String str, String str2) {
        this.a.c(str, str2);
    }

    @Override // defpackage.x22
    public final void j(String str, RtmErrorEvent.ErrorLevel errorLevel, Map map) {
        String str2;
        xb20 xb20Var = this.a;
        whl0 whl0Var = xb20Var.b;
        LinkedHashMap linkedHashMap = whl0Var.b;
        if (map != null) {
            linkedHashMap = b.n(linkedHashMap, map);
        }
        if (linkedHashMap == null || (str2 = new JSONObject(linkedHashMap).toString()) == null) {
            str2 = "";
        }
        xb20Var.c.reportRtmError(RtmErrorEvent.newBuilder(str).withAdditional(str2).withErrorLevel(errorLevel).withRequestId(whl0Var.a).build());
    }

    @Override // defpackage.x22
    public final void pauseSession() {
        xb20 xb20Var = this.a;
        xb20Var.c.pauseSession();
        xb20Var.a.getClass();
    }

    @Override // defpackage.x22
    public final void reportError(String str, Throwable th) {
        xb20 xb20Var = this.a;
        xb20Var.c.reportError(str, str, th);
        xb20Var.a.getClass();
        if (th == null) {
            if (ydz.a.a()) {
                ydz.b("Report", str);
            }
        } else if (ydz.a.a()) {
            ydz.c("Report", str, th);
        }
    }

    @Override // defpackage.x22
    public final void reportEvent(String str) {
        xb20 xb20Var = this.a;
        xb20Var.c.reportEvent(str);
        xb20Var.a.getClass();
    }

    @Override // defpackage.x22
    public final void resumeSession() {
        xb20 xb20Var = this.a;
        xb20Var.c.resumeSession();
        xb20Var.a.getClass();
    }

    @Override // defpackage.x22
    public final void reportEvent(String str, Map map) {
        this.a.b(str, map);
    }
}
