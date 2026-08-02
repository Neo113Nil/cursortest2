package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.net.taxi.dto.request.EmailParam$Action;

@gsq0
/* loaded from: classes9.dex */
public final class bsn {
    public static final asn Companion = new asn();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(17)), null};
    public final String a;
    public final EmailParam$Action b;
    public final String c;

    public /* synthetic */ bsn(int i, String str, EmailParam$Action emailParam$Action, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, yrn.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = emailParam$Action;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsn)) {
            return false;
        }
        bsn bsnVar = (bsn) obj;
        return jl40.l(this.a, bsnVar.a) && this.b == bsnVar.b && jl40.l(this.c, bsnVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailParam(sessionId=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", email=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public bsn(String str, EmailParam$Action emailParam$Action, String str2) {
        this.a = str;
        this.b = emailParam$Action;
        this.c = str2;
    }
}
