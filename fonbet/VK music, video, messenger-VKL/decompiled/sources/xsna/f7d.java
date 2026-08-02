package xsna;

import java.util.ArrayList;

/* compiled from: ClipListData.kt */
/* loaded from: classes18.dex */
public final class f7d {
    public final ArrayList a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;

    public f7d(ArrayList arrayList, String str, long j, long j2, long j3) {
        this.a = arrayList;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7d)) {
            return false;
        }
        f7d f7dVar = (f7d) obj;
        return this.a.equals(f7dVar.a) && epx.f(this.b, f7dVar.b) && this.c == f7dVar.c && this.d == f7dVar.d && this.e == f7dVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.e) + bh10.a(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipListData(clips=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        sb.append(this.b);
        sb.append(", clipsCount=");
        sb.append(this.c);
        sb.append(", viewsCount=");
        sb.append(this.d);
        sb.append(", likesCount=");
        return vu5.a(')', this.e, sb);
    }
}
