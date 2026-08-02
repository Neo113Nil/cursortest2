package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xqp implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xqp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((qpj) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((dn20) this.b).invoke(obj)).booleanValue();
            default:
                vmy0 vmy0Var = (vmy0) this.b;
                vmy0Var.getClass();
                return ((xmy0) obj).b.p().longValue() <= vmy0Var.h;
        }
    }
}
