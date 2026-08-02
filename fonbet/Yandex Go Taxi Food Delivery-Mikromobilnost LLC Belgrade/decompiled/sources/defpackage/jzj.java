package defpackage;

import android.text.SpannedString;

/* loaded from: classes2.dex */
public final class jzj implements bwg {
    public final String a;
    public final SpannedString b;

    public jzj(String str, SpannedString spannedString) {
        this.a = str;
        this.b = spannedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzj)) {
            return false;
        }
        jzj jzjVar = (jzj) obj;
        return jl40.l(this.a, jzjVar.a) && this.b.equals(jzjVar.b);
    }

    @Override // defpackage.bwg
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LogDisplayModel(id=" + this.a + ", content=" + ((Object) this.b) + ')';
    }
}
