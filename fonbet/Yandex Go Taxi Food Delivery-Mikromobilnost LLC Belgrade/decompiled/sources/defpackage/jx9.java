package defpackage;

import android.content.Context;
import com.yandex.go.chargers.discovery.shortcuts.c;
import com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView;
import com.yandex.go.chargers.orchestrator_user_events.domain.b;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes12.dex */
public final class jx9 implements swj {
    public final Context a;
    public final ah00 b;
    public final a3v c;
    public final xx9 d;
    public final cx9 e;
    public final c06 f;
    public final rw9 g;
    public final c h;
    public final b i;
    public s2a j;
    public c29 k;

    public jx9(Context context, ah00 ah00Var, a3v a3vVar, xx9 xx9Var, cx9 cx9Var, c06 c06Var, rw9 rw9Var, c cVar, b bVar) {
        this.a = context;
        this.b = ah00Var;
        this.c = a3vVar;
        this.d = xx9Var;
        this.e = cx9Var;
        this.f = c06Var;
        this.g = rw9Var;
        this.h = cVar;
        this.i = bVar;
    }

    @Override // defpackage.swj
    public final ModalView a(apf apfVar) {
        qw9 qw9Var = new qw9((em9) this.g.a.a.get(), this.j);
        c29 c29Var = this.k;
        if (c29Var == null) {
            ny61.g("Required put ChargersDiscoveryNavigator");
            return null;
        }
        v920 v920Var = this.e.a;
        bx9 bx9Var = new bx9((com.yandex.go.navigation.screen.c) ((xvf0) v920Var.a).get(), (en9) ((xvf0) v920Var.b).get(), (n) ((pxf) v920Var.c).get(), (cyx) ((xvf0) v920Var.w).get(), (o6a) ((pxf) v920Var.x).get(), (com.yandex.go.chargers.discovery.domain.c) ((dx9) v920Var.y).get(), c29Var, qw9Var);
        ShortcutsView a = this.h.a(bx9Var);
        a aVar = (a) i5m.a((rs0) apfVar.c).get();
        ru.yandex.taxi.layers.presentation.optimalview.c cVar = (ru.yandex.taxi.layers.presentation.optimalview.c) i5m.a((n3w) apfVar.w).get();
        Object obj = i5m.a((azf) apfVar.x).get();
        wwj wwjVar = (wwj) obj;
        io9 io9Var = new io9(bx9Var);
        c06 c06Var = this.f;
        md6 md6Var = ((sn9) c06Var.a).a;
        rn9 rn9Var = new rn9((em9) ((xvf0) md6Var.b).get(), (jn9) ((t4) md6Var.c).get(), io9Var);
        ((on9) c06Var.b).a.getClass();
        return new ChargersDiscoveryModalView(this.a, this.b, a, this.c, aVar, cVar, bx9Var, wwjVar, new com.yandex.go.chargers.attention.presentation.b(rn9Var), this.d, qw9Var, this.i);
    }
}
