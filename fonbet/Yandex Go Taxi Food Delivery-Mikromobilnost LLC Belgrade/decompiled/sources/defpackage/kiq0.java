package defpackage;

import com.yandex.mapkit.navigation.JamType;
import com.yandex.mapkit.navigation.JamTypeColor;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class kiq0 extends a35 {
    @Override // defpackage.a35, defpackage.zyg
    public final void b(w4e0 w4e0Var, int i) {
        super.b(w4e0Var, i);
        int i2 = yrg0.map_route_with_alternative_jams_width;
        zuj0 zuj0Var = this.b;
        w4e0Var.p(((avj0) zuj0Var).e(i2));
        w4e0Var.z(((avj0) zuj0Var).e(yrg0.map_route_with_alternative_jams_outline_width));
    }

    @Override // defpackage.a35
    public final void e(HashSet hashSet) {
        super.e(hashSet);
        hashSet.removeIf(new v6o0(1, new tyo0(25)));
        hashSet.add(new JamTypeColor(JamType.UNKNOWN, ((avj0) this.b).a(qqg0.selected_route_route_jams_unknown)));
    }
}
