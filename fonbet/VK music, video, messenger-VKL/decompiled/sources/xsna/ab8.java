package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes.dex */
public final class ab8 implements yx1, cb8 {

    @Nullable
    public bb8 b;

    @NonNull
    public static String b(@NonNull Bundle bundle, @NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // xsna.cb8
    public final void a(@Nullable b5k b5kVar) {
        this.b = b5kVar;
    }

    @Override // xsna.yx1
    public final void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        bb8 bb8Var = this.b;
        if (bb8Var != null) {
            try {
                bb8Var.a("$A$:" + b(bundle, str));
            } catch (JSONException unused) {
            }
        }
    }
}
