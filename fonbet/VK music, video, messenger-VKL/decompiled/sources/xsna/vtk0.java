package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: StateFlow.kt */
/* loaded from: classes11.dex */
public final class vtk0 {
    public static final con0 a = new con0("NONE");
    public static final con0 b = new con0("PENDING");
    public static bpn0 c;
    public static bpn0 d;
    public static bpn0 e;

    public static final utk0 a(Object obj) {
        if (obj == null) {
            obj = tyx.h;
        }
        return new utk0(obj);
    }

    public static wfz0 b(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString("name");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            q2z.a(next, jSONObject2.get(next).toString(), arrayList);
        }
        return new wfz0(str, string, pn00.s(arrayList));
    }

    public static final rtc0 c() {
        bpn0 bpn0Var = d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (rtc0) bpn0Var.getValue();
    }

    public static final ccw0 d() {
        bpn0 bpn0Var = e;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (ccw0) bpn0Var.getValue();
    }

    public void e(long j, String str) {
        ((kui) gjv.a()).c(j, str);
    }
}
