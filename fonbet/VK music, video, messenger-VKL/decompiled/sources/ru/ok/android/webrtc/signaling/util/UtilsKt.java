package ru.ok.android.webrtc.signaling.util;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.exception.SubDomain;
import ru.ok.android.webrtc.signaling.api.TransportType;
import xsna.epx;

/* loaded from: classes9.dex */
public final class UtilsKt {
    @CallInternalApi
    public static final SubDomain subDomain(TransportType transportType) {
        if (epx.f(transportType, TransportType.WT.INSTANCE)) {
            return SubDomain.WT;
        }
        if (epx.f(transportType, TransportType.WS.INSTANCE)) {
            return SubDomain.WS;
        }
        return null;
    }
}
