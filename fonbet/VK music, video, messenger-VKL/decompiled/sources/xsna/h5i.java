package xsna;

import com.vk.dto.community.entries.widget.Widget;

/* compiled from: CommunityWidgetItemModel.kt */
/* loaded from: classes5.dex */
public final class h5i extends s4h {
    public final Widget b;

    public h5i(Widget widget) {
        this.b = widget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5i) && epx.f(this.b, ((h5i) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommunityWidgetItemModel(widget=" + this.b + ')';
    }
}
