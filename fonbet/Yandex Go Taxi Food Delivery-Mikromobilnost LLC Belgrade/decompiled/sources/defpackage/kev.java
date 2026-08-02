package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public abstract class kev {
    public static final uh a = new uh(EmptyList.a);
    public static final uh b;
    public static final uh c;
    public static final uh d;

    static {
        cvw.a(4096);
        kkj kkjVar = new kkj(4096);
        cvw.a(4096);
        b = new uh(new xis0(kkjVar, new kkj(4096)));
        c = new uh(Boolean.FALSE);
        d = new uh(Boolean.TRUE);
    }

    public static final void a(aev aevVar, mw01... mw01VarArr) {
        List d0 = j73.d0(mw01VarArr);
        aevVar.b().b(a, vng.L(d0));
        aevVar.c().put("coil#transformations", a.X(d0, null, null, null, new gau(12, new Ref$IntRef()), 31));
    }
}
