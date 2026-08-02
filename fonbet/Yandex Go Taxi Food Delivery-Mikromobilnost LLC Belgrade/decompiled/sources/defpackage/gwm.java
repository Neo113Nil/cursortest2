package defpackage;

/* loaded from: classes5.dex */
public final class gwm implements v7p {
    public final /* synthetic */ int a;
    public final izf b;

    public /* synthetic */ gwm(izf izfVar, int i) {
        this.a = i;
        this.b = izfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        izf izfVar = this.b;
        switch (i) {
            case 0:
                return new fwm((wiq0) izfVar.get());
            default:
                return new vwm((wiq0) izfVar.get());
        }
    }
}
