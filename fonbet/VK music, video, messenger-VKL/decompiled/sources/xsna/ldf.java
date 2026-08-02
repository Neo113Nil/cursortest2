package xsna;

import java.util.ArrayList;

/* compiled from: ClipsUploadAuthorsViewState.kt */
/* loaded from: classes17.dex */
public final class ldf {
    public final ArrayList a;
    public final s61 b;
    public final long c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public ldf(ArrayList arrayList, s61 s61Var, long j, boolean z, int i, boolean z2, boolean z3) {
        this.a = arrayList;
        this.b = s61Var;
        this.c = j;
        this.d = z;
        this.e = i;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldf)) {
            return false;
        }
        ldf ldfVar = (ldf) obj;
        return this.a.equals(ldfVar.a) && epx.f(this.b, ldfVar.b) && this.c == ldfVar.c && this.d == ldfVar.d && this.e == ldfVar.e && this.f == ldfVar.f && this.g == ldfVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s61 s61Var = this.b;
        return Boolean.hashCode(this.g) + qoy.b(shy.a(this.e, qoy.b(bh10.a((hashCode + (s61Var == null ? 0 : s61Var.hashCode())) * 31, 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadAuthorsViewState(authors=");
        kr.d(this.a, sb, ", afterAuthorsButton=");
        sb.append(this.b);
        sb.append(", selectedAuthorId=");
        sb.append(this.c);
        sb.append(", hasNext=");
        sb.append(this.d);
        sb.append(", nameMaxLines=");
        sb.append(this.e);
        sb.append(", scrollToFirstIfChangedEnabled=");
        sb.append(this.f);
        sb.append(", showAlwaysAuthorsList=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
