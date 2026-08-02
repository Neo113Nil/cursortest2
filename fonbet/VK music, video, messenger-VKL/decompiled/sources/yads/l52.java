package yads;

import xsna.jgp;

/* loaded from: classes10.dex */
public final class l52 implements pb2 {
    public final za a;
    public final s63 b;
    public final lv c;

    public l52(za zaVar, s63 s63Var, lv lvVar) {
        this.a = zaVar;
        this.b = s63Var;
        this.c = lvVar;
    }

    @Override // yads.pb2
    public final void a(String str) {
        za zaVar = this.a;
        s63 s63Var = this.b;
        lv lvVar = this.c;
        zaVar.getClass();
        bi2 bi2Var = new bi2(lvVar, s63Var, new be0());
        if (str.length() > 0) {
            za.d.execute(new ya(str, bi2Var, jgp.b));
        }
    }
}
