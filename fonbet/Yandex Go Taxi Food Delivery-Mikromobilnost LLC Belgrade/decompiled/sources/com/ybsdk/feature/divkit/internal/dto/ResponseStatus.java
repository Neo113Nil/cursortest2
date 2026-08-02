package com.ybsdk.feature.divkit.internal.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/ResponseStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "IN_PROGRESS", "FAILED", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResponseStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResponseStatus[] $VALUES;
    public static final ResponseStatus SUCCESS = new ResponseStatus("SUCCESS", 0);
    public static final ResponseStatus IN_PROGRESS = new ResponseStatus("IN_PROGRESS", 1);
    public static final ResponseStatus FAILED = new ResponseStatus("FAILED", 2);

    private static final /* synthetic */ ResponseStatus[] $values() {
        return new ResponseStatus[]{SUCCESS, IN_PROGRESS, FAILED};
    }

    static {
        ResponseStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ResponseStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ResponseStatus valueOf(String str) {
        return (ResponseStatus) Enum.valueOf(ResponseStatus.class, str);
    }

    public static ResponseStatus[] values() {
        return (ResponseStatus[]) $VALUES.clone();
    }
}
