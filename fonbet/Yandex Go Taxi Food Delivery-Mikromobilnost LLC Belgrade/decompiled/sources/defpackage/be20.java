package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class be20 implements zd20 {
    public final ArrayList a;
    public final PointF b;
    public final PointF c;

    public be20(ArrayList arrayList, PointF pointF, PointF pointF2) {
        this.a = arrayList;
        this.b = pointF;
        this.c = pointF2;
    }

    @Override // defpackage.zd20
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be20)) {
            return false;
        }
        be20 be20Var = (be20) obj;
        return this.a.equals(be20Var.a) && this.b.equals(be20Var.b) && this.c.equals(be20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Linear(colors=" + this.a + ", startPoint=" + this.b + ", endPoint=" + this.c + ')';
    }
}
