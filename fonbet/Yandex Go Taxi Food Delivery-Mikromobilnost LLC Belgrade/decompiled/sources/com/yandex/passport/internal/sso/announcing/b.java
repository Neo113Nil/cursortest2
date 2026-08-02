package com.yandex.passport.internal.sso.announcing;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SsoAnnouncer$Source.values().length];
        try {
            iArr[SsoAnnouncer$Source.BOOTSTRAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SsoAnnouncer$Source.BACKUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
