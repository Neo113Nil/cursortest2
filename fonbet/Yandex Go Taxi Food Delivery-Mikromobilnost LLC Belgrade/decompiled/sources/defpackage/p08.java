package defpackage;

import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarUiState$State;
import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarUiState$TopContentType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class p08 {
    public final Orientation a;
    public final String b;
    public final String c;
    public final String d;
    public final CancelSimilarUiState$State e;
    public final f6j f;
    public final List g;
    public final CancelSimilarUiState$TopContentType h;
    public final UiStateDrawableWrapper i;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
        fq80 fq80Var = Orientation.Companion;
        CancelSimilarUiState$State cancelSimilarUiState$State = CancelSimilarUiState$State.IDLE;
        CancelSimilarUiState$TopContentType cancelSimilarUiState$TopContentType = CancelSimilarUiState$TopContentType.ORDER_CARD;
    }

    public p08(Orientation orientation, String str, String str2, String str3, CancelSimilarUiState$State cancelSimilarUiState$State, f6j f6jVar, List list, CancelSimilarUiState$TopContentType cancelSimilarUiState$TopContentType, UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = orientation;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cancelSimilarUiState$State;
        this.f = f6jVar;
        this.g = list;
        this.h = cancelSimilarUiState$TopContentType;
        this.i = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p08)) {
            return false;
        }
        p08 p08Var = (p08) obj;
        return this.a == p08Var.a && jl40.l(this.b, p08Var.b) && jl40.l(this.c, p08Var.c) && jl40.l(this.d, p08Var.d) && this.e == p08Var.e && jl40.l(this.f, p08Var.f) && jl40.l(this.g, p08Var.g) && this.h == p08Var.h && jl40.l(this.i, p08Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (this.h.hashCode() + unr0.c((this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31, 31, this.g)) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.i;
        return hashCode4 + (uiStateDrawableWrapper != null ? uiStateDrawableWrapper.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelSimilarUiState(orientation=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        g8e.D(sb, this.c, ", eta=", this.d, ", state=");
        sb.append(this.e);
        sb.append(", driverUiState=");
        sb.append(this.f);
        sb.append(", buttons=");
        sb.append(this.g);
        sb.append(", topContentType=");
        sb.append(this.h);
        sb.append(", image=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
