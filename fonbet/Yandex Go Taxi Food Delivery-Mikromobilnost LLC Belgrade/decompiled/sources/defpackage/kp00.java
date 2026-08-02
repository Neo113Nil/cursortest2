package defpackage;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class kp00 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((jp00) obj).getOrder()).compareTo(Integer.valueOf(((jp00) obj2).getOrder()));
    }
}
