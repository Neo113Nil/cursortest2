package com.yandex.go.design.compose.button;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/design/compose/button/ButtonForm;", "", "Squircle", "Circle", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonForm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonForm[] $VALUES;
    public static final ButtonForm Circle;
    public static final ButtonForm Squircle;

    static {
        ButtonForm buttonForm = new ButtonForm("Squircle", 0);
        Squircle = buttonForm;
        ButtonForm buttonForm2 = new ButtonForm("Circle", 1);
        Circle = buttonForm2;
        ButtonForm[] buttonFormArr = {buttonForm, buttonForm2};
        $VALUES = buttonFormArr;
        $ENTRIES = a.a(buttonFormArr);
    }

    public static ButtonForm valueOf(String str) {
        return (ButtonForm) Enum.valueOf(ButtonForm.class, str);
    }

    public static ButtonForm[] values() {
        return (ButtonForm[]) $VALUES.clone();
    }
}
