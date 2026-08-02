package xsna;

import android.graphics.RectF;
import com.vk.editor.timeline.entity.Animation;
import java.util.ArrayList;
import java.util.List;
import xsna.gp6;

/* compiled from: StickerTimelineItem.kt */
/* loaded from: classes18.dex */
public final class r7l0 implements gp6 {
    public final String a;
    public long b;
    public long c;
    public final long d;
    public final long e;
    public long f;
    public final List<las> g;
    public final qwo0 h;
    public final int i;
    public float j;
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public Animation m;
    public float n;
    public float o;

    public r7l0(String str, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, qwo0 qwo0Var, int i) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = arrayList;
        this.h = qwo0Var;
        this.i = i;
    }

    @Override // xsna.gp6
    public final void A(Animation animation) {
        this.m = animation;
    }

    @Override // xsna.gp6
    public final RectF B() {
        return this.l;
    }

    @Override // xsna.gp6
    public final Animation C() {
        return this.m;
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
        return Long.MAX_VALUE;
    }

    @Override // xsna.gp6
    public final long H() {
        return this.f;
    }

    @Override // xsna.gp6
    public final float I() {
        return this.j;
    }

    @Override // xsna.gp6
    public final boolean J() {
        return false;
    }

    @Override // xsna.gp6
    public final boolean K() {
        return false;
    }

    @Override // xsna.gp6
    public final void L(float f) {
        this.j = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7l0)) {
            return false;
        }
        r7l0 r7l0Var = (r7l0) obj;
        return epx.f(this.a, r7l0Var.a) && this.b == r7l0Var.b && this.c == r7l0Var.c && this.d == r7l0Var.d && this.e == r7l0Var.e && this.f == r7l0Var.f && epx.f(this.g, r7l0Var.g) && this.h.equals(r7l0Var.h) && this.i == r7l0Var.i;
    }

    @Override // xsna.gp6
    public final long getDuration() {
        return x() - E();
    }

    @Override // xsna.gp6
    public final String getType() {
        return "STICKER";
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(shy.a(this.i, (this.h.hashCode() + fw3.a((((Long.hashCode(Long.MAX_VALUE) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31) - 1172269795) * 31, 31, this.g)) * 31, 31), 31, false);
    }

    @Override // xsna.gp6
    public final String m() {
        return this.a;
    }

    @Override // xsna.gp6
    public final void n(float f) {
        this.o = f;
    }

    @Override // xsna.gp6
    public final void o(float f) {
        this.n = f;
    }

    @Override // xsna.gp6
    public final float p() {
        return this.o;
    }

    @Override // xsna.gp6
    public final float q() {
        return this.n;
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
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerTimelineItem(uniqueId=");
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
        sb.append(", originalDurationMs=9223372036854775807, type=STICKER, actions=");
        sb.append(this.g);
        sb.append(", style=");
        sb.append(this.h);
        sb.append(", indexY=");
        return h5s.c(this.i, ", fixedY=false, fixedX=false)", sb);
    }

    @Override // xsna.gp6
    public final RectF u() {
        return this.k;
    }

    @Override // xsna.gp6
    public final List<las> v() {
        return this.g;
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
