package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class dey0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ dey0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.b) {
            case 0:
                return ((jly0) obj).b.p().compareTo(((jly0) obj2).b.p());
            default:
                compare = Float.compare(((yads.e23) obj).c, ((yads.e23) obj2).c);
                return compare;
        }
    }
}
