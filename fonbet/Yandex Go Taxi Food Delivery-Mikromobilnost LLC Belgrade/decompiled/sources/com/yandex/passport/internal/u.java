package com.yandex.passport.internal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import defpackage.hs31;
import defpackage.ls31;
import defpackage.ny61;
import defpackage.yr31;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class u implements hs31 {
    public final Class a;
    public final Callable b;

    public u(Class cls, Callable callable) {
        this.a = cls;
        this.b = callable;
    }

    public static com.yandex.passport.internal.ui.base.h a(AppCompatActivity appCompatActivity, Class cls, Callable callable) {
        return (com.yandex.passport.internal.ui.base.h) new ls31(appCompatActivity.getViewModelStore(), new u(cls, callable), 0).b(cls);
    }

    public static com.yandex.passport.internal.ui.base.h b(Fragment fragment, Callable callable) {
        try {
            com.yandex.passport.internal.ui.base.h hVar = (com.yandex.passport.internal.ui.base.h) callable.call();
            Class<?> cls = hVar.getClass();
            return (com.yandex.passport.internal.ui.base.h) new ls31(fragment.getViewModelStore(), new u(cls, new t(0, hVar)), 0).b(cls);
        } catch (Exception e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (cls != this.a) {
            ny61.r("Unknown ViewModel class");
            return null;
        }
        try {
            return (yr31) this.b.call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            ny61.j(e2);
            return null;
        }
    }
}
