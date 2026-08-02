package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ewa implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ ewa(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((j5) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((wcg) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }
}
