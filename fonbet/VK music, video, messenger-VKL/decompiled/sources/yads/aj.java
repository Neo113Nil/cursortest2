package yads;

import android.content.Context;
import com.ironsource.X3;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class aj {
    public final jp2 a;
    public final kg1 b;
    public final Context c;

    public aj(Context context, jp2 jp2Var, kg1 kg1Var) {
        this.a = jp2Var;
        this.b = kg1Var;
        this.c = context.getApplicationContext();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final oi a(JSONObject jSONObject, kn knVar) {
        bj ka2Var;
        if (!c52.a(jSONObject, "name", "type", "clickable", "required")) {
            throw new a22("Native Ad json has not required attributes");
        }
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        String optString2 = jSONObject.optString("name");
        if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("link");
        jg1 a = optJSONObject == null ? null : this.b.a(optJSONObject, knVar);
        Context context = this.c;
        jp2 jp2Var = this.a;
        if (optString2.equals("close_button")) {
            ka2Var = new hw();
        } else {
            if (!optString2.equals("feedback")) {
                switch (optString.hashCode()) {
                    case -1034364087:
                        if (optString.equals("number")) {
                            ka2Var = new ka2(new mr2());
                            break;
                        }
                        break;
                    case -951532658:
                        if (optString.equals("qrcode")) {
                            ka2Var = new kv(new wb3());
                            break;
                        }
                        break;
                    case -891985903:
                        if (optString.equals("string")) {
                            ka2Var = new n53();
                            break;
                        }
                        break;
                    case -410956671:
                        if (optString.equals("container")) {
                            ka2Var = new zl0();
                            break;
                        }
                        break;
                    case 100313435:
                        if (optString.equals("image")) {
                            ka2Var = new a51();
                            break;
                        }
                        break;
                    case 103772132:
                        if (optString.equals(X3.i.I0)) {
                            ka2Var = new qo1(new on1(zc3.a(knVar.a)), new fj3(context, jp2Var, knVar), new o41(), new d51());
                            break;
                        }
                        break;
                }
                throw new a22("Native Ad json has not required attributes");
            }
            ka2Var = new tu0(new a51());
        }
        return new oi(optString2, optString, ka2Var.a(jSONObject), a, jSONObject.getBoolean("clickable"), jSONObject.getBoolean("required"));
    }
}
