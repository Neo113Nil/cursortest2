package xsna;

import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: PlaylistVisualContentController.kt */
/* loaded from: classes16.dex */
public final class dfb0 implements VkTile.h {
    public final Thumb a;
    public final List<Thumb> b;
    public final boolean c;
    public final boolean d;

    public dfb0(Thumb thumb, List<Thumb> list, boolean z, boolean z2) {
        this.a = thumb;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfb0)) {
            return false;
        }
        dfb0 dfb0Var = (dfb0) obj;
        return epx.f(this.a, dfb0Var.a) && epx.f(this.b, dfb0Var.b) && this.c == dfb0Var.c && this.d == dfb0Var.d;
    }

    public final int hashCode() {
        Thumb thumb = this.a;
        int hashCode = (thumb == null ? 0 : thumb.hashCode()) * 31;
        List<Thumb> list = this.b;
        return Boolean.hashCode(this.d) + qoy.b((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistVisualContentParams(photo=");
        sb.append(this.a);
        sb.append(", thumbs=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", isPlayButtonVisible=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
