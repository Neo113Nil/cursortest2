package xsna;

import java.util.List;

/* compiled from: StickersConfigEntity.kt */
/* loaded from: classes5.dex */
public final class i9l0 {
    public final int a;
    public final List<Integer> b;

    public i9l0(int i, List<Integer> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9l0)) {
            return false;
        }
        i9l0 i9l0Var = (i9l0) obj;
        return this.a == i9l0Var.a && epx.f(this.b, i9l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersConfigEntity(version=");
        sb.append(this.a);
        sb.append(", packIds=");
        return ms9.a(')', sb, this.b);
    }
}
