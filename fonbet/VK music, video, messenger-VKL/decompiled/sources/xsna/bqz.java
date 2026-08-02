package xsna;

import java.util.Comparator;
import xsna.gkk0;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class bqz implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ bqz(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((qtd0) obj).La(), ((qtd0) obj2).La());
            case 1:
                return jw5.b(((gkk0.d) obj).a, ((gkk0.d) obj2).a);
            default:
                return jw5.b(Integer.valueOf(((nqo) obj).a), Integer.valueOf(((nqo) obj2).a));
        }
    }
}
