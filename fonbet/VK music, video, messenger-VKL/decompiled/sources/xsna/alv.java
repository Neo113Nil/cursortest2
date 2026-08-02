package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: HttpUrlPostCall.kt */
/* loaded from: classes.dex */
public final class alv {
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final gzs<okhttp3.t> e;
    public final List<gnk> f;

    public alv() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public alv(String str, long j, int i, int i2, gzs<? extends okhttp3.t> gzsVar, List<gnk> list) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = gzsVar;
        this.f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static alv a(alv alvVar, String str, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = alvVar.a;
        }
        String str2 = str;
        long j = alvVar.b;
        int i2 = alvVar.c;
        int i3 = alvVar.d;
        gzs<okhttp3.t> gzsVar = alvVar.e;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = alvVar.f;
        }
        return new alv(str2, j, i2, i3, gzsVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alv)) {
            return false;
        }
        alv alvVar = (alv) obj;
        return epx.f(this.a, alvVar.a) && this.b == alvVar.b && this.c == alvVar.c && this.d == alvVar.d && epx.f(this.e, alvVar.e) && epx.f(this.f, alvVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + sf3.a(shy.a(this.d, shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpUrlPostCall(url=");
        sb.append(this.a);
        sb.append(", timeoutMs=");
        sb.append(this.b);
        sb.append(", retryCountOnBackendError=");
        sb.append(this.c);
        sb.append(", retryCountOnNetworkError=");
        sb.append(this.d);
        sb.append(", requestBodyProvider=");
        sb.append(this.e);
        sb.append(", customHeaders=");
        return ms9.a(')', sb, this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public alv(String str, long j, int i, int i2, okhttp3.s sVar, List list, int i3) {
        this(str, r2, r4, (i3 & 8) != 0 ? r4 : i2, new zkv(sVar, 0), (i3 & 32) != 0 ? EmptyList.b : list);
        long j2 = (i3 & 2) != 0 ? 0L : j;
        int i4 = (i3 & 4) != 0 ? 0 : i;
    }
}
