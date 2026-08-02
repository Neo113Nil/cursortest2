package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class g7j {
    public static final g7j b;
    public final List a;

    static {
        DetailsCardListItem.a aVar = DetailsCardListItem.a.g;
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
        b = new g7j(EmptyList.a);
    }

    public g7j(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7j) && jl40.l(this.a, ((g7j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DetailsCardRoutePointsUiState(points=", Extension.C_BRAKE, this.a);
    }
}
