package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ContactSelectorRemoteCoreWidget$ContactPositionModel;

/* loaded from: classes5.dex */
public final class oae extends n351 {
    public final String c;
    public final CharSequence d;
    public final ContactSelectorRemoteCoreWidget$ContactPositionModel e;
    public final dty0 f;
    public final hts0 g;
    public final jvs0 h;
    public final l690 i;
    public final x2s j;
    public final jbq0 k;
    public final String l;

    public oae(String str, CharSequence charSequence, ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel, dty0 dty0Var, hts0 hts0Var, jvs0 jvs0Var, l690 l690Var, x2s x2sVar, jbq0 jbq0Var, String str2) {
        super("contact", false, 14);
        this.c = str;
        this.d = charSequence;
        this.e = contactSelectorRemoteCoreWidget$ContactPositionModel;
        this.f = dty0Var;
        this.g = hts0Var;
        this.h = jvs0Var;
        this.i = l690Var;
        this.j = x2sVar;
        this.k = jbq0Var;
        this.l = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oae)) {
            return false;
        }
        oae oaeVar = (oae) obj;
        return jl40.l(this.c, oaeVar.c) && jl40.l(this.d, oaeVar.d) && this.e == oaeVar.e && jl40.l(this.f, oaeVar.f) && jl40.l(this.g, oaeVar.g) && jl40.l(this.h, oaeVar.h) && this.i.equals(oaeVar.i) && jl40.l(this.j, oaeVar.j) && this.k.equals(oaeVar.k) && jl40.l(this.l, oaeVar.l);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31;
        dty0 dty0Var = this.f;
        int hashCode3 = (hashCode2 + (dty0Var == null ? 0 : dty0Var.hashCode())) * 31;
        hts0 hts0Var = this.g;
        int hashCode4 = (hashCode3 + (hts0Var == null ? 0 : hts0Var.hashCode())) * 31;
        jvs0 jvs0Var = this.h;
        int hashCode5 = (this.k.hashCode() + tse0.a(this.j, (this.i.hashCode() + ((hashCode4 + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31)) * 31, 31)) * 31;
        String str2 = this.l;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.d, "ContactModel(contact=", this.c, ", description=", ", contactPosition=");
        t.append(this.e);
        t.append(", contactStyle=");
        t.append(this.f);
        t.append(", lead=");
        t.append(this.g);
        t.append(", trail=");
        t.append(this.h);
        t.append(", horizontalPaddings=");
        t.append(this.i);
        t.append(", onShownAnalyticsData=");
        t.append(this.j);
        t.append(", widgetAction=");
        t.append(this.k);
        t.append(", id=");
        t.append(this.l);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
