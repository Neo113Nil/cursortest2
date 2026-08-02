package defpackage;

import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class ofb {
    public final g a;
    public final h b;
    public final com.yandex.go.superapp.order.multi.old.provider.g c;
    public final kf4 d;
    public final l3w0 e;

    public ofb(g gVar, h hVar, com.yandex.go.superapp.order.multi.old.provider.g gVar2, kf4 kf4Var, l3w0 l3w0Var) {
        this.a = gVar;
        this.b = hVar;
        this.c = gVar2;
        this.d = kf4Var;
        this.e = l3w0Var;
    }

    public final boolean a() {
        if (!this.a.a.Kg() || !((cne0) this.b.b).f("launch_actual") || ((Boolean) this.d.b.getValue()).booleanValue() || this.e.a()) {
            return false;
        }
        return this.c.d();
    }
}
