package xsna;

/* compiled from: Distinct.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class atr implements b9i {
    public static final cb3 b = new cb3(2);
    public static final s03 c = new s03(1);
    public static final /* synthetic */ atr d = new atr();

    public static final dhn a(ksr ksrVar, izs izsVar, wzs wzsVar) {
        if (ksrVar instanceof dhn) {
            dhn dhnVar = (dhn) ksrVar;
            if (dhnVar.c == izsVar && dhnVar.d == wzsVar) {
                return (dhn) ksrVar;
            }
        }
        return new dhn(ksrVar, izsVar, wzsVar);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new a330();
    }
}
