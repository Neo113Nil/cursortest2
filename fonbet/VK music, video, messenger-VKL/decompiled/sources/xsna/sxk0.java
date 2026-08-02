package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: StaticBlurScreenContent.kt */
/* loaded from: classes18.dex */
public final class sxk0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1973956457);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630 q630Var = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8339) != 8338)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1973956457, i2, -1, "com.vk.design.demo.presentation.screens.StaticBlurScreenContent.Content (StaticBlurScreenContent.kt:56)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(wbl.a);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            Object obj2 = (yvj) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) x3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1993731870, 0, -1, "com.vk.core.tool.compose.blur.control.rememberRegion (BlurRecordingState.kt:29)");
            }
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.k.b(new ArrayList());
                M.R(x4);
            }
            wh50 wh50Var3 = (wh50) x4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1353399796, 0, -1, "com.vk.core.tool.compose.blur.rememberBlurRecordingState (BlurState.kt:12)");
            }
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new vg7(wh50Var3);
                M.R(x5);
            }
            vg7 vg7Var = (vg7) x5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            jjn0.a("Static Blur", gzsVar, x5Var, gzsVar2, null, null, M, ((i2 << 6) & 7168) | (i2 & 896) | ((i2 << 3) & 112) | 6, 48);
            djn0.a(true, true, M, 438, 0);
            dh7 dh7Var = (dh7) wh50Var.getValue();
            boolean y = M.y(obj2) | M.J(vg7Var);
            Object x6 = M.x();
            if (y || x6 == obj) {
                Object ii80Var = new ii80(obj2, vg7Var, wh50Var2, wh50Var, 1);
                M.R(ii80Var);
                x6 = ii80Var;
            }
            txk0.c(dh7Var, (izs) x6, M, 0);
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, q630Var);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                q630Var = bu00.f(q630Var, new com.vk.movika.sdk.base.observable.g(vg7Var, 8));
            }
            txk0.a(q630Var, M, 0);
            if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                M.K(-73891640);
                txk0.b(vg7Var, (dh7) wh50Var.getValue(), null, M, 0);
            } else {
                M.K(-77671811);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jd30(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
