package xsna;

/* compiled from: CatalogBlockInlineActorFactory.kt */
/* loaded from: classes.dex */
public final class m1k0 implements t1a {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ m1k0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.t1a
    public final s1a a(b2a b2aVar) {
        switch (this.b) {
            case 0:
                return (s1a) ((ezc0) this.c).invoke(b2aVar);
            default:
                return (s1a) ((mmt0) this.c).invoke(b2aVar);
        }
    }
}
