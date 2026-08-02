package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class yqk implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ yqk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((pt50) obj) instanceof rvp0;
            default:
                return ((tly0) obj) instanceof cly0;
        }
    }
}
