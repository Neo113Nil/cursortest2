package org.webrtc;

import xsna.lhg;

/* loaded from: classes9.dex */
public enum RTCErrorType {
    NONE(0),
    UNSUPPORTED_OPERATION(1),
    UNSUPPORTED_PARAMETER(2),
    INVALID_PARAMETER(3),
    INVALID_RANGE(4),
    SYNTAX_ERROR(5),
    INVALID_STATE(6),
    INVALID_MODIFICATION(7),
    NETWORK_ERROR(8),
    RESOURCE_EXHAUSTED(9),
    INTERNAL_ERROR(10),
    OPERATION_ERROR_WITH_DATA(11);

    private final int nativeIndex;

    RTCErrorType(int i) {
        this.nativeIndex = i;
    }

    @CalledByNative
    public static RTCErrorType fromNativeIndex(int i) {
        for (RTCErrorType rTCErrorType : values()) {
            if (rTCErrorType.getNative() == i) {
                return rTCErrorType;
            }
        }
        throw new IllegalArgumentException(lhg.a(i, "Unknown native error type: "));
    }

    public int getNative() {
        return this.nativeIndex;
    }
}
