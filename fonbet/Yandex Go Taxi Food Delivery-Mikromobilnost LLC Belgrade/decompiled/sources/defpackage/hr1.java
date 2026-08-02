package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.widget.dialog.Toggleable;

/* loaded from: classes13.dex */
public final class hr1 {
    public final Toggleable a;
    public final Toggleable b;
    public final String c;
    public final CharSequence d;
    public final CharSequence e;
    public final q1c f;
    public final q1c g;
    public final tls h;
    public final sls i;

    public hr1(Toggleable toggleable, Toggleable toggleable2, String str, CharSequence charSequence, CharSequence charSequence2, q1c q1cVar, q1c q1cVar2, tls tlsVar, sls slsVar, int i) {
        toggleable = (i & 1) != 0 ? Toggleable.OFF : toggleable;
        toggleable2 = (i & 2) != 0 ? Toggleable.ON : toggleable2;
        str = (i & 4) != 0 ? null : str;
        charSequence = (i & 8) != 0 ? null : charSequence;
        charSequence2 = (i & 16) != 0 ? null : charSequence2;
        q1cVar = (i & 32) != 0 ? null : q1cVar;
        q1cVar2 = (i & 64) != 0 ? null : q1cVar2;
        tlsVar = (i & 128) != 0 ? null : tlsVar;
        slsVar = (i & 256) != 0 ? null : slsVar;
        this.a = toggleable;
        this.b = toggleable2;
        this.c = str;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = q1cVar;
        this.g = q1cVar2;
        this.h = tlsVar;
        this.i = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr1)) {
            return false;
        }
        hr1 hr1Var = (hr1) obj;
        return this.a == hr1Var.a && this.b == hr1Var.b && jl40.l(this.c, hr1Var.c) && jl40.l(this.d, hr1Var.d) && jl40.l(this.e, hr1Var.e) && jl40.l(this.f, hr1Var.f) && jl40.l(this.g, hr1Var.g) && jl40.l(this.h, hr1Var.h) && jl40.l(this.i, hr1Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        q1c q1cVar = this.f;
        int hashCode5 = (hashCode4 + (q1cVar == null ? 0 : q1cVar.hashCode())) * 31;
        q1c q1cVar2 = this.g;
        int hashCode6 = (hashCode5 + (q1cVar2 == null ? 0 : q1cVar2.hashCode())) * 31;
        tls tlsVar = this.h;
        int hashCode7 = (hashCode6 + (tlsVar == null ? 0 : tlsVar.hashCode())) * 31;
        sls slsVar = this.i;
        return hashCode7 + (slsVar != null ? slsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlertDialogUiState(backButton=");
        sb.append(this.a);
        sb.append(", dismissOnTouchOutside=");
        sb.append(this.b);
        sb.append(", iconTag=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append((Object) this.d);
        sb.append(", description=");
        sb.append((Object) this.e);
        sb.append(", additionalButton=");
        sb.append(this.f);
        sb.append(", mainButton=");
        sb.append(this.g);
        sb.append(", onAttach=");
        sb.append(this.h);
        sb.append(", onDetach=");
        return ly3.r(sb, this.i, Extension.C_BRAKE);
    }

    public hr1() {
        this(null, null, null, null, null, null, null, null, null, 511);
    }
}
