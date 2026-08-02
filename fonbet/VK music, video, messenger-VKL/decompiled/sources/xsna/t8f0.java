package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class t8f0 extends n3a {
    public final izs<UIBlockList, Boolean> a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public t8f0(izs<? super UIBlockList, Boolean> izsVar, boolean z) {
        this.a = izsVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8f0)) {
            return false;
        }
        t8f0 t8f0Var = (t8f0) obj;
        return epx.f(this.a, t8f0Var.a) && this.b == t8f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RebindBlocksCmd(shouldUpdate=");
        sb.append(this.a);
        sb.append(", animate=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
