package com.yandex.div.core.view2;

import com.yandex.div2.DivAccessibility;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DivAccessibility.Type.values().length];
        try {
            iArr[DivAccessibility.Type.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivAccessibility.Type.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivAccessibility.Type.BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivAccessibility.Type.IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivAccessibility.Type.TEXT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivAccessibility.Type.EDIT_TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DivAccessibility.Type.HEADER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DivAccessibility.Type.LIST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DivAccessibility.Type.SELECT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[DivAccessibility.Type.TAB_BAR.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[DivAccessibility.Type.RADIO.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[DivAccessibility.Type.CHECKBOX.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
        int[] iArr2 = new int[DivAccessibilityBinder$AccessibilityType.values().length];
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.EDIT_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.HEADER.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.IMAGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.PAGER.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.SLIDER.ordinal()] = 8;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.SELECT.ordinal()] = 9;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.TAB_WIDGET.ordinal()] = 10;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.TEXT.ordinal()] = 11;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.CHECK_BOX.ordinal()] = 12;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON.ordinal()] = 13;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.CONTAINER.ordinal()] = 14;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[DivAccessibilityBinder$AccessibilityType.SWITCH.ordinal()] = 15;
        } catch (NoSuchFieldError unused27) {
        }
        b = iArr2;
    }
}
