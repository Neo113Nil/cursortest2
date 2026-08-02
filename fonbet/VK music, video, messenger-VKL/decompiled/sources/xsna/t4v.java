package xsna;

import com.vk.dto.narratives.HighlightCover;
import com.vkontakte.android.R;

/* compiled from: HighlightCustomCoverItem.kt */
/* loaded from: classes3.dex */
public final class t4v extends zif0 {
    public final HighlightCover a;
    public final boolean b;

    public t4v(HighlightCover highlightCover, boolean z) {
        this.a = highlightCover;
        this.b = z;
    }

    @Override // xsna.zif0
    public final long a() {
        return -1L;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_highlight_custom_cover;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4v)) {
            return false;
        }
        t4v t4vVar = (t4v) obj;
        return epx.f(this.a, t4vVar.a) && this.b == t4vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightCustomCoverItem(cover=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
