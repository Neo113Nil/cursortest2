package xsna;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: ClipsPickerResponse.kt */
/* loaded from: classes16.dex */
public final class xpe {
    public final ArrayList a;
    public final Set<String> b;
    public final String c;

    public xpe(ArrayList arrayList, Set set, String str) {
        this.a = arrayList;
        this.b = set;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpe)) {
            return false;
        }
        xpe xpeVar = (xpe) obj;
        return this.a.equals(xpeVar.a) && epx.f(this.b, xpeVar.b) && epx.f(this.c, xpeVar.c);
    }

    public final int hashCode() {
        int b = fw3.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPickerResponse(videoFiles=");
        sb.append(this.a);
        sb.append(", selectedIds=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
