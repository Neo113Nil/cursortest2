package com.yandex.go.tariffcard.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/ui/HeaderType;", "", "ULTIMA", "STANDARD", "MULTICLASS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HeaderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HeaderType[] $VALUES;
    public static final HeaderType MULTICLASS;
    public static final HeaderType STANDARD;
    public static final HeaderType ULTIMA;

    static {
        HeaderType headerType = new HeaderType("ULTIMA", 0);
        ULTIMA = headerType;
        HeaderType headerType2 = new HeaderType("STANDARD", 1);
        STANDARD = headerType2;
        HeaderType headerType3 = new HeaderType("MULTICLASS", 2);
        MULTICLASS = headerType3;
        HeaderType[] headerTypeArr = {headerType, headerType2, headerType3};
        $VALUES = headerTypeArr;
        $ENTRIES = kotlin.enums.a.a(headerTypeArr);
    }

    public static HeaderType valueOf(String str) {
        return (HeaderType) Enum.valueOf(HeaderType.class, str);
    }

    public static HeaderType[] values() {
        return (HeaderType[]) $VALUES.clone();
    }
}
