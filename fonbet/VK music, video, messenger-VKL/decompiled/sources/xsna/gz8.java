package xsna;

import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import xsna.n6g;

/* compiled from: CachingVideoDecoderFrameHandler.kt */
/* loaded from: classes3.dex */
public final class gz8 extends rql {
    public Long q;
    public int r;
    public final sk3<a> s;
    public final LinkedHashSet t;

    /* compiled from: CachingVideoDecoderFrameHandler.kt */
    public static final class a {
        public final float[] a;
        public final g0u b;
        public final long c;

        public a(float[] fArr, g0u g0uVar, long j) {
            this.a = fArr;
            this.b = g0uVar;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            a aVar = (a) obj;
            return Arrays.equals(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + ((this.b.hashCode() + (Arrays.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DecodedFrameInfo(texMatrix=");
            sb.append(Arrays.toString(this.a));
            sb.append(", renderBuffer=");
            sb.append(this.b);
            sb.append(", timestampMcs=");
            return vu5.a(')', this.c, sb);
        }
    }

    public gz8(csp cspVar, xsw xswVar, pms0 pms0Var) {
        super(cspVar, xswVar, pms0Var);
        this.s = new sk3<>();
        this.t = new LinkedHashSet();
    }

    @Override // xsna.rql
    public final void i() {
        LinkedHashSet linkedHashSet = this.t;
        super.i();
        try {
            sk3<a> sk3Var = this.s;
            Iterator<a> it = sk3Var.iterator();
            while (it.hasNext()) {
                it.next().b.a();
            }
            sk3Var.clear();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((g0u) it2.next()).a();
            }
            linkedHashSet.clear();
        } catch (Throwable th) {
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.w("CachingVideoDecoderFrameHandler", mnh0.A(th));
            }
        }
    }

    @Override // xsna.rql
    public final void j(ckn0 ckn0Var, long j) {
        Object obj;
        super.j(ckn0Var, j);
        if (this.r <= 0) {
            return;
        }
        Long l = this.q;
        if (l == null) {
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.e("CachingVideoDecoderFrameHandler", "Frame timestamp wasn't set");
                return;
            }
            return;
        }
        float[] fArr = new float[16];
        ckn0Var.getTransformMatrix(fArr);
        int intValue = g(this.n, ckn0Var.a).d().intValue();
        m0u f = f(!r0.g().booleanValue());
        int i = ckn0Var.b;
        int i2 = ckn0Var.c;
        LinkedHashSet linkedHashSet = this.t;
        Iterator it = linkedHashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            g0u g0uVar = (g0u) obj;
            if (g0uVar.a == i && g0uVar.b == i2) {
                break;
            }
        }
        g0u g0uVar2 = (g0u) obj;
        if (g0uVar2 == null && (g0uVar2 = (g0u) j5g.Z(linkedHashSet)) == null) {
            g0uVar2 = new g0u();
            g0uVar2.b(i, i2);
        }
        linkedHashSet.remove(g0uVar2);
        GLES20.glBindFramebuffer(36160, g0uVar2.c);
        int i3 = g0uVar2.a;
        int i4 = g0uVar2.b;
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(3042);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glClear(16640);
        GLES20.glViewport(0, 0, i3, i4);
        f.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        f.e = null;
        f.d = null;
        f.c = intValue;
        f.d();
        s3q0 s3q0Var = s3q0.a;
        GLES20.glBindFramebuffer(36160, 0);
        this.s.addLast(new a(fArr, g0uVar2, l.longValue()));
        this.r--;
    }

    public final long m() {
        if (this.r == 0) {
            sk3<a> sk3Var = this.s;
            if (!sk3Var.isEmpty()) {
                a removeFirst = sk3Var.removeFirst();
                sk3Var.addLast(removeFirst);
                long j = removeFirst.c;
                float[] fArr = removeFirst.a;
                long nanos = TimeUnit.MICROSECONDS.toNanos(j);
                int i = removeFirst.b.e;
                bpn0 bpn0Var = n6g.c;
                l(fArr, nanos, i, false, n6g.a.a());
                return j;
            }
        }
        throw new IllegalArgumentException("Tried to render cached frames, but they are not ready");
    }
}
