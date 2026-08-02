package defpackage;

/* loaded from: classes4.dex */
public final class p1 extends x3 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(int i, Class cls) {
        super(0, cls);
        this.c = i;
    }

    @Override // defpackage.x3
    public b3 Fg(i3 i3Var) {
        switch (this.c) {
            case 1:
                return i3Var.C();
            case 4:
                return i3Var.E();
            case 12:
                throw new IllegalStateException("unexpected implicit constructed encoding");
            case 14:
                return i3Var.F();
            case 17:
                return i3Var;
            case 18:
                return i3Var.G();
            default:
                return super.Fg(i3Var);
        }
    }

    @Override // defpackage.x3
    public b3 Gg(dqf dqfVar) {
        switch (this.c) {
            case 0:
                return new kpf(dqfVar.a);
            case 1:
                return s1.u(dqfVar.a);
            case 2:
                return w1.u(dqfVar.a);
            case 3:
                return e2.u(dqfVar.a, false);
            case 4:
            case 17:
            case 18:
            default:
                return super.Gg(dqfVar);
            case 5:
                return new rpf(dqfVar.a);
            case 6:
                return new g2(dqfVar.a);
            case 7:
                return new vpf(dqfVar.a);
            case 8:
                return new xpf(dqfVar.a);
            case 9:
                return new l2(dqfVar.a);
            case 10:
                if (dqfVar.a.length == 0) {
                    return zpf.b;
                }
                ny61.r("malformed NULL encoding encountered");
                return null;
            case 11:
                return new bqf(dqfVar.a);
            case 12:
                return new q2(new vpf(dqfVar.a));
            case 13:
                return u2.x(dqfVar.a, false);
            case 14:
                return dqfVar;
            case 15:
                return new hqf(dqfVar.a);
            case 16:
                return new d3(dqfVar.a);
            case 19:
                return new nqf(dqfVar.a);
            case 20:
                return new v3(dqfVar.a);
            case 21:
                return new rqf(dqfVar.a);
            case 22:
                return new tqf(dqfVar.a);
            case 23:
                return new vqf(dqfVar.a);
            case 24:
                return new xqf(dqfVar.a);
        }
    }
}
