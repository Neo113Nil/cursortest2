package com.yandex.passport.common.permission;

import android.content.Context;
import defpackage.qoi0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes8.dex */
public final class c {
    public static final b b;
    public final Context a;

    static {
        qoi0.b(new MutablePropertyReference1Impl("answeredRawPermissions", 0, "getAnsweredRawPermissions()Ljava/util/Set;", c.class));
        b = new b();
    }

    public c(Context context) {
        this.a = context;
        context.getSharedPreferences("PermissionManager.Prefs", 0);
    }
}
