package com.yandex.go.overdraft.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/overdraft/data/model/ButtonActionType;", "", "OPEN_DEBT_INFO", "SWITCH_PAYMENT_METHOD_AND_OPEN_SUMMARY", "TOP_UP_YANDEX_CARD", "TOP_UP_YANGO_PAY", "OPEN_PAYMENT_METHODS_TO_PAY_DEBT", "OPEN_PAYMENT_METHODS", "PLUS_TOGGLE", "CLOSE", "OPEN_HISTORY", "PAY_DEBT", "OPEN_SBP", "OPEN_URL", "CONTINUE_CREATE_ORDER", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonActionType[] $VALUES;
    public static final ButtonActionType CLOSE;
    public static final ButtonActionType CONTINUE_CREATE_ORDER;
    public static final ButtonActionType OPEN_DEBT_INFO;
    public static final ButtonActionType OPEN_HISTORY;
    public static final ButtonActionType OPEN_PAYMENT_METHODS;
    public static final ButtonActionType OPEN_PAYMENT_METHODS_TO_PAY_DEBT;
    public static final ButtonActionType OPEN_SBP;
    public static final ButtonActionType OPEN_URL;
    public static final ButtonActionType PAY_DEBT;
    public static final ButtonActionType PLUS_TOGGLE;
    public static final ButtonActionType SWITCH_PAYMENT_METHOD_AND_OPEN_SUMMARY;
    public static final ButtonActionType TOP_UP_YANDEX_CARD;
    public static final ButtonActionType TOP_UP_YANGO_PAY;
    public static final ButtonActionType UNKNOWN;

    static {
        ButtonActionType buttonActionType = new ButtonActionType("OPEN_DEBT_INFO", 0);
        OPEN_DEBT_INFO = buttonActionType;
        ButtonActionType buttonActionType2 = new ButtonActionType("SWITCH_PAYMENT_METHOD_AND_OPEN_SUMMARY", 1);
        SWITCH_PAYMENT_METHOD_AND_OPEN_SUMMARY = buttonActionType2;
        ButtonActionType buttonActionType3 = new ButtonActionType("TOP_UP_YANDEX_CARD", 2);
        TOP_UP_YANDEX_CARD = buttonActionType3;
        ButtonActionType buttonActionType4 = new ButtonActionType("TOP_UP_YANGO_PAY", 3);
        TOP_UP_YANGO_PAY = buttonActionType4;
        ButtonActionType buttonActionType5 = new ButtonActionType("OPEN_PAYMENT_METHODS_TO_PAY_DEBT", 4);
        OPEN_PAYMENT_METHODS_TO_PAY_DEBT = buttonActionType5;
        ButtonActionType buttonActionType6 = new ButtonActionType("OPEN_PAYMENT_METHODS", 5);
        OPEN_PAYMENT_METHODS = buttonActionType6;
        ButtonActionType buttonActionType7 = new ButtonActionType("PLUS_TOGGLE", 6);
        PLUS_TOGGLE = buttonActionType7;
        ButtonActionType buttonActionType8 = new ButtonActionType("CLOSE", 7);
        CLOSE = buttonActionType8;
        ButtonActionType buttonActionType9 = new ButtonActionType("OPEN_HISTORY", 8);
        OPEN_HISTORY = buttonActionType9;
        ButtonActionType buttonActionType10 = new ButtonActionType("PAY_DEBT", 9);
        PAY_DEBT = buttonActionType10;
        ButtonActionType buttonActionType11 = new ButtonActionType("OPEN_SBP", 10);
        OPEN_SBP = buttonActionType11;
        ButtonActionType buttonActionType12 = new ButtonActionType("OPEN_URL", 11);
        OPEN_URL = buttonActionType12;
        ButtonActionType buttonActionType13 = new ButtonActionType("CONTINUE_CREATE_ORDER", 12);
        CONTINUE_CREATE_ORDER = buttonActionType13;
        ButtonActionType buttonActionType14 = new ButtonActionType("UNKNOWN", 13);
        UNKNOWN = buttonActionType14;
        ButtonActionType[] buttonActionTypeArr = {buttonActionType, buttonActionType2, buttonActionType3, buttonActionType4, buttonActionType5, buttonActionType6, buttonActionType7, buttonActionType8, buttonActionType9, buttonActionType10, buttonActionType11, buttonActionType12, buttonActionType13, buttonActionType14};
        $VALUES = buttonActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(buttonActionTypeArr);
    }

    public static ButtonActionType valueOf(String str) {
        return (ButtonActionType) Enum.valueOf(ButtonActionType.class, str);
    }

    public static ButtonActionType[] values() {
        return (ButtonActionType[]) $VALUES.clone();
    }
}
