package xsna;

import android.net.Uri;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Objects;

/* compiled from: ExoVideoSource.kt */
/* loaded from: classes3.dex */
public final class m7q {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final Uri K;
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final sht0 e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final long s;
    public final boolean t;
    public final boolean u;
    public final float v;
    public final List<zpa0> w;
    public final r7s0 x;
    public final boolean y;
    public final String z;

    /* JADX WARN: Multi-variable type inference failed */
    public m7q(String str, int i, long j, String str2, sht0 sht0Var, String str3, String str4, String str5, int i2, String str6, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, String str7, long j2, boolean z4, boolean z5, float f, List<? extends zpa0> list, r7s0 r7s0Var, boolean z6, String str8, boolean z7) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
        this.e = sht0Var;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = i2;
        this.j = str6;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = str7;
        this.s = j2;
        this.t = z4;
        this.u = z5;
        this.v = f;
        this.w = list;
        this.x = r7s0Var;
        this.y = z6;
        this.z = str8;
        this.A = z7;
        boolean z8 = false;
        this.B = i6 == 0;
        boolean z9 = i6 == 1;
        this.C = z9;
        boolean z10 = i6 == 2;
        this.D = z10;
        boolean z11 = i6 == 3;
        this.E = z11;
        boolean z12 = i6 == 4;
        this.F = i6 == 6;
        boolean z13 = i6 == 7;
        this.G = z13;
        this.H = (j == 0 || i == 0 || (!z9 && !z11 && !z12 && !z13)) ? false : true;
        this.I = j != 0 && i != 0 && z10 && i2 == -5;
        if (j != 0 && i != 0 && z10 && i2 == -3) {
            z8 = true;
        }
        this.J = z8;
        this.K = sht0Var.b;
    }

    public static m7q a(m7q m7qVar, sht0 sht0Var, String str, String str2, int i, boolean z, boolean z2, String str3, long j, r7s0 r7s0Var, String str4, boolean z3, int i2) {
        boolean z4;
        boolean z5;
        String str5 = m7qVar.a;
        int i3 = m7qVar.b;
        long j2 = m7qVar.c;
        String str6 = m7qVar.d;
        sht0 sht0Var2 = (i2 & 16) != 0 ? m7qVar.e : sht0Var;
        String str7 = m7qVar.f;
        String str8 = (i2 & 64) != 0 ? m7qVar.g : str;
        String str9 = (i2 & 128) != 0 ? m7qVar.h : str2;
        int i4 = (i2 & 256) != 0 ? m7qVar.i : i;
        String str10 = m7qVar.j;
        sht0 sht0Var3 = sht0Var2;
        String str11 = str8;
        String str12 = str9;
        int i5 = i4;
        int i6 = m7qVar.k;
        int i7 = m7qVar.l;
        int i8 = m7qVar.m;
        int i9 = m7qVar.n;
        boolean z6 = m7qVar.o;
        if ((i2 & 32768) != 0) {
            z4 = z6;
            z5 = m7qVar.p;
        } else {
            z4 = z6;
            z5 = z;
        }
        boolean z7 = (i2 & 65536) != 0 ? m7qVar.q : z2;
        String str13 = (i2 & 131072) != 0 ? m7qVar.r : str3;
        long j3 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? m7qVar.s : j;
        boolean z8 = m7qVar.t;
        boolean z9 = m7qVar.u;
        float f = m7qVar.v;
        List<zpa0> list = m7qVar.w;
        r7s0 r7s0Var2 = (i2 & 8388608) != 0 ? m7qVar.x : r7s0Var;
        boolean z10 = m7qVar.y;
        String str14 = (i2 & 33554432) != 0 ? m7qVar.z : str4;
        boolean z11 = (i2 & 67108864) != 0 ? m7qVar.A : z3;
        m7qVar.getClass();
        return new m7q(str5, i3, j2, str6, sht0Var3, str7, str11, str12, i5, str10, i6, i7, i8, i9, z4, z5, z7, str13, j3, z8, z9, f, list, r7s0Var2, z10, str14, z11);
    }

    public final int b() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7q)) {
            return false;
        }
        if (!this.E) {
            if (this.p != ((m7q) obj).p) {
                return false;
            }
        }
        if (this.F) {
            if (!epx.f(this.z, ((m7q) obj).z)) {
                return false;
            }
        }
        m7q m7qVar = (m7q) obj;
        return epx.f(this.a, m7qVar.a) && epx.f(this.g, m7qVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.g);
    }

    public final String toString() {
        return "key: " + this.a + ", size:" + this.l + 'x' + this.m + ", duration:" + this.k;
    }
}
