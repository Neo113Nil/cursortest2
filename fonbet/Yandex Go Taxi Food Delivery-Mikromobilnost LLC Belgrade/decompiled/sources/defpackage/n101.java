package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes12.dex */
public final class n101 {
    public final UiStateDrawableWrapper a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public n101(UiStateDrawableWrapper uiStateDrawableWrapper, CharSequence charSequence, CharSequence charSequence2, List list, boolean z, boolean z2) {
        this.a = uiStateDrawableWrapper;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n101)) {
            return false;
        }
        n101 n101Var = (n101) obj;
        return jl40.l(this.a, n101Var.a) && jl40.l(this.b, n101Var.b) && jl40.l(this.c, n101Var.c) && this.d.equals(n101Var.d) && this.e == n101Var.e && this.f == n101Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return Boolean.hashCode(this.f) + unr0.e(unr0.c((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackableAcceptanceModalUiState(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", content=");
        sb.append((Object) this.c);
        sb.append(", buttons=");
        sb.append(this.d);
        sb.append(", showCloseButton=");
        return smw0.k(", hasAcceptButton=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
