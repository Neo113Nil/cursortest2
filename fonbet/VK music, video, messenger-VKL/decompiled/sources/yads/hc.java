package yads;

import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class hc extends Lambda implements gzs {
    public final /* synthetic */ JSONObject b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(JSONObject jSONObject) {
        super(0);
        this.b = jSONObject;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return ke1.a("offerId", this.b);
    }
}
