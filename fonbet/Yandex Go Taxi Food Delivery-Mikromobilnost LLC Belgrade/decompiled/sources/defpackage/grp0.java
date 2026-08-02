package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class grp0 extends jnl {
    public final Map c;

    public grp0(Map map) {
        super("Common", (Object) null);
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grp0) && this.c.equals(((grp0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode() + 624333936;
    }

    public final String toString() {
        return nnm.j("Common(name=tech.zxing_used, parameters=", Extension.C_BRAKE, this.c);
    }
}
