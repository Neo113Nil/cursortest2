package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class fj3 {
    public final kn a;
    public final yc3 b;
    public final rf3 c;
    public final ie3 d;
    public final rk3 e;
    public final o41 f;

    public /* synthetic */ fj3(Context context, jp2 jp2Var, kn knVar) {
        this(knVar, zc3.a(knVar.a()), new rf3(context, new q72()), new ie3(context, jp2Var), new rk3(), new o41());
    }

    public final Object a(JSONObject jSONObject) {
        dd3 dd3Var;
        qk3 qk3Var;
        Object failure;
        try {
            dd3Var = this.d.a(this.b.a("vast", jSONObject), this.a);
        } catch (Exception unused) {
            dd3Var = null;
        }
        if (dd3Var == null || dd3Var.b.isEmpty()) {
            throw new a22("Invalid VAST in response");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.e.getClass();
            boolean optBoolean = optJSONObject.optBoolean("volumeControlVisible", true);
            boolean optBoolean2 = optJSONObject.optBoolean("isProgressBarHidden", false);
            boolean optBoolean3 = optJSONObject.optBoolean("alternativeFormatFallback", false);
            try {
                failure = Double.valueOf(optJSONObject.getDouble("initialVolume"));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            qk3Var = new qk3(optBoolean, optBoolean2, optBoolean3, (Double) failure);
        } else {
            qk3Var = null;
        }
        ArrayList a = this.c.a(dd3Var.b, qk3Var);
        if (a.isEmpty()) {
            throw new a22("Invalid VAST in response");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("preview");
        return new we3(a, qk3Var, optJSONObject2 != null ? this.f.a(optJSONObject2) : null);
    }

    public fj3(kn knVar, yc3 yc3Var, rf3 rf3Var, ie3 ie3Var, rk3 rk3Var, o41 o41Var) {
        this.a = knVar;
        this.b = yc3Var;
        this.c = rf3Var;
        this.d = ie3Var;
        this.e = rk3Var;
        this.f = o41Var;
    }
}
