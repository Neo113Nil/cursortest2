package defpackage;

import android.content.Context;
import com.yandex.div.core.expression.variables.a;

/* loaded from: classes14.dex */
public final class baw0 implements s6o {
    public final a a;
    public final zuj0 b;
    public final o7h c;

    public baw0(je7 je7Var, a aVar, d0m d0mVar, zuj0 zuj0Var) {
        this.a = aVar;
        this.b = zuj0Var;
        this.c = new o7h((Context) je7Var.a.a.get(), d0mVar, cxh0.superapp_favorites_error);
    }

    public final void a(azl azlVar) {
        int i = kyh0.superapp_favorites_header_title;
        zuj0 zuj0Var = this.b;
        this.a.i(new z131("superapp_favorites.screen.title", ((avj0) zuj0Var).h(i)), new z131("superapp_favorites.error_screen.title", ((avj0) zuj0Var).h(kyh0.superapp_favorites_loading_error)), new z131("superapp_favorites.error_screen.subtitle", ((avj0) zuj0Var).h(kyh0.superapp_favorites_loading_error_subtitle)), new z131("superapp_favorites.error_screen.refresh", ((avj0) zuj0Var).h(kyh0.superapp_favorites_reload_button_title)));
    }

    public final ywl b() {
        ywl a = this.c.a();
        return a == null ? o7h.e : a;
    }
}
