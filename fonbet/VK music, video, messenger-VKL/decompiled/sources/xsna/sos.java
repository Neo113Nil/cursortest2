package xsna;

import com.vk.dto.user.Platform;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: FriendsGetOnlineApiCmd.kt */
/* loaded from: classes2.dex */
public final class sos<Result> implements k7r0 {
    public static final sos<Result> b = new sos<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray(eok.ONLINE_EXTRAS_KEY);
        Object L = optJSONArray != null ? f370.L(optJSONArray) : EmptyList.b;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("online_mobile");
        return pn00.k(new Pair(Platform.WEB, L), new Pair(Platform.MOBILE, optJSONArray2 != null ? f370.L(optJSONArray2) : EmptyList.b));
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
