package ru.ok.android.webrtc.protocol.commands;

import androidx.annotation.NonNull;
import defpackage.q0;
import java.util.Objects;
import ru.ok.android.webrtc.protocol.RtcCommand;

/* loaded from: classes9.dex */
public class RequestAsrCommand implements RtcCommand<EmptyResponse> {
    public final boolean start;

    public RequestAsrCommand(@NonNull boolean z) {
        this.start = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.start == ((RequestAsrCommand) obj).start;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.start));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommand
    public boolean isNotify() {
        return true;
    }

    public String toString() {
        return q0.a(new StringBuilder("RequestAsr{isEnabled="), this.start, '}');
    }
}
