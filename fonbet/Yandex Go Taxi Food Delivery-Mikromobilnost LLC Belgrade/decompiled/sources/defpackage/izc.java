package defpackage;

import com.yandex.go.navigator.complete_route.CancelMode;
import com.yandex.go.navigator.domain.t;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class izc extends ad5 {
    public final ya50 A;
    public final gyc x;
    public final CancelMode y;
    public final t z;

    public izc(gyc gycVar, CancelMode cancelMode, t tVar, ya50 ya50Var) {
        super(gzc.class);
        this.x = gycVar;
        this.y = cancelMode;
        this.z = tVar;
        this.A = ya50Var;
    }

    public final void Kg() {
        i650 i650Var = this.A.a;
        i650Var.a.a("navigation.exit_route_button.back_to_route", n.u(i650Var), 1, new HashMap());
        ((ej1) this.x.a).r(new qu(9));
    }
}
