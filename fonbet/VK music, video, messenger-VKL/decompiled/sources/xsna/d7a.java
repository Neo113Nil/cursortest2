package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;

/* compiled from: CatalogHintViewInfo.kt */
/* loaded from: classes16.dex */
public final class d7a {
    public final UIBlockHint a;
    public final View b;

    public d7a(UIBlockHint uIBlockHint, View view) {
        this.a = uIBlockHint;
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7a)) {
            return false;
        }
        d7a d7aVar = (d7a) obj;
        return epx.f(this.a, d7aVar.a) && epx.f(this.b, d7aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogHintViewInfo(hint=");
        sb.append(this.a);
        sb.append(", view=");
        return br.b(sb, this.b, ')');
    }
}
