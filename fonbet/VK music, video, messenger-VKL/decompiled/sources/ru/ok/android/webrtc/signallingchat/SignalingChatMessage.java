package ru.ok.android.webrtc.signallingchat;

import androidx.annotation.NonNull;
import defpackage.q0;

/* loaded from: classes9.dex */
public class SignalingChatMessage {
    public final boolean direct;

    @NonNull
    public final String message;

    public SignalingChatMessage(@NonNull String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignalingChatMessage signalingChatMessage = (SignalingChatMessage) obj;
        if (this.direct != signalingChatMessage.direct) {
            return false;
        }
        return this.message.equals(signalingChatMessage.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SignalingChatMessage{message='");
        sb.append(this.message);
        sb.append("', direct=");
        return q0.a(sb, this.direct, '}');
    }
}
