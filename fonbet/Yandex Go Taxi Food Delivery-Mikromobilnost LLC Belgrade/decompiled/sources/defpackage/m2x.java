package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class m2x extends w2x {
    public final g28 b;
    public final boolean c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2x(g28 g28Var, boolean z) {
        super(ViewType.CANDIDATE_TO_SAVE);
        String id = g28Var.e.getId();
        this.b = g28Var;
        this.c = z;
        this.d = id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2x)) {
            return false;
        }
        m2x m2xVar = (m2x) obj;
        return jl40.l(this.b, m2xVar.b) && this.c == m2xVar.c && jl40.l(this.d, m2xVar.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CandidateToSave(address=");
        sb.append(this.b);
        sb.append(", withDivider=");
        sb.append(this.c);
        sb.append(", id=");
        return oyr.t(sb, this.d, Extension.C_BRAKE);
    }
}
