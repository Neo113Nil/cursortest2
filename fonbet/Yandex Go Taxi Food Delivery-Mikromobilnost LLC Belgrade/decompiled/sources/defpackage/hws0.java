package defpackage;

import java.lang.reflect.Field;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class hws0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String name = ((Field) obj).getName();
        Integer l = bvu0.l(10, evu0.d0(name, "f$", name));
        Integer valueOf = Integer.valueOf(l != null ? l.intValue() : Integer.MAX_VALUE);
        String name2 = ((Field) obj2).getName();
        Integer l2 = bvu0.l(10, evu0.d0(name2, "f$", name2));
        return valueOf.compareTo(Integer.valueOf(l2 != null ? l2.intValue() : Integer.MAX_VALUE));
    }
}
