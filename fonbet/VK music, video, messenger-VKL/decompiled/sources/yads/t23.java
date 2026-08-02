package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.c5g;
import xsna.j9x;
import xsna.k9x;
import xsna.swe0;

/* loaded from: classes10.dex */
public final class t23 {
    public final r23 a = new r23();
    public final em b = new em();

    public final s23 a(JSONObject jSONObject) {
        k23 k23Var;
        dm dmVar;
        ArrayList arrayList;
        t23 t23Var = this;
        Object opt = jSONObject.opt("ColorWizButton");
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jSONObject.opt("ColorWizBack");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = opt4 instanceof String ? (String) opt4 : null;
        JSONObject optJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray optJSONArray = jSONObject.optJSONArray("smart-centers");
        if (optJSONObject2 != null) {
            t23Var.a.getClass();
            k23Var = new k23(optJSONObject2.getInt("x"), optJSONObject2.getInt("y"), optJSONObject2.getInt(Logger.METHOD_W), optJSONObject2.getInt("h"));
        } else {
            k23Var = null;
        }
        if (optJSONObject != null) {
            t23Var.b.getClass();
            dmVar = em.a(optJSONObject);
        } else {
            dmVar = null;
        }
        if (optJSONArray != null) {
            k9x q = swe0.q(0, optJSONArray.length());
            ArrayList arrayList2 = new ArrayList(c5g.u(q, 10));
            j9x it = q.iterator();
            while (it.d) {
                int nextInt = it.nextInt();
                r23 r23Var = t23Var.a;
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(nextInt);
                r23Var.getClass();
                arrayList2.add(new k23(optJSONObject3.getInt("x"), optJSONObject3.getInt("y"), optJSONObject3.getInt(Logger.METHOD_W), optJSONObject3.getInt("h")));
                t23Var = this;
                optJSONArray = optJSONArray;
                dmVar = dmVar;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new s23(str, str2, str3, str4, dmVar, k23Var, arrayList);
    }
}
