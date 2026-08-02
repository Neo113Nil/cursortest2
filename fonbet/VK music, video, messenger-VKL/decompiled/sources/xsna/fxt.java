package xsna;

import com.vk.newsfeed.impl.requests.WallWithCounters;
import org.json.JSONObject;

/* compiled from: GetWallWithCountersRequest.kt */
/* loaded from: classes4.dex */
public final class fxt extends com.vk.api.request.rx.batch.c<JSONObject, Integer, Integer, Integer, WallWithCounters> {
    public fxt(hz2 hz2Var, hz2 hz2Var2, hz2 hz2Var3, hz2 hz2Var4, int i) {
        super(hz2Var, (i & 2) != 0 ? new g5j(0) : hz2Var2, (i & 4) != 0 ? new g5j(0) : hz2Var3, (i & 8) != 0 ? new g5j(0) : hz2Var4);
    }

    @Override // com.vk.api.request.rx.batch.c
    public final WallWithCounters K0(bv6<JSONObject> bv6Var, bv6<Integer> bv6Var2, bv6<Integer> bv6Var3, bv6<Integer> bv6Var4) {
        JSONObject optJSONObject = bv6Var.a.optJSONObject("response");
        return optJSONObject == null ? WallWithCounters.b : sa30.d(bv6Var2.a.intValue(), optJSONObject, bv6Var3.a.intValue(), bv6Var4.a.intValue());
    }
}
