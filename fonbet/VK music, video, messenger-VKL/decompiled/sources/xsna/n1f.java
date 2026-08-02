package xsna;

import java.util.ArrayList;

/* compiled from: ClipsReportViewState.kt */
/* loaded from: classes16.dex */
public final class n1f {
    public final ArrayList a;
    public final boolean b;

    public n1f(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1f)) {
            return false;
        }
        n1f n1fVar = (n1f) obj;
        return this.a.equals(n1fVar.a) && this.b == n1fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsReportViewState(items=");
        sb.append(this.a);
        sb.append(", isSendButtonEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
