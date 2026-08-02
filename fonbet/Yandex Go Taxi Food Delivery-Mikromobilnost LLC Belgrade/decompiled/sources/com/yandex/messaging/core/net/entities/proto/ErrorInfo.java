package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.xuf0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "", Constants.KEY_MESSAGE, "", "workerId", "", "timeMcs", "", "retryAfter", "<init>", "(Ljava/lang/String;IJJ)V", "getMessage", "()Ljava/lang/String;", "getWorkerId", "()I", "getTimeMcs", "()J", "getRetryAfter", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ErrorInfo {

    @Json(name = "Message")
    @xuf0(tag = 1)
    private final String message;

    @Json(name = "RetryAfter")
    @xuf0(tag = 4)
    private final long retryAfter;

    @Json(name = "TimeMcs")
    @xuf0(tag = 3)
    private final long timeMcs;

    @Json(name = "WorkerId")
    @xuf0(tag = 2)
    private final int workerId;

    public ErrorInfo(String str, int i, long j, long j2) {
        this.message = str;
        this.workerId = i;
        this.timeMcs = j;
        this.retryAfter = j2;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorInfo.message;
        }
        if ((i2 & 2) != 0) {
            i = errorInfo.workerId;
        }
        if ((i2 & 4) != 0) {
            j = errorInfo.timeMcs;
        }
        if ((i2 & 8) != 0) {
            j2 = errorInfo.retryAfter;
        }
        long j3 = j2;
        return errorInfo.copy(str, i, j, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWorkerId() {
        return this.workerId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeMcs() {
        return this.timeMcs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRetryAfter() {
        return this.retryAfter;
    }

    public final ErrorInfo copy(String message, int workerId, long timeMcs, long retryAfter) {
        return new ErrorInfo(message, workerId, timeMcs, retryAfter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) other;
        return jl40.l(this.message, errorInfo.message) && this.workerId == errorInfo.workerId && this.timeMcs == errorInfo.timeMcs && this.retryAfter == errorInfo.retryAfter;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getRetryAfter() {
        return this.retryAfter;
    }

    public final long getTimeMcs() {
        return this.timeMcs;
    }

    public final int getWorkerId() {
        return this.workerId;
    }

    public int hashCode() {
        return Long.hashCode(this.retryAfter) + qv10.c(oyr.b(this.workerId, this.message.hashCode() * 31, 31), 31, this.timeMcs);
    }

    public String toString() {
        String str = this.message;
        int i = this.workerId;
        long j = this.timeMcs;
        long j2 = this.retryAfter;
        StringBuilder u = b64.u(i, "ErrorInfo(message=", str, ", workerId=", ", timeMcs=");
        u.append(j);
        return g8e.l(j2, ", retryAfter=", Extension.C_BRAKE, u);
    }
}
