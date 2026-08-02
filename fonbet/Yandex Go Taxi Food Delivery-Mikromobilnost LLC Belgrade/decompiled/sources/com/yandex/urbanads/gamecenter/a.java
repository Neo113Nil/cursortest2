package com.yandex.urbanads.gamecenter;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GameCenterMessageType.values().length];
        try {
            iArr[GameCenterMessageType.DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GameCenterMessageType.HAPTIC_FEEDBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GameCenterMessageType.COINS_REFRESH_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GameCenterMessageType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
