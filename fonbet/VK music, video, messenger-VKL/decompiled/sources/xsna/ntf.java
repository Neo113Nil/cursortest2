package xsna;

import xsna.uuf;

/* compiled from: ClipsWrapperSearchButtonMviState.kt */
/* loaded from: classes17.dex */
public final class ntf implements km50, uuf.d.c {
    public final vob b;
    public final boolean c;

    public ntf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntf)) {
            return false;
        }
        ntf ntfVar = (ntf) obj;
        return epx.f(this.b, ntfVar.b) && this.c == ntfVar.c;
    }

    public final int hashCode() {
        vob vobVar = this.b;
        return Boolean.hashCode(this.c) + ((vobVar == null ? 0 : vobVar.hashCode()) * 31);
    }

    @Override // xsna.uuf.d
    public final ppf o() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperSearchButtonMviState(button=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ ntf(int i) {
        this(null, true);
    }

    public ntf(vob vobVar, boolean z) {
        this.b = vobVar;
        this.c = z;
    }
}
