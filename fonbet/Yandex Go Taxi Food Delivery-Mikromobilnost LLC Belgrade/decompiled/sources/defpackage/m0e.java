package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.ConfigurationType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lm0e;", "Lt0e;", "Companion", "k0e", "l0e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class m0e extends t0e {
    public static final l0e Companion = new l0e();
    public final String a;

    public m0e(int i) {
        this.a = "";
    }

    @Override // defpackage.t0e
    public final ConfigurationType a() {
        return ConfigurationType.LIST;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0e) && jl40.l(this.a, ((m0e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("List(backgroundColor=", this.a, Extension.C_BRAKE);
    }

    public m0e() {
        this(0);
    }

    public m0e(Object obj) {
        this.a = "";
    }
}
