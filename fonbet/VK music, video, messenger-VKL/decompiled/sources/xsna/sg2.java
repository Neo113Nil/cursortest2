package xsna;

/* compiled from: AnimatedBoundaryDrawState.kt */
/* loaded from: classes16.dex */
public final class sg2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sg2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((vg2) this.c).c = ((Number) obj).intValue();
                break;
            default:
                ((kdw0) this.c).b((mdw0) obj);
                break;
        }
        return s3q0.a;
    }
}
