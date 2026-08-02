package ru.ok.android.webrtc.stat.utils;

import org.webrtc.IceCandidateErrorEvent;
import xsna.nyh0;
import xsna.xqm0;
import xsna.xy6;

/* loaded from: classes9.dex */
public final class StringExtKt {
    public static final String asString(IceCandidateErrorEvent iceCandidateErrorEvent) {
        String str = iceCandidateErrorEvent.address;
        int i = iceCandidateErrorEvent.port;
        String str2 = iceCandidateErrorEvent.url;
        int i2 = iceCandidateErrorEvent.errorCode;
        String str3 = iceCandidateErrorEvent.errorText;
        StringBuilder b = xy6.b(i, "\n        IceCandidateErrorEvent(address = ", str, ", port = ", ", url = ");
        nyh0.a(i2, str2, ", errorCode = ", ", errorText ", b);
        b.append(str3);
        b.append("\n    ");
        return xqm0.g(b.toString());
    }
}
