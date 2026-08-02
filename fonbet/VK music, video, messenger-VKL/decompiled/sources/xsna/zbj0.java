package xsna;

import java.util.ArrayList;

/* compiled from: ClipsUploadScreenViewState.kt */
/* loaded from: classes17.dex */
public final class zbj0 {
    public final fze a;
    public final ArrayList b;
    public final Integer c;

    public zbj0(fze fzeVar, ArrayList arrayList, Integer num) {
        this.a = fzeVar;
        this.b = arrayList;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbj0)) {
            return false;
        }
        zbj0 zbj0Var = (zbj0) obj;
        return epx.f(this.a, zbj0Var.a) && this.b.equals(zbj0Var.b) && epx.f(this.c, zbj0Var.c);
    }

    public final int hashCode() {
        fze fzeVar = this.a;
        int a = qr.a(this.b, (fzeVar == null ? 0 : fzeVar.hashCode()) * 31, 31);
        Integer num = this.c;
        return a + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharingOptionsBlock(banner=");
        sb.append(this.a);
        sb.append(", items=");
        kr.d(this.b, sb, ", scrollToIndex=");
        return uqi.b(sb, this.c, ')');
    }
}
