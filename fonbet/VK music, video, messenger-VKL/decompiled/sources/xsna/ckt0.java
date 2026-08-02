package xsna;

import android.graphics.RectF;
import com.vk.editor.timeline.entity.Animation;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gp6;

/* compiled from: VideoTimelineItem.kt */
/* loaded from: classes18.dex */
public final class ckt0 implements gp6 {
    public final String a;
    public long b;
    public long c;
    public final long d;
    public final long e;
    public final long g;
    public final List<las> h;
    public final String i;
    public final float j;
    public float k;
    public Animation n;
    public float p;
    public float q;
    public long f = 0;
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final boolean o = true;

    public ckt0(String str, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, String str2, float f) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.g = j5;
        this.h = arrayList;
        this.i = str2;
        this.j = f;
    }

    @Override // xsna.gp6
    public final void A(Animation animation) {
        this.n = animation;
    }

    @Override // xsna.gp6
    public final RectF B() {
        return this.m;
    }

    @Override // xsna.gp6
    public final Animation C() {
        return this.n;
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
        return this.k;
    }

    @Override // xsna.gp6
    public final boolean J() {
        return true;
    }

    @Override // xsna.gp6
    public final boolean K() {
        return true;
    }

    @Override // xsna.gp6
    public final void L(float f) {
        this.k = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckt0)) {
            return false;
        }
        ckt0 ckt0Var = (ckt0) obj;
        return epx.f(this.a, ckt0Var.a) && this.b == ckt0Var.b && this.c == ckt0Var.c && this.d == ckt0Var.d && this.e == ckt0Var.e && this.f == ckt0Var.f && this.g == ckt0Var.g && epx.f(this.h, ckt0Var.h) && epx.f(this.i, ckt0Var.i) && Float.compare(this.j, ckt0Var.j) == 0;
    }

    @Override // xsna.gp6
    public final long getDuration() {
        return x() - E();
    }

    @Override // xsna.gp6
    public final String getType() {
        return SignalingProtocol.MEDIA_OPTION_VIDEO;
    }

    public final int hashCode() {
        return Float.hashCode(this.j) + qoy.b(qoy.b(shy.a(0, urd0.a(fw3.a((((Long.hashCode(this.g) + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31) + 81665115) * 31, 31, this.h), 29791, this.i), 31), 31, true), 31, true);
    }

    @Override // xsna.gp6
    public final String m() {
        return this.a;
    }

    @Override // xsna.gp6
    public final void n(float f) {
        this.q = f;
    }

    @Override // xsna.gp6
    public final void o(float f) {
        this.p = f;
    }

    @Override // xsna.gp6
    public final float p() {
        return this.q;
    }

    @Override // xsna.gp6
    public final float q() {
        return this.p;
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
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTimelineItem(uniqueId=");
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
        sb.append(", type=VIDEO, actions=");
        sb.append(this.h);
        sb.append(", path=");
        sb.append(this.i);
        sb.append(", modifier=null, overlay=null, indexY=0, fixedY=true, fixedX=true, speed=");
        return xq.c(')', this.j, sb);
    }

    @Override // xsna.gp6
    public final RectF u() {
        return this.l;
    }

    @Override // xsna.gp6
    public final List<las> v() {
        return this.h;
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
        return this.o;
    }

    @Override // xsna.gp6
    public final void z(long j) {
        this.c = j;
    }
}
