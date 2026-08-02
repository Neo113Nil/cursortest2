package defpackage;

/* loaded from: classes3.dex */
public final class pi8 implements v7p {
    public final /* synthetic */ int a;
    public final owf b;

    public /* synthetic */ pi8(owf owfVar, int i) {
        this.a = i;
        this.b = owfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        owf owfVar = this.b;
        switch (i) {
            case 0:
                return new oi8((w530) owfVar.get());
            default:
                return new ri8((w530) owfVar.get());
        }
    }
}
