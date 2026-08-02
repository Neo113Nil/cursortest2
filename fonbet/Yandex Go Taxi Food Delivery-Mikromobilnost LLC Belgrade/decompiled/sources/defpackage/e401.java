package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class e401 {
    public final FormattedText a;
    public final c4v b;
    public final kdc c;

    public e401(FormattedText formattedText, c4v c4vVar, kdc kdcVar) {
        this.a = formattedText;
        this.b = c4vVar;
        this.c = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e401)) {
            return false;
        }
        e401 e401Var = (e401) obj;
        return jl40.l(this.a, e401Var.a) && jl40.l(this.b, e401Var.b) && jl40.l(this.c, e401Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        kdc kdcVar = this.c;
        return hashCode + (kdcVar == null ? 0 : kdcVar.hashCode());
    }

    public final String toString() {
        return "TrackingCardPopUp(title=" + this.a + ", icon=" + this.b + ", background=" + this.c + Extension.C_BRAKE;
    }
}
