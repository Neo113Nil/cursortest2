package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.au00;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: MarketButtonsScreenContent.kt */
/* loaded from: classes18.dex */
public final class du00 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1468449014);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1468449014, i, -1, "com.vk.design.demo.presentation.screens.Content (MarketButtonsScreenContent.kt:61)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(16);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630.a aVar3 = q630.a.a;
            float f = 8;
            q630 D2 = s200.D(txj0.f(aVar3, 1.0f), f);
            a.j g2 = androidx.compose.foundation.layout.a.g(f);
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g2, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(1.0f, aVar3, true);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            sco0 a3 = au00.b.a.a("Добавить в корзину", null, null, null, null, null, null, M, 805306374, 510);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.movika.tools.controls.seekbar.n(23);
                M.R(x);
            }
            zt00.a((gzs) x, buttonStyle, buttonAppearance, b, null, a3, false, null, null, M, 438, 2000);
            q630 b2 = tpg0Var.b(1.0f, aVar3, true);
            qzu0.a.getClass();
            sco0 a4 = au00.b.a.a("Купить на", "доставка от 1 дня", qzu0.G0(M), new uco(byc0.b(53, 20)), "Озон", null, null, M, 805528118, ApiInvocationException.ErrorCodes.GROUP_RESTRICTION);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new r(15);
                M.R(x2);
            }
            zt00.a((gzs) x2, buttonStyle, buttonAppearance, b2, null, a4, false, null, null, M, 438, 2000);
            M.G();
            q630 D4 = s200.D(txj0.f(aVar3, 1.0f), f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c3 = qri.c(M, D4);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 b3 = tpg0Var.b(1.0f, aVar3, true);
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Positive;
            sco0 a6 = au00.b.a.a("Добавить в корзину", "Послезавтра Послезавтра Послезавтра", null, null, null, null, null, M, 805306422, IronSourceError.ERROR_CODE_INIT_FAILED);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new gu0(24);
                M.R(x3);
            }
            zt00.a((gzs) x3, buttonStyle, buttonAppearance2, b3, null, a6, false, null, null, M, 438, 2000);
            q630 b4 = tpg0Var.b(1.0f, aVar3, true);
            sco0 a7 = au00.b.a.a("Добавить в корзину", null, null, null, null, null, null, M, 805306374, 510);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new x84(19);
                M.R(x4);
            }
            zt00.a((gzs) x4, buttonStyle, buttonAppearance, b4, null, a7, false, null, null, M, 438, 2000);
            M.G();
            q630 D6 = s200.D(txj0.f(aVar3, 1.0f), f);
            androidx.compose.foundation.layout.k a8 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), bVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D7 = M.D();
            q630 c4 = qri.c(M, D6);
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
            k9q0.w(M, a8, cVar);
            k9q0.w(M, D7, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 b5 = tpg0Var.b(1.0f, aVar3, true);
            oqv a9 = au00.a.C2574a.a(qzu0.z0(M), M);
            sco0 a10 = au00.b.a.a("Добавить в корзину", "Послезавтра", null, null, null, null, null, M, 805306422, IronSourceError.ERROR_CODE_INIT_FAILED);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new y84(6);
                M.R(x5);
            }
            zt00.a((gzs) x5, buttonStyle, buttonAppearance, b5, a9, a10, false, null, null, M, 438, 1984);
            q630 b6 = tpg0Var.b(1.0f, aVar3, true);
            oqv a11 = au00.a.C2574a.a(qzu0.z0(M), M);
            sco0 a12 = au00.b.a.a("Купить на", null, null, null, null, null, null, M, 805306374, 510);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new jb(21);
                M.R(x6);
            }
            zt00.a((gzs) x6, buttonStyle, buttonAppearance, b6, a11, a12, false, null, null, M, 438, 1984);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fri(q630Var, i, 1);
        }
    }
}
