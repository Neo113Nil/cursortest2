package defpackage;

import com.ybsdk.screens.changephone.push.a;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h4s0 {
    public final Set a;

    public /* synthetic */ h4s0(Set set) {
        this.a = set;
    }

    public void a(String str, JSONObject jSONObject) {
        for (o03 o03Var : this.a) {
            boolean z = false;
            switch (o03Var.a) {
                case 0:
                    if (!jl40.l(str, "applications")) {
                        break;
                    } else if (jSONObject == null) {
                        x4c.g("empty params for ApplicationSilentPushHandler", null, null, null, 14);
                        break;
                    } else {
                        String optString = jSONObject.optString("application_type");
                        String optString2 = jSONObject.optString("application_status");
                        Iterator it = ((Set) o03Var.b).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (((a) it.next()).a(optString, optString2)) {
                                z = true;
                                break;
                            }
                        }
                    }
                default:
                    ((q960) o03Var.b).getClass();
                    break;
            }
            if (z) {
                return;
            }
        }
        x4c.g("Silent push for yb_sdk was not handled!", null, "Feature: " + str + ", params = " + jSONObject, null, 10);
    }
}
