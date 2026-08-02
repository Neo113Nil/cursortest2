package com.yandex.plus.pay.data.mb.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jpd;
import defpackage.juc;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/pay/data/mb/dto/CompositeOfferDto$StructureType", "", "Lcom/yandex/plus/pay/data/mb/dto/CompositeOfferDto$StructureType;", "Companion", "jpd", "TARIFF", "OPTION", "COMPOSITE", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeOfferDto$StructureType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompositeOfferDto$StructureType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final CompositeOfferDto$StructureType COMPOSITE;
    public static final jpd Companion;
    public static final CompositeOfferDto$StructureType OPTION;
    public static final CompositeOfferDto$StructureType TARIFF;

    static {
        CompositeOfferDto$StructureType compositeOfferDto$StructureType = new CompositeOfferDto$StructureType("TARIFF", 0);
        TARIFF = compositeOfferDto$StructureType;
        CompositeOfferDto$StructureType compositeOfferDto$StructureType2 = new CompositeOfferDto$StructureType("OPTION", 1);
        OPTION = compositeOfferDto$StructureType2;
        CompositeOfferDto$StructureType compositeOfferDto$StructureType3 = new CompositeOfferDto$StructureType("COMPOSITE", 2);
        COMPOSITE = compositeOfferDto$StructureType3;
        CompositeOfferDto$StructureType[] compositeOfferDto$StructureTypeArr = {compositeOfferDto$StructureType, compositeOfferDto$StructureType2, compositeOfferDto$StructureType3};
        $VALUES = compositeOfferDto$StructureTypeArr;
        $ENTRIES = kotlin.enums.a.a(compositeOfferDto$StructureTypeArr);
        Companion = new jpd();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new juc(28));
    }

    public static CompositeOfferDto$StructureType valueOf(String str) {
        return (CompositeOfferDto$StructureType) Enum.valueOf(CompositeOfferDto$StructureType.class, str);
    }

    public static CompositeOfferDto$StructureType[] values() {
        return (CompositeOfferDto$StructureType[]) $VALUES.clone();
    }
}
