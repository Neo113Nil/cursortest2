package xsna;

import java.time.Instant;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.builders.SetBuilder;

/* compiled from: ExerciseSegment.kt */
/* loaded from: classes12.dex */
public final class l4q {
    public static final Set<Integer> e = rl3.y0(new Integer[]{10, 36, 0});
    public static final Set<Integer> f = rl3.y0(new Integer[]{38, 39, 44, 54, 0});
    public static final Set<Integer> g;
    public static final Set<Integer> h;
    public static final Object i;
    public final Instant a;
    public final Instant b;
    public final int c;
    public final int d;

    static {
        Set<Integer> y0 = rl3.y0(new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 48, 49, 50, 51, 63, 65});
        g = y0;
        Set<Integer> y02 = rl3.y0(new Integer[]{55, 56, 58, 57, 59, 61});
        h = y02;
        Pair pair = new Pair(8, Collections.singleton(7));
        Pair pair2 = new Pair(9, Collections.singleton(8));
        Pair pair3 = new Pair(13, y0);
        Pair pair4 = new Pair(25, Collections.singleton(21));
        Pair pair5 = new Pair(26, rl3.y0(new Integer[]{67, 8, 40, 24}));
        Pair pair6 = new Pair(34, y0);
        Pair pair7 = new Pair(37, rl3.y0(new Integer[]{64, 66}));
        Pair pair8 = new Pair(48, Collections.singleton(40));
        Pair pair9 = new Pair(54, Collections.singleton(45));
        Pair pair10 = new Pair(56, rl3.y0(new Integer[]{46, 64}));
        Pair pair11 = new Pair(57, Collections.singleton(47));
        Pair pair12 = new Pair(70, y0);
        Pair pair13 = new Pair(68, Collections.singleton(52));
        Pair pair14 = new Pair(69, Collections.singleton(53));
        SetBuilder setBuilder = new SetBuilder();
        setBuilder.add(60);
        Set<Integer> set = y02;
        setBuilder.addAll(set);
        s3q0 s3q0Var = s3q0.a;
        Pair pair15 = new Pair(73, setBuilder.d());
        SetBuilder setBuilder2 = new SetBuilder();
        setBuilder2.add(62);
        setBuilder2.addAll(set);
        i = pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(74, setBuilder2.d()), new Pair(79, Collections.singleton(64)), new Pair(82, Collections.singleton(66)), new Pair(81, y0), new Pair(83, Collections.singleton(67)));
    }

    public l4q(Instant instant, Instant instant2, int i2, int i3) {
        this.a = instant;
        this.b = instant2;
        this.c = i2;
        this.d = i3;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("repetitions can not be negative.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4q)) {
            return false;
        }
        l4q l4qVar = (l4q) obj;
        return epx.f(this.a, l4qVar.a) && epx.f(this.b, l4qVar.b) && this.c == l4qVar.c && this.d == l4qVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, w11.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExerciseSegment(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        sb.append(this.b);
        sb.append(", segmentType=");
        sb.append(this.c);
        sb.append(", repetitions=");
        return vu5.b(sb, this.d, ')');
    }
}
