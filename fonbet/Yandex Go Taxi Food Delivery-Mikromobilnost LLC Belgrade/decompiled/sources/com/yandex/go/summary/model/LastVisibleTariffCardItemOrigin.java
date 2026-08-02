package com.yandex.go.summary.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/summary/model/LastVisibleTariffCardItemOrigin;", "", "SYSTEM", "USER", "composelogic"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LastVisibleTariffCardItemOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LastVisibleTariffCardItemOrigin[] $VALUES;
    public static final LastVisibleTariffCardItemOrigin SYSTEM;
    public static final LastVisibleTariffCardItemOrigin USER;

    static {
        LastVisibleTariffCardItemOrigin lastVisibleTariffCardItemOrigin = new LastVisibleTariffCardItemOrigin("SYSTEM", 0);
        SYSTEM = lastVisibleTariffCardItemOrigin;
        LastVisibleTariffCardItemOrigin lastVisibleTariffCardItemOrigin2 = new LastVisibleTariffCardItemOrigin("USER", 1);
        USER = lastVisibleTariffCardItemOrigin2;
        LastVisibleTariffCardItemOrigin[] lastVisibleTariffCardItemOriginArr = {lastVisibleTariffCardItemOrigin, lastVisibleTariffCardItemOrigin2};
        $VALUES = lastVisibleTariffCardItemOriginArr;
        $ENTRIES = a.a(lastVisibleTariffCardItemOriginArr);
    }

    public static LastVisibleTariffCardItemOrigin valueOf(String str) {
        return (LastVisibleTariffCardItemOrigin) Enum.valueOf(LastVisibleTariffCardItemOrigin.class, str);
    }

    public static LastVisibleTariffCardItemOrigin[] values() {
        return (LastVisibleTariffCardItemOrigin[]) $VALUES.clone();
    }
}
