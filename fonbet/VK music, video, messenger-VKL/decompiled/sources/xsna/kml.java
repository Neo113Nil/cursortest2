package xsna;

import org.json.JSONObject;
import xsna.d0j0;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes.dex */
public final class kml implements u2j0 {
    public static d0j0 b(ozg0 ozg0Var) {
        return new d0j0(System.currentTimeMillis() + 3600000, new d0j0.b(8), new d0j0.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // xsna.u2j0
    public final d0j0 a(ozg0 ozg0Var, JSONObject jSONObject) {
        return b(ozg0Var);
    }
}
