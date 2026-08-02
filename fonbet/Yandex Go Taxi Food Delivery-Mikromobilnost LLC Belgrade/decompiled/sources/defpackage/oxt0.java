package defpackage;

import android.net.Uri;
import androidx.media3.common.a;
import java.util.List;

/* loaded from: classes10.dex */
public final class oxt0 {
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final a[] j;
    public final int k;
    public final String l;
    public final String m;
    public final List n;
    public final long[] o;
    public final long p;

    public oxt0(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, a[] aVarArr, List list, long[] jArr, long j2) {
        this.l = str;
        this.m = str2;
        this.a = i;
        this.b = str3;
        this.c = j;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str5;
        this.j = aVarArr;
        this.n = list;
        this.o = jArr;
        this.p = j2;
        this.k = list.size();
    }

    public final Uri a(int i, int i2) {
        a[] aVarArr = this.j;
        d6z.x(aVarArr != null);
        List list = this.n;
        d6z.x(list != null);
        d6z.x(i2 < list.size());
        String num = Integer.toString(aVarArr[i].j);
        String l = ((Long) list.get(i2)).toString();
        return m4m0.j(this.l, this.m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
    }

    public final oxt0 b(a[] aVarArr) {
        return new oxt0(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, aVarArr, this.n, this.o, this.p);
    }

    public final long c(int i) {
        if (i == this.k - 1) {
            return this.p;
        }
        long[] jArr = this.o;
        return jArr[i + 1] - jArr[i];
    }
}
