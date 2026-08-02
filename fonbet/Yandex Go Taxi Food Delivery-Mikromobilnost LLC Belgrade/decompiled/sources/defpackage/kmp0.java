package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkmp0;", "", "Companion", "imp0", "jmp0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class kmp0 {
    public static final jmp0 Companion = new jmp0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(25))};
    public final boolean a;
    public final List b;

    public /* synthetic */ kmp0(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmp0)) {
            return false;
        }
        kmp0 kmp0Var = (kmp0) obj;
        return this.a == kmp0Var.a && jl40.l(this.b, kmp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SdcRouteResponse(useMapkit=" + this.a + ", paths=" + this.b + Extension.C_BRAKE;
    }

    public kmp0() {
        this.a = true;
        this.b = EmptyList.a;
    }
}
