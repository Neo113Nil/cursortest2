package com.ybsdk.feature.main.internal.domain.entities;

import defpackage.cg91;
import defpackage.k4o;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/main/internal/domain/entities/ProductsViewType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BANK_OFFERS", "PARTNER_OFFERS", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductsViewType[] $VALUES;
    public static final ProductsViewType BANK_OFFERS;
    public static final ProductsViewType PARTNER_OFFERS;
    private final String value;

    private static final /* synthetic */ ProductsViewType[] $values() {
        return new ProductsViewType[]{BANK_OFFERS, PARTNER_OFFERS};
    }

    static {
        byte[] bArr = cg91.g;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ cg91.a[i % 8]);
        }
        BANK_OFFERS = new ProductsViewType("BANK_OFFERS", 0, new String(bArr2, uza.a));
        PARTNER_OFFERS = new ProductsViewType("PARTNER_OFFERS", 1, "PARTNER_OFFERS");
        ProductsViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ProductsViewType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ProductsViewType valueOf(String str) {
        return (ProductsViewType) Enum.valueOf(ProductsViewType.class, str);
    }

    public static ProductsViewType[] values() {
        return (ProductsViewType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
