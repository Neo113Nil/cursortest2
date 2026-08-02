package defpackage;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class gsk implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((Float) ((Pair) obj).f(), (Float) ((Pair) obj2).f());
    }
}
