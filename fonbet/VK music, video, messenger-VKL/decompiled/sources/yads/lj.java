package yads;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class lj {
    public final aj a;

    public /* synthetic */ lj(Context context, jp2 jp2Var, kg1 kg1Var, int i) {
        this(new aj(context, jp2Var, (i & 4) != 0 ? new kg1(context, jp2Var) : kg1Var));
    }

    public final ArrayList a(JSONObject jSONObject, kn knVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            boolean z = jSONObject2.getBoolean("required");
            try {
                arrayList.add(this.a.a(jSONObject2, knVar));
            } catch (Throwable th) {
                if (z) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public lj(aj ajVar) {
        this.a = ajVar;
    }
}
