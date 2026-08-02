package yads;

import android.text.Html;
import com.ironsource.O6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j8y;

/* loaded from: classes10.dex */
public final class js1 {
    public final lr1 a;

    public /* synthetic */ js1() {
        this(new lr1());
    }

    public final rr1 a(JSONObject jSONObject) {
        j5 j5Var;
        String string;
        try {
            j8y j8yVar = je1.a;
            String string2 = jSONObject.getString(O6.G1);
            if (string2 == null || string2.length() == 0 || "null".equals(string2)) {
                throw new JSONException("Json value can not be null or empty");
            }
            String valueOf = String.valueOf(Html.fromHtml(string2));
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            MapBuilder mapBuilder = new MapBuilder();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                mapBuilder.put(next, jSONObject2.getString(next));
            }
            MapBuilder h = mapBuilder.h();
            if (h.isEmpty()) {
                return null;
            }
            List b = je1.b("click_tracking_urls", jSONObject);
            List b2 = je1.b("impression_tracking_urls", jSONObject);
            List b3 = je1.b("ad_response_tracking_urls", jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("bidding_info");
            Map a = optJSONObject != null ? je1.a(optJSONObject) : null;
            if (jSONObject.has("impression_data")) {
                this.a.getClass();
                try {
                    string = jSONObject.getString("impression_data");
                } catch (Exception unused) {
                }
                if (string.length() == 0 || "null".equals(string)) {
                    throw new JSONException("Json has not required attributes");
                }
                j5Var = new j5(string);
                return new rr1(valueOf, h, b2, b, b3, j5Var, a);
            }
            j5Var = null;
            return new rr1(valueOf, h, b2, b, b3, j5Var, a);
        } catch (JSONException unused2) {
            return null;
        }
    }

    public js1(lr1 lr1Var) {
        this.a = lr1Var;
    }
}
