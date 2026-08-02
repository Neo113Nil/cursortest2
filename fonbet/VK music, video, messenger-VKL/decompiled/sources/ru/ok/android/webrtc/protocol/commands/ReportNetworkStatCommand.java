package ru.ok.android.webrtc.protocol.commands;

import java.util.Objects;
import ru.ok.android.webrtc.protocol.RtcCommand;
import xsna.vu5;

/* loaded from: classes9.dex */
public class ReportNetworkStatCommand implements RtcCommand<EmptyResponse> {
    public final long sendBitrate;
    public final long timestamp;

    public ReportNetworkStatCommand(long j, long j2) {
        this.timestamp = j;
        this.sendBitrate = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ReportNetworkStatCommand reportNetworkStatCommand = (ReportNetworkStatCommand) obj;
            if (this.timestamp == reportNetworkStatCommand.timestamp && this.sendBitrate == reportNetworkStatCommand.sendBitrate) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.timestamp), Long.valueOf(this.sendBitrate));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommand
    public boolean isNotify() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStat{timestamp=");
        sb.append(this.timestamp);
        sb.append(", sendBitrate=");
        return vu5.a('}', this.sendBitrate, sb);
    }
}
