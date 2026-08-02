package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlockHint;

/* compiled from: CatalogHintPositionInfo.kt */
/* loaded from: classes16.dex */
public final class a7a {
    public final UIBlockHint a;
    public final int b;

    public a7a(UIBlockHint uIBlockHint, int i) {
        this.a = uIBlockHint;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7a)) {
            return false;
        }
        a7a a7aVar = (a7a) obj;
        return epx.f(this.a, a7aVar.a) && this.b == a7aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogHintPositionInfo(hint=");
        sb.append(this.a);
        sb.append(", position=");
        return vu5.b(sb, this.b, ')');
    }
}
