package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/widgets/common/WidgetView$State$Type", "", "Lcom/ybsdk/widgets/common/WidgetView$State$Type;", "<init>", "(Ljava/lang/String;I)V", "LIMIT", "INFO", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WidgetView$State$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WidgetView$State$Type[] $VALUES;
    public static final WidgetView$State$Type LIMIT = new WidgetView$State$Type("LIMIT", 0);
    public static final WidgetView$State$Type INFO = new WidgetView$State$Type("INFO", 1);

    private static final /* synthetic */ WidgetView$State$Type[] $values() {
        return new WidgetView$State$Type[]{LIMIT, INFO};
    }

    static {
        WidgetView$State$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WidgetView$State$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WidgetView$State$Type valueOf(String str) {
        return (WidgetView$State$Type) Enum.valueOf(WidgetView$State$Type.class, str);
    }

    public static WidgetView$State$Type[] values() {
        return (WidgetView$State$Type[]) $VALUES.clone();
    }
}
