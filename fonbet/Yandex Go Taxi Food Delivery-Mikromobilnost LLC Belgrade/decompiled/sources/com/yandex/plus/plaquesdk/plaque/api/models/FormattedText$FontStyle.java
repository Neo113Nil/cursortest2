package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/FormattedText$FontStyle", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/FormattedText$FontStyle;", "NORMAL", "ITALIC", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FormattedText$FontStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormattedText$FontStyle[] $VALUES;
    public static final FormattedText$FontStyle ITALIC;
    public static final FormattedText$FontStyle NORMAL;

    static {
        FormattedText$FontStyle formattedText$FontStyle = new FormattedText$FontStyle("NORMAL", 0);
        NORMAL = formattedText$FontStyle;
        FormattedText$FontStyle formattedText$FontStyle2 = new FormattedText$FontStyle("ITALIC", 1);
        ITALIC = formattedText$FontStyle2;
        FormattedText$FontStyle[] formattedText$FontStyleArr = {formattedText$FontStyle, formattedText$FontStyle2};
        $VALUES = formattedText$FontStyleArr;
        $ENTRIES = a.a(formattedText$FontStyleArr);
    }

    public static FormattedText$FontStyle valueOf(String str) {
        return (FormattedText$FontStyle) Enum.valueOf(FormattedText$FontStyle.class, str);
    }

    public static FormattedText$FontStyle[] values() {
        return (FormattedText$FontStyle[]) $VALUES.clone();
    }
}
