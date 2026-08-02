package com.yandex.passport.internal.flags;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/passport/internal/flags/Flag$Type", "", "Lcom/yandex/passport/internal/flags/Flag$Type;", "BOOLEAN", "INT", "STRING", "ENUM", "JSON_ARRAY", "TITLE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Flag$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Flag$Type[] $VALUES;
    public static final Flag$Type BOOLEAN;
    public static final Flag$Type ENUM;
    public static final Flag$Type INT;
    public static final Flag$Type JSON_ARRAY;
    public static final Flag$Type STRING;
    public static final Flag$Type TITLE;

    static {
        Flag$Type flag$Type = new Flag$Type("BOOLEAN", 0);
        BOOLEAN = flag$Type;
        Flag$Type flag$Type2 = new Flag$Type("INT", 1);
        INT = flag$Type2;
        Flag$Type flag$Type3 = new Flag$Type("STRING", 2);
        STRING = flag$Type3;
        Flag$Type flag$Type4 = new Flag$Type("ENUM", 3);
        ENUM = flag$Type4;
        Flag$Type flag$Type5 = new Flag$Type("JSON_ARRAY", 4);
        JSON_ARRAY = flag$Type5;
        Flag$Type flag$Type6 = new Flag$Type("TITLE", 5);
        TITLE = flag$Type6;
        Flag$Type[] flag$TypeArr = {flag$Type, flag$Type2, flag$Type3, flag$Type4, flag$Type5, flag$Type6};
        $VALUES = flag$TypeArr;
        $ENTRIES = kotlin.enums.a.a(flag$TypeArr);
    }

    public static Flag$Type valueOf(String str) {
        return (Flag$Type) Enum.valueOf(Flag$Type.class, str);
    }

    public static Flag$Type[] values() {
        return (Flag$Type[]) $VALUES.clone();
    }
}
