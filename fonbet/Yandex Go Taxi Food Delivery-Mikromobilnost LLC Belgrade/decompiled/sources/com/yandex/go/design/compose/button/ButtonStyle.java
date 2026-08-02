package com.yandex.go.design.compose.button;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/design/compose/button/ButtonStyle;", "", "Main", "Minor", "Ghost", "Outline", "Floating", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    public static final ButtonStyle Floating;
    public static final ButtonStyle Ghost;
    public static final ButtonStyle Main;
    public static final ButtonStyle Minor;
    public static final ButtonStyle Outline;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("Main", 0);
        Main = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("Minor", 1);
        Minor = buttonStyle2;
        ButtonStyle buttonStyle3 = new ButtonStyle("Ghost", 2);
        Ghost = buttonStyle3;
        ButtonStyle buttonStyle4 = new ButtonStyle("Outline", 3);
        Outline = buttonStyle4;
        ButtonStyle buttonStyle5 = new ButtonStyle("Floating", 4);
        Floating = buttonStyle5;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3, buttonStyle4, buttonStyle5};
        $VALUES = buttonStyleArr;
        $ENTRIES = a.a(buttonStyleArr);
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }
}
