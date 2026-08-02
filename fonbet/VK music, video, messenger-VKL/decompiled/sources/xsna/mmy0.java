package xsna;

import java.time.Instant;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class mmy0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ mmy0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((Instant) obj).compareTo((Instant) obj2);
            default:
                return yads.f23.a((yads.e23) obj, (yads.e23) obj2);
        }
    }
}
