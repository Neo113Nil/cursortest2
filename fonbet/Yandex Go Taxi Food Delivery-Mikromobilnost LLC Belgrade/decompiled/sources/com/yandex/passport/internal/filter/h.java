package com.yandex.passport.internal.filter;

import com.yandex.passport.data.models.ParameterRule;
import com.yandex.passport.data.models.VersionRule$Sign;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VersionRule$Sign.values().length];
        try {
            iArr[VersionRule$Sign.GREATER_OR_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VersionRule$Sign.EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ParameterRule.Sign.values().length];
        try {
            iArr2[ParameterRule.Sign.INCLUDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ParameterRule.Sign.EXCLUDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
