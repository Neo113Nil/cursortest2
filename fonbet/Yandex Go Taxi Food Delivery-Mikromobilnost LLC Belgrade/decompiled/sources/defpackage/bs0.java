package defpackage;

/* loaded from: classes5.dex */
public final class bs0 implements v7p {
    public final /* synthetic */ int a;
    public final hbn b;

    public /* synthetic */ bs0(hbn hbnVar, int i) {
        this.a = i;
        this.b = hbnVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        hbn hbnVar = this.b;
        switch (i) {
            case 0:
                return new ryh(12, (mum) hbnVar.get());
            default:
                return new g191((mum) hbnVar.get());
        }
    }
}
