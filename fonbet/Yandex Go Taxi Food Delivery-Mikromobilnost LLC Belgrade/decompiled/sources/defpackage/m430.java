package defpackage;

/* loaded from: classes13.dex */
public final class m430 implements v7p {
    public final /* synthetic */ int a;
    public final tbg b;

    public /* synthetic */ m430(tbg tbgVar, int i) {
        this.a = i;
        this.b = tbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tbg tbgVar = this.b;
        switch (i) {
            case 0:
                return new a22((zuj0) tbgVar.get());
            default:
                return new i47((zuj0) tbgVar.get(), 7);
        }
    }
}
