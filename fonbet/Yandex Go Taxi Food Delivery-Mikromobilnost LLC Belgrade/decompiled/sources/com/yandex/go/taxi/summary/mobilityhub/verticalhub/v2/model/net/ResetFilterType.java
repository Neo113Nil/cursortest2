package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.orj0;
import defpackage.zfj0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/ResetFilterType;", "", "Companion", "orj0", "RESET_DUE", "RESET_TRANSPORT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetFilterType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResetFilterType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final orj0 Companion;
    public static final ResetFilterType RESET_DUE;
    public static final ResetFilterType RESET_TRANSPORT;
    public static final ResetFilterType UNKNOWN;

    static {
        ResetFilterType resetFilterType = new ResetFilterType("RESET_DUE", 0);
        RESET_DUE = resetFilterType;
        ResetFilterType resetFilterType2 = new ResetFilterType("RESET_TRANSPORT", 1);
        RESET_TRANSPORT = resetFilterType2;
        ResetFilterType resetFilterType3 = new ResetFilterType("UNKNOWN", 2);
        UNKNOWN = resetFilterType3;
        ResetFilterType[] resetFilterTypeArr = {resetFilterType, resetFilterType2, resetFilterType3};
        $VALUES = resetFilterTypeArr;
        $ENTRIES = kotlin.enums.a.a(resetFilterTypeArr);
        Companion = new orj0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(8));
    }

    public static ResetFilterType valueOf(String str) {
        return (ResetFilterType) Enum.valueOf(ResetFilterType.class, str);
    }

    public static ResetFilterType[] values() {
        return (ResetFilterType[]) $VALUES.clone();
    }
}
