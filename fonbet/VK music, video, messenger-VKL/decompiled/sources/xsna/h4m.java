package xsna;

import xsna.tlo0;

/* compiled from: TemplateDetailsViewState.kt */
/* loaded from: classes3.dex */
public final class h4m {
    public final String a;
    public final tlo0 b;

    public h4m(String str, tlo0.g gVar) {
        this.a = str;
        this.b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4m)) {
            return false;
        }
        h4m h4mVar = (h4m) obj;
        return epx.f(this.a, h4mVar.a) && epx.f(this.b, h4mVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        tlo0 tlo0Var = this.b;
        return hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailsContentField(text=");
        sb.append(this.a);
        sb.append(", errorText=");
        return bt.a(sb, this.b, ')');
    }
}
