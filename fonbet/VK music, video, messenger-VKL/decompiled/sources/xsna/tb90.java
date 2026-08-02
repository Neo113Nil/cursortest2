package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: PagerMeasureResult.kt */
/* loaded from: classes11.dex */
public final class tb90 implements ob90, dp10 {
    public final List<kp10> a;
    public final int b;
    public final int c;
    public final int d;
    public final Orientation e;
    public final int f;
    public final int g;
    public final int h;
    public final kp10 i;
    public final kp10 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final x9k0 n;
    public final dp10 o;
    public final boolean p;
    public final List<kp10> q;
    public final List<kp10> r;
    public final yvj s;
    public final azl t;
    public final long u;

    public tb90() {
        throw null;
    }

    public tb90(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, kp10 kp10Var, kp10 kp10Var2, float f, int i7, boolean z, x9k0 x9k0Var, dp10 dp10Var, boolean z2, List list2, List list3, yvj yvjVar, azl azlVar, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = orientation;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = kp10Var;
        this.j = kp10Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = x9k0Var;
        this.o = dp10Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = yvjVar;
        this.t = azlVar;
        this.u = j;
    }

    @Override // xsna.ob90
    public final long a() {
        dp10 dp10Var = this.o;
        return (dp10Var.getWidth() << 32) | (dp10Var.getHeight() & 4294967295L);
    }

    @Override // xsna.ob90
    public final int b() {
        return -this.f;
    }

    @Override // xsna.ob90
    public final int c() {
        return this.d;
    }

    @Override // xsna.ob90
    public final int d() {
        return this.b;
    }

    @Override // xsna.ob90
    public final int e() {
        return this.c;
    }

    @Override // xsna.ob90
    public final x9k0 f() {
        return this.n;
    }

    @Override // xsna.ob90
    public final List<kp10> g() {
        return this.a;
    }

    @Override // xsna.dp10
    public final int getHeight() {
        return this.o.getHeight();
    }

    @Override // xsna.ob90
    public final Orientation getOrientation() {
        return this.e;
    }

    @Override // xsna.dp10
    public final int getWidth() {
        return this.o.getWidth();
    }

    public final tb90 h(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List<kp10> list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        kp10 kp10Var = (kp10) j5g.Y(list);
        kp10 kp10Var2 = (kp10) j5g.i0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((kp10Var.k + i3) - i5, (kp10Var2.k + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - kp10Var.k, i4 - kp10Var2.k) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.get(i6).a(i);
        }
        List<kp10> list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            list2.get(i7).a(i);
        }
        List<kp10> list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            list3.get(i8).a(i);
        }
        return new tb90(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    @Override // xsna.ob90
    public final boolean i() {
        return false;
    }

    @Override // xsna.dp10
    public final void j() {
        this.o.j();
    }

    @Override // xsna.dp10
    public final izs<srg0, s3q0> k() {
        return this.o.k();
    }

    @Override // xsna.dp10
    public final Map<gt1, Integer> q() {
        return this.o.q();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tb90(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, int i6, x9k0 x9k0Var, dp10 dp10Var, yvj yvjVar, azl azlVar, long j) {
        this(list, i, i2, i3, orientation, i4, i5, i6, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, false, x9k0Var, dp10Var, false, r17, r17, yvjVar, azlVar, j);
        EmptyList emptyList = EmptyList.b;
    }
}
