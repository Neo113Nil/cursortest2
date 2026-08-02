package com.yandex.go.taxi.order.change.source.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tqs0;
import defpackage.xbt0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/SourceChangeReason;", "", "Companion", "xbt0", "PICKUP_POINT_MANUAL", "ALTPIN_SUGGEST", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SourceChangeReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourceChangeReason[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SourceChangeReason ALTPIN_SUGGEST;
    public static final xbt0 Companion;
    public static final SourceChangeReason PICKUP_POINT_MANUAL;

    static {
        SourceChangeReason sourceChangeReason = new SourceChangeReason("PICKUP_POINT_MANUAL", 0);
        PICKUP_POINT_MANUAL = sourceChangeReason;
        SourceChangeReason sourceChangeReason2 = new SourceChangeReason("ALTPIN_SUGGEST", 1);
        ALTPIN_SUGGEST = sourceChangeReason2;
        SourceChangeReason[] sourceChangeReasonArr = {sourceChangeReason, sourceChangeReason2};
        $VALUES = sourceChangeReasonArr;
        $ENTRIES = kotlin.enums.a.a(sourceChangeReasonArr);
        Companion = new xbt0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(29));
    }

    public static SourceChangeReason valueOf(String str) {
        return (SourceChangeReason) Enum.valueOf(SourceChangeReason.class, str);
    }

    public static SourceChangeReason[] values() {
        return (SourceChangeReason[]) $VALUES.clone();
    }
}
