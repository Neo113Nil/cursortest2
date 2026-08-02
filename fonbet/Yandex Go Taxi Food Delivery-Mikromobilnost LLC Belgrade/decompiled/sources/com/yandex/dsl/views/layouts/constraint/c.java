package com.yandex.dsl.views.layouts.constraint;

import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConstraintSetBuilder.Side.values().length];
        try {
            iArr[ConstraintSetBuilder.Side.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConstraintSetBuilder.Side.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConstraintSetBuilder.Side.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConstraintSetBuilder.Side.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ConstraintSetBuilder.Side.BASELINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ConstraintSetBuilder.Side.START.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ConstraintSetBuilder.Side.END.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
