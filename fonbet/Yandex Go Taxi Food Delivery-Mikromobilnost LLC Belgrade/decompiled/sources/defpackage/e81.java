package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le81;", "", "Companion", "c81", "d81", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class e81 {
    public static final d81 Companion = new d81();
    public final h81 a;
    public final k81 b;

    public /* synthetic */ e81(int i, h81 h81Var, k81 k81Var) {
        this.a = (i & 1) == 0 ? new h81(0) : h81Var;
        if ((i & 2) == 0) {
            this.b = new k81(0);
        } else {
            this.b = k81Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e81)) {
            return false;
        }
        e81 e81Var = (e81) obj;
        return jl40.l(this.a, e81Var.a) && jl40.l(this.b, e81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressTopDescription(geoPointTopDescription=" + this.a + ", regularTopDescription=" + this.b + Extension.C_BRAKE;
    }

    public e81() {
        this(0);
    }

    public e81(int i) {
        h81 h81Var = new h81(0);
        k81 k81Var = new k81(0);
        this.a = h81Var;
        this.b = k81Var;
    }
}
