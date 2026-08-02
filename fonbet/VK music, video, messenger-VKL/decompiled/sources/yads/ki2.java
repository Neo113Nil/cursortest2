package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes10.dex */
public final class ki2 {
    public static ji2 a() {
        ai2 ai2Var = ai2.d;
        return a(StringUtils.UNDEFINED, "No mediation data was received. Possibly, Client Bidding adapters are not connected", 1003);
    }

    public static ji2 a(String str, String str2, Integer num) {
        return new ji2(str, null, null, new bj2(ej2.d, str2, num), null);
    }
}
