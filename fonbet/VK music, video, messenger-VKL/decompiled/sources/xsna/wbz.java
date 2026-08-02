package xsna;

import java.util.ArrayList;

/* compiled from: LinkVKBidScreenContent.kt */
/* loaded from: classes18.dex */
public final class wbz {
    public final ArrayList a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public wbz(ArrayList arrayList, int i, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbz)) {
            return false;
        }
        wbz wbzVar = (wbz) obj;
        return this.a.equals(wbzVar.a) && this.b == wbzVar.b && this.c == wbzVar.c && this.d == wbzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkVKBidScreenContent(profiles=");
        kr.d(this.a, sb, ", selectedProfileIndex=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", isLinkButtonEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
