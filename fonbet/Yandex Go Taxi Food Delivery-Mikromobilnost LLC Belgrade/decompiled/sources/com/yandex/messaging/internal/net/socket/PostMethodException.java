package com.yandex.messaging.internal.net.socket;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.RateLimit;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/internal/net/socket/PostMethodException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", ACSPConstants.STATUS, CA20Status.STATUS_USER_I, "b", "()I", "", "details", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "rateLimitWaitFor", "Ljava/lang/Long;", "getRateLimitWaitFor", "()Ljava/lang/Long;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PostMethodException extends RuntimeException {
    private final String details;
    private final Long rateLimitWaitFor;
    private final int status;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PostMethodException(PostMessageResponse postMessageResponse) {
        super(r1);
        int i = postMessageResponse.status;
        String str = postMessageResponse.details;
        RateLimit rateLimit = postMessageResponse.rateLimit;
        Long valueOf = rateLimit != null ? Long.valueOf(rateLimit.waitFor) : null;
        this.status = i;
        this.details = str;
        this.rateLimitWaitFor = valueOf;
    }

    /* renamed from: a, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    /* renamed from: b, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostMethodException)) {
            return false;
        }
        PostMethodException postMethodException = (PostMethodException) obj;
        return this.status == postMethodException.status && jl40.l(this.details, postMethodException.details) && jl40.l(this.rateLimitWaitFor, postMethodException.rateLimitWaitFor);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        String str = this.details;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.rateLimitWaitFor;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = this.status;
        String str = this.details;
        Long l = this.rateLimitWaitFor;
        StringBuilder v = unr0.v(i, "PostMethodException(status=", ", details=", str, ", rateLimitWaitFor=");
        v.append(l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
