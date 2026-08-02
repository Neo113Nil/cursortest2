package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qj6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qj6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                return ((Boolean) ((pj6) this.b).invoke(obj)).booleanValue();
            default:
                vmy0 vmy0Var = (vmy0) this.b;
                Long l = (Long) obj;
                if (vmy0Var.f.containsKey(l)) {
                    xmy0 xmy0Var = (xmy0) vmy0Var.f.get(l);
                    synchronized (xmy0Var) {
                        z = xmy0Var.e;
                    }
                    if (!z) {
                        return true;
                    }
                }
                return false;
        }
    }
}
