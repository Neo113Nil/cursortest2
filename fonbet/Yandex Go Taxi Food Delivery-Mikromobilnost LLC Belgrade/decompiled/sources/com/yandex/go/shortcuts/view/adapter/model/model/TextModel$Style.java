package com.yandex.go.shortcuts.view.adapter.model.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/model/TextModel$Style", "", "Lcom/yandex/go/shortcuts/view/adapter/model/model/TextModel$Style;", "MEDIUM", "LIGHT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextModel$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextModel$Style[] $VALUES;
    public static final TextModel$Style LIGHT;
    public static final TextModel$Style MEDIUM;

    static {
        TextModel$Style textModel$Style = new TextModel$Style("MEDIUM", 0);
        MEDIUM = textModel$Style;
        TextModel$Style textModel$Style2 = new TextModel$Style("LIGHT", 1);
        LIGHT = textModel$Style2;
        TextModel$Style[] textModel$StyleArr = {textModel$Style, textModel$Style2};
        $VALUES = textModel$StyleArr;
        $ENTRIES = a.a(textModel$StyleArr);
    }

    public static TextModel$Style valueOf(String str) {
        return (TextModel$Style) Enum.valueOf(TextModel$Style.class, str);
    }

    public static TextModel$Style[] values() {
        return (TextModel$Style[]) $VALUES.clone();
    }
}
