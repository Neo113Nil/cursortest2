package xsna;

import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CartViewState.kt */
/* loaded from: classes18.dex */
public final class egz {
    public final List<CartItem> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public egz(ListBuilder listBuilder, boolean z, boolean z2, boolean z3) {
        this.a = listBuilder;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egz)) {
            return false;
        }
        egz egzVar = (egz) obj;
        return epx.f(this.a, egzVar.a) && this.b == egzVar.b && this.c == egzVar.c && this.d == egzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListState(items=");
        sb.append(this.a);
        sb.append(", hasNext=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        sb.append(this.c);
        sb.append(", trackUiMeasuringSession=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
