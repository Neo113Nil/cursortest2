package xsna;

import java.util.ArrayList;

/* compiled from: ClipsUploadScreenViewState.kt */
/* loaded from: classes17.dex */
public final class adk {
    public final ldf a;
    public final ArrayList b;

    public adk(ldf ldfVar, ArrayList arrayList) {
        this.a = ldfVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adk)) {
            return false;
        }
        adk adkVar = (adk) obj;
        return this.a.equals(adkVar.a) && this.b.equals(adkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatorBlock(authorsState=");
        sb.append(this.a);
        sb.append(", belowAuthorItems=");
        return bo.c(')', sb, this.b);
    }
}
