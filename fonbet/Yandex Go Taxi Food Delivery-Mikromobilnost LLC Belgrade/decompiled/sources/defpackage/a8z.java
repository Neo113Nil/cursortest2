package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a8z {
    public final int a;
    public final long b;
    public final List c;

    public a8z(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8z)) {
            return false;
        }
        a8z a8zVar = (a8z) obj;
        return this.a == a8zVar.a && this.b == a8zVar.b && jl40.l(this.c, a8zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "LocationDiagnosticJournalItemUiState(index=" + this.a + ", date=" + this.b + ", coordinates=" + this.c + Extension.C_BRAKE;
    }
}
