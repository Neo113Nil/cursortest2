package xsna;

import android.graphics.RectF;
import com.vk.editor.timeline.entity.Animation;
import java.util.ArrayList;
import java.util.List;
import xsna.gp6;

/* compiled from: AudioTimelineItem.kt */
/* loaded from: classes18.dex */
public final class oy4 implements gp6 {
    public final String a;
    public long b;
    public long c;
    public final long d;
    public final long e;
    public long f;
    public final long g;
    public final String h;
    public final List<las> i;
    public final String j;
    public final qwo0 k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final Long q;
    public final boolean r;
    public final String s;
    public final float t;
    public float u;
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public Animation x;
    public float y;
    public float z;

    public oy4(String str, long j, long j2, long j3, long j4, long j5, long j6, String str2, ArrayList arrayList, String str3, qwo0 qwo0Var, int i, int i2, int i3, boolean z, boolean z2, Long l, boolean z3, String str4, float f) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = str2;
        this.i = arrayList;
        this.j = str3;
        this.k = qwo0Var;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = z;
        this.p = z2;
        this.q = l;
        this.r = z3;
        this.s = str4;
        this.t = f;
    }

    @Override // xsna.gp6
    public final void A(Animation animation) {
        this.x = animation;
    }

    @Override // xsna.gp6
    public final RectF B() {
        return this.w;
    }

    @Override // xsna.gp6
    public final Animation C() {
        return this.x;
    }

    @Override // xsna.gp6
    public final y3o0 D() {
        return gp6.a.a(this);
    }

    @Override // xsna.gp6
    public final long E() {
        return this.b;
    }

    @Override // xsna.gp6
    public final void F(long j) {
        this.f = j;
    }

    @Override // xsna.gp6
    public final long G() {
        return this.g;
    }

    @Override // xsna.gp6
    public final long H() {
        return this.f;
    }

    @Override // xsna.gp6
    public final float I() {
        return this.u;
    }

    @Override // xsna.gp6
    public final boolean J() {
        return this.o;
    }

    @Override // xsna.gp6
    public final boolean K() {
        return this.p;
    }

    @Override // xsna.gp6
    public final void L(float f) {
        this.u = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4)) {
            return false;
        }
        oy4 oy4Var = (oy4) obj;
        return epx.f(this.a, oy4Var.a) && this.b == oy4Var.b && this.c == oy4Var.c && this.d == oy4Var.d && this.e == oy4Var.e && this.f == oy4Var.f && this.g == oy4Var.g && epx.f(this.h, oy4Var.h) && epx.f(this.i, oy4Var.i) && epx.f(this.j, oy4Var.j) && this.k.equals(oy4Var.k) && this.l == oy4Var.l && this.m == oy4Var.m && this.n == oy4Var.n && this.o == oy4Var.o && this.p == oy4Var.p && epx.f(this.q, oy4Var.q) && this.r == oy4Var.r && epx.f(this.s, oy4Var.s) && Float.compare(this.t, oy4Var.t) == 0;
    }

    @Override // xsna.gp6
    public final long getDuration() {
        return x() - E();
    }

    @Override // xsna.gp6
    public final String getType() {
        return this.h;
    }

    public final int hashCode() {
        int a = fw3.a(urd0.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int b = qoy.b(qoy.b(shy.a(this.n, shy.a(this.m, shy.a(this.l, (this.k.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31), 31, this.o), 31, this.p);
        Long l = this.q;
        int b2 = qoy.b((b + (l == null ? 0 : l.hashCode())) * 31, 31, this.r);
        String str2 = this.s;
        return Float.hashCode(this.t) + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // xsna.gp6
    public final String m() {
        return this.a;
    }

    @Override // xsna.gp6
    public final void n(float f) {
        this.z = f;
    }

    @Override // xsna.gp6
    public final void o(float f) {
        this.y = f;
    }

    @Override // xsna.gp6
    public final float p() {
        return this.z;
    }

    @Override // xsna.gp6
    public final float q() {
        return this.y;
    }

    @Override // xsna.gp6
    public final long r() {
        return this.e;
    }

    @Override // xsna.gp6
    public final void s(long j) {
        this.b = j;
    }

    @Override // xsna.gp6
    public final int t() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTimelineItem(uniqueId=");
        sb.append(this.a);
        sb.append(", startMs=");
        sb.append(this.b);
        sb.append(", endMs=");
        sb.append(this.c);
        sb.append(", minRangeMs=");
        sb.append(this.d);
        sb.append(", maxRangeMs=");
        sb.append(this.e);
        sb.append(", offsetMs=");
        sb.append(this.f);
        sb.append(", originalDurationMs=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(", actions=");
        sb.append(this.i);
        sb.append(", path=");
        sb.append(this.j);
        sb.append(", style=");
        sb.append(this.k);
        sb.append(", trackColorOn=");
        sb.append(this.l);
        sb.append(", trackColorOff=");
        sb.append(this.m);
        sb.append(", indexY=");
        sb.append(this.n);
        sb.append(", fixedY=");
        sb.append(this.o);
        sb.append(", fixedX=");
        sb.append(this.p);
        sb.append(", recommendedMarkTime=");
        sb.append(this.q);
        sb.append(", isVoiceOverStub=");
        sb.append(this.r);
        sb.append(", editingHintText=");
        sb.append(this.s);
        sb.append(", speed=");
        return xq.c(')', this.t, sb);
    }

    @Override // xsna.gp6
    public final RectF u() {
        return this.v;
    }

    @Override // xsna.gp6
    public final List<las> v() {
        return this.i;
    }

    @Override // xsna.gp6
    public final long w() {
        return this.d;
    }

    @Override // xsna.gp6
    public final long x() {
        return this.c;
    }

    @Override // xsna.gp6
    public final boolean y() {
        return false;
    }

    @Override // xsna.gp6
    public final void z(long j) {
        this.c = j;
    }
}
