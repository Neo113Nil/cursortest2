package xsna;

import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: TrackEventsBlockListConfig.kt */
/* loaded from: classes11.dex */
public final class mfp0 {
    public static final a e = new a();
    public static final mfp0 f = new mfp0(0);
    public final boolean a;
    public final int b;
    public final long c;
    public final Set<String> d;

    /* compiled from: TrackEventsBlockListConfig.kt */
    public static final class a {
    }

    public mfp0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfp0)) {
            return false;
        }
        mfp0 mfp0Var = (mfp0) obj;
        return this.a == mfp0Var.a && this.b == mfp0Var.b && this.c == mfp0Var.c && epx.f(this.d, mfp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackEventsBlockListConfig(enabled=");
        sb.append(this.a);
        sb.append(", batchSizeCount=");
        sb.append(this.b);
        sb.append(", intervalMs=");
        sb.append(this.c);
        sb.append(", blockList=");
        return ur.c(sb, this.d, ')');
    }

    public mfp0(boolean z, int i, long j, Set<String> set) {
        this.a = z;
        this.b = i;
        this.c = j;
        this.d = set;
    }

    public mfp0(int i) {
        this(false, 32, 60000L, EmptySet.b);
    }
}
