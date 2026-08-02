package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class lmi0 {
    public static final kmi0 Companion = new kmi0();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final String c;
    public final Boolean d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new hkg0(21)), a.b(lazyThreadSafetyMode, new hkg0(22)), null, null};
    }

    public /* synthetic */ lmi0(int i, List list, List list2, String str, Boolean bool) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, jmi0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmi0)) {
            return false;
        }
        lmi0 lmi0Var = (lmi0) obj;
        return jl40.l(this.a, lmi0Var.a) && jl40.l(this.b, lmi0Var.b) && jl40.l(this.c, lmi0Var.c) && jl40.l(this.d, lmi0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder v = qv10.v("RedirectionConfigResponseDto(features=", this.a, ", hostApps=", this.b, ", merchantId=");
        v.append(this.c);
        v.append(", chromeTabEnabled=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
