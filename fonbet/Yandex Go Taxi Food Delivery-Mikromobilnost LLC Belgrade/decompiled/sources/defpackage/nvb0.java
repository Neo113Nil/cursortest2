package defpackage;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class nvb0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.valueOf(((jvb0) obj2).a.b).compareTo(Float.valueOf(((jvb0) obj).a.b));
    }
}
