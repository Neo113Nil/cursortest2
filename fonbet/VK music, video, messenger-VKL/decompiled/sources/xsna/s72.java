package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AndroidCursorHandle.android.kt */
/* loaded from: classes11.dex */
public final class s72 {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(final wv70 wv70Var, final q630 q630Var, final long j, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1776202187);
        int i3 = (M.J(wv70Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | 128;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                M.h();
                i2 = i3 & (-897);
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1776202187, i2, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new x7(wv70Var, 3);
                M.R(x);
            }
            final q630 b2 = egi0.b(q630Var, false, (izs) x);
            dt1.a.getClass();
            nc2.a(wv70Var, dt1.a.c, kai.c(-1653527038, new wzs() { // from class: xsna.n72
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1653527038, intValue, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
                        }
                        long j2 = j;
                        q630 q630Var2 = b2;
                        if (j2 != 9205357640488583168L) {
                            aVar2.K(-1244013944);
                            q630 o = txj0.o(q630Var2, uco.c(j2), uco.b(j2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                            dt1.a.getClass();
                            cp10 d = ja8.d(dt1.a.c, false);
                            int hashCode = Long.hashCode(n34.n(aVar2));
                            sy90 D = aVar2.D();
                            q630 c = qri.c(aVar2, o);
                            cri.h7.getClass();
                            LayoutNode.a aVar3 = cri.a.b;
                            if (aVar2.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar2.H();
                            if (aVar2.L()) {
                                aVar2.I(aVar3);
                            } else {
                                aVar2.f();
                            }
                            k9q0.w(aVar2, d, cri.a.f);
                            k9q0.w(aVar2, D, cri.a.e);
                            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar2, cri.a.h);
                            k9q0.w(aVar2, c, cri.a.d);
                            s72.b(0, 1, aVar2, null);
                            aVar2.G();
                            aVar2.j();
                        } else {
                            aVar2.K(-1243644858);
                            s72.b(0, 0, aVar2, q630Var2);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, i4 | Tensorflow.FRAME_WIDTH);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final long j2 = j;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var, j2, i) { // from class: xsna.o72
                public final /* synthetic */ q630 c;
                public final /* synthetic */ long d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    s72.a(wv70.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(694251107, i3, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            f9t.e(bu00.e(txj0.s(q630Var, b, a), new q72(((qlo0) M.r(rlo0.a)).a, 0)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p72(q630Var, i, i2);
        }
    }
}
