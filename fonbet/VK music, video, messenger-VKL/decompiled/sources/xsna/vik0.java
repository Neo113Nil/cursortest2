package xsna;

import androidx.media3.ui.b;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class vik0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        b.C0073b c0073b = (b.C0073b) obj;
        b.C0073b c0073b2 = (b.C0073b) obj2;
        int compare = Integer.compare(c0073b2.a, c0073b.a);
        if (compare != 0) {
            return compare;
        }
        int compareTo = c0073b2.c.compareTo(c0073b.c);
        return compareTo != 0 ? compareTo : c0073b2.d.compareTo(c0073b.d);
    }
}
