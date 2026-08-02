package xsna;

import com.vk.dto.common.Direction;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Weight.kt */
/* loaded from: classes18.dex */
public final class gkx0 implements Comparable<gkx0> {
    public static final gkx0 c = new gkx0(-1);
    public static final gkx0 d = new gkx0(0);
    public static final gkx0 e = new gkx0(Long.MAX_VALUE);
    public final long b;

    /* compiled from: Weight.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gkx0(long j) {
        this.b = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gkx0 gkx0Var) {
        return epx.h(this.b, gkx0Var.b);
    }

    public final gkx0 b(Direction direction) {
        int i = a.$EnumSwitchMapping$0[direction.ordinal()];
        long j = this.b;
        if (i == 1) {
            return new gkx0(j - 1);
        }
        if (i == 2) {
            return new gkx0(j + 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkx0) && this.b == ((gkx0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Weight(value="));
    }
}
