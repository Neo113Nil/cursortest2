package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.register.CatalogBlockVariant;

/* compiled from: VisibilityCatalogBlockEvent.kt */
/* loaded from: classes16.dex */
public final class v4u0 implements wnk {
    public final BlockId a;
    public final CatalogBlockVariant b;
    public final boolean c;

    public v4u0(BlockId blockId, CatalogBlockVariant catalogBlockVariant, boolean z) {
        this.a = blockId;
        this.b = catalogBlockVariant;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4u0)) {
            return false;
        }
        v4u0 v4u0Var = (v4u0) obj;
        return epx.f(this.a, v4u0Var.a) && this.b == v4u0Var.b && this.c == v4u0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisibilityCatalogBlockEvent(blockId=");
        sb.append(this.a);
        sb.append(", blockVariant=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
