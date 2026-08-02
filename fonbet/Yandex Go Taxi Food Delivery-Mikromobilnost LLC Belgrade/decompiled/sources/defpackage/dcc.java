package defpackage;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class dcc implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) obj2).compareTo((String) obj);
    }
}
