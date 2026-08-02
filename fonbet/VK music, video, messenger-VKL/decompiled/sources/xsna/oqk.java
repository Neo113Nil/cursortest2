package xsna;

import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class oqk implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ oqk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((one.video.calls.sdk_private.b) ((pt50) obj)).b.isEmpty();
            default:
                return ((tly0) obj).s();
        }
    }
}
