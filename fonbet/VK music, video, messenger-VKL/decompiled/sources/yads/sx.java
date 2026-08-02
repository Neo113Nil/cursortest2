package yads;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class sx {
    public final br2 a;
    public final n9 b;
    public final wy c;

    public /* synthetic */ sx() {
        this(new br2(), new n9(), new wy());
    }

    public final gp2 a(v9 v9Var, d4 d4Var) {
        gp2 b = this.a.b(v9Var, d4Var);
        gp2 a = this.b.a(d4Var.e);
        wy wyVar = this.c;
        wyVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ttp0.g(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        yb2 yb2Var = wyVar.a;
        int i = d4Var.n;
        yb2Var.getClass();
        linkedHashMap.put(X3.i.n, i != 1 ? i != 2 ? StringUtils.UNDEFINED : X3.i.C : X3.i.D);
        gp2 a2 = hp2.a(b, a);
        c cVar = a2.b;
        return new gp2(pn00.n(a2.a, linkedHashMap), cVar != null ? cVar : null);
    }

    public sx(br2 br2Var, n9 n9Var, wy wyVar) {
        this.a = br2Var;
        this.b = n9Var;
        this.c = wyVar;
    }
}
