package xsna;

import java.util.List;

/* compiled from: SelectionPreviewItem.kt */
/* loaded from: classes2.dex */
public final class hei0 implements hfz {
    public final List<qtd0> b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public hei0(String str, List list, boolean z, boolean z2) {
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hei0)) {
            return false;
        }
        hei0 hei0Var = (hei0) obj;
        return epx.f(this.b, hei0Var.b) && epx.f(this.c, hei0Var.c) && this.d == hei0Var.d && this.e == hei0Var.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionPreviewItem(selection=");
        sb.append(this.b);
        sb.append(", hintText=");
        sb.append(this.c);
        sb.append(", channelButton=");
        sb.append(this.d);
        sb.append(", avoidScrollToLast=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
