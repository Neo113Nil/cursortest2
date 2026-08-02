package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.r66;
import defpackage.tj6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BrandingType;", "", "Companion", "tj6", "YA_PLUS", "MASTERCARD", "YA_PLUS_MASTERCARD", "VISA", "YA_PLUS_VISA", "OTHER", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BrandingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BrandingType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final tj6 Companion;
    public static final BrandingType MASTERCARD;
    public static final BrandingType OTHER;
    public static final BrandingType VISA;
    public static final BrandingType YA_PLUS;
    public static final BrandingType YA_PLUS_MASTERCARD;
    public static final BrandingType YA_PLUS_VISA;

    static {
        BrandingType brandingType = new BrandingType("YA_PLUS", 0);
        YA_PLUS = brandingType;
        BrandingType brandingType2 = new BrandingType("MASTERCARD", 1);
        MASTERCARD = brandingType2;
        BrandingType brandingType3 = new BrandingType("YA_PLUS_MASTERCARD", 2);
        YA_PLUS_MASTERCARD = brandingType3;
        BrandingType brandingType4 = new BrandingType("VISA", 3);
        VISA = brandingType4;
        BrandingType brandingType5 = new BrandingType("YA_PLUS_VISA", 4);
        YA_PLUS_VISA = brandingType5;
        BrandingType brandingType6 = new BrandingType("OTHER", 5);
        OTHER = brandingType6;
        BrandingType[] brandingTypeArr = {brandingType, brandingType2, brandingType3, brandingType4, brandingType5, brandingType6};
        $VALUES = brandingTypeArr;
        $ENTRIES = kotlin.enums.a.a(brandingTypeArr);
        Companion = new tj6();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(3));
    }

    public static BrandingType valueOf(String str) {
        return (BrandingType) Enum.valueOf(BrandingType.class, str);
    }

    public static BrandingType[] values() {
        return (BrandingType[]) $VALUES.clone();
    }
}
