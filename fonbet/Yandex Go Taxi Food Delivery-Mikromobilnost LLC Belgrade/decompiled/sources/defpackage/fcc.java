package defpackage;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class fcc implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Double) obj2).compareTo((Double) obj);
    }
}
