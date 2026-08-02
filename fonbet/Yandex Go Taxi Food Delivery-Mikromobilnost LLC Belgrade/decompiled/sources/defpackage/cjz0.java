package defpackage;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class cjz0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((CharSequence) obj2).length()).compareTo(Integer.valueOf(((CharSequence) obj).length()));
    }
}
