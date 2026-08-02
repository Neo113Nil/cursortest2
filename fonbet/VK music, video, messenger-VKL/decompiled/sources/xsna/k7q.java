package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class k7q implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Long.valueOf(((n7o) obj).c), Long.valueOf(((n7o) obj2).c));
            default:
                return jw5.b(Integer.valueOf(((ic50) obj).e), Integer.valueOf(((ic50) obj2).e));
        }
    }
}
