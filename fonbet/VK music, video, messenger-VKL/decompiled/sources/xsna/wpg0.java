package xsna;

import java.util.Comparator;
import kotlin.Pair;

/* compiled from: SemanticsSort.kt */
/* loaded from: classes11.dex */
public final class wpg0 implements Comparator {
    public static final wpg0 c = new wpg0(0);
    public final /* synthetic */ int b;

    public /* synthetic */ wpg0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                zhf0 h = ((igi0) obj).h();
                zhf0 h2 = ((igi0) obj2).h();
                int compare = Float.compare(h2.c, h.c);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h2.a, h.a);
            case 1:
                return jw5.b((Float) ((Pair) obj).i(), (Float) ((Pair) obj2).i());
            default:
                return jw5.b(Integer.valueOf(((ic50) obj).e), Integer.valueOf(((ic50) obj2).e));
        }
    }
}
