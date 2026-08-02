package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: ContactAndLinksItem.kt */
/* loaded from: classes5.dex */
public final class pmw implements VkCell.f {
    public final String a;
    public final Drawable b;

    public pmw(String str, pcc pccVar) {
        this.a = str;
        this.b = pccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmw)) {
            return false;
        }
        pmw pmwVar = (pmw) obj;
        return epx.f(this.a, pmwVar.a) && epx.f(this.b, pmwVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Drawable drawable = this.b;
        return hashCode + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "ImageViewParams(thumb=" + this.a + ", placeholderIcon=" + this.b + ')';
    }
}
