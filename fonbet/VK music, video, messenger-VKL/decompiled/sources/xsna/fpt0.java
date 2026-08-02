package xsna;

import com.vk.dto.common.VideoUrl;

/* compiled from: VideoUrlsListItem.kt */
/* loaded from: classes2.dex */
public final class fpt0 implements hfz {
    public final VideoUrl b;
    public final boolean c;

    public fpt0(VideoUrl videoUrl, boolean z) {
        this.b = videoUrl;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpt0)) {
            return false;
        }
        fpt0 fpt0Var = (fpt0) obj;
        return this.b == fpt0Var.b && this.c == fpt0Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUrlsListItem(url=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
