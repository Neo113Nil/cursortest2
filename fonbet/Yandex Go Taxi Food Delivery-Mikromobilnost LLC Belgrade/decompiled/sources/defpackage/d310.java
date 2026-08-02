package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld310;", "Lhd90;", "Companion", "c310", "b310", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class d310 implements hd90 {
    public static final c310 Companion = new c310();
    public final boolean b;
    public final String c;

    public /* synthetic */ d310(int i, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d310)) {
            return false;
        }
        d310 d310Var = (d310) obj;
        return this.b == d310Var.b && jl40.l(this.c, d310Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return xvz.m("MasstransitMapLayersConfigDto(enabled=", this.b, ", mapStyle=", this.c, Extension.C_BRAKE);
    }

    public d310() {
        this.b = false;
        this.c = "";
    }
}
