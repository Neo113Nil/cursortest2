package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class x1q0 implements Predicate {
    public final /* synthetic */ exi0 a;

    public /* synthetic */ x1q0(exi0 exi0Var) {
        this.a = exi0Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }
}
