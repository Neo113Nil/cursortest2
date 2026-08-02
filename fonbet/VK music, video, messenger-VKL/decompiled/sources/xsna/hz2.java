package xsna;

import com.vk.core.apps.BuildInfo;
import org.json.JSONObject;

/* compiled from: ApiMethodExtension.kt */
/* loaded from: classes2.dex */
public final class hz2 extends rsg0<Object> {
    public final String s;
    public final /* synthetic */ izs<JSONObject, Object> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz2(String str, String str2, izs izsVar) {
        super(str2);
        this.t = izsVar;
        this.s = BuildInfo.h() ? vx2.d.d() : str;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.t.invoke(jSONObject);
    }

    @Override // xsna.xz2
    public final String k() {
        return this.s;
    }
}
