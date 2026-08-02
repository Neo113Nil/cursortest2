package ru.ok.android.webrtc;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public enum HangupReason {
    TIMEOUT,
    BUSY,
    MISSED,
    REJECTED,
    FAILED,
    HUNGUP,
    CANCELED,
    CALL_TIMEOUT,
    REMOVED,
    SERVICE_UNAVAILABLE,
    PARTICIPANT_LIMIT_EXCEEDED,
    OBSOLETE_CLIENT,
    BANNED,
    ANOTHER_DEVICE,
    KILLED,
    KILLED_WITHOUT_DELETE,
    SOCKET_CLOSED,
    INITIALLY_CLOSED;

    @Nullable
    public static HangupReason safeValueOf(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }
}
