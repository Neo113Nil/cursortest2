package xsna;

import xsna.mno0;

/* compiled from: SimilarVideoUiState.kt */
/* loaded from: classes7.dex */
public final class doj0 {
    public final mno0 a;
    public final String b;
    public final boolean c;

    public doj0(mno0.i iVar, String str, boolean z) {
        this.a = iVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doj0)) {
            return false;
        }
        doj0 doj0Var = (doj0) obj;
        return epx.f(this.a, doj0Var.a) && epx.f(this.b, doj0Var.b) && this.c == doj0Var.c;
    }

    public final int hashCode() {
        mno0 mno0Var = this.a;
        int hashCode = (mno0Var == null ? 0 : mno0Var.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarVideoAuthor(channelName=");
        sb.append(this.a);
        sb.append(", ownerPhoto=");
        sb.append(this.b);
        sb.append(", isVerified=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
