package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Permissions.kt */
/* loaded from: classes4.dex */
public final class gy90 {
    public final ArrayList a;
    public final ArrayList b;

    public gy90() {
        throw null;
    }

    public gy90(Context context, Iterable<String> iterable) {
        ArrayList arrayList = new ArrayList();
        for (String str : iterable) {
            if (enj.l(context, str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : iterable) {
            if (!enj.l(context, str2)) {
                arrayList2.add(str2);
            }
        }
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean a(String[] strArr) {
        List u0 = rl3.u0(strArr);
        return (j5g.d0(this.a, u0).isEmpty() && j5g.d0(this.b, u0).isEmpty()) ? false : true;
    }

    public final List<String> b() {
        return this.b;
    }

    public final List<String> c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy90)) {
            return false;
        }
        gy90 gy90Var = (gy90) obj;
        return epx.f(this.a, gy90Var.a) && epx.f(this.b, gy90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Permissions(granted=");
        sb.append(this.a);
        sb.append(", denied=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
