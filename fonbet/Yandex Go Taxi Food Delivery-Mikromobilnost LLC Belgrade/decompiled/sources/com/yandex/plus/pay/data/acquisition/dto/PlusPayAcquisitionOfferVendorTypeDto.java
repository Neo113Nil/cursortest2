package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.q2d0;
import defpackage.t8d0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/data/acquisition/dto/PlusPayAcquisitionOfferVendorTypeDto;", "", "Companion", "t8d0", "GOOGLE_PLAY", "NATIVE_YANDEX", "UNKNOWN", "pay-sdk-data-acquisition-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayAcquisitionOfferVendorTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayAcquisitionOfferVendorTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final t8d0 Companion;
    public static final PlusPayAcquisitionOfferVendorTypeDto GOOGLE_PLAY;
    public static final PlusPayAcquisitionOfferVendorTypeDto NATIVE_YANDEX;
    public static final PlusPayAcquisitionOfferVendorTypeDto UNKNOWN;

    static {
        PlusPayAcquisitionOfferVendorTypeDto plusPayAcquisitionOfferVendorTypeDto = new PlusPayAcquisitionOfferVendorTypeDto("GOOGLE_PLAY", 0);
        GOOGLE_PLAY = plusPayAcquisitionOfferVendorTypeDto;
        PlusPayAcquisitionOfferVendorTypeDto plusPayAcquisitionOfferVendorTypeDto2 = new PlusPayAcquisitionOfferVendorTypeDto("NATIVE_YANDEX", 1);
        NATIVE_YANDEX = plusPayAcquisitionOfferVendorTypeDto2;
        PlusPayAcquisitionOfferVendorTypeDto plusPayAcquisitionOfferVendorTypeDto3 = new PlusPayAcquisitionOfferVendorTypeDto("UNKNOWN", 2);
        UNKNOWN = plusPayAcquisitionOfferVendorTypeDto3;
        PlusPayAcquisitionOfferVendorTypeDto[] plusPayAcquisitionOfferVendorTypeDtoArr = {plusPayAcquisitionOfferVendorTypeDto, plusPayAcquisitionOfferVendorTypeDto2, plusPayAcquisitionOfferVendorTypeDto3};
        $VALUES = plusPayAcquisitionOfferVendorTypeDtoArr;
        $ENTRIES = a.a(plusPayAcquisitionOfferVendorTypeDtoArr);
        Companion = new t8d0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(16));
    }

    public static PlusPayAcquisitionOfferVendorTypeDto valueOf(String str) {
        return (PlusPayAcquisitionOfferVendorTypeDto) Enum.valueOf(PlusPayAcquisitionOfferVendorTypeDto.class, str);
    }

    public static PlusPayAcquisitionOfferVendorTypeDto[] values() {
        return (PlusPayAcquisitionOfferVendorTypeDto[]) $VALUES.clone();
    }
}
