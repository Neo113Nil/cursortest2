package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class onu {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final ImmutableList l;
    public final ImmutableList m;
    public final ImmutableList n;

    public onu(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, List list) {
        d6z.l((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = ImmutableList.l(arrayList2);
        this.m = ImmutableList.l(arrayList3);
        this.n = ImmutableList.l(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onu)) {
            return false;
        }
        onu onuVar = (onu) obj;
        return this.d == onuVar.d && this.e == onuVar.e && this.f == onuVar.f && this.g == onuVar.g && this.i == onuVar.i && this.j == onuVar.j && this.k == onuVar.k && Objects.equals(this.a, onuVar.a) && Objects.equals(this.b, onuVar.b) && Objects.equals(this.c, onuVar.c) && Objects.equals(this.h, onuVar.h) && Objects.equals(this.l, onuVar.l) && Objects.equals(this.m, onuVar.m) && Objects.equals(this.n, onuVar.n);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n);
    }
}
