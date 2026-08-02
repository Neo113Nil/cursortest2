package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class de20 implements zd20 {
    public final ArrayList a;
    public final PointF b;

    public de20(ArrayList arrayList, PointF pointF) {
        this.a = arrayList;
        this.b = pointF;
    }

    @Override // defpackage.zd20
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de20)) {
            return false;
        }
        de20 de20Var = (de20) obj;
        return this.a.equals(de20Var.a) && this.b.equals(de20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Radial(colors=" + this.a + ", centralPoint=" + this.b + ')';
    }
}
