package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.g8f0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vye0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/ProductDto$Details$Type", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/common/ProductDto$Details$Type;", "Companion", "g8f0", "SUBSCRIPTION", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductDto$Details$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProductDto$Details$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final g8f0 Companion;
    public static final ProductDto$Details$Type SUBSCRIPTION;

    static {
        ProductDto$Details$Type productDto$Details$Type = new ProductDto$Details$Type("SUBSCRIPTION", 0);
        SUBSCRIPTION = productDto$Details$Type;
        ProductDto$Details$Type[] productDto$Details$TypeArr = {productDto$Details$Type};
        $VALUES = productDto$Details$TypeArr;
        $ENTRIES = a.a(productDto$Details$TypeArr);
        Companion = new g8f0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(14));
    }

    public static ProductDto$Details$Type valueOf(String str) {
        return (ProductDto$Details$Type) Enum.valueOf(ProductDto$Details$Type.class, str);
    }

    public static ProductDto$Details$Type[] values() {
        return (ProductDto$Details$Type[]) $VALUES.clone();
    }
}
