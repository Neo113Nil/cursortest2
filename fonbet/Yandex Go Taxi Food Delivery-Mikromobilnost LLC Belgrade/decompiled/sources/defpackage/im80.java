package defpackage;

/* loaded from: classes13.dex */
public final class im80 extends bys {
    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        b6r b6rVar = (b6r) obj;
        b6r b6rVar2 = (b6r) obj2;
        if ((b6rVar instanceof a6r) && (b6rVar2 instanceof a6r)) {
            return true;
        }
        return ((b6rVar instanceof z5r) && (b6rVar2 instanceof z5r)) ? b6rVar.equals(b6rVar2) : jl40.l(b6rVar, b6rVar2);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        b6r b6rVar = (b6r) obj;
        b6r b6rVar2 = (b6r) obj2;
        if ((b6rVar instanceof a6r) && (b6rVar2 instanceof a6r)) {
            return true;
        }
        return ((b6rVar instanceof z5r) && (b6rVar2 instanceof z5r)) ? jl40.l(((z5r) b6rVar).a, ((z5r) b6rVar2).a) : super.k(b6rVar, b6rVar2);
    }
}
