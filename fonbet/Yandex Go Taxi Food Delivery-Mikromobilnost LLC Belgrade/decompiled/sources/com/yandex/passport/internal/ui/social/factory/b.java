package com.yandex.passport.internal.ui.social.factory;

import com.yandex.passport.internal.SocialConfiguration;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SocialConfiguration.Type.values().length];
        try {
            iArr[SocialConfiguration.Type.SOCIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SocialConfiguration.Type.MAIL_OAUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SocialConfiguration.Type.MAIL_PASSWORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
