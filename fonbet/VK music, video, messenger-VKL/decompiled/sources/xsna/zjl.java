package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zjl implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zjl(mtk0 mtk0Var, boolean z) {
        this.d = mtk0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                akl aklVar = (akl) this.d;
                vqt vqtVar = (vqt) obj;
                if (this.c) {
                    aklVar.n.e(vqtVar.a.size());
                } else {
                    aklVar.n.e(vqtVar.a.size() + vqtVar.c);
                }
                return s3q0.a;
            default:
                return ((kw8) obj).e(new emh((mtk0) this.d, this.c, 1));
        }
    }

    public /* synthetic */ zjl(boolean z, akl aklVar) {
        this.c = z;
        this.d = aklVar;
    }
}
