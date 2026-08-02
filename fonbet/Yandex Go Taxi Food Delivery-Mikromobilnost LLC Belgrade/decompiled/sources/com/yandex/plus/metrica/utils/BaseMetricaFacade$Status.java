package com.yandex.plus.metrica.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/plus/metrica/utils/BaseMetricaFacade$Status", "", "Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", "", "available", "Z", "a", "()Z", "NOT_FOUND", "INCOMPATIBLE", "COMPATIBLE", "metrica-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BaseMetricaFacade$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BaseMetricaFacade$Status[] $VALUES;
    public static final BaseMetricaFacade$Status COMPATIBLE;
    public static final BaseMetricaFacade$Status INCOMPATIBLE;
    public static final BaseMetricaFacade$Status NOT_FOUND;
    private final boolean available;

    static {
        BaseMetricaFacade$Status baseMetricaFacade$Status = new BaseMetricaFacade$Status("NOT_FOUND", 0, false);
        NOT_FOUND = baseMetricaFacade$Status;
        BaseMetricaFacade$Status baseMetricaFacade$Status2 = new BaseMetricaFacade$Status("INCOMPATIBLE", 1, false);
        INCOMPATIBLE = baseMetricaFacade$Status2;
        BaseMetricaFacade$Status baseMetricaFacade$Status3 = new BaseMetricaFacade$Status("COMPATIBLE", 2, true);
        COMPATIBLE = baseMetricaFacade$Status3;
        BaseMetricaFacade$Status[] baseMetricaFacade$StatusArr = {baseMetricaFacade$Status, baseMetricaFacade$Status2, baseMetricaFacade$Status3};
        $VALUES = baseMetricaFacade$StatusArr;
        $ENTRIES = kotlin.enums.a.a(baseMetricaFacade$StatusArr);
    }

    public BaseMetricaFacade$Status(String str, int i, boolean z) {
        this.available = z;
    }

    public static BaseMetricaFacade$Status valueOf(String str) {
        return (BaseMetricaFacade$Status) Enum.valueOf(BaseMetricaFacade$Status.class, str);
    }

    public static BaseMetricaFacade$Status[] values() {
        return (BaseMetricaFacade$Status[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }
}
