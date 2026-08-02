package xsna;

import java.util.List;

/* compiled from: ModalPostDonutState.kt */
/* loaded from: classes4.dex */
public final class f130 implements km50 {
    public final List<be> b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public f130(List<? extends be> list, boolean z, boolean z2) {
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f130)) {
            return false;
        }
        f130 f130Var = (f130) obj;
        return epx.f(this.b, f130Var.b) && this.c == f130Var.c && this.d == f130Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalPostDonutState(data=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", isError=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
