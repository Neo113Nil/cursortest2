package xsna;

import java.util.ArrayList;

/* compiled from: ClipsFavoriteFoldersResponse.kt */
/* loaded from: classes16.dex */
public final class b4e {
    public final ArrayList a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public b4e(ArrayList arrayList, String str, int i, int i2, int i3) {
        this.a = arrayList;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4e)) {
            return false;
        }
        b4e b4eVar = (b4e) obj;
        return this.a.equals(b4eVar.a) && epx.f(this.b, b4eVar.b) && this.c == b4eVar.c && this.d == b4eVar.d && this.e == b4eVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFavoriteFoldersResponse(items=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        sb.append(this.b);
        sb.append(", totalFoldersCount=");
        sb.append(this.c);
        sb.append(", maxAllowedFoldersCount=");
        sb.append(this.d);
        sb.append(", maxClipsInFolderCount=");
        return vu5.b(sb, this.e, ')');
    }
}
