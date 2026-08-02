package defpackage;

import okhttp3.Protocol;

/* loaded from: classes9.dex */
public final class nvf0 {
    public static Protocol a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Protocol protocol = Protocol.HTTP_1_0;
        str2 = protocol.protocol;
        if (str.equals(str2)) {
            return protocol;
        }
        Protocol protocol2 = Protocol.HTTP_1_1;
        str3 = protocol2.protocol;
        if (str.equals(str3)) {
            return protocol2;
        }
        Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
        str4 = protocol3.protocol;
        if (str.equals(str4)) {
            return protocol3;
        }
        Protocol protocol4 = Protocol.HTTP_2;
        str5 = protocol4.protocol;
        if (str.equals(str5)) {
            return protocol4;
        }
        Protocol protocol5 = Protocol.SPDY_3;
        str6 = protocol5.protocol;
        if (str.equals(str6)) {
            return protocol5;
        }
        Protocol protocol6 = Protocol.QUIC;
        str7 = protocol6.protocol;
        if (str.equals(str7)) {
            return protocol6;
        }
        Protocol protocol7 = Protocol.HTTP_3;
        str8 = protocol7.protocol;
        if (cvu0.x(str, str8, false)) {
            return protocol7;
        }
        ny61.v("Unexpected protocol: ".concat(str));
        return null;
    }
}
