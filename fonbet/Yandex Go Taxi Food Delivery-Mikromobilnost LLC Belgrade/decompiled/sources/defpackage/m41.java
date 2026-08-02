package defpackage;

import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class m41 {
    public final int a;
    public final String b;
    public final PointType c;
    public final Origin d;
    public final pv0 e;
    public final zzs f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final l41 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final tls r;
    public final tls s;

    public m41(int i, String str, PointType pointType, Origin origin, pv0 pv0Var, zzs zzsVar, boolean z, boolean z2, l41 l41Var, ww90 ww90Var, i4b0 i4b0Var, int i2) {
        boolean z3 = (i2 & 256) != 0;
        l41 l41Var2 = (i2 & 512) != 0 ? null : l41Var;
        boolean z4 = (i2 & 1024) != 0;
        boolean z5 = (i2 & 2048) != 0;
        boolean z6 = (i2 & 4096) != 0;
        boolean z7 = (i2 & 8192) != 0;
        boolean z8 = (i2 & 16384) == 0;
        boolean z9 = (65536 & i2) == 0;
        ww90 ww90Var2 = (131072 & i2) != 0 ? null : ww90Var;
        i4b0 i4b0Var2 = (i2 & 262144) == 0 ? i4b0Var : null;
        this.a = i;
        this.b = str;
        this.c = pointType;
        this.d = origin;
        this.e = pv0Var;
        this.f = zzsVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = l41Var2;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = true;
        this.q = z9;
        this.r = ww90Var2;
        this.s = i4b0Var2;
    }
}
