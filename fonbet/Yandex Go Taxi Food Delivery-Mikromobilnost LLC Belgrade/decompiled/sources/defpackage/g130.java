package defpackage;

import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import com.yandex.go.places.impl.navigation.map.listener.a;

/* loaded from: classes13.dex */
public final class g130 {
    public final h130 a;
    public boolean b;
    public a c;
    public g18 d;

    public g130(h130 h130Var) {
        this.a = h130Var;
    }

    public final void a(zbc0 zbc0Var, w030 w030Var) {
        if (this.b) {
            return;
        }
        this.b = true;
        hoa hoaVar = this.a.a;
        a aVar = new a(zbc0Var, (tse) hoaVar.a.get(), (go80) hoaVar.b.get(), (tdc0) hoaVar.c.get(), (PlacesMapMode) hoaVar.d.a);
        this.c = aVar;
        this.d = w030Var.g(aVar);
    }

    public final void b() {
        this.b = false;
        a aVar = this.c;
        if (aVar != null) {
            aVar.b();
            aVar.y = false;
            if (aVar.x == PlacesMapMode.WITH_MAP) {
                tdc0 tdc0Var = aVar.w;
                if (tdc0Var.c) {
                    tdc0Var.a.detach();
                }
                tdc0Var.c = false;
            }
        }
        this.c = null;
        g18 g18Var = this.d;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.d = null;
    }
}
