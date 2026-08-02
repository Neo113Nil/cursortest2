package xsna;

import com.vk.community.design.compose.donut.DonutUserStackClipPosition;
import com.vk.community.design.compose.donut.DonutUserStackSize;

/* compiled from: DonutUserStackSemanticsState.kt */
/* loaded from: classes17.dex */
public final class u4o {
    public final DonutUserStackSize a;
    public final DonutUserStackClipPosition b;
    public final iy5 c;

    public u4o(DonutUserStackSize donutUserStackSize, DonutUserStackClipPosition donutUserStackClipPosition, iy5 iy5Var) {
        this.a = donutUserStackSize;
        this.b = donutUserStackClipPosition;
        this.c = iy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4o)) {
            return false;
        }
        u4o u4oVar = (u4o) obj;
        return this.a == u4oVar.a && this.b == u4oVar.b && epx.f(this.c, u4oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DonutUserStackSemanticsState(size=" + this.a + ", clipPosition=" + this.b + ", badge=" + this.c + ')';
    }
}
