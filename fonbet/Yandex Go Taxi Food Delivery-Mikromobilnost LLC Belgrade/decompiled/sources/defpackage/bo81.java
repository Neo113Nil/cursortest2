package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bo81 {
    public final List a;
    public final List b;

    public bo81(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo81)) {
            return false;
        }
        bo81 bo81Var = (bo81) obj;
        return this.a.equals(bo81Var.a) && jl40.l(this.b, bo81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("DebugPanelLogsData(sdkLogs=", this.a, ", networkLogs=", this.b, Extension.C_BRAKE);
    }
}
