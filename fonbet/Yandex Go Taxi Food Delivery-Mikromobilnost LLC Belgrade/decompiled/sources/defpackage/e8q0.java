package defpackage;

/* loaded from: classes5.dex */
public final class e8q0 implements v7p {
    public final /* synthetic */ int a;
    public final exf b;
    public final k0n c;
    public final p4 d;

    public e8q0(k0n k0nVar, exf exfVar, p4 p4Var) {
        this.a = 2;
        this.c = k0nVar;
        this.b = exfVar;
        this.d = p4Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        p4 p4Var = this.d;
        exf exfVar = this.b;
        k0n k0nVar = this.c;
        switch (i) {
            case 0:
                return new d8q0((htg) exfVar.get(), (u1n) k0nVar.get(), i5m.a(p4Var));
            case 1:
                return new d8q0((htg) exfVar.get(), (u1n) k0nVar.get(), i5m.a(p4Var));
            default:
                return new d8q0((u1n) k0nVar.get(), (htg) exfVar.get(), i5m.a(p4Var));
        }
    }

    public /* synthetic */ e8q0(exf exfVar, k0n k0nVar, p4 p4Var, int i) {
        this.a = i;
        this.b = exfVar;
        this.c = k0nVar;
        this.d = p4Var;
    }
}
