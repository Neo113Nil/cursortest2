package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;

/* compiled from: TrackGroupArray.java */
/* loaded from: classes12.dex */
public final class qfp0 {
    public static final qfp0 d = new qfp0(new pfp0[0]);
    public final int a;
    public final com.google.common.collect.g b;
    public int c;

    static {
        y2r0.L(0);
    }

    public qfp0(pfp0... pfp0VarArr) {
        com.google.common.collect.g n = ImmutableList.n(pfp0VarArr);
        this.b = n;
        this.a = pfp0VarArr.length;
        int i = 0;
        while (i < n.e) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < n.e; i3++) {
                if (((pfp0) n.get(i)).equals(n.get(i3))) {
                    ahn.o("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final pfp0 a(int i) {
        return (pfp0) this.b.get(i);
    }

    public final int b(pfp0 pfp0Var) {
        int indexOf = this.b.indexOf(pfp0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qfp0.class != obj.getClass()) {
            return false;
        }
        qfp0 qfp0Var = (qfp0) obj;
        if (this.a != qfp0Var.a) {
            return false;
        }
        com.google.common.collect.g gVar = qfp0Var.b;
        com.google.common.collect.g gVar2 = this.b;
        gVar2.getClass();
        return qhz.a(gVar2, gVar);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
