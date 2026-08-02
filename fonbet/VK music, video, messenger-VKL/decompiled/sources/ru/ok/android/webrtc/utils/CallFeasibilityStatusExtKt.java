package ru.ok.android.webrtc.utils;

import ru.ok.android.webrtc.CallFeasibilityStatus;

/* loaded from: classes9.dex */
public final class CallFeasibilityStatusExtKt {
    public static final CallFeasibilityStatus safeValueOf(String str) {
        try {
            return CallFeasibilityStatus.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
