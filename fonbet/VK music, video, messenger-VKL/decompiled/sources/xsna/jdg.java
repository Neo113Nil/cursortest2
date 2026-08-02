package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jdg implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ jdg(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((k60) this.b).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((frp) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((uh40) this.b).invoke(obj)).booleanValue();
        }
    }
}
