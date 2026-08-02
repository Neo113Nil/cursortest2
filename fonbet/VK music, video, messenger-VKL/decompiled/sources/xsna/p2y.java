package xsna;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ad6;

/* compiled from: JsBridgeParameterResult.kt */
/* loaded from: classes6.dex */
public final class p2y<T extends ad6> {
    public final Object a;
    public final String b;

    /* compiled from: JsBridgeParameterResult.kt */
    public static final class a {
        public final Exception a;

        public a(Exception exc) {
            this.a = exc;
        }
    }

    public p2y(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final T a() {
        Object obj = this.a;
        if (obj instanceof a) {
            throw ((a) obj).a;
        }
        return (T) obj;
    }

    public final String b() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).optString(CommonUrlParts.REQUEST_ID, "default_request_id");
        } catch (JSONException unused) {
            return null;
        }
    }
}
