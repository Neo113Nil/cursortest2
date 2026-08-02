package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class qon0 extends n3a {
    public final izs<Boolean, Boolean> a;
    public final izs<UIBlockList, Boolean> b;
    public final boolean c;

    public qon0() {
        throw null;
    }

    public qon0(int i, izs izsVar, izs izsVar2) {
        this.a = (i & 1) != 0 ? new eni0(5) : izsVar;
        this.b = izsVar2;
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qon0)) {
            return false;
        }
        qon0 qon0Var = (qon0) obj;
        return epx.f(this.a, qon0Var.a) && epx.f(this.b, qon0Var.b) && this.c == qon0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dq.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncWithPredicateCmd(shouldScrollToHorizontalTop=");
        sb.append(this.a);
        sb.append(", shouldUpdate=");
        sb.append(this.b);
        sb.append(", isAnimated=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
