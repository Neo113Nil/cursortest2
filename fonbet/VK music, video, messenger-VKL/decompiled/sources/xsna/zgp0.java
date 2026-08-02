package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* compiled from: TrackSelectionOverride.java */
/* loaded from: classes12.dex */
public final class zgp0 {
    public final pfp0 a;
    public final ImmutableList<Integer> b;

    static {
        y2r0.L(0);
        y2r0.L(1);
    }

    public zgp0(pfp0 pfp0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= pfp0Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = pfp0Var;
        this.b = ImmutableList.m(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zgp0.class == obj.getClass()) {
            zgp0 zgp0Var = (zgp0) obj;
            if (this.a.equals(zgp0Var.a)) {
                ImmutableList<Integer> immutableList = zgp0Var.b;
                ImmutableList<Integer> immutableList2 = this.b;
                immutableList2.getClass();
                if (qhz.a(immutableList2, immutableList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
