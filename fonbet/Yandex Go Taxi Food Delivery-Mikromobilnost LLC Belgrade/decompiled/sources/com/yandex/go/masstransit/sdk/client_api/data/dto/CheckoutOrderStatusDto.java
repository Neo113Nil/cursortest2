package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.clb;
import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutOrderStatusDto;", "", "Companion", "clb", "FAILURE", "SUCCESS", "PROCESSING", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutOrderStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckoutOrderStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final clb Companion;
    public static final CheckoutOrderStatusDto FAILURE;
    public static final CheckoutOrderStatusDto PROCESSING;
    public static final CheckoutOrderStatusDto SUCCESS;

    static {
        CheckoutOrderStatusDto checkoutOrderStatusDto = new CheckoutOrderStatusDto("FAILURE", 0);
        FAILURE = checkoutOrderStatusDto;
        CheckoutOrderStatusDto checkoutOrderStatusDto2 = new CheckoutOrderStatusDto("SUCCESS", 1);
        SUCCESS = checkoutOrderStatusDto2;
        CheckoutOrderStatusDto checkoutOrderStatusDto3 = new CheckoutOrderStatusDto("PROCESSING", 2);
        PROCESSING = checkoutOrderStatusDto3;
        CheckoutOrderStatusDto[] checkoutOrderStatusDtoArr = {checkoutOrderStatusDto, checkoutOrderStatusDto2, checkoutOrderStatusDto3};
        $VALUES = checkoutOrderStatusDtoArr;
        $ENTRIES = kotlin.enums.a.a(checkoutOrderStatusDtoArr);
        Companion = new clb();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(28));
    }

    public static CheckoutOrderStatusDto valueOf(String str) {
        return (CheckoutOrderStatusDto) Enum.valueOf(CheckoutOrderStatusDto.class, str);
    }

    public static CheckoutOrderStatusDto[] values() {
        return (CheckoutOrderStatusDto[]) $VALUES.clone();
    }
}
