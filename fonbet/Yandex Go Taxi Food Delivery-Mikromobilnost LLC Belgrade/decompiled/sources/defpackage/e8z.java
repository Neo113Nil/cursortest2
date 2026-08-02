package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class e8z {
    public final long a;
    public final List b;

    public e8z(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8z)) {
            return false;
        }
        e8z e8zVar = (e8z) obj;
        return this.a == e8zVar.a && jl40.l(this.b, e8zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LocationDiagnosticJournalUpdateModel(updateTime=" + this.a + ", coordinates=" + this.b + Extension.C_BRAKE;
    }
}
