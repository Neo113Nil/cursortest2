package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.bd3;

/* loaded from: classes9.dex */
public final class e implements g<JSONObject> {
    private static String b() {
        for (String str : sg.bigo.ads.a.a.av) {
            if (!TextUtils.isEmpty(sg.bigo.ads.c.e.a(str))) {
                return str;
            }
        }
        return "";
    }

    private static String c() {
        Iterator<String> it = sg.bigo.ads.a.a.aw.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if ((next == null || next.isEmpty()) ? false : bd3.d(next)) {
                return next;
            }
        }
        return "";
    }

    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            jSONObject.put(sg.bigo.ads.a.a.z, b);
        }
        String c = c();
        if (!TextUtils.isEmpty(c)) {
            jSONObject.put(sg.bigo.ads.a.a.y, c);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.u;
    }
}
