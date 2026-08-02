package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import one.video.exo.preload.PreloadException;
import xsna.o1d0;
import xsna.yn80;

/* compiled from: PreloadMediaSource.java */
/* loaded from: classes8.dex */
public final class q1d0 extends androidx.media3.exoplayer.source.t {
    public boolean A;

    @Nullable
    public final pae0 B;
    public final c l;
    public final ao80 m;
    public final p06 n;
    public final androidx.media3.exoplayer.k[] o;
    public final xu1 p;
    public e q;
    public a r;
    public final Handler s;
    public boolean t;
    public boolean u;
    public long v;

    @Nullable
    public ewo0 w;

    @Nullable
    public Pair<o1d0, b> x;

    @Nullable
    public Pair<o1d0, i.b> y;
    public boolean z;

    /* compiled from: PreloadMediaSource.java */
    public interface a {
        hk0 getConfig();
    }

    /* compiled from: PreloadMediaSource.java */
    public static class b {
        public final i.b a;
        public final Long b;

        public b(i.b bVar, long j) {
            this.a = bVar;
            this.b = Long.valueOf(j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return q1d0.F(this.a, bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            i.b bVar = this.a;
            return this.b.intValue() + ((((((vul0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, bVar.a) + bVar.b) * 31) + bVar.c) * 31) + bVar.e) * 31);
        }
    }

    /* compiled from: PreloadMediaSource.java */
    public class d implements h.a {
        public final long b;
        public boolean c;

        public d(long j) {
            this.b = j;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final void b(androidx.media3.exoplayer.source.h hVar) {
            this.c = true;
            q1d0.this.s.post(new fwq(3, this, hVar));
        }

        @Override // androidx.media3.exoplayer.source.q.a
        public final void d(androidx.media3.exoplayer.source.h hVar) {
            q1d0.this.s.post(new xq8(5, this, hVar));
        }
    }

    /* compiled from: PreloadMediaSource.java */
    public interface e {
        @Nullable
        Size f();
    }

    public q1d0(Context context, androidx.media3.exoplayer.source.i iVar, c cVar, p06 p06Var, androidx.media3.exoplayer.k[] kVarArr, z9l z9lVar, Looper looper, hk0 hk0Var, su5 su5Var, pae0 pae0Var) {
        super(iVar);
        this.l = cVar;
        this.n = p06Var;
        this.o = kVarArr;
        this.p = z9lVar;
        this.q = new ck70(4);
        this.r = new qca0(hk0Var, 1);
        ao80 ao80Var = new ao80(context, new yn80.a(xgp0.j, new so40(this, 16), new p1d0(this, 0), null, su5Var, null, null), new r8l());
        this.m = ao80Var;
        ao80Var.c(new ao(29), p06Var);
        this.B = pae0Var;
        this.s = new Handler(looper, null);
        this.v = C.TIME_UNSET;
    }

    public static boolean F(i.b bVar, i.b bVar2) {
        return bVar.a.equals(bVar2.a) && bVar.b == bVar2.b && bVar.c == bVar2.c && bVar.e == bVar2.e;
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void A(ewo0 ewo0Var) {
        this.w = ewo0Var;
        s(ewo0Var);
        this.s.post(new w9j(6, this, ewo0Var));
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void B() {
        if (E() && !this.A) {
            this.l.b(this);
            G();
            this.A = true;
        }
        ewo0 ewo0Var = this.w;
        if (ewo0Var != null) {
            A(ewo0Var);
        } else {
            if (this.u) {
                return;
            }
            this.u = true;
            y(null, this.k);
        }
    }

    public final void C() {
        try {
            maybeThrowSourceInfoRefreshError();
            Pair<o1d0, b> pair = this.x;
            if (pair != null) {
                o1d0 o1d0Var = (o1d0) pair.first;
                boolean z = o1d0Var.c;
                if (z) {
                    fxc0.z(z);
                    o1d0.a aVar = o1d0Var.f;
                    if (aVar != null) {
                        for (m0h0 m0h0Var : aVar.c) {
                            if (m0h0Var != null) {
                                m0h0Var.maybeThrowError();
                            }
                        }
                    }
                } else {
                    o1d0Var.maybeThrowPrepareError();
                }
            }
            this.s.postDelayed(new tv9(this, 9), 100L);
        } catch (IOException e2) {
            this.l.a(new PreloadException(this.k.f(), e2), this);
            G();
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final o1d0 m(i.b bVar, xu1 xu1Var, long j) {
        b bVar2 = new b(bVar, j);
        Pair<o1d0, b> pair = this.x;
        if (pair != null && bVar2.equals(pair.second)) {
            Pair<o1d0, b> pair2 = this.x;
            pair2.getClass();
            o1d0 o1d0Var = (o1d0) pair2.first;
            if (E()) {
                this.x = null;
                this.y = new Pair<>(o1d0Var, bVar);
            }
            return o1d0Var;
        }
        Pair<o1d0, b> pair3 = this.x;
        androidx.media3.exoplayer.source.i iVar = this.k;
        if (pair3 != null) {
            iVar.h(((o1d0) pair3.first).b);
            this.x = null;
        }
        o1d0 o1d0Var2 = new o1d0(iVar.m(bVar, xu1Var, j));
        if (!E()) {
            this.x = new Pair<>(o1d0Var2, bVar2);
        }
        return o1d0Var2;
    }

    public final boolean E() {
        return !this.a.isEmpty();
    }

    public final void G() {
        this.s.removeCallbacksAndMessages(null);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(androidx.media3.exoplayer.source.h hVar) {
        o1d0 o1d0Var = (o1d0) hVar;
        Pair<o1d0, b> pair = this.x;
        if (pair != null) {
            pair.getClass();
            if (o1d0Var == pair.first) {
                this.x = null;
                this.k.h(o1d0Var.b);
            }
        }
        Pair<o1d0, i.b> pair2 = this.y;
        if (pair2 != null) {
            pair2.getClass();
            if (o1d0Var == pair2.first) {
                this.y = null;
            }
        }
        this.k.h(o1d0Var.b);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        if (E()) {
            return;
        }
        this.A = false;
        if (this.t) {
            return;
        }
        this.w = null;
        this.u = false;
        super.t();
    }

    @Override // androidx.media3.exoplayer.source.t
    public final i.b z(i.b bVar) {
        Pair<o1d0, i.b> pair = this.y;
        if (pair == null) {
            return bVar;
        }
        pair.getClass();
        if (!F(bVar, (i.b) pair.second)) {
            return bVar;
        }
        Pair<o1d0, i.b> pair2 = this.y;
        pair2.getClass();
        return (i.b) pair2.second;
    }

    /* compiled from: PreloadMediaSource.java */
    public interface c {
        void a(PreloadException preloadException, q1d0 q1d0Var);

        void b(q1d0 q1d0Var);

        boolean c(q1d0 q1d0Var);

        boolean d(q1d0 q1d0Var, long j);

        boolean f(q1d0 q1d0Var);

        default void e(q1d0 q1d0Var) {
        }
    }
}
