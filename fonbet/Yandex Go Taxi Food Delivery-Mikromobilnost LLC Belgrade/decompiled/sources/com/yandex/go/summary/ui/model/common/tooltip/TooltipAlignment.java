package com.yandex.go.summary.ui.model.common.tooltip;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/summary/ui/model/common/tooltip/TooltipAlignment;", "", "START", "END", "CENTER", "compose"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TooltipAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TooltipAlignment[] $VALUES;
    public static final TooltipAlignment CENTER;
    public static final TooltipAlignment END;
    public static final TooltipAlignment START;

    static {
        TooltipAlignment tooltipAlignment = new TooltipAlignment("START", 0);
        START = tooltipAlignment;
        TooltipAlignment tooltipAlignment2 = new TooltipAlignment("END", 1);
        END = tooltipAlignment2;
        TooltipAlignment tooltipAlignment3 = new TooltipAlignment("CENTER", 2);
        CENTER = tooltipAlignment3;
        TooltipAlignment[] tooltipAlignmentArr = {tooltipAlignment, tooltipAlignment2, tooltipAlignment3};
        $VALUES = tooltipAlignmentArr;
        $ENTRIES = a.a(tooltipAlignmentArr);
    }

    public static TooltipAlignment valueOf(String str) {
        return (TooltipAlignment) Enum.valueOf(TooltipAlignment.class, str);
    }

    public static TooltipAlignment[] values() {
        return (TooltipAlignment[]) $VALUES.clone();
    }
}
