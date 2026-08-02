package defpackage;

import android.content.Context;
import com.yandex.go.shortcuts.impl.analytic.a;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import com.yandex.go.superapp.tracking.data.e;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes14.dex */
public final class kqe {
    public final h3y a;
    public final i0s0 b;
    public final za90 c;
    public final jep0 d;
    public final h3y e;

    public kqe(h3y h3yVar, i0s0 i0s0Var, za90 za90Var, jep0 jep0Var, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = i0s0Var;
        this.c = za90Var;
        this.d = jep0Var;
        this.e = h3yVar2;
    }

    public final ShortcutsView a(Context context, pzr0 pzr0Var, a aVar, s1s0 s1s0Var, o1s0 o1s0Var, mep0 mep0Var, ShortcutViewSourceType shortcutViewSourceType) {
        com.yandex.go.shortcuts.impl.view.a aVar2 = new com.yandex.go.shortcuts.impl.view.a(context, this.c);
        p1s0 p1s0Var = new p1s0();
        jqe jqeVar = new jqe(mep0Var, shortcutViewSourceType);
        d3s0 d3s0Var = (d3s0) this.e.get();
        d3s0Var.getClass();
        oo2 oo2Var = new oo2(d3s0Var, pzr0Var, aVar, o1s0Var);
        c4s0 c4s0Var = (c4s0) this.a.get();
        new iqe();
        q4s0 q4s0Var = new q4s0(jqeVar, shortcutViewSourceType);
        e eVar = this.d.a;
        c4s0Var.getClass();
        i0s0 i0s0Var = this.b;
        i0s0Var.getClass();
        return new v9g(c4s0Var, oo2Var, aVar, i0s0Var, aVar2, p1s0Var, s1s0Var, q4s0Var, null).a();
    }
}
