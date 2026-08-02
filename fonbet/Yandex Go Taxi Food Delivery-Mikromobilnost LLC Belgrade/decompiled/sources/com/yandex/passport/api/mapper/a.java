package com.yandex.passport.api.mapper;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.ui.AppTheme;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PassportTheme.values().length];
        try {
            iArr[PassportTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportTheme.FOLLOW_SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportTheme.LIGHT_CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[AppTheme.values().length];
        try {
            iArr2[AppTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AppTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AppTheme.FOLLOW_SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
