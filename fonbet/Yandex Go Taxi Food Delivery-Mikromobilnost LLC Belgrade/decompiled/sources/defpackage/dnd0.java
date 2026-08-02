package defpackage;

/* loaded from: classes2.dex */
public final class dnd0 implements hs31 {
    public final /* synthetic */ int a;
    public final sls b;

    public /* synthetic */ dnd0(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                return new cnd0(slsVar.invoke());
            default:
                return (yr31) slsVar.invoke();
        }
    }
}
