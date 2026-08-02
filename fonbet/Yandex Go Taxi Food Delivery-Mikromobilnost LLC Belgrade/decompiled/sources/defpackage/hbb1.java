package defpackage;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class hbb1 {
    public static au2 a;

    public static final zii0 a(igr0 igr0Var, rzx rzxVar, fwi fwiVar) {
        zii0 j = gwk0.o(rzxVar).j(rzxVar, true);
        float f0 = fwiVar.f0(igr0Var.b);
        float f = j.a - f0;
        float f2 = j.b - f0;
        float f3 = j.c + f0;
        float f4 = j.d + f0;
        float w0 = fwiVar.w0(0.0f);
        float w02 = fwiVar.w0(igr0Var.c);
        return new zii0(f + w0, f2 + w02, f3 + w0, f4 + w02);
    }

    public static f530 b(f530 f530Var, igr0 igr0Var, ehr0 ehr0Var, boolean z, int i) {
        f530 a2;
        if ((i & 4) != 0) {
            z = true;
        }
        if (!z) {
            return f530Var;
        }
        a2 = b.a(f530Var, m.a(), new ls40(20, igr0Var, ehr0Var, (Object) null));
        return a2;
    }

    public static f530 c(f530 f530Var, igr0 igr0Var, boolean z, float f, m3u0 m3u0Var, int i) {
        f530 a2;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        if ((i & 8) != 0) {
            m3u0Var = null;
        }
        if (!z) {
            return f530Var;
        }
        a2 = b.a(f530Var, m.a(), new fn1(igr0Var, f, m3u0Var));
        return a2;
    }

    public static final Integer d(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONObject f(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final String g(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public static final eb2 h(igr0 igr0Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new eb2();
            btsVar.o0(Q);
        }
        ka90 ka90Var = (ka90) Q;
        int f0 = ((fwi) btsVar.m(j.h)).f0(igr0Var.b);
        boolean c = btsVar.c(f0);
        Object Q2 = btsVar.Q();
        Object obj = Q2;
        if (c || Q2 == o430Var) {
            BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f0, BlurMaskFilter.Blur.NORMAL);
            ((eb2) ka90Var).a.setMaskFilter(blurMaskFilter);
            btsVar.o0(blurMaskFilter);
            obj = blurMaskFilter;
        }
        eb2 eb2Var = (eb2) ka90Var;
        eb2Var.f(tje.n(igr0Var.a, btsVar));
        return eb2Var;
    }
}
