package xsna;

import com.vk.core.view.components.cell.VkCell;

/* compiled from: ItemActionLinkView.kt */
/* loaded from: classes16.dex */
public final class qmw implements VkCell.f {
    public final ljw a;

    public qmw(ljw ljwVar) {
        this.a = ljwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmw) && epx.f(this.a, ((qmw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageViewParams(imageParams=" + this.a + ')';
    }
}
