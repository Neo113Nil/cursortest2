package ru.ok.android.webrtc.protocol.commands;

import java.util.Objects;
import ru.ok.android.webrtc.protocol.RtcCommand;
import xsna.vu5;

/* loaded from: classes9.dex */
public class ReportPerfStatCommand implements RtcCommand<ReportPerfStatResponse> {
    public final long framesDecoded;
    public final long framesReceived;

    public ReportPerfStatCommand(long j, long j2) {
        this.framesReceived = j;
        this.framesDecoded = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ReportPerfStatCommand reportPerfStatCommand = (ReportPerfStatCommand) obj;
            if (this.framesReceived == reportPerfStatCommand.framesReceived && this.framesDecoded == reportPerfStatCommand.framesDecoded) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.framesReceived), Long.valueOf(this.framesDecoded));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommand
    public boolean isNotify() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportPerfStatCommand{framesReceived=");
        sb.append(this.framesReceived);
        sb.append(", framesDecoded=");
        return vu5.a('}', this.framesDecoded, sb);
    }
}
