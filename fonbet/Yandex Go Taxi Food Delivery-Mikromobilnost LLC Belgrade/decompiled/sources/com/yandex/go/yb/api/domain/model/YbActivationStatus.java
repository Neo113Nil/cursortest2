package com.yandex.go.yb.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/yb/api/domain/model/YbActivationStatus;", "", "WAITING", "REJECTED", "ACTIVATED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbActivationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbActivationStatus[] $VALUES;
    public static final YbActivationStatus ACTIVATED;
    public static final YbActivationStatus REJECTED;
    public static final YbActivationStatus WAITING;

    static {
        YbActivationStatus ybActivationStatus = new YbActivationStatus("WAITING", 0);
        WAITING = ybActivationStatus;
        YbActivationStatus ybActivationStatus2 = new YbActivationStatus("REJECTED", 1);
        REJECTED = ybActivationStatus2;
        YbActivationStatus ybActivationStatus3 = new YbActivationStatus("ACTIVATED", 2);
        ACTIVATED = ybActivationStatus3;
        YbActivationStatus[] ybActivationStatusArr = {ybActivationStatus, ybActivationStatus2, ybActivationStatus3};
        $VALUES = ybActivationStatusArr;
        $ENTRIES = a.a(ybActivationStatusArr);
    }

    public static YbActivationStatus valueOf(String str) {
        return (YbActivationStatus) Enum.valueOf(YbActivationStatus.class, str);
    }

    public static YbActivationStatus[] values() {
        return (YbActivationStatus[]) $VALUES.clone();
    }
}
