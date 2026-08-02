package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ContactCheckHashResponse;", "", "statusCheck", "Lcom/yandex/messaging/core/net/entities/ContactCheckHashStatus;", "<init>", "(Lcom/yandex/messaging/core/net/entities/ContactCheckHashStatus;)V", "getStatusCheck", "()Lcom/yandex/messaging/core/net/entities/ContactCheckHashStatus;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ContactCheckHashResponse {
    private final ContactCheckHashStatus statusCheck;

    public ContactCheckHashResponse(@Json(name = "status_check") ContactCheckHashStatus contactCheckHashStatus) {
        this.statusCheck = contactCheckHashStatus;
    }

    public static /* synthetic */ ContactCheckHashResponse copy$default(ContactCheckHashResponse contactCheckHashResponse, ContactCheckHashStatus contactCheckHashStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            contactCheckHashStatus = contactCheckHashResponse.statusCheck;
        }
        return contactCheckHashResponse.copy(contactCheckHashStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final ContactCheckHashStatus getStatusCheck() {
        return this.statusCheck;
    }

    public final ContactCheckHashResponse copy(@Json(name = "status_check") ContactCheckHashStatus statusCheck) {
        return new ContactCheckHashResponse(statusCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContactCheckHashResponse) && this.statusCheck == ((ContactCheckHashResponse) other).statusCheck;
    }

    public final ContactCheckHashStatus getStatusCheck() {
        return this.statusCheck;
    }

    public int hashCode() {
        return this.statusCheck.hashCode();
    }

    public String toString() {
        return "ContactCheckHashResponse(statusCheck=" + this.statusCheck + Extension.C_BRAKE;
    }
}
