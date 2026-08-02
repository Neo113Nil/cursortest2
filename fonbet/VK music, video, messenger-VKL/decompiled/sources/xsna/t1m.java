package xsna;

import java.util.ArrayList;

/* compiled from: ClipsUploadScreenViewState.kt */
/* loaded from: classes17.dex */
public final class t1m {
    public final ArrayList a;
    public final ief b;
    public final ArrayList c;

    public t1m(ArrayList arrayList, ief iefVar, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = iefVar;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1m)) {
            return false;
        }
        t1m t1mVar = (t1m) obj;
        return this.a.equals(t1mVar.a) && this.b.equals(t1mVar.b) && this.c.equals(t1mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionBlock(aboveDescriptionData=");
        kr.d(this.a, sb, ", descriptionState=");
        sb.append(this.b);
        sb.append(", belowDescriptionItems=");
        return bo.c(')', sb, this.c);
    }
}
