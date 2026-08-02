package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ButtonSize;

/* loaded from: classes5.dex */
public final class et implements pre, pru {
    public final String a;
    public final ButtonSize b;
    public final n37 c;
    public final n37 d;
    public final r9x0 e;
    public final x2s f;

    public et(String str, ButtonSize buttonSize, n37 n37Var, n37 n37Var2, r9x0 r9x0Var, x2s x2sVar) {
        this.a = str;
        this.b = buttonSize;
        this.c = n37Var;
        this.d = n37Var2;
        this.e = r9x0Var;
        this.f = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return jl40.l(this.a, etVar.a) && this.b == etVar.b && this.c.equals(etVar.c) && jl40.l(this.d, etVar.d) && this.e.equals(etVar.e) && this.f.equals(etVar.f);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "action-button";
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        n37 n37Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (n37Var == null ? 0 : n37Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonRemoteCoreWidget(id=" + this.a + ", buttonSize=" + this.b + ", normalStyle=" + this.c + ", loadingStyle=" + this.d + ", action=" + this.e + ", analyticsData=" + this.f + Extension.C_BRAKE;
    }
}
