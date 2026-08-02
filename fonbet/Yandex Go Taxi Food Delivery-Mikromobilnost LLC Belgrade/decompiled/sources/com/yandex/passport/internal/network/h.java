package com.yandex.passport.internal.network;

import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.resources.DeviceDensity;
import com.yandex.passport.common.util.LocationType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.RC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Environment.TEAM_PRODUCTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Environment.TEAM_TESTING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DeviceDensity.values().length];
        try {
            iArr2[DeviceDensity.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeviceDensity.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeviceDensity.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DeviceDensity.EXTRA_HIGH.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DeviceDensity.EXTRA_EXTRA_HIGH.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[PassportUrlType.values().length];
        try {
            iArr3[PassportUrlType.BACKEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[PassportUrlType.WEBAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[PassportUrlType.FRONTEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[PassportUrlType.FRONTEND_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
        int[] iArr4 = new int[LocationType.values().length];
        try {
            iArr4[LocationType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[LocationType.FI.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[LocationType.KZ.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        d = iArr4;
    }
}
