package com.caverock.androidsvg;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CSSParser$PseudoClassIdents.values().length];
        b = iArr;
        try {
            iArr[CSSParser$PseudoClassIdents.first_child.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[CSSParser$PseudoClassIdents.last_child.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[CSSParser$PseudoClassIdents.only_child.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[CSSParser$PseudoClassIdents.first_of_type.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[CSSParser$PseudoClassIdents.last_of_type.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[CSSParser$PseudoClassIdents.only_of_type.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[CSSParser$PseudoClassIdents.root.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[CSSParser$PseudoClassIdents.empty.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            b[CSSParser$PseudoClassIdents.nth_child.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            b[CSSParser$PseudoClassIdents.nth_last_child.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            b[CSSParser$PseudoClassIdents.nth_of_type.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            b[CSSParser$PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            b[CSSParser$PseudoClassIdents.not.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            b[CSSParser$PseudoClassIdents.target.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            b[CSSParser$PseudoClassIdents.lang.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            b[CSSParser$PseudoClassIdents.link.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            b[CSSParser$PseudoClassIdents.visited.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            b[CSSParser$PseudoClassIdents.hover.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            b[CSSParser$PseudoClassIdents.active.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            b[CSSParser$PseudoClassIdents.focus.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            b[CSSParser$PseudoClassIdents.enabled.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            b[CSSParser$PseudoClassIdents.disabled.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            b[CSSParser$PseudoClassIdents.checked.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            b[CSSParser$PseudoClassIdents.indeterminate.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr2 = new int[CSSParser$AttribOp.values().length];
        a = iArr2;
        try {
            iArr2[CSSParser$AttribOp.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            a[CSSParser$AttribOp.INCLUDES.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            a[CSSParser$AttribOp.DASHMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
    }
}
