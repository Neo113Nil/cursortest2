package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dm4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((em4) this.c).f.dispose();
                break;
            case 1:
                ((kca) this.c).d.clear();
                break;
            default:
                d3j d3jVar = (d3j) this.c;
                ((p870) d3jVar.F.getValue()).e(128, d3jVar.q6());
                break;
        }
    }
}
