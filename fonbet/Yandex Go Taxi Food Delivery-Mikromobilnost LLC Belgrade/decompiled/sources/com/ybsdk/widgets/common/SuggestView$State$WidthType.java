package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/common/SuggestView$State$WidthType", "", "Lcom/ybsdk/widgets/common/SuggestView$State$WidthType;", "<init>", "(Ljava/lang/String;I)V", "WRAP", "DOUBLE", "TRIPLE", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestView$State$WidthType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestView$State$WidthType[] $VALUES;
    public static final SuggestView$State$WidthType WRAP = new SuggestView$State$WidthType("WRAP", 0);
    public static final SuggestView$State$WidthType DOUBLE = new SuggestView$State$WidthType("DOUBLE", 1);
    public static final SuggestView$State$WidthType TRIPLE = new SuggestView$State$WidthType("TRIPLE", 2);

    private static final /* synthetic */ SuggestView$State$WidthType[] $values() {
        return new SuggestView$State$WidthType[]{WRAP, DOUBLE, TRIPLE};
    }

    static {
        SuggestView$State$WidthType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SuggestView$State$WidthType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SuggestView$State$WidthType valueOf(String str) {
        return (SuggestView$State$WidthType) Enum.valueOf(SuggestView$State$WidthType.class, str);
    }

    public static SuggestView$State$WidthType[] values() {
        return (SuggestView$State$WidthType[]) $VALUES.clone();
    }
}
