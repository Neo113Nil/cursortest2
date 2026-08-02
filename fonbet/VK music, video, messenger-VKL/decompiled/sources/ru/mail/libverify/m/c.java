package ru.mail.libverify.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.common.DetailStatus;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.m.c;
import ru.mail.libverify.requests.c;

/* loaded from: classes9.dex */
public class c<RESP extends c<RESP, REQ>, REQ extends ru.mail.libverify.requests.c<REQ, RESP>> extends ru.mail.libverify.k0.a<RESP, REQ> {
    private String description;
    private DetailStatus detail_status;

    @Nullable
    private Long server_timestamp;
    private Status status;

    @Nullable
    public final String d() {
        return this.description;
    }

    @NonNull
    public final DetailStatus e() {
        if (this.detail_status == null) {
            this.detail_status = DetailStatus.UNKNOWN;
        }
        DetailStatus detailStatus = this.detail_status;
        return (detailStatus == DetailStatus.UNSUPPORTED_ROUTES && this.status == Status.ERROR) ? DetailStatus.UNKNOWN : detailStatus;
    }

    @Nullable
    public final Long f() {
        return this.server_timestamp;
    }

    @NonNull
    public Status g() {
        if (this.status == null) {
            this.status = Status.UNKNOWN;
        }
        return (this.detail_status == DetailStatus.UNSUPPORTED_ROUTES && this.status == Status.ERROR) ? Status.UNSUPPORTED_NUMBER : this.status;
    }

    @NonNull
    public String toString() {
        return "ClientApiResponseBase{status=" + this.status + ", description='" + this.description + "', detail_status='" + this.detail_status + "'}";
    }
}
