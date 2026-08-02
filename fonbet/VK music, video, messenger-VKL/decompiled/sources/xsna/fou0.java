package xsna;

/* compiled from: VkCounterDefaults.kt */
/* loaded from: classes17.dex */
public final class fou0 implements gxj {
    public final long a;
    public final long b;

    public fou0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.gxj
    public final mtk0 a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(930031894);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(930031894, i, -1, "com.vk.core.compose.component.defaults.VkCounterColors.backgroundColor (VkCounterDefaults.kt:482)");
        }
        wh50 f = bo.f(0, this.a, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    @Override // xsna.gxj
    public final mtk0 b(androidx.compose.runtime.a aVar) {
        aVar.K(454199879);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(454199879, 0, -1, "com.vk.core.compose.component.defaults.VkCounterColors.contentColor (VkCounterDefaults.kt:485)");
        }
        wh50 f = bo.f(0, this.b, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fou0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fou0 fou0Var = (fou0) obj;
        return l5g.d(this.a, fou0Var.a) && l5g.d(this.b, fou0Var.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkCounterColors(backgroundColor=");
        dn.h(this.a, ", contentColor=", sb);
        return pm0.d(')', this.b, sb);
    }
}
