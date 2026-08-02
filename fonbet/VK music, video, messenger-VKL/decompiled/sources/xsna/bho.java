package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import xsna.q630;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class bho<T> extends q630.c implements noy {
    public d12<T> p;
    public wzs<? super q9x, ? super o6j, ? extends Pair<? extends tgo<T>, ? extends T>> q;
    public Orientation r;
    public boolean s;

    public bho() {
        throw null;
    }

    @Override // xsna.q630.c
    public final void b2() {
        this.s = false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(j);
        if (!ep10Var.z1() || !this.s) {
            Pair<? extends tgo<T>, ? extends T> invoke = this.q.invoke(new q9x((N.c & 4294967295L) | (N.b << 32)), new o6j(j));
            d12<T> d12Var = this.p;
            tgo<T> i = invoke.i();
            T j2 = invoke.j();
            if (!epx.f(d12Var.e(), i)) {
                ((zak0) d12Var.m).setValue(i);
                wi50 wi50Var = d12Var.e.b;
                boolean f = wi50Var.f();
                if (f) {
                    try {
                        t02 t02Var = d12Var.n;
                        float c = d12Var.e().c(j2);
                        if (!Float.isNaN(c)) {
                            t02Var.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            d12Var.i(null);
                        }
                        d12Var.h(j2);
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        wi50Var.c(null);
                    }
                }
                if (!f) {
                    d12Var.i(j2);
                }
            }
        }
        this.s = ep10Var.z1() || this.s;
        return ep10Var.Q(N.b, N.c, jgp.b, new gq0(ep10Var, this, N, 4));
    }
}
