package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/FormattedText$VerticalAlignment", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/FormattedText$VerticalAlignment;", "BASELINE", "CENTER", "BOTTOM", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FormattedText$VerticalAlignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormattedText$VerticalAlignment[] $VALUES;
    public static final FormattedText$VerticalAlignment BASELINE;
    public static final FormattedText$VerticalAlignment BOTTOM;
    public static final FormattedText$VerticalAlignment CENTER;

    static {
        FormattedText$VerticalAlignment formattedText$VerticalAlignment = new FormattedText$VerticalAlignment("BASELINE", 0);
        BASELINE = formattedText$VerticalAlignment;
        FormattedText$VerticalAlignment formattedText$VerticalAlignment2 = new FormattedText$VerticalAlignment("CENTER", 1);
        CENTER = formattedText$VerticalAlignment2;
        FormattedText$VerticalAlignment formattedText$VerticalAlignment3 = new FormattedText$VerticalAlignment("BOTTOM", 2);
        BOTTOM = formattedText$VerticalAlignment3;
        FormattedText$VerticalAlignment[] formattedText$VerticalAlignmentArr = {formattedText$VerticalAlignment, formattedText$VerticalAlignment2, formattedText$VerticalAlignment3};
        $VALUES = formattedText$VerticalAlignmentArr;
        $ENTRIES = a.a(formattedText$VerticalAlignmentArr);
    }

    public static FormattedText$VerticalAlignment valueOf(String str) {
        return (FormattedText$VerticalAlignment) Enum.valueOf(FormattedText$VerticalAlignment.class, str);
    }

    public static FormattedText$VerticalAlignment[] values() {
        return (FormattedText$VerticalAlignment[]) $VALUES.clone();
    }
}
