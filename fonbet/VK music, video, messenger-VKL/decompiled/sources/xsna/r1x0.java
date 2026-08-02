package xsna;

/* compiled from: VoipShareLinkPagerTabItem.kt */
/* loaded from: classes7.dex */
public final class r1x0 implements hfz {
    public final com.vk.voip.ui.share.link.pager.view.c b;
    public final boolean c;

    public r1x0(com.vk.voip.ui.share.link.pager.view.c cVar, boolean z) {
        this.b = cVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1x0)) {
            return false;
        }
        r1x0 r1x0Var = (r1x0) obj;
        return epx.f(this.b, r1x0Var.b) && this.c == r1x0Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipShareLinkPagerTabItem(linkType=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
