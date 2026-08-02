package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Locale;
import org.json.JSONObject;
import xsna.na8;

/* loaded from: classes10.dex */
public final class im3 {
    public final SharedPreferences a;
    public final gm3 b;

    public im3(Context context) {
        this(sz2.a(new sz2(), context, "ViewSizeInfoStorage"), new gm3());
    }

    public static String a(jm3 jm3Var) {
        return na8.a(jm3Var.b(), jm3Var.a(), "-");
    }

    public im3(SharedPreferences sharedPreferences, gm3 gm3Var) {
        this.a = sharedPreferences;
        this.b = gm3Var;
    }

    public final void a(jm3 jm3Var, fm3 fm3Var) {
        String a = a(jm3Var);
        this.b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", fm3Var.a.a);
        jSONObject2.put("height", fm3Var.a.b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", fm3Var.b.a);
        jSONObject3.put("height", fm3Var.b.b);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", fm3Var.c.a.a);
        String name = fm3Var.c.a.b.name();
        Locale locale = Locale.ROOT;
        jSONObject4.put(X3.a.t, name.toLowerCase(locale));
        jSONObject5.put("value", fm3Var.c.b.a);
        jSONObject5.put(X3.a.t, fm3Var.c.b.b.name().toLowerCase(locale));
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(fm3Var.d);
        jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String jSONObject8 = jSONObject.toString();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(a, jSONObject8);
        edit.apply();
    }
}
