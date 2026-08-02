package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lsc {
    public final String a;
    public final Drawable b;
    public final CharSequence c;
    public final CharSequence d;
    public final ksc e;
    public final sls f;

    public lsc(String str, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, ksc kscVar, sls slsVar) {
        this.a = str;
        this.b = drawable;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = kscVar;
        this.f = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc)) {
            return false;
        }
        lsc lscVar = (lsc) obj;
        return jl40.l(this.a, lscVar.a) && jl40.l(this.b, lscVar.b) && jl40.l(this.c, lscVar.c) && jl40.l(this.d, lscVar.d) && jl40.l(this.e, lscVar.e) && jl40.l(this.f, lscVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.e(smw0.b(smw0.b((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.c), 31, this.d), 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunicationItemUiState(id=");
        sb.append(this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", showProgressAnimation=false, trail=");
        sb.append(this.e);
        sb.append(", clickCallback=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
