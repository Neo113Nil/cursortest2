package xsna;

import java.time.Instant;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class vqk implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !(((pt50) obj) instanceof t3y0);
            default:
                return Objects.nonNull((Instant) obj);
        }
    }
}
