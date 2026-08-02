package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class mee0 {
    public static final lee0 Companion = new lee0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(0))};
    public final String a;
    public final ilk b;
    public final List c;

    public /* synthetic */ mee0(int i, String str, ilk ilkVar, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, kee0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = ilkVar;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mee0)) {
            return false;
        }
        mee0 mee0Var = (mee0) obj;
        return jl40.l(this.a, mee0Var.a) && jl40.l(this.b, mee0Var.b) && jl40.l(this.c, mee0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostMessageAction(messageName=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", parametersMapping=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
