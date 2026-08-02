package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class qd3 extends n3a {
    public final String a;
    public final UIBlock b;

    public qd3(String str, UIBlock uIBlock) {
        this.a = str;
        this.b = uIBlock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        return epx.f(this.a, qd3Var.a) && epx.f(this.b, qd3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UIBlock uIBlock = this.b;
        return hashCode + (uIBlock == null ? 0 : uIBlock.hashCode());
    }

    public final String toString() {
        return "ApplyUserChanges(sectionId=" + this.a + ", block=" + this.b + ')';
    }
}
