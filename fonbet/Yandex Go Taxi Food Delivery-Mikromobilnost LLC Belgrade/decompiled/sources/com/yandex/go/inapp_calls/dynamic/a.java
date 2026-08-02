package com.yandex.go.inapp_calls.dynamic;

import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import defpackage.g8e;
import defpackage.jst;
import defpackage.jx81;

/* loaded from: classes11.dex */
public abstract class a {
    public static final Context a(Context context) {
        return !jx81.d() ? new FixedContextWrapper(context) : context;
    }

    public static final String[] b(Context context) {
        ClassLoader classLoader = context.getApplicationContext().getClassLoader();
        BaseDexClassLoader baseDexClassLoader = classLoader instanceof BaseDexClassLoader ? (BaseDexClassLoader) classLoader : null;
        if (baseDexClassLoader == null) {
            g8e.A(jst.e, "Try to fetch flutter app lib location without correct class loader");
            return null;
        }
        String findLibrary = baseDexClassLoader.findLibrary("app");
        if (findLibrary != null && findLibrary.length() != 0) {
            return new String[]{"--aot-shared-library-name=".concat(findLibrary)};
        }
        g8e.A(jst.e, "Fail to fetch flutter app lib location");
        return null;
    }
}
