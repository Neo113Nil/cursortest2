package xsna;

import java.util.Comparator;
import xsna.t69;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class i69 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((t69.a) obj).b.ordinal()), Integer.valueOf(((t69.a) obj2).b.ordinal()));
            default:
                return jw5.b(((lb1) obj).b, ((lb1) obj2).b);
        }
    }
}
