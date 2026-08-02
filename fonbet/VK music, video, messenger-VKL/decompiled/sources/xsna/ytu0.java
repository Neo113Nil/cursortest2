package xsna;

import xsna.tlo0;

/* compiled from: VkFeedCarouselCard.kt */
/* loaded from: classes18.dex */
public final class ytu0 {
    public final gko a;
    public final f880 b;
    public final tlo0.f c;

    public ytu0(gko gkoVar, f880 f880Var, tlo0.f fVar) {
        this.a = gkoVar;
        this.b = f880Var;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytu0)) {
            return false;
        }
        ytu0 ytu0Var = (ytu0) obj;
        return this.a.equals(ytu0Var.a) && this.b.equals(ytu0Var.b) && this.c.equals(ytu0Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Top(icon=");
        sb.append(this.a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return pr.b(sb, this.c, ')');
    }
}
