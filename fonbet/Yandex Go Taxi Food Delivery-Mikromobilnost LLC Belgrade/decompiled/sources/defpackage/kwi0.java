package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class kwi0 implements bnr0 {
    public final List a;

    public kwi0(List list) {
        this.a = list;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof kwi0)) {
            return this;
        }
        return new kwi0(a.m0(((kwi0) bnr0Var).a, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return kwi0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((kwi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("RemoteTrackersSharedData(trackers=", Extension.C_BRAKE, this.a);
    }
}
