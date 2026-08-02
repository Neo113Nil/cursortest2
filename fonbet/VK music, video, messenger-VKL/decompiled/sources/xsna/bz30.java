package xsna;

import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: MsgSendUncheckedCmd.kt */
/* loaded from: classes2.dex */
public final class bz30<Result> implements k7r0 {
    public final /* synthetic */ String b;

    public bz30(String str) {
        this.b = str;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return this.b + '_' + jSONObject.getInt("response");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
