package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: PlaylistCellViewHolder.kt */
/* loaded from: classes3.dex */
public final class dcb0 implements VkCell.f {
    public final Thumb a;
    public final List<Thumb> b;

    public dcb0(Thumb thumb, List<Thumb> list) {
        this.a = thumb;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcb0)) {
            return false;
        }
        dcb0 dcb0Var = (dcb0) obj;
        return epx.f(this.a, dcb0Var.a) && epx.f(this.b, dcb0Var.b);
    }

    public final int hashCode() {
        Thumb thumb = this.a;
        int hashCode = (thumb == null ? 0 : thumb.hashCode()) * 31;
        List<Thumb> list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistPictureParams(photo=");
        sb.append(this.a);
        sb.append(", thumbs=");
        return ms9.a(')', sb, this.b);
    }
}
