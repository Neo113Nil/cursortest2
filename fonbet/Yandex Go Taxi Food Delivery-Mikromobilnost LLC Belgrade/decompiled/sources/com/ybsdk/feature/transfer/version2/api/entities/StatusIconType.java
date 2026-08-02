package com.ybsdk.feature.transfer.version2.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/StatusIconType;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "SUCCESS", "TIMEOUT", "WARNING", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatusIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StatusIconType[] $VALUES;
    public static final StatusIconType ERROR = new StatusIconType("ERROR", 0);
    public static final StatusIconType SUCCESS = new StatusIconType("SUCCESS", 1);
    public static final StatusIconType TIMEOUT = new StatusIconType("TIMEOUT", 2);
    public static final StatusIconType WARNING = new StatusIconType("WARNING", 3);

    private static final /* synthetic */ StatusIconType[] $values() {
        return new StatusIconType[]{ERROR, SUCCESS, TIMEOUT, WARNING};
    }

    static {
        StatusIconType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private StatusIconType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StatusIconType valueOf(String str) {
        return (StatusIconType) Enum.valueOf(StatusIconType.class, str);
    }

    public static StatusIconType[] values() {
        return (StatusIconType[]) $VALUES.clone();
    }
}
