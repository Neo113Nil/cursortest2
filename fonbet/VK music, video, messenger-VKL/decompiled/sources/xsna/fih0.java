package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* compiled from: ScrubbingModeParameters.java */
/* loaded from: classes12.dex */
public final class fih0 {
    public static final fih0 b;
    public final ImmutableSet<Integer> a;

    /* compiled from: ScrubbingModeParameters.java */
    public static final class a {
        public ImmutableSet<Integer> a;
    }

    static {
        a aVar = new a();
        aVar.a = ImmutableSet.m(2, 1, 5);
        b = new fih0(aVar);
    }

    public fih0(a aVar) {
        this.a = aVar.a;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof fih0) && this.a.equals(((fih0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
