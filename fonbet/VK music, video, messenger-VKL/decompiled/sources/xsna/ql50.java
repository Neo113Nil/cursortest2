package xsna;

import xsna.pl50;
import xsna.pm50;

/* compiled from: MviLoggerStoreFactory.kt */
/* loaded from: classes3.dex */
public final class ql50 implements pm50 {
    public final String a;
    public final pl50 b;
    public final pm50 c;

    public ql50(String str, pl50 pl50Var) {
        this.a = str;
        this.b = pl50Var;
        this.c = pm50.a.a;
    }

    @Override // xsna.pm50
    public final mm50 a(an50 an50Var) {
        return this.c.a(new an50(an50Var.a, an50Var.b, an50Var.c, an50Var.d, new tti(new dsg(4, an50Var, this))));
    }

    public /* synthetic */ ql50(aqw aqwVar, int i) {
        this("MviLogger", (i & 2) != 0 ? pl50.a.b : aqwVar);
    }
}
