package defpackage;

/* loaded from: classes15.dex */
public final class c18 implements x08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c18(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x08
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((sls) obj).invoke();
                break;
            case 1:
                ((uw10) obj).b.remove(this);
                break;
            default:
                ((pzt0) obj).a(null);
                break;
        }
    }
}
