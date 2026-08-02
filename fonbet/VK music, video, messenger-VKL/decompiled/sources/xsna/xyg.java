package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xyg implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ xyg(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((la2) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((r9k) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((b140) this.b).invoke(obj)).booleanValue();
        }
    }
}
