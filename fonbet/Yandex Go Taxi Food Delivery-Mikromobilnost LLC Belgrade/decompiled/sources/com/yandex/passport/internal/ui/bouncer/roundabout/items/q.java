package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.DisplayState;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DisplayState.values().length];
        try {
            iArr[DisplayState.Simple.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DisplayState.FirstInGroup.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DisplayState.MidInGroup.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DisplayState.LastInGroup.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[SocialProvider.values().length];
        try {
            iArr2[SocialProvider.FACEBOOK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SocialProvider.GOOGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SocialProvider.MAILRU.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SocialProvider.ODNOKLASSNIKI.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SocialProvider.TWITTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SocialProvider.VKONTAKTE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SocialProvider.ESIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SocialProvider.TV1001.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
