package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.NeuroPostcardButtonModel$ButtonSizeModel;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.NeuroPostcardButtonModel$ButtonStyleModel;

/* loaded from: classes5.dex */
public final class a360 {
    public final CharSequence a;
    public final CharSequence b;
    public final NeuroPostcardButtonModel$ButtonStyleModel c;
    public final NeuroPostcardButtonModel$ButtonSizeModel d;
    public final y260 e;
    public final String f;

    public a360(CharSequence charSequence, CharSequence charSequence2, NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel, NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel, y260 y260Var, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = neuroPostcardButtonModel$ButtonStyleModel;
        this.d = neuroPostcardButtonModel$ButtonSizeModel;
        this.e = y260Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a360)) {
            return false;
        }
        a360 a360Var = (a360) obj;
        return jl40.l(this.a, a360Var.a) && jl40.l(this.b, a360Var.b) && this.c == a360Var.c && this.d == a360Var.d && jl40.l(this.e, a360Var.e) && jl40.l(this.f, a360Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31;
        y260 y260Var = this.e;
        int hashCode3 = (hashCode2 + (y260Var == null ? 0 : y260Var.hashCode())) * 31;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "NeuroPostcardButtonModel(title=", ", subtitle=", ", style=");
        r.append(this.c);
        r.append(", size=");
        r.append(this.d);
        r.append(", action=");
        r.append(this.e);
        r.append(", metricaLabel=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
