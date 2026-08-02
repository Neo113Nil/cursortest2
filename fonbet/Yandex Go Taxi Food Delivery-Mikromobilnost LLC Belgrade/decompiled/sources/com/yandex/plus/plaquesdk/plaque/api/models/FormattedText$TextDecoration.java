package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/FormattedText$TextDecoration", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/FormattedText$TextDecoration;", "UNDERLINE", "LINE_THROUGH", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormattedText$TextDecoration {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormattedText$TextDecoration[] $VALUES;
    public static final FormattedText$TextDecoration LINE_THROUGH;
    public static final FormattedText$TextDecoration UNDERLINE;

    static {
        FormattedText$TextDecoration formattedText$TextDecoration = new FormattedText$TextDecoration("UNDERLINE", 0);
        UNDERLINE = formattedText$TextDecoration;
        FormattedText$TextDecoration formattedText$TextDecoration2 = new FormattedText$TextDecoration("LINE_THROUGH", 1);
        LINE_THROUGH = formattedText$TextDecoration2;
        FormattedText$TextDecoration[] formattedText$TextDecorationArr = {formattedText$TextDecoration, formattedText$TextDecoration2};
        $VALUES = formattedText$TextDecorationArr;
        $ENTRIES = a.a(formattedText$TextDecorationArr);
    }

    public static FormattedText$TextDecoration valueOf(String str) {
        return (FormattedText$TextDecoration) Enum.valueOf(FormattedText$TextDecoration.class, str);
    }

    public static FormattedText$TextDecoration[] values() {
        return (FormattedText$TextDecoration[]) $VALUES.clone();
    }
}
