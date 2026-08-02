package yads;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;
import xsna.j5g;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class kg1 {
    public final r0 a;

    public /* synthetic */ kg1(Context context, jp2 jp2Var) {
        this(new r0(context.getApplicationContext(), jp2Var));
    }

    public static String a(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        return optString;
    }

    public kg1(r0 r0Var) {
        this.a = r0Var;
    }

    public final jg1 a(JSONObject jSONObject, kn knVar) {
        ArrayList arrayList;
        ListBuilder listBuilder;
        Object failure;
        JSONArray jSONArray;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                r0 r0Var = this.a;
                r0Var.getClass();
                String optString = jSONObject2.optString("type");
                if (optString != null && optString.length() != 0 && !optString.equals("null")) {
                    Map map = r0Var.f;
                    if (map == null) {
                        Pair pair = new Pair("adtune", new tc(r0Var.b, r0Var.c));
                        Pair pair2 = new Pair("divkit_adtune", new uh0(r0Var.d, r0Var.e, r0Var.c, knVar.b));
                        Pair pair3 = new Pair(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, new bw());
                        Context context = r0Var.a;
                        wb3 wb3Var = r0Var.b;
                        jSONArray = optJSONArray;
                        map = pn00.k(pair, pair2, pair3, new Pair("deeplink", new za0(wb3Var, new wh2(context, wb3Var), new p93())), new Pair("feedback", new ju0(r0Var.b)));
                        r0Var.f = map;
                    } else {
                        jSONArray = optJSONArray;
                    }
                    q0 q0Var = (q0) map.get(optString);
                    if (q0Var != null) {
                        arrayList2.add(q0Var.a(jSONObject2));
                    }
                    i++;
                    optJSONArray = jSONArray;
                } else {
                    throw new a22("Native Ad json has not required attributes");
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String a = a("falseClickUrl", jSONObject);
        er0 er0Var = a != null ? new er0(a, jSONObject.optLong("falseClickInterval", 0L)) : null;
        SetBuilder setBuilder = new SetBuilder();
        String a2 = a("trackingUrl", jSONObject);
        if (a2 != null) {
            setBuilder.add(a2);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (optJSONArray2 != null) {
            ListBuilder e = e43.e();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                    failure = optJSONArray2.getString(i2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    e.add((String) failure);
                }
            }
            listBuilder = e.g();
        } else {
            listBuilder = null;
        }
        if (listBuilder != null) {
            setBuilder.addAll(listBuilder);
        }
        return new jg1(arrayList, er0Var, j5g.O0(setBuilder.d()), a("url", jSONObject), jSONObject.optLong("clickableDelay", 0L));
    }
}
