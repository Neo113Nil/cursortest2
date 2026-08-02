package xsna;

import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.vk.stat.sak.model.DebugStatsEventKey;

/* compiled from: SuperAppKitInitTime.kt */
/* loaded from: classes11.dex */
public final class h9n0 extends i9n0 {
    public static final h9n0 d = new h9n0();
    public static final DebugStatsEventKey e = DebugStatsEventKey.SUPERAPPKIT_INIT_TIME;
    public static final String f = GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION;

    @Override // xsna.i9n0
    public final DebugStatsEventKey c() {
        return e;
    }

    @Override // xsna.i9n0
    public final String d() {
        return f;
    }
}
