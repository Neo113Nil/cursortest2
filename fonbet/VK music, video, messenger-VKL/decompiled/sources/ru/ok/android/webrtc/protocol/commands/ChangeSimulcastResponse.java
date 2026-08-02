package ru.ok.android.webrtc.protocol.commands;

import ru.ok.android.webrtc.protocol.RtcResponse;

/* loaded from: classes9.dex */
public final class ChangeSimulcastResponse implements RtcResponse {
    public final int a;

    public ChangeSimulcastResponse(int i) {
        this.a = i;
    }

    public final int getErrorCode() {
        return this.a;
    }

    public final boolean isSuccess() {
        return this.a == 0;
    }

    public String toString() {
        return "ChangeSimulcastResponse(success=" + isSuccess() + ", errorCode=" + this.a + ")";
    }
}
