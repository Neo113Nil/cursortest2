package xsna;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: SuperappApi.kt */
/* loaded from: classes6.dex */
public final class afn0 extends rdx0<JSONObject> {
    public final String u;
    public final String v;

    public afn0(String str, String str2, String str3, Map map) {
        super(str3);
        this.u = str;
        this.v = str2 == null ? this.l : str2;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                o((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // xsna.rdx0
    public final boolean k() {
        return false;
    }

    @Override // xsna.rdx0
    public final String l() {
        return this.u;
    }

    @Override // xsna.rdx0
    public final String n() {
        return this.v;
    }
}
