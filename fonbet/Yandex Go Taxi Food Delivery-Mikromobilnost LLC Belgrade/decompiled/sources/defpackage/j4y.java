package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class j4y implements a4y, u5y {
    public final int a;
    public final Object b;
    public final int c;
    public final LayoutDirection d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final c j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public int r;
    public final long s;
    public long t;
    public int u;
    public int v;
    public boolean w;

    public j4y(int i, Object obj, int i2, int i3, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, c cVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = layoutDirection;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = cVar;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((o) list.get(i9)).b);
        }
        this.n = i8;
        int i10 = i3 + i8;
        this.o = i10 >= 0 ? i10 : 0;
        this.s = (this.c << 32) | (i8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        this.t = 0L;
        this.u = -1;
        this.v = -1;
    }

    public final void a(o.a aVar, boolean z) {
        a aVar2;
        if (this.p == Integer.MIN_VALUE) {
            lxv.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) list.get(i);
            int i2 = this.q - oVar.b;
            int i3 = this.r;
            long j = this.t;
            b a = this.j.a(i, this.b);
            if (a != null) {
                if (z) {
                    a.r = j;
                } else {
                    long c = z5w.c(!z5w.a(a.r, 9223372034707292159L) ? a.r : j, ((z5w) a.q.getValue()).a);
                    int i4 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    if ((i4 <= i2 && ((int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= i2) || (i4 >= i3 && ((int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) >= i3)) {
                        a.b();
                    }
                    j = c;
                }
                aVar2 = a.n;
            } else {
                aVar2 = null;
            }
            long c2 = z5w.c(j, this.h);
            if (!z && a != null) {
                a.m = c2;
            }
            if (aVar2 != null) {
                aVar.getClass();
                o.a.a(aVar, oVar);
                oVar.x0(z5w.c(c2, oVar.x), 0.0f, aVar2);
            } else {
                o.a.y(aVar, oVar, c2);
            }
        }
    }

    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == LayoutDirection.Rtl) {
            i2 = (i3 - i2) - this.c;
        }
        this.t = (i2 << 32) | (i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        this.u = i5;
        this.v = i6;
        this.q = -this.e;
        this.r = i4 + this.f;
    }

    @Override // defpackage.u5y
    public final void c(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.u5y
    public final int d() {
        return this.g.size();
    }

    @Override // defpackage.u5y
    public final int e() {
        return this.m;
    }

    @Override // defpackage.u5y
    public final boolean f() {
        return this.w;
    }

    @Override // defpackage.u5y
    public final boolean g() {
        return true;
    }

    @Override // defpackage.u5y
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.u5y
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.u5y
    public final void h() {
        this.w = true;
    }

    @Override // defpackage.u5y
    public final long i() {
        return this.k;
    }

    @Override // defpackage.u5y
    public final int j() {
        return this.o;
    }

    @Override // defpackage.u5y
    public final Object k(int i) {
        return ((o) this.g.get(i)).a();
    }

    @Override // defpackage.u5y
    public final long l(int i) {
        return this.t;
    }

    @Override // defpackage.u5y
    public final int m() {
        return this.l;
    }
}
