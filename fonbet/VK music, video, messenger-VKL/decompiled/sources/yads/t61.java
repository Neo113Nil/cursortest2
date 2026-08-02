package yads;

import com.unity3d.ads.core.data.model.exception.GatewayException;

/* loaded from: classes10.dex */
public enum t61 {
    c(GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION),
    d("ad"),
    e("instream"),
    f("bidder_token");

    public final String b;

    t61(String str) {
        this.b = str;
    }
}
