package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TypographyComponentsDemoContent.kt */
/* loaded from: classes18.dex */
public final class cvp0 implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1581113212);
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 16384 : 8192) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 8193) != 8192)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1581113212, i2, -1, "com.vk.design.demo.presentation.screens.typography.TypographyComponentsDemoContent.Content (TypographyComponentsDemoContent.kt:28)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new sm0(6);
                M.R(x);
            }
            q630 b = ahh0.b(aVar2, m4s.C((izs) x, M, 6), Orientation.Vertical);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            dvp0.a(null, M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bvp0(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
