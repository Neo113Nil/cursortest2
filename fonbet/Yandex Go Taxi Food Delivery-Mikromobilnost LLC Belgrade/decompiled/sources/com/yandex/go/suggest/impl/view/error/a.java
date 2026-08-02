package com.yandex.go.suggest.impl.view.error;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.suggest.impl.router.e;
import defpackage.bhv0;
import defpackage.c0g;
import defpackage.f8v0;
import defpackage.gfw0;
import defpackage.mfw0;
import defpackage.ogw0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.swp0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u7r;
import defpackage.unv0;
import defpackage.zy11;
import java.util.HashMap;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes8.dex */
public abstract class a {
    public final ogw0 a;
    public final gfw0 b;
    public final u7r c;
    public final mfw0 d;
    public final tse e;
    public final pwy0 f;
    public final String g;
    public final int h;
    public pzt0 i;

    public a(ogw0 ogw0Var, gfw0 gfw0Var, u7r u7rVar, mfw0 mfw0Var, tse tseVar, pwy0 pwy0Var, swp0 swp0Var, f8v0 f8v0Var) {
        this.a = ogw0Var;
        this.b = gfw0Var;
        this.c = u7rVar;
        this.d = mfw0Var;
        this.e = tseVar;
        this.f = pwy0Var;
        this.g = swp0Var.a();
        this.h = f8v0Var.d;
    }

    public static final ViewGroup a(a aVar, ViewGroup viewGroup) {
        u7r u7rVar = aVar.c;
        String str = aVar.g;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        u7rVar.a.a("FindInGoSearch.LoadingFailed", hashMap, 2, new HashMap());
        aVar.b.d = true;
        ViewGroup d = aVar.d(viewGroup);
        pzt0 pzt0Var = aVar.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.i = tje.N(aVar.e, null, null, new SuperappSuggestErrorController$subscribeToThemeUpdates$1(aVar, null), 3);
        aVar.i();
        aVar.j();
        aVar.b();
        if (aVar.d.a > aVar.h) {
            aVar.k();
            return d;
        }
        aVar.l();
        return d;
    }

    public abstract void b();

    public abstract void c(ThemeType themeType);

    public abstract ViewGroup d(ViewGroup viewGroup);

    public abstract void e();

    public abstract FrameLayout f();

    public final void g() {
        e eVar = this.a.c;
        ((c0g) eVar.I).D2().a(eVar.F.k(), "open_summary_from_suggest_router_as_fallback", true, unv0.a, new bhv0(0));
    }

    public final void h() {
        u7r u7rVar = this.c;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        String str = this.g;
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        u7rVar.a.a("FindInGoSearch.ErrorButton.Tapped", hashMap, 2, new HashMap());
        this.a.a.g(zy11.a);
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();
}
