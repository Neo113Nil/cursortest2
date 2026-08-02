package xsna;

import org.json.JSONObject;

/* compiled from: FaveRemoveTag.kt */
/* loaded from: classes4.dex */
public final class mrq extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ mrq(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                return jSONObject;
        }
    }

    public mrq() {
        super("groups.hideWarning");
    }
}
