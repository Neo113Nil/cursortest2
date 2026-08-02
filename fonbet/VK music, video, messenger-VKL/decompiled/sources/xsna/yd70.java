package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NotificationMenuModalState.kt */
/* loaded from: classes4.dex */
public final class yd70 implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List<ee70> f;
    public final Long g;

    public yd70() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yd70 a(yd70 yd70Var, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, Long l, int i) {
        if ((i & 1) != 0) {
            z = yd70Var.b;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = yd70Var.c;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = yd70Var.d;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = yd70Var.e;
        }
        boolean z8 = z4;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = yd70Var.f;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            l = yd70Var.g;
        }
        yd70Var.getClass();
        return new yd70(z5, z6, z7, z8, list2, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd70)) {
            return false;
        }
        yd70 yd70Var = (yd70) obj;
        return this.b == yd70Var.b && this.c == yd70Var.c && this.d == yd70Var.d && this.e == yd70Var.e && epx.f(this.f, yd70Var.f) && epx.f(this.g, yd70Var.g);
    }

    public final int hashCode() {
        int a = fw3.a(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Long l = this.g;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationMenuModalState(isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", showProfileStats=");
        sb.append(this.d);
        sb.append(", tabsEnabled=");
        sb.append(this.e);
        sb.append(", sources=");
        sb.append(this.f);
        sb.append(", currentSourceId=");
        return iq.b(sb, this.g, ')');
    }

    public yd70(boolean z, boolean z2, boolean z3, boolean z4, List<ee70> list, Long l) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
        this.g = l;
    }

    public yd70(int i) {
        this(true, false, false, false, EmptyList.b, null);
    }
}
