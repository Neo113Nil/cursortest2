package xsna;

import org.json.JSONObject;

/* compiled from: AccountGetHelpHints.kt */
/* loaded from: classes14.dex */
public final class ho extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho(String str, int i) {
        super(str);
        this.s = i;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new com.vk.dto.hints.a(jSONObject.optJSONObject("response"));
            default:
                return jSONObject;
        }
    }
}
