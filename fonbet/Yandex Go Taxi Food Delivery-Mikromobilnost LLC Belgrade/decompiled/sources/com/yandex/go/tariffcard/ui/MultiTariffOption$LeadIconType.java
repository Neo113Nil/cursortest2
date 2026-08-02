package com.yandex.go.tariffcard.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/tariffcard/ui/MultiTariffOption$LeadIconType", "", "Lcom/yandex/go/tariffcard/ui/MultiTariffOption$LeadIconType;", "USUAL", "HIGH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MultiTariffOption$LeadIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiTariffOption$LeadIconType[] $VALUES;
    public static final MultiTariffOption$LeadIconType HIGH;
    public static final MultiTariffOption$LeadIconType USUAL;

    static {
        MultiTariffOption$LeadIconType multiTariffOption$LeadIconType = new MultiTariffOption$LeadIconType("USUAL", 0);
        USUAL = multiTariffOption$LeadIconType;
        MultiTariffOption$LeadIconType multiTariffOption$LeadIconType2 = new MultiTariffOption$LeadIconType("HIGH", 1);
        HIGH = multiTariffOption$LeadIconType2;
        MultiTariffOption$LeadIconType[] multiTariffOption$LeadIconTypeArr = {multiTariffOption$LeadIconType, multiTariffOption$LeadIconType2};
        $VALUES = multiTariffOption$LeadIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(multiTariffOption$LeadIconTypeArr);
    }

    public static MultiTariffOption$LeadIconType valueOf(String str) {
        return (MultiTariffOption$LeadIconType) Enum.valueOf(MultiTariffOption$LeadIconType.class, str);
    }

    public static MultiTariffOption$LeadIconType[] values() {
        return (MultiTariffOption$LeadIconType[]) $VALUES.clone();
    }
}
