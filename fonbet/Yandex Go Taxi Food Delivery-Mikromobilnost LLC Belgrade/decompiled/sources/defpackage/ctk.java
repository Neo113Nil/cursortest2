package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ctk implements d4x {
    public final Uri a;
    public final double b;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.doubleValue() > 100.0d) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ctk(JSONObject jSONObject) {
        Double d;
        this.a = b4x.k("image_url", jSONObject);
        Double d2 = null;
        try {
            d = b4x.d("ratio", jSONObject);
        } catch (JSONException e) {
            if (ydz.a.a()) {
                ydz.c("ParsingErrorLogger", "An error occurred during parsing process", e);
            }
        }
        if (d != null) {
            if (d.doubleValue() >= 0.01d) {
            }
            if (d2 != null) {
                this.b = 1.0d;
                return;
            } else {
                this.b = d2.doubleValue();
                return;
            }
        }
        d2 = d;
        if (d2 != null) {
        }
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "imageUrl");
        tjz0Var.a(Double.valueOf(this.b), "ratio");
        return tjz0Var.a.toString();
    }
}
