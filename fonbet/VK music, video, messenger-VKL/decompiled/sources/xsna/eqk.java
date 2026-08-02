package xsna;

import java.util.function.Predicate;
import one.video.calls.sdk_private.f;
import xsna.eqy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class eqk implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ eqk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !one.video.calls.sdk_private.a.A.contains((f.g) obj);
            case 1:
                return ((vmy0) obj).g.get() != 0;
            default:
                eqy0.b bVar = (eqy0.b) obj;
                return bVar == eqy0.b.c || bVar == eqy0.b.d;
        }
    }
}
