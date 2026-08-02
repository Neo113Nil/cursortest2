package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;
import java.util.HashMap;
import kotlin.Pair;

/* compiled from: AudioSourceDecodingStat.kt */
/* loaded from: classes3.dex */
public final class yx4 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final HashMap<Integer, Integer> e = new HashMap<>();

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b((Integer) ((Pair) t).i(), (Integer) ((Pair) t2).i());
        }
    }

    public yx4(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx4)) {
            return false;
        }
        yx4 yx4Var = (yx4) obj;
        return this.a == yx4Var.a && epx.f(this.b, yx4Var.b) && this.c == yx4Var.c && this.d == yx4Var.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return this.a + '|' + this.b + '|' + this.c + '|' + this.d + '[' + j5g.g0(j5g.D0(new a(), rn00.x(this.e)), StringUtils.COMMA, null, null, 0, new qt(6), 30) + ']';
    }
}
