package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class lf90 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((ff90) obj2).a).compareTo(Integer.valueOf(((ff90) obj).a));
    }
}
