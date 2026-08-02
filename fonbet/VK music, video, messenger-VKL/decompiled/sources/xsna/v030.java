package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class v030 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ v030(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return obj instanceof v6n0;
            case 1:
                return ((ejy0) obj) instanceof fny0;
            default:
                return ((xmy0) obj).a();
        }
    }
}
