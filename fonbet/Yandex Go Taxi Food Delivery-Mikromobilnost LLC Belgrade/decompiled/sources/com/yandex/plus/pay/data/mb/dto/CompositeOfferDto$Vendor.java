package com.yandex.plus.pay.data.mb.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kpd;
import defpackage.rpd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/pay/data/mb/dto/CompositeOfferDto$Vendor", "", "Lcom/yandex/plus/pay/data/mb/dto/CompositeOfferDto$Vendor;", "Companion", "rpd", "GOOGLE_PLAY", "NATIVE_YANDEX", "UNKNOWN", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeOfferDto$Vendor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompositeOfferDto$Vendor[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final rpd Companion;
    public static final CompositeOfferDto$Vendor GOOGLE_PLAY;
    public static final CompositeOfferDto$Vendor NATIVE_YANDEX;
    public static final CompositeOfferDto$Vendor UNKNOWN;

    static {
        CompositeOfferDto$Vendor compositeOfferDto$Vendor = new CompositeOfferDto$Vendor("GOOGLE_PLAY", 0);
        GOOGLE_PLAY = compositeOfferDto$Vendor;
        CompositeOfferDto$Vendor compositeOfferDto$Vendor2 = new CompositeOfferDto$Vendor("NATIVE_YANDEX", 1);
        NATIVE_YANDEX = compositeOfferDto$Vendor2;
        CompositeOfferDto$Vendor compositeOfferDto$Vendor3 = new CompositeOfferDto$Vendor("UNKNOWN", 2);
        UNKNOWN = compositeOfferDto$Vendor3;
        CompositeOfferDto$Vendor[] compositeOfferDto$VendorArr = {compositeOfferDto$Vendor, compositeOfferDto$Vendor2, compositeOfferDto$Vendor3};
        $VALUES = compositeOfferDto$VendorArr;
        $ENTRIES = kotlin.enums.a.a(compositeOfferDto$VendorArr);
        Companion = new rpd();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(2));
    }

    public static CompositeOfferDto$Vendor valueOf(String str) {
        return (CompositeOfferDto$Vendor) Enum.valueOf(CompositeOfferDto$Vendor.class, str);
    }

    public static CompositeOfferDto$Vendor[] values() {
        return (CompositeOfferDto$Vendor[]) $VALUES.clone();
    }
}
