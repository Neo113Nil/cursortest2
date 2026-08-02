package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kog implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ kog(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((jog) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((j6e) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((p6e0) this.b).invoke(obj)).booleanValue();
        }
    }
}
