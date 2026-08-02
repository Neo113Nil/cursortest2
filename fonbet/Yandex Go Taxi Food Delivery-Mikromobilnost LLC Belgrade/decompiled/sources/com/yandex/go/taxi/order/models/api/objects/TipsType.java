package com.yandex.go.taxi.order.models.api.objects;

import defpackage.aiz0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nhz0;
import defpackage.w511;
import defpackage.zhz0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/TipsType;", "", "Companion", "zhz0", "PERCENT", "FLAT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TipsType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zhz0 Companion;
    public static final TipsType FLAT;
    public static final TipsType PERCENT;

    static {
        TipsType tipsType = new TipsType("PERCENT", 0);
        PERCENT = tipsType;
        TipsType tipsType2 = new TipsType("FLAT", 1);
        FLAT = tipsType2;
        TipsType[] tipsTypeArr = {tipsType, tipsType2};
        $VALUES = tipsTypeArr;
        $ENTRIES = kotlin.enums.a.a(tipsTypeArr);
        Companion = new zhz0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(1));
    }

    public static TipsType valueOf(String str) {
        return (TipsType) Enum.valueOf(TipsType.class, str);
    }

    public static TipsType[] values() {
        return (TipsType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = aiz0.a[ordinal()];
        if (i == 1) {
            return "percent";
        }
        if (i == 2) {
            return "flat";
        }
        w511.b();
        return null;
    }
}
