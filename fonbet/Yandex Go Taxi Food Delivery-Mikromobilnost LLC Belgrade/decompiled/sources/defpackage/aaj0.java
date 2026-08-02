package defpackage;

import java.util.Comparator;

/* loaded from: classes6.dex */
public final class aaj0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ppi ppiVar = ((nu1) obj).f;
        Integer valueOf = ppiVar != null ? Integer.valueOf(ppiVar.a) : null;
        ppi ppiVar2 = ((nu1) obj2).f;
        return uvc.b(valueOf, ppiVar2 != null ? Integer.valueOf(ppiVar2.a) : null);
    }
}
