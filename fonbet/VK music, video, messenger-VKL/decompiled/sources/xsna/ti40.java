package xsna;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti40 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((eqq) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((i0b0) this.b).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((izs) this.b).invoke(obj)).booleanValue();
            case 3:
                aby0 aby0Var = (aby0) this.b;
                aby0Var.getClass();
                return Arrays.equals(((gey0) ((Map.Entry) obj).getValue()).b, aby0Var.b);
            default:
                return ((tdy0) this.b).g.containsKey((Long) obj);
        }
    }
}
