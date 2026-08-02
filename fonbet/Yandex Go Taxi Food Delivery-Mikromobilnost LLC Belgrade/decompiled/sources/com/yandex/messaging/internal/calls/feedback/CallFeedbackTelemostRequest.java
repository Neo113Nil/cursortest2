package com.yandex.messaging.internal.calls.feedback;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostRequest;", "", "statsReport", "Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntity;", "<init>", "(Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntity;)V", "getStatsReport", "()Lcom/yandex/messaging/internal/calls/feedback/CallFeedbackTelemostEntity;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CallFeedbackTelemostRequest {
    public static final int $stable = 0;
    private final CallFeedbackTelemostEntity statsReport;

    public CallFeedbackTelemostRequest(@Json(name = "stats_report") CallFeedbackTelemostEntity callFeedbackTelemostEntity) {
        this.statsReport = callFeedbackTelemostEntity;
    }

    public static /* synthetic */ CallFeedbackTelemostRequest copy$default(CallFeedbackTelemostRequest callFeedbackTelemostRequest, CallFeedbackTelemostEntity callFeedbackTelemostEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            callFeedbackTelemostEntity = callFeedbackTelemostRequest.statsReport;
        }
        return callFeedbackTelemostRequest.copy(callFeedbackTelemostEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final CallFeedbackTelemostEntity getStatsReport() {
        return this.statsReport;
    }

    public final CallFeedbackTelemostRequest copy(@Json(name = "stats_report") CallFeedbackTelemostEntity statsReport) {
        return new CallFeedbackTelemostRequest(statsReport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CallFeedbackTelemostRequest) && jl40.l(this.statsReport, ((CallFeedbackTelemostRequest) other).statsReport);
    }

    public final CallFeedbackTelemostEntity getStatsReport() {
        return this.statsReport;
    }

    public int hashCode() {
        return this.statsReport.hashCode();
    }

    public String toString() {
        return "CallFeedbackTelemostRequest(statsReport=" + this.statsReport + Extension.C_BRAKE;
    }
}
