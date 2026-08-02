package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class i3l0 {
    public static final i3l0 c = new i3l0((f1z) null, 3);
    public final f1z a;
    public final List b;

    public /* synthetic */ i3l0(f1z f1zVar, int i) {
        this((i & 1) != 0 ? e1z.a : f1zVar, EmptyList.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3l0)) {
            return false;
        }
        i3l0 i3l0Var = (i3l0) obj;
        return jl40.l(this.a, i3l0Var.a) && jl40.l(this.b, i3l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteEta(loadingState=" + this.a + ", routes=" + this.b + Extension.C_BRAKE;
    }

    public i3l0(f1z f1zVar, List list) {
        this.a = f1zVar;
        this.b = list;
    }

    public i3l0() {
        this((f1z) null, 3);
    }
}
