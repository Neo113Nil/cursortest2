package xsna;

import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yqp implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yqp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((zqh) this.b).invoke(obj)).booleanValue();
            default:
                lby0 lby0Var = (lby0) this.b;
                lby0Var.getClass();
                return Arrays.equals(((gey0) obj).b, lby0Var.b);
        }
    }
}
