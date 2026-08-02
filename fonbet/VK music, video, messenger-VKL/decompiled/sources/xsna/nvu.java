package xsna;

import java.util.Comparator;
import xsna.uzj0;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class nvu implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ nvu(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((vg6) obj).a), Integer.valueOf(((vg6) obj2).a));
            case 1:
                return jw5.b(((uzj0.a) obj).a, ((uzj0.a) obj2).a);
            default:
                return jw5.b(Float.valueOf(((nnx) obj).getWidth()), Float.valueOf(((nnx) obj2).getWidth()));
        }
    }
}
