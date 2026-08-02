package defpackage;

/* loaded from: classes13.dex */
public abstract class dm80 implements vdc0 {
    public final svj a;
    public final lg80 b;

    public dm80(svj svjVar, lg80 lg80Var) {
        this.a = svjVar;
        this.b = lg80Var;
    }

    @Override // defpackage.vdc0
    public final lg80 getMode() {
        return this.b;
    }

    @Override // defpackage.vdc0
    public final svj getSource() {
        return this.a;
    }
}
