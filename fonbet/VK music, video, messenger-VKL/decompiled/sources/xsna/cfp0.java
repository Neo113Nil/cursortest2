package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: TrackClickActionToAnalytics.kt */
/* loaded from: classes16.dex */
public final class cfp0 implements u0a {
    public final UIBlock a;
    public final Object b;

    public cfp0(UIBlock uIBlock, Object obj) {
        this.a = uIBlock;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfp0)) {
            return false;
        }
        cfp0 cfp0Var = (cfp0) obj;
        return epx.f(this.a, cfp0Var.a) && epx.f(this.b, cfp0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackClickActionToAnalytics(block=");
        sb.append(this.a);
        sb.append(", additionalData=");
        return k73.c(sb, this.b, ')');
    }
}
