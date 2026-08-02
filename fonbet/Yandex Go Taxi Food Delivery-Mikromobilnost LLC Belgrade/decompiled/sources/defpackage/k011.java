package defpackage;

/* loaded from: classes12.dex */
public final class k011 implements j011 {
    public final me1 a;
    public final g011 b;

    public k011(me1 me1Var, g011 g011Var) {
        this.a = me1Var;
        this.b = g011Var;
    }

    @Override // defpackage.j011
    public final void a(String str) {
        this.a.b.edit().putString("last_used_card_id", str).apply();
    }

    @Override // defpackage.j011
    public final void reload() {
        this.b.a.g(zy11.a);
    }
}
