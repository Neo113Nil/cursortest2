package xsna;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Id.kt */
@vby
/* loaded from: classes2.dex */
public final class m300 implements Comparable<m300> {
    public static final /* synthetic */ int b = 0;

    static {
        new AtomicLong(1L);
    }

    public static String a(long j) {
        return q9k.d("Id(#", j, ')');
    }

    @Override // java.lang.Comparable
    public final int compareTo(m300 m300Var) {
        m300Var.getClass();
        return epx.h(0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m300)) {
            return false;
        }
        ((m300) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return a(0L);
    }
}
