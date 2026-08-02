package xsna;

import android.graphics.Bitmap;
import com.vk.editor.filters.correction.model.FilterType;

/* compiled from: FilterItem.kt */
/* loaded from: classes18.dex */
public final class tcr {
    public final FilterType a;
    public final Bitmap b;
    public final String c;
    public boolean d;
    public boolean e;
    public float f;

    public tcr(FilterType filterType, Bitmap bitmap, String str, boolean z, boolean z2, float f) {
        this.a = filterType;
        this.b = bitmap;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcr)) {
            return false;
        }
        tcr tcrVar = (tcr) obj;
        return this.a == tcrVar.a && epx.f(this.b, tcrVar.b) && epx.f(this.c, tcrVar.c) && this.d == tcrVar.d && this.e == tcrVar.e && Float.compare(this.f, tcrVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + qoy.b(qoy.b(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterItem(type=");
        sb.append(this.a);
        sb.append(", preview=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", isShowIntensity=");
        sb.append(this.e);
        sb.append(", intensity=");
        return xq.c(')', this.f, sb);
    }
}
