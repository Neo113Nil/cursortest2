package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.b;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class i4y implements aa10 {
    public final k4y a;
    public final int b;
    public final boolean c;
    public final float d;
    public final aa10 e;
    public final float f;
    public final boolean g;
    public final tse h;
    public final fwi i;
    public final int j;
    public final tls k;
    public final tls l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final Orientation q;
    public final int r;
    public final int s;

    public i4y(k4y k4yVar, int i, boolean z, float f, aa10 aa10Var, float f2, boolean z2, tse tseVar, fwi fwiVar, int i2, tls tlsVar, tls tlsVar2, List list, int i3, int i4, int i5, Orientation orientation, int i6, int i7) {
        this.a = k4yVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = aa10Var;
        this.f = f2;
        this.g = z2;
        this.h = tseVar;
        this.i = fwiVar;
        this.j = i2;
        this.k = tlsVar;
        this.l = tlsVar2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = orientation;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.aa10
    public final tls a() {
        return this.e.a();
    }

    @Override // defpackage.aa10
    public final Map b() {
        return this.e.b();
    }

    @Override // defpackage.aa10
    public final void c() {
        this.e.c();
    }

    public final i4y d(int i, boolean z) {
        k4y k4yVar;
        int i2;
        if (this.g) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty() || (k4yVar = this.a) == null) {
            return null;
        }
        int i3 = k4yVar.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        j4y j4yVar = (j4y) a.P(list);
        j4y j4yVar2 = (j4y) a.Z(list);
        if (j4yVar.w || j4yVar2.w) {
            return null;
        }
        int i5 = this.o;
        int i6 = this.n;
        Orientation orientation = this.q;
        if (i < 0) {
            if (Math.min((ddb1.d(j4yVar, orientation) + j4yVar.o) - i6, (ddb1.d(j4yVar2, orientation) + j4yVar2.o) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - ddb1.d(j4yVar, orientation), i5 - ddb1.d(j4yVar2, orientation)) <= i) {
            return null;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            j4y j4yVar3 = (j4y) list.get(i7);
            j4yVar3.getClass();
            if (!j4yVar3.w) {
                long j = j4yVar3.t;
                j4yVar3.t = ((((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (j >> 32)) << 32);
                if (z) {
                    int size2 = j4yVar3.g.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        b a = j4yVar3.j.a(i8, j4yVar3.b);
                        if (a != null) {
                            long j2 = a.l;
                            i2 = i4;
                            a.l = ((((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (j2 >> 32)) << 32);
                        } else {
                            i2 = i4;
                        }
                        i8++;
                        i4 = i2;
                    }
                }
            }
            i7++;
            i4 = i4;
        }
        return new i4y(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final long e() {
        aa10 aa10Var = this.e;
        return (aa10Var.getWidth() << 32) | (aa10Var.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.aa10
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.aa10
    public final int getWidth() {
        return this.e.getWidth();
    }
}
