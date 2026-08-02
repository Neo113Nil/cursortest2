package com.ybsdk.feature.main.internal.data.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET", "CREDIT_LIMIT", "CORP_CARD", "PRO", "PROMO", "OTHER", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductTypeDto[] $VALUES;
    public static final ProductTypeDto WALLET = new ProductTypeDto("WALLET", 0);
    public static final ProductTypeDto CREDIT_LIMIT = new ProductTypeDto("CREDIT_LIMIT", 1);
    public static final ProductTypeDto CORP_CARD = new ProductTypeDto("CORP_CARD", 2);
    public static final ProductTypeDto PRO = new ProductTypeDto("PRO", 3);
    public static final ProductTypeDto PROMO = new ProductTypeDto("PROMO", 4);
    public static final ProductTypeDto OTHER = new ProductTypeDto("OTHER", 5);

    private static final /* synthetic */ ProductTypeDto[] $values() {
        return new ProductTypeDto[]{WALLET, CREDIT_LIMIT, CORP_CARD, PRO, PROMO, OTHER};
    }

    static {
        ProductTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductTypeDto valueOf(String str) {
        return (ProductTypeDto) Enum.valueOf(ProductTypeDto.class, str);
    }

    public static ProductTypeDto[] values() {
        return (ProductTypeDto[]) $VALUES.clone();
    }
}
