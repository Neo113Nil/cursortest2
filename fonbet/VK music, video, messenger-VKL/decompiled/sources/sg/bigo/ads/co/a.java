package sg.bigo.ads.co;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes9.dex */
public final class a {
    public int a;
    public String b;
    public String c;
    public Map<String, Object> d;

    public a(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = jSONObject.optString("data");
            this.a = jSONObject.optInt("code");
            this.b = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            s.a(jSONObject.optInt("timestamp", 0));
            this.d = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals("code", next) && !TextUtils.equals(NotificationCompat.CATEGORY_MESSAGE, next)) {
                    this.d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.c = "";
            this.a = 1005;
            this.b = "Invalid response.";
        }
    }

    public final boolean b() {
        return this.a == -14;
    }

    public final boolean a() {
        return this.a == 1;
    }
}
