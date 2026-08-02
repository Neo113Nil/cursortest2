package com.yandex.passport.internal.ui.base;

import android.content.Context;
import android.content.Intent;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class l {
    public final com.yandex.passport.legacy.lx.j a;
    public final int b;

    public l(com.yandex.passport.legacy.lx.j jVar, int i) {
        this.a = jVar;
        this.b = i;
    }

    public final Intent a(Context context) {
        try {
            return (Intent) this.a.a(context);
        } catch (Exception e) {
            ny61.o(e);
            return null;
        }
    }
}
