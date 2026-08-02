package com.yandex.go.zone.dto.objects;

import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tj31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/VerticalType;", "", "Companion", "tj31", "GROUP", "SINGLE_TARIFF", "TRANSPORT", "NAVIGATOR", "DRIVE", "MIXED", JCP.RAW_PREFIX, "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final tj31 Companion;
    public static final VerticalType DRIVE;
    public static final VerticalType GROUP;
    public static final VerticalType MIXED;
    public static final VerticalType NAVIGATOR;
    public static final VerticalType NONE;
    public static final VerticalType SINGLE_TARIFF;
    public static final VerticalType TRANSPORT;

    static {
        VerticalType verticalType = new VerticalType("GROUP", 0);
        GROUP = verticalType;
        VerticalType verticalType2 = new VerticalType("SINGLE_TARIFF", 1);
        SINGLE_TARIFF = verticalType2;
        VerticalType verticalType3 = new VerticalType("TRANSPORT", 2);
        TRANSPORT = verticalType3;
        VerticalType verticalType4 = new VerticalType("NAVIGATOR", 3);
        NAVIGATOR = verticalType4;
        VerticalType verticalType5 = new VerticalType("DRIVE", 4);
        DRIVE = verticalType5;
        VerticalType verticalType6 = new VerticalType("MIXED", 5);
        MIXED = verticalType6;
        VerticalType verticalType7 = new VerticalType(JCP.RAW_PREFIX, 6);
        NONE = verticalType7;
        VerticalType[] verticalTypeArr = {verticalType, verticalType2, verticalType3, verticalType4, verticalType5, verticalType6, verticalType7};
        $VALUES = verticalTypeArr;
        $ENTRIES = kotlin.enums.a.a(verticalTypeArr);
        Companion = new tj31();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(19));
    }

    public static VerticalType valueOf(String str) {
        return (VerticalType) Enum.valueOf(VerticalType.class, str);
    }

    public static VerticalType[] values() {
        return (VerticalType[]) $VALUES.clone();
    }
}
