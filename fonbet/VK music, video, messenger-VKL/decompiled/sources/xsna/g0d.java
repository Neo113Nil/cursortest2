package xsna;

import com.vk.clips.playlists.ui.picker.recycler.ClipItem$MultiSelectCheckboxState;
import com.vk.dto.common.Image;

/* compiled from: ClipItem.kt */
/* loaded from: classes16.dex */
public final class g0d implements hfz {
    public final ClipItem$MultiSelectCheckboxState b;
    public final String c;
    public final Image d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public g0d(ClipItem$MultiSelectCheckboxState clipItem$MultiSelectCheckboxState, String str, Image image, int i, boolean z, boolean z2) {
        this.b = clipItem$MultiSelectCheckboxState;
        this.c = str;
        this.d = image;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0d)) {
            return false;
        }
        g0d g0dVar = (g0d) obj;
        return this.b == g0dVar.b && epx.f(this.c, g0dVar.c) && epx.f(this.d, g0dVar.d) && this.e == g0dVar.e && this.f == g0dVar.f && this.g == g0dVar.g;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c.hashCode());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(shy.a(this.e, fq.b(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Clip(multiSelectCheckboxState=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", preview=");
        sb.append(this.d);
        sb.append(", viewsCount=");
        sb.append(this.e);
        sb.append(", isPrivate=");
        sb.append(this.f);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
