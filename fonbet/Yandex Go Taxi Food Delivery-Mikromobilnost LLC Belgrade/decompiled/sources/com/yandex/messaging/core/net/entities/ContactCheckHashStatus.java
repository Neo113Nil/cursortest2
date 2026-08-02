package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ContactCheckHashStatus;", "", "", "wireValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OK", "FailedHash", "FailedVersion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactCheckHashStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContactCheckHashStatus[] $VALUES;

    @Json(name = "FAILED_HASH")
    public static final ContactCheckHashStatus FailedHash;

    @Json(name = "FAILED_VERSION")
    public static final ContactCheckHashStatus FailedVersion;

    @Json(name = "OK")
    public static final ContactCheckHashStatus OK;
    private final String wireValue;

    static {
        ContactCheckHashStatus contactCheckHashStatus = new ContactCheckHashStatus("OK", 0, "OK");
        OK = contactCheckHashStatus;
        ContactCheckHashStatus contactCheckHashStatus2 = new ContactCheckHashStatus("FailedHash", 1, "FAILED_HASH");
        FailedHash = contactCheckHashStatus2;
        ContactCheckHashStatus contactCheckHashStatus3 = new ContactCheckHashStatus("FailedVersion", 2, "FAILED_VERSION");
        FailedVersion = contactCheckHashStatus3;
        ContactCheckHashStatus[] contactCheckHashStatusArr = {contactCheckHashStatus, contactCheckHashStatus2, contactCheckHashStatus3};
        $VALUES = contactCheckHashStatusArr;
        $ENTRIES = a.a(contactCheckHashStatusArr);
    }

    public ContactCheckHashStatus(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static ContactCheckHashStatus valueOf(String str) {
        return (ContactCheckHashStatus) Enum.valueOf(ContactCheckHashStatus.class, str);
    }

    public static ContactCheckHashStatus[] values() {
        return (ContactCheckHashStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getWireValue() {
        return this.wireValue;
    }
}
