package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class jwq implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fq4 fq4Var = (fq4) obj;
        int i = 0;
        Integer valueOf = Integer.valueOf(fq4Var.d ? 2 : fq4Var.e ? 1 : 0);
        fq4 fq4Var2 = (fq4) obj2;
        if (fq4Var2.d) {
            i = 2;
        } else if (fq4Var2.e) {
            i = 1;
        }
        return valueOf.compareTo(Integer.valueOf(i));
    }
}
