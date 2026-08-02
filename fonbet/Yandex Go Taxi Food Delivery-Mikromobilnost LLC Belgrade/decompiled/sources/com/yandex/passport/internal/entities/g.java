package com.yandex.passport.internal.entities;

import com.yandex.passport.api.PassportParameterRule;
import com.yandex.passport.data.models.ParameterRule;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ParameterRule.Sign.values().length];
        try {
            iArr[ParameterRule.Sign.INCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParameterRule.Sign.EXCLUDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PassportParameterRule.Sign.values().length];
        try {
            iArr2[PassportParameterRule.Sign.INCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PassportParameterRule.Sign.EXCLUDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
