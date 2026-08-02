package defpackage;

import com.yandex.go.places.map.ui.pinwar.b;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes13.dex */
public final class a3c0 extends r8 {
    public final a3v c;
    public final bt00 w;
    public final l56 x;
    public final uo21 y;
    public final b z;

    public a3c0(b bVar, a3v a3vVar, bt00 bt00Var, l56 l56Var, uo21 uo21Var, ah00 ah00Var) {
        super(5, ah00Var);
        this.c = a3vVar;
        this.w = bt00Var;
        this.x = l56Var;
        this.y = uo21Var;
        this.z = bVar;
    }

    public final void detach() {
        this.z.Cg();
        uo21 uo21Var = this.y;
        if (uo21Var != null) {
            uo21Var.detach();
        }
        ((e) this.w).b();
        this.x.showBlockedZones();
        this.c.a0(this);
    }
}
