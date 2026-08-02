package xsna;

import xsna.tlo0;

/* compiled from: VkCompositeActionButtonView.kt */
/* loaded from: classes18.dex */
public final class nmu0 {
    public final tlo0.h a;
    public final tlo0.h b;
    public final int c;
    public final String d;

    public nmu0(tlo0.h hVar, tlo0.h hVar2, int i, String str) {
        this.a = hVar;
        this.b = hVar2;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmu0)) {
            return false;
        }
        nmu0 nmu0Var = (nmu0) obj;
        return this.a.equals(nmu0Var.a) && this.b.equals(nmu0Var.b) && this.c == nmu0Var.c && epx.f(this.d, nmu0Var.d);
    }

    public final int hashCode() {
        int a = shy.a(this.c, u11.c(this.a.a.hashCode() * 31, 31, this.b.a), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatePic(day=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", description=");
        return ho8.a(sb, this.d, ')');
    }
}
