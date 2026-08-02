package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class bq90 {
    public static final aq90 Companion = new aq90();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(4))};
    public final q5o a;

    public /* synthetic */ bq90(int i, q5o q5oVar) {
        if (1 == (i & 1)) {
            this.a = q5oVar;
        } else {
            qje.Z(i, 1, zp90.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return bq90.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((bq90) obj).a);
    }

    public final int hashCode() {
        q5o q5oVar = this.a;
        if (q5oVar != null) {
            return q5oVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Patch(patch=" + this.a + Extension.C_BRAKE;
    }
}
