package defpackage;

import com.yandex.div2.DivLayoutProvider;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oyk implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object A = wwg.A("height_variable_name", jSONObject);
        if (A == null) {
            A = null;
        }
        String str = (String) A;
        Object opt = jSONObject.opt("width_variable_name");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        return new DivLayoutProvider(str, (String) (opt != null ? opt : null));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        DivLayoutProvider divLayoutProvider = (DivLayoutProvider) obj;
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "height_variable_name", divLayoutProvider.a);
        wwg.Z(yf90Var, jSONObject, "width_variable_name", divLayoutProvider.b);
        return jSONObject;
    }
}
