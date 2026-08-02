package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class dil0 implements ped0 {
    public static final Set d;
    public static final LinkedHashSet e;
    public final zhl0 a;
    public final uhl0 b;
    public final ead0 c;

    static {
        Set f0 = j73.f0(new String[]{"sdkVersion", "sdk_version"});
        d = f0;
        e = v4r0.h(j73.f0(new String[]{Constants.KEY_SERVICE, "requestId", "testIds", "testids", "test_ids", "triggeredTestIds", "triggered_testids", "external_triggered_test_ids", "triggered_test_ids", "_meta"}), f0);
    }

    public dil0(zhl0 zhl0Var, uhl0 uhl0Var, ead0 ead0Var) {
        this.a = zhl0Var;
        this.b = uhl0Var;
        this.c = ead0Var;
    }

    public static bil0 c(sbd0 sbd0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        String str = null;
        if (!(sbd0Var instanceof qbd0)) {
            if (sbd0Var instanceof rbd0) {
                return new bil0(null, null, null, ((rbd0) sbd0Var).a());
            }
            w511.b();
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            String str2 = (String) it.next();
            Map map = ((qbd0) sbd0Var).a;
            obj = map != null ? map.get(str2) : null;
            if (obj != null) {
                break;
            }
        }
        String obj4 = obj != null ? obj.toString() : null;
        Map map2 = ((qbd0) sbd0Var).a;
        String obj5 = (map2 == null || (obj3 = map2.get(Constants.KEY_SERVICE)) == null) ? null : obj3.toString();
        if (map2 != null && (obj2 = map2.get("requestId")) != null) {
            str = obj2.toString();
        }
        if (map2 == null) {
            map2 = b.f();
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!e.contains(str3)) {
                try {
                    jSONObject.put(str3, value);
                } catch (Exception unused) {
                }
            }
        }
        return new bil0(obj5, obj4, str, jSONObject.toString());
    }

    @Override // defpackage.ped0
    public final void a() {
    }

    @Override // defpackage.ped0
    public final void b(tbd0 tbd0Var) {
        sbd0 sbd0Var = tbd0Var.c;
        int i = cil0.a[tbd0Var.a.ordinal()];
        if (i == 1 || i == 2) {
            zhl0 zhl0Var = this.a;
            if (zhl0Var == null || !((Boolean) this.c.invoke()).booleanValue()) {
                return;
            }
            bil0 c = c(sbd0Var);
            zhl0Var.a(new vhl0(tbd0Var.b, c.b, c.a, c.c, c.d));
            return;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                return;
            }
            w511.b();
            return;
        }
        uhl0 uhl0Var = this.b;
        if (uhl0Var != null) {
            bil0 c2 = c(sbd0Var);
            uhl0Var.a(new shl0(tbd0Var.b, c2.b, c2.a, c2.c, c2.d, tbd0Var.d, null, 904));
        }
    }
}
