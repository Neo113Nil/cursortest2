package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a53 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ a53(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((z43) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((rop) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((wq20) this.b).invoke(obj)).booleanValue();
        }
    }
}
