package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class j implements g<JSONObject> {
    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = {sg.bigo.ads.a.a.C, sg.bigo.ads.a.a.D};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            String a = sg.bigo.ads.c.c.a(str);
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put(str, a);
            }
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.C;
    }
}
