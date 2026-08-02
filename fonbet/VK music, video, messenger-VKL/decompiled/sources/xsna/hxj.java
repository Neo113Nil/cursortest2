package xsna;

/* compiled from: VkSubnavigationButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class hxj implements gxj {
    public final long a;
    public final long b;

    public hxj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // xsna.gxj
    public final mtk0 a(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-1086131941);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1086131941, i, -1, "com.vk.core.compose.component.subnavigation.CounterColorsImpl.backgroundColor (VkSubnavigationButtonDefaults.kt:230)");
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
        aVar.K(586414154);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(586414154, 0, -1, "com.vk.core.compose.component.subnavigation.CounterColorsImpl.contentColor (VkSubnavigationButtonDefaults.kt:233)");
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
        if (!(obj instanceof hxj)) {
            return false;
        }
        hxj hxjVar = (hxj) obj;
        return l5g.d(this.a, hxjVar.a) && l5g.d(this.b, hxjVar.b);
    }

    public final int hashCode() {
        int i = l5g.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterColorsImpl(backgroundColor=");
        dn.h(this.a, ", textColor=", sb);
        return pm0.d(')', this.b, sb);
    }
}
