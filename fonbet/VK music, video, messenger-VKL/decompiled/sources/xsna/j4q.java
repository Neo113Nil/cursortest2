package xsna;

import java.util.Comparator;
import kotlin.Pair;
import xsna.i4q;

/* compiled from: Comparisons.kt */
/* loaded from: classes12.dex */
public final class j4q implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ j4q(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((i4q.a) obj).a, ((i4q.a) obj2).a);
            case 1:
                return jw5.b((Integer) ((Pair) obj).j(), (Integer) ((Pair) obj2).j());
            default:
                return jw5.b(Integer.valueOf(-((Number) ((Pair) obj).g()).intValue()), Integer.valueOf(-((Number) ((Pair) obj2).g()).intValue()));
        }
    }
}
