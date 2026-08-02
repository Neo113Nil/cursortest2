package xsna;

import java.util.Map;
import java.util.function.Predicate;
import one.video.calls.sdk_private.aB;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xay0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ xay0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((gey0) ((Map.Entry) obj).getValue()).c.equals(aB.d);
            default:
                return ((xmy0) obj).b.s();
        }
    }
}
