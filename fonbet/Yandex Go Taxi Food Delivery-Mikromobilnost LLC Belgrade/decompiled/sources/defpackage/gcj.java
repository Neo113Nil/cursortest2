package defpackage;

/* loaded from: classes2.dex */
public final class gcj implements bt41 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gcj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bt41
    public final void d(srd0 srd0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fu90.b(((u7d0) obj).a, srd0Var.a.toString(), "3ds");
                break;
            default:
                ajo ajoVar = (ajo) obj;
                fu90.b(ajoVar.b, srd0Var.a.toString(), ajoVar.a);
                break;
        }
    }
}
