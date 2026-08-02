package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import xsna.q630;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes17.dex */
public final class aho<T> extends q630.c implements noy {
    public e12<T> p;
    public wzs<? super q9x, ? super o6j, ? extends Pair<? extends ugo<T>, ? extends T>> q;
    public Orientation r;
    public boolean s;

    public aho() {
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
            Pair<? extends ugo<T>, ? extends T> invoke = this.q.invoke(new q9x((N.c & 4294967295L) | (N.b << 32)), new o6j(j));
            e12<T> e12Var = this.p;
            ugo<T> i = invoke.i();
            T j2 = invoke.j();
            if (!epx.f(e12Var.e(), i)) {
                ((zak0) e12Var.l).setValue(i);
                wi50 wi50Var = e12Var.d.b;
                boolean f = wi50Var.f();
                if (f) {
                    try {
                        u02 u02Var = e12Var.m;
                        float c = e12Var.e().c(j2);
                        if (!Float.isNaN(c)) {
                            u02Var.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            e12Var.i(null);
                        }
                        e12Var.h(j2);
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                        wi50Var.c(null);
                    }
                }
                if (!f) {
                    e12Var.i(j2);
                }
            }
        }
        int i2 = 0;
        this.s = ep10Var.z1() || this.s;
        return ep10Var.Q(N.b, N.c, jgp.b, new zgo(ep10Var, this, N, i2));
    }
}
