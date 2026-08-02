package defpackage;

import android.text.SpannedString;

/* loaded from: classes2.dex */
public final class izj implements bwg {
    public final String a;
    public final SpannedString b;

    public izj(String str, SpannedString spannedString) {
        this.a = str;
        this.b = spannedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izj)) {
            return false;
        }
        izj izjVar = (izj) obj;
        return jl40.l(this.a, izjVar.a) && this.b.equals(izjVar.b);
    }

    @Override // defpackage.bwg
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoDisplayModel(id=" + this.a + ", content=" + ((Object) this.b) + ')';
    }
}
