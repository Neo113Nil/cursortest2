package xsna;

import java.util.ArrayList;

/* compiled from: TemplateDetailsViewState.kt */
/* loaded from: classes3.dex */
public final class i4m {
    public final h4m a;
    public final h4m b;
    public final ArrayList c;

    public i4m(h4m h4mVar, h4m h4mVar2, ArrayList arrayList) {
        this.a = h4mVar;
        this.b = h4mVar2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4m)) {
            return false;
        }
        i4m i4mVar = (i4m) obj;
        return this.a.equals(i4mVar.a) && this.b.equals(i4mVar.b) && this.c.equals(i4mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailsContentViewState(title=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", templates=");
        return bo.c(')', sb, this.c);
    }
}
