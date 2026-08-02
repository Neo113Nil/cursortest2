package xsna;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class jqt0 implements t1a {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ jqt0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.t1a
    public final s1a a(b2a b2aVar) {
        switch (this.b) {
            case 0:
                return (s1a) ((tpt0) this.c).invoke(b2aVar);
            default:
                return (s1a) ((o45) this.c).invoke(b2aVar);
        }
    }
}
