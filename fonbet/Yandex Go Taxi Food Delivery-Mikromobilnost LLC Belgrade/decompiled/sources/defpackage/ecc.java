package defpackage;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class ecc implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Long) obj2).compareTo((Long) obj);
    }
}
