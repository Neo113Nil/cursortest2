package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class si40 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ si40(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((ba40) this.b).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((d4r) this.b).invoke(obj)).booleanValue();
        }
    }
}
