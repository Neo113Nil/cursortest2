package xsna;

import java.util.ArrayList;

/* compiled from: StoryStatCategory.kt */
/* loaded from: classes18.dex */
public final class vdm0 {
    public final String a;
    public final ArrayList b;

    public vdm0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdm0)) {
            return false;
        }
        vdm0 vdm0Var = (vdm0) obj;
        return epx.f(this.a, vdm0Var.a) && this.b.equals(vdm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatCategory(header=");
        sb.append(this.a);
        sb.append(", elements=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
