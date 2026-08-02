package defpackage;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class mai0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((Double) ((Pair) obj2).f(), (Double) ((Pair) obj).f());
    }
}
