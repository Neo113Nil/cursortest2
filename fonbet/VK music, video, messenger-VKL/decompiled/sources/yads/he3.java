package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class he3 extends z83 {
    public final iz2 C;
    public final ez2 D;
    public final md3 E;

    public he3(Context context, d4 d4Var, bu1 bu1Var, String str, un3 un3Var, ye3 ye3Var, qq3 qq3Var, iz2 iz2Var, ez2 ez2Var, md3 md3Var) {
        super(context, d4Var, 0, str, un3Var, ye3Var, qq3Var, null, bu1Var, 1664);
        this.C = iz2Var;
        this.D = ez2Var;
        this.E = md3Var;
    }

    @Override // yads.z83
    public final wq2 a(g92 g92Var, int i) {
        Map map = g92Var.c;
        if (map == null) {
            map = jgp.b;
        }
        this.D.a(map);
        id3 a = this.E.a(g92Var);
        if (a == null) {
            return new wq2(new mc2("Can't parse VAST response."));
        }
        List list = a.a.b;
        return list.isEmpty() ? new wq2(new am0()) : new wq2(list, null);
    }

    @Override // yads.z83, yads.qp2
    public final Map d() {
        MapBuilder mapBuilder = new MapBuilder();
        String a = ((jz2) this.C).a();
        if (a != null) {
        }
        mapBuilder.putAll(super.d());
        return mapBuilder.h();
    }
}
