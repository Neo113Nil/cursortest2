package xsna;

import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ProductCardTopBarViewState.kt */
/* loaded from: classes18.dex */
public final class and0 implements dnd0 {
    public final List<ProductCardTopBarControlAction> a;

    public and0(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof and0) && epx.f(this.a, ((and0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ControlActions(actions="), this.a);
    }
}
