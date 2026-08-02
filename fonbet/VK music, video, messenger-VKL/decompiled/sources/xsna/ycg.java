package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ycg implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ ycg(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((d40) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((bq00) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((rgl0) this.b).invoke(obj)).booleanValue();
        }
    }
}
