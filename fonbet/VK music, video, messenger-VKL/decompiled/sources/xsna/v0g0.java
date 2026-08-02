package xsna;

import android.content.Context;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class v0g0 extends n3a {
    public final hba a;
    public final Context b;

    public v0g0(hba hbaVar, Context context) {
        this.a = hbaVar;
        this.b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0g0)) {
            return false;
        }
        v0g0 v0g0Var = (v0g0) obj;
        return epx.f(this.a, v0g0Var.a) && epx.f(this.b, v0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplaceBlocksWithProgressDialog(replacementId=" + this.a + ", context=" + this.b + ')';
    }
}
