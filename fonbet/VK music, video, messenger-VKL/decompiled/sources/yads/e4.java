package yads;

import android.util.Log;
import android.webkit.WebView;
import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class e4 {
    public final ax3 a;

    public e4(ax3 ax3Var) {
        this.a = ax3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ax3 ax3Var = this.a;
        boolean z = ax3Var.g;
        if (z) {
            throw new IllegalStateException("AdSession is finished");
        }
        if (fc2.c != ax3Var.b.a) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        if (!ax3Var.f || z) {
            try {
                ax3Var.c();
            } catch (Exception unused) {
            }
        }
        ax3 ax3Var2 = this.a;
        if (!ax3Var2.f || ax3Var2.g) {
            return;
        }
        if (ax3Var2.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        ka kaVar = ax3Var2.e;
        my3.a.a((WebView) kaVar.b.get(), "publishImpressionEvent", kaVar.a);
        ax3Var2.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(rd3 rd3Var) {
        iy3.a(this.a);
        ax3 ax3Var = this.a;
        if (fc2.c == ax3Var.b.a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", rd3Var.a);
                if (rd3Var.a) {
                    jSONObject.put("skipOffset", rd3Var.b);
                }
                jSONObject.put("autoPlay", rd3Var.c);
                jSONObject.put(X3.i.L, rd3Var.d);
            } catch (JSONException e) {
                Log.e("OMIDLIB", "VastProperties: JSON error", e);
            }
            if (!ax3Var.j) {
                ka kaVar = ax3Var.e;
                my3.a.a((WebView) kaVar.b.get(), "publishLoadedEvent", jSONObject, kaVar.a);
                ax3Var.j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
