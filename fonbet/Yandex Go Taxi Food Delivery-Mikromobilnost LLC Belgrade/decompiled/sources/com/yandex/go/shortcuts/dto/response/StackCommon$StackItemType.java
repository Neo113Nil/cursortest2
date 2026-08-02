package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ryt0;
import defpackage.s7s0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/shortcuts/dto/response/StackCommon$StackItemType", "", "Lcom/yandex/go/shortcuts/dto/response/StackCommon$StackItemType;", "Companion", "ryt0", "UNKNOWN", "THUMB", "INFO", "BUTTON", "RATING", "PRICE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StackCommon$StackItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StackCommon$StackItemType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final StackCommon$StackItemType BUTTON;
    public static final ryt0 Companion;
    public static final StackCommon$StackItemType INFO;
    public static final StackCommon$StackItemType PRICE;
    public static final StackCommon$StackItemType RATING;
    public static final StackCommon$StackItemType THUMB;
    public static final StackCommon$StackItemType UNKNOWN;

    static {
        StackCommon$StackItemType stackCommon$StackItemType = new StackCommon$StackItemType("UNKNOWN", 0);
        UNKNOWN = stackCommon$StackItemType;
        StackCommon$StackItemType stackCommon$StackItemType2 = new StackCommon$StackItemType("THUMB", 1);
        THUMB = stackCommon$StackItemType2;
        StackCommon$StackItemType stackCommon$StackItemType3 = new StackCommon$StackItemType("INFO", 2);
        INFO = stackCommon$StackItemType3;
        StackCommon$StackItemType stackCommon$StackItemType4 = new StackCommon$StackItemType("BUTTON", 3);
        BUTTON = stackCommon$StackItemType4;
        StackCommon$StackItemType stackCommon$StackItemType5 = new StackCommon$StackItemType("RATING", 4);
        RATING = stackCommon$StackItemType5;
        StackCommon$StackItemType stackCommon$StackItemType6 = new StackCommon$StackItemType("PRICE", 5);
        PRICE = stackCommon$StackItemType6;
        StackCommon$StackItemType[] stackCommon$StackItemTypeArr = {stackCommon$StackItemType, stackCommon$StackItemType2, stackCommon$StackItemType3, stackCommon$StackItemType4, stackCommon$StackItemType5, stackCommon$StackItemType6};
        $VALUES = stackCommon$StackItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(stackCommon$StackItemTypeArr);
        Companion = new ryt0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(25));
    }

    public static StackCommon$StackItemType valueOf(String str) {
        return (StackCommon$StackItemType) Enum.valueOf(StackCommon$StackItemType.class, str);
    }

    public static StackCommon$StackItemType[] values() {
        return (StackCommon$StackItemType[]) $VALUES.clone();
    }
}
