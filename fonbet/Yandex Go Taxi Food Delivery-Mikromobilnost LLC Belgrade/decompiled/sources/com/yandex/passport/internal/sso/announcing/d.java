package com.yandex.passport.internal.sso.announcing;

import com.yandex.passport.internal.sso.AccountAction$LastAction;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AccountAction$LastAction.values().length];
        try {
            iArr[AccountAction$LastAction.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountAction$LastAction.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
