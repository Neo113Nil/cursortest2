package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d711 implements h711 {
    public final String a;
    public final SpannableStringBuilder b;
    public final String c;
    public final obm d;
    public final CharSequence e;
    public final String f;
    public final String g;

    public d711(String str, SpannableStringBuilder spannableStringBuilder, String str2, obm obmVar, CharSequence charSequence, String str3, String str4) {
        this.a = str;
        this.b = spannableStringBuilder;
        this.c = str2;
        this.d = obmVar;
        this.e = charSequence;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d711)) {
            return false;
        }
        d711 d711Var = (d711) obj;
        if (!jl40.l(this.a, d711Var.a) || !this.b.equals(d711Var.b) || !jl40.l(this.c, d711Var.c) || !jl40.l(this.d, d711Var.d) || !jl40.l(this.e, d711Var.e) || !this.f.equals(d711Var.f)) {
            return false;
        }
        f911 f911Var = f911.a;
        return f911Var.equals(f911Var) && this.g.equals(d711Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.c);
        obm obmVar = this.d;
        int hashCode = (b + (obmVar == null ? 0 : obmVar.a.hashCode())) * 31;
        CharSequence charSequence = this.e;
        return this.g.hashCode() + ((((this.f.hashCode() + ((hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31)) * 31) + 1831550193) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return f911.a;
    }

    public final String toString() {
        return "TransferStopItem(title=" + this.a + ", subtitle=" + ((Object) this.b) + ", time=" + this.c + ", iconRes=null, iconDrawableState=" + this.d + ", exit=" + ((Object) this.e) + ", contentDescription=" + this.f + ", transportType=" + f911.a + ", id=" + this.g + Extension.C_BRAKE;
    }
}
