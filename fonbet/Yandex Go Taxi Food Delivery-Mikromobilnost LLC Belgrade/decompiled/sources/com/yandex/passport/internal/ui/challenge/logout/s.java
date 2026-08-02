package com.yandex.passport.internal.ui.challenge.logout;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogoutBehaviour.values().length];
        try {
            iArr[LogoutBehaviour.DROP_CLIENT_TOKEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogoutBehaviour.DROP_X_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
