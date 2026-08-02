package xsna;

import com.vk.core.view.components.topbar.VkTopBar;

/* compiled from: ToolbarSearchRenderState.kt */
/* loaded from: classes16.dex */
public final class n3p0 {
    public final VkTopBar.c a;
    public final VkTopBar.Middle b;
    public final s7p0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public n3p0() {
        this((VkTopBar.c.f) null, (VkTopBar.Middle.d) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3p0)) {
            return false;
        }
        n3p0 n3p0Var = (n3p0) obj;
        return epx.f(this.a, n3p0Var.a) && epx.f(this.b, n3p0Var.b) && epx.f(this.c, n3p0Var.c);
    }

    public final int hashCode() {
        VkTopBar.c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        VkTopBar.Middle middle = this.b;
        int hashCode2 = (hashCode + (middle == null ? 0 : middle.hashCode())) * 31;
        s7p0 s7p0Var = this.c;
        return hashCode2 + (s7p0Var != null ? s7p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarSearchRenderState(before=" + this.a + ", middle=" + this.b + ", searchMenuItem=" + this.c + ')';
    }

    public /* synthetic */ n3p0(VkTopBar.c.f fVar, VkTopBar.Middle.d dVar, int i) {
        this((i & 1) != 0 ? null : fVar, (i & 2) != 0 ? null : dVar, (s7p0) null);
    }

    public n3p0(VkTopBar.c cVar, VkTopBar.Middle middle, s7p0 s7p0Var) {
        this.a = cVar;
        this.b = middle;
        this.c = s7p0Var;
    }
}
