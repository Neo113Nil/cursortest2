package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dak0;
import xsna.wlp0;

/* compiled from: Transition.kt */
/* loaded from: classes11.dex */
public final class ump0 {
    public static final pmp0 a = new pmp0(0);

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ wlp0 a;

        public a(wlp0 wlp0Var) {
            this.a = wlp0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            wlp0 wlp0Var = this.a;
            wlp0Var.i();
            wlp0Var.a.h0();
        }
    }

    public static final <S, T, V extends wq2> void a(wlp0<S> wlp0Var, wlp0<S>.d<T, V> dVar, T t, T t2, phr<T> phrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(867041821);
        if ((i & 6) == 0) {
            i2 = (M.J(wlp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(t) : M.y(t) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(t2) : M.y(t2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? M.J(phrVar) : M.y(phrVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(867041821, i2, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1927)");
            }
            if (wlp0Var.g()) {
                dVar.m(t, t2, phrVar);
            } else {
                dVar.n(t2, phrVar);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rt00(wlp0Var, dVar, t, t2, phrVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    public static final wlp0.a b(wlp0 wlp0Var, jtp0 jtp0Var, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        wlp0.a.C3941a c3941a;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1758)");
        }
        boolean J = aVar.J(wlp0Var);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (J || x == obj) {
            x = new wlp0.a(jtp0Var, str);
            aVar.R(x);
        }
        wlp0.a aVar2 = (wlp0.a) x;
        boolean J2 = aVar.J(wlp0Var) | aVar.y(aVar2);
        Object x2 = aVar.x();
        if (J2 || x2 == obj) {
            x2 = new uwi0(3, wlp0Var, aVar2);
            aVar.R(x2);
        }
        bap.c(aVar2, (izs) x2, aVar, 0);
        if (wlp0Var.g() && (c3941a = (wlp0.a.C3941a) ((zak0) aVar2.b).getValue()) != null) {
            wlp0<S> wlp0Var2 = wlp0.this;
            c3941a.b.m(c3941a.d.invoke(wlp0Var2.e().b()), c3941a.d.invoke(wlp0Var2.e().f()), (phr) c3941a.c.invoke(wlp0Var2.e()));
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return aVar2;
    }

    public static final wlp0.d c(wlp0 wlp0Var, Object obj, Object obj2, phr phrVar, itp0 itp0Var, androidx.compose.runtime.a aVar, int i) {
        Object obj3;
        Object obj4;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1889)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && aVar.J(wlp0Var)) || (i & 6) == 4;
        Object x = aVar.x();
        Object obj5 = a.C0011a.a;
        if (z || x == obj5) {
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e = a2 != null ? a2.e() : null;
            dak0 b = dak0.a.b(a2);
            try {
                obj3 = obj2;
                wq2 wq2Var = (wq2) itp0Var.a().invoke(obj3);
                wq2Var.d();
                obj4 = obj;
                Object dVar = new wlp0.d(obj4, wq2Var, itp0Var);
                dak0.a.d(a2, b, e);
                aVar.R(dVar);
                x = dVar;
            } catch (Throwable th) {
                dak0.a.d(a2, b, e);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        wlp0.d dVar2 = (wlp0.d) x;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        a(wlp0Var, dVar2, obj4, obj3, phrVar, aVar, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        boolean J = aVar.J(dVar2) | ((i3 > 4 && aVar.J(wlp0Var)) || (i & 6) == 4);
        Object x2 = aVar.x();
        if (J || x2 == obj5) {
            x2 = new o6i0(5, wlp0Var, dVar2);
            aVar.R(x2);
        }
        bap.c(dVar2, (izs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return dVar2;
    }

    public static final wlp0 d(bi50 bi50Var, String str, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:811)");
        }
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !aVar.J(bi50Var)) && (i & 6) != 4) {
            z = false;
        }
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (z || x == obj) {
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e = a2 != null ? a2.e() : null;
            dak0 b = dak0.a.b(a2);
            try {
                Object wlp0Var = new wlp0(bi50Var, null, str);
                dak0.a.d(a2, b, e);
                aVar.R(wlp0Var);
                x = wlp0Var;
            } catch (Throwable th) {
                dak0.a.d(a2, b, e);
                throw th;
            }
        }
        wlp0 wlp0Var2 = (wlp0) x;
        aVar.K(-1356604288);
        wlp0Var2.a(((zak0) bi50Var.e).getValue(), aVar, 0);
        aVar.j();
        boolean J = aVar.J(wlp0Var2);
        Object x2 = aVar.x();
        if (J || x2 == obj) {
            x2 = new r6i0(wlp0Var2, 8);
            aVar.R(x2);
        }
        bap.c(wlp0Var2, (izs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wlp0Var2;
    }

    public static final <T> wlp0<T> e(T t, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = new wlp0(new bi50(t), null, str);
            aVar.R(x);
        }
        wlp0<T> wlp0Var = (wlp0) x;
        wlp0Var.a(t, aVar, (i & 8) | 48 | (i & 14));
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new lzl0(wlp0Var, 2);
            aVar.R(x2);
        }
        bap.c(wlp0Var, (izs) x2, aVar, 54);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wlp0Var;
    }

    @ozl
    public static final wlp0 f(bi50 bi50Var, String str, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:883)");
        }
        wlp0 d = d(bi50Var, str, aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d;
    }
}
