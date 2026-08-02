package com.yx360.design.compose.atoms;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DsCheckbox$Variant.values().length];
        try {
            iArr[DsCheckbox$Variant.Brand.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsCheckbox$Variant.User.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[UserState.values().length];
        try {
            iArr2[UserState.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[UserState.Pressed.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[UserState.Disabled.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[DsCheckbox$State.values().length];
        try {
            iArr3[DsCheckbox$State.Selected.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[DsCheckbox$State.Unselected.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[DsCheckbox$State.Indeterminate.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
