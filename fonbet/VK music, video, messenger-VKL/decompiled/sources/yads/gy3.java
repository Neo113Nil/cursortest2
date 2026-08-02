package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class gy3 extends yw3 {
    public gy3(jx3 jx3Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(jx3Var, hashSet, jSONObject, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.kx3, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        rx3 rx3Var;
        if (!TextUtils.isEmpty(str) && (rx3Var = rx3.c) != null) {
            for (ax3 ax3Var : Collections.unmodifiableCollection(rx3Var.a)) {
                if (this.c.contains(ax3Var.h)) {
                    ka kaVar = ax3Var.e;
                    if (this.e >= kaVar.f) {
                        kaVar.e = 2;
                        my3.a.a((WebView) kaVar.b.get(), "setNativeViewHierarchy", str, kaVar.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (px3.c(this.d, this.b.a)) {
            return null;
        }
        jx3 jx3Var = this.b;
        JSONObject jSONObject = this.d;
        jx3Var.a = jSONObject;
        return jSONObject.toString();
    }
}
