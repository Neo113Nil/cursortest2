package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pbw {
    public final String a;
    public final String b;
    public final List c;

    public pbw(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbw)) {
            return false;
        }
        pbw pbwVar = (pbw) obj;
        return jl40.l(this.a, pbwVar.a) && this.b.equals(pbwVar.b) && jl40.l(this.c, pbwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("IntercityDashboardCommentSuggestsModalPayload(title=", this.a, ", comment=", this.b, ", suggests="), this.c, Extension.C_BRAKE);
    }
}
