package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityNameHistoryState.kt */
/* loaded from: classes5.dex */
public final class wah implements km50 {
    public final boolean b;
    public final String c;
    public final Throwable d;
    public final boolean e;
    public final List<uah> f;

    public wah() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static wah a(wah wahVar, boolean z, String str, Throwable th, boolean z2, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = wahVar.b;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            str = wahVar.c;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            th = wahVar.d;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z2 = wahVar.e;
        }
        boolean z4 = z2;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = wahVar.f;
        }
        wahVar.getClass();
        return new wah(z3, str2, th2, z4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wah)) {
            return false;
        }
        wah wahVar = (wah) obj;
        return this.b == wahVar.b && epx.f(this.c, wahVar.c) && epx.f(this.d, wahVar.d) && this.e == wahVar.e && epx.f(this.f, wahVar.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.d;
        return this.f.hashCode() + qoy.b((hashCode2 + (th != null ? th.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityNameHistoryState(isLoading=");
        sb.append(this.b);
        sb.append(", nextId=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", isRefreshing=");
        sb.append(this.e);
        sb.append(", items=");
        return ms9.a(')', sb, this.f);
    }

    public wah(boolean z, String str, Throwable th, boolean z2, List<uah> list) {
        this.b = z;
        this.c = str;
        this.d = th;
        this.e = z2;
        this.f = list;
    }

    public wah(int i) {
        this(false, null, null, false, EmptyList.b);
    }
}
