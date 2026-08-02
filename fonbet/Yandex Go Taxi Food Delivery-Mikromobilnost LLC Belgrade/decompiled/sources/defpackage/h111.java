package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardAction;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes6.dex */
public final class h111 {
    public static final h111 k = new h111(null, null, "", "", null, false, "", TransportCardAction.ADD_TRANSPORT_CARD, "", p011.e);
    public final UiStateDrawableWrapper a;
    public final UiStateDrawableWrapper b;
    public final CharSequence c;
    public final CharSequence d;
    public final kdc e;
    public final boolean f;
    public final CharSequence g;
    public final TransportCardAction h;
    public final String i;
    public final p011 j;

    public h111(UiStateDrawableWrapper uiStateDrawableWrapper, UiStateDrawableWrapper uiStateDrawableWrapper2, CharSequence charSequence, CharSequence charSequence2, kdc kdcVar, boolean z, CharSequence charSequence3, TransportCardAction transportCardAction, String str, p011 p011Var) {
        this.a = uiStateDrawableWrapper;
        this.b = uiStateDrawableWrapper2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = kdcVar;
        this.f = z;
        this.g = charSequence3;
        this.h = transportCardAction;
        this.i = str;
        this.j = p011Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h111)) {
            return false;
        }
        h111 h111Var = (h111) obj;
        return jl40.l(this.a, h111Var.a) && jl40.l(this.b, h111Var.b) && jl40.l(this.c, h111Var.c) && jl40.l(this.d, h111Var.d) && jl40.l(this.e, h111Var.e) && this.f == h111Var.f && jl40.l(this.g, h111Var.g) && this.h == h111Var.h && jl40.l(this.i, h111Var.i) && this.j.equals(h111Var.j);
    }

    public final int hashCode() {
        UiStateDrawableWrapper uiStateDrawableWrapper = this.a;
        int hashCode = (uiStateDrawableWrapper == null ? 0 : uiStateDrawableWrapper.hashCode()) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper2 = this.b;
        int b = smw0.b(smw0.b((hashCode + (uiStateDrawableWrapper2 == null ? 0 : uiStateDrawableWrapper2.hashCode())) * 31, 31, this.c), 31, this.d);
        kdc kdcVar = this.e;
        int hashCode2 = (this.h.hashCode() + smw0.b(unr0.e((b + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        return this.j.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportCardUiState(cardDrawable=");
        sb.append(this.a);
        sb.append(", cardStatusDrawable=");
        sb.append(this.b);
        sb.append(", cardText=");
        vfc.A(sb, this.c, ", cardAccessibilityText=", this.d, ", textColor=");
        sb.append(this.e);
        sb.append(", isActive=");
        sb.append(this.f);
        sb.append(", cardLoadingText=");
        sb.append((Object) this.g);
        sb.append(", cardAction=");
        sb.append(this.h);
        sb.append(", deeplink=");
        sb.append(this.i);
        sb.append(", analyticsData=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
