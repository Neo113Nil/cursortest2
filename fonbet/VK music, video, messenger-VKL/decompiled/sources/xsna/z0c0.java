package xsna;

import java.util.function.Predicate;
import one.video.calls.sdk_private.aB;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0c0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ z0c0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((u1c0) obj).c == 74;
            case 1:
                return !((gey0) obj).c.equals(aB.d);
            default:
                return ((xmy0) obj).a();
        }
    }
}
