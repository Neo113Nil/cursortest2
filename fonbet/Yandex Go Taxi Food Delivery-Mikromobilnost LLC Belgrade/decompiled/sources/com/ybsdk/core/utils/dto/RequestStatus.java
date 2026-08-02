package com.ybsdk.core.utils.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/core/utils/dto/RequestStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "AUTHENTICATION_REQUIRED", "FAIL", "UNKNOWN", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequestStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequestStatus[] $VALUES;
    public static final RequestStatus SUCCESS = new RequestStatus("SUCCESS", 0);
    public static final RequestStatus AUTHENTICATION_REQUIRED = new RequestStatus("AUTHENTICATION_REQUIRED", 1);
    public static final RequestStatus FAIL = new RequestStatus("FAIL", 2);
    public static final RequestStatus UNKNOWN = new RequestStatus("UNKNOWN", 3);

    private static final /* synthetic */ RequestStatus[] $values() {
        return new RequestStatus[]{SUCCESS, AUTHENTICATION_REQUIRED, FAIL, UNKNOWN};
    }

    static {
        RequestStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RequestStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RequestStatus valueOf(String str) {
        return (RequestStatus) Enum.valueOf(RequestStatus.class, str);
    }

    public static RequestStatus[] values() {
        return (RequestStatus[]) $VALUES.clone();
    }
}
