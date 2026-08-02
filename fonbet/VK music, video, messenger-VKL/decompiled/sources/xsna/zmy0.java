package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class zmy0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ zmy0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((tly0) obj).c.stream().allMatch(new bny0());
            default:
                return false;
        }
    }
}
