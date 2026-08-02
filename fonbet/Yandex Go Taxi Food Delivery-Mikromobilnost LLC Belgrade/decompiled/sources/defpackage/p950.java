package defpackage;

import android.os.Looper;
import com.yandex.go.navigation.base.internal.NavigationRouterException;

/* loaded from: classes8.dex */
public abstract class p950 {
    public static final wby a;

    static {
        vby vbyVar = xby.d;
        vbyVar.getClass();
        a = new wby(vbyVar, new p0u(14));
    }

    public static final void a() {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        xby.t(a, "NavigationRouter:notMainThread", new NavigationRouterException("Access to navigation router not from main thread is forbidden"), null, 10);
    }
}
