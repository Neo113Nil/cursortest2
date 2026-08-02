package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.communications.model.TextAlign;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj0e;", "Lt0e;", "Companion", "h0e", "i0e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j0e extends t0e {
    public static final i0e Companion = new i0e();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new kpd(27)), null};
    public final String a;
    public final TextAlign b;
    public final Boolean c;

    public j0e(int i, String str, TextAlign textAlign, Boolean bool) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = TextAlign.START;
        } else {
            this.b = textAlign;
        }
        if ((i & 4) == 0) {
            this.c = Boolean.FALSE;
        } else {
            this.c = bool;
        }
    }

    @Override // defpackage.t0e
    public final ConfigurationType a() {
        return ConfigurationType.DIALOGUE;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0e)) {
            return false;
        }
        j0e j0eVar = (j0e) obj;
        return jl40.l(this.a, j0eVar.a) && this.b == j0eVar.b && jl40.l(this.c, j0eVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Boolean bool = this.c;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dialogue(backgroundColor=");
        sb.append(this.a);
        sb.append(", titleAlign=");
        sb.append(this.b);
        sb.append(", ignoreMaxCommunicationsCount=");
        return nzs.d(sb, this.c, Extension.C_BRAKE);
    }

    public j0e() {
        TextAlign textAlign = TextAlign.START;
        Boolean bool = Boolean.FALSE;
        this.a = "";
        this.b = textAlign;
        this.c = bool;
    }
}
