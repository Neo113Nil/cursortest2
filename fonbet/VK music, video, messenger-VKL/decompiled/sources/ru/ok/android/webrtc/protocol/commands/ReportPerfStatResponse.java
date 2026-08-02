package ru.ok.android.webrtc.protocol.commands;

import androidx.annotation.Nullable;
import java.util.Objects;
import ru.ok.android.webrtc.protocol.RtcResponse;
import xsna.uqi;

/* loaded from: classes9.dex */
public class ReportPerfStatResponse implements RtcResponse {

    @Nullable
    public final Integer estimatedPerformanceIndex;

    public ReportPerfStatResponse(@Nullable Integer num) {
        this.estimatedPerformanceIndex = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.estimatedPerformanceIndex, ((ReportPerfStatResponse) obj).estimatedPerformanceIndex);
    }

    public int hashCode() {
        return Objects.hash(this.estimatedPerformanceIndex);
    }

    public String toString() {
        return uqi.b(new StringBuilder("ReportPerfStatResponse{estimatedPerformanceIndex="), this.estimatedPerformanceIndex, '}');
    }
}
