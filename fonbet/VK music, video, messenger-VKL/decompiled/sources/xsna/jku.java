package xsna;

import com.vk.core.view.components.group.header.VkGroupHeader;

/* compiled from: GroupHeaderItem.kt */
/* loaded from: classes7.dex */
public final class jku implements hfz {
    public final tlo0 b;
    public final VkGroupHeader.Size c;

    public jku(tlo0 tlo0Var, VkGroupHeader.Size size) {
        this.b = tlo0Var;
        this.c = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jku)) {
            return false;
        }
        jku jkuVar = (jku) obj;
        return this.b.equals(jkuVar.b) && this.c == jkuVar.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 961);
    }

    public final String toString() {
        return "GroupHeaderItem(text=" + this.b + ", subtitle=null, size=" + this.c + ')';
    }
}
