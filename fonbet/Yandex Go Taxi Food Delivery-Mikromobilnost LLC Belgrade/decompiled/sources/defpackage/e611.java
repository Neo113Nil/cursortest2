package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e611 implements h711 {
    public final CharSequence a;
    public final CharSequence b;
    public final h911 c;
    public final String d;

    public e611(CharSequence charSequence, CharSequence charSequence2, h911 h911Var, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = h911Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e611)) {
            return false;
        }
        e611 e611Var = (e611) obj;
        return this.a.equals(e611Var.a) && jl40.l(this.b, e611Var.b) && this.c.equals(e611Var.c) && this.d.equals(e611Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.c;
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "BadgeWithSubtitleItem(badge=", ", subtitle=", ", transportType=");
        r.append(this.c);
        r.append(", id=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
