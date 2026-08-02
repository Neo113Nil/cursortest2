package xsna;

import com.vk.core.view.components.cell.VkCell;

/* compiled from: MarketEditAlbumGoodVh.kt */
/* loaded from: classes18.dex */
public final class yw00 implements VkCell.f {
    public final String a;
    public final boolean b;

    public yw00(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw00)) {
            return false;
        }
        yw00 yw00Var = (yw00) obj;
        return epx.f(this.a, yw00Var.a) && this.b == yw00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketEditAlbumCellLeftPictureParams(url=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
