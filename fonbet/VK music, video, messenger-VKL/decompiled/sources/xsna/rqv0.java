package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.DropdownSide;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.input.VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$1;
import com.vk.core.compose.component.input.VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4;
import kotlin.Triple;
import xsna.cri;
import xsna.dak0;
import xsna.dt1;
import xsna.q630;
import xsna.wlp0;

/* compiled from: VkTextFieldContainer.kt */
/* loaded from: classes17.dex */
public final class rqv0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.lang.Object, xsna.jai] */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v29, types: [xsna.l5g] */
    /* JADX WARN: Type inference failed for: r3v34, types: [com.vk.core.compose.component.input.VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$1] */
    /* JADX WARN: Type inference failed for: r3v58, types: [com.vk.core.compose.component.input.VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v9, types: [xsna.l5g] */
    /* JADX WARN: Type inference failed for: r9v10, types: [xsna.l5g] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void a(final InputSelect$State inputSelect$State, final boolean z, final boolean z2, q630 q630Var, DropdownSide dropdownSide, dt1.c cVar, zzs zzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        dt1.c cVar2;
        zzs zzsVar2;
        final DropdownSide dropdownSide2;
        final zzs zzsVar3;
        Throwable th;
        int i4;
        ?? r6;
        long j;
        Object B;
        boolean z5;
        ?? c;
        long j2;
        ?? r3;
        long j3;
        Object B2;
        Object B3;
        int i5;
        int i6;
        boolean z6;
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar.M(-2092249585);
        if ((i & 6) == 0) {
            i3 = (M.o(inputSelect$State.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i3 |= M.l(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i3 |= M.l(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var2) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= M.o(dropdownSide == null ? -1 : dropdownSide.ordinal()) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if ((i & 196608) == 0) {
                i3 |= M.J(cVar2) ? 131072 : 65536;
            }
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
            zzsVar2 = zzsVar;
        } else {
            zzsVar2 = zzsVar;
            if ((i & 1572864) == 0) {
                i3 |= M.y(zzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        if ((i & 12582912) == 0) {
            i3 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            final DropdownSide dropdownSide3 = i7 != 0 ? null : dropdownSide;
            if (i8 != 0) {
                dt1.a.getClass();
                cVar2 = dt1.a.l;
            }
            zzsVar3 = i9 != 0 ? null : zzsVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2092249585, i3, -1, "com.vk.core.compose.component.input.VkTextFieldContainer (VkTextFieldContainer.kt:36)");
            }
            boolean z7 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z7 || x == obj) {
                th = null;
                x = new Triple(inputSelect$State, Boolean.valueOf(z3), Boolean.valueOf(z4));
                M.R(x);
            } else {
                th = null;
            }
            wlp0 e = ump0.e((Triple) x, "InputContainerAnimation", M, 48, 0);
            z46 z46Var = e.a;
            Triple triple = (Triple) ((zak0) e.d).getValue();
            M.K(1336770734);
            if (androidx.compose.runtime.b.d()) {
                i4 = i3;
                androidx.compose.runtime.b.f(1336770734, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:48)");
            } else {
                i4 = i3;
            }
            InputSelect$State inputSelect$State2 = (InputSelect$State) triple.d();
            Boolean bool = (Boolean) triple.h();
            boolean booleanValue = bool.booleanValue();
            if (zzsVar3 == null) {
                M.K(800232315);
                M.j();
                r6 = th;
            } else {
                M.K(441455942);
                r6 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(((l5g) zzsVar3.invoke(inputSelect$State2, bool, M, Integer.valueOf((i4 >> 12) & 896))).a, M);
            }
            if (r6 == 0) {
                M.K(441458068);
                s1v.k();
                j = on20.a.c(inputSelect$State2, booleanValue, M);
                M.j();
            } else {
                M.K(441455247);
                M.j();
                j = r6.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            d8g g = l5g.g(j);
            boolean J = M.J(g);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = (itp0) b9g.a.invoke(g);
                M.R(x2);
            }
            itp0 itp0Var = (itp0) x2;
            if (e.g()) {
                M.K(1666827533);
                M.j();
                B = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J2 = M.J(e);
                B = M.x();
                if (J2 || B == obj) {
                    dak0 a = dak0.a.a();
                    ?? e2 = a != null ? a.e() : th;
                    dak0 b = dak0.a.b(a);
                    try {
                        Object B4 = z46Var.B();
                        dak0.a.d(a, b, e2);
                        M.R(B4);
                        B = B4;
                    } finally {
                    }
                }
                M.j();
            }
            Triple triple2 = (Triple) B;
            M.K(1336770734);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1336770734, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:48)");
            }
            InputSelect$State inputSelect$State3 = (InputSelect$State) triple2.d();
            Boolean bool2 = (Boolean) triple2.h();
            boolean booleanValue2 = bool2.booleanValue();
            if (zzsVar3 == null) {
                M.K(800232315);
                M.j();
                z5 = booleanValue2;
                c = th;
            } else {
                M.K(441455942);
                z5 = booleanValue2;
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(((l5g) zzsVar3.invoke(inputSelect$State3, bool2, M, Integer.valueOf((i4 >> 12) & 896))).a, M);
            }
            if (c == 0) {
                M.K(441458068);
                s1v.k();
                j2 = on20.a.c(inputSelect$State3, z5, M);
                M.j();
            } else {
                M.K(441455247);
                M.j();
                j2 = c.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            l5g c2 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
            boolean J3 = M.J(e);
            Object x3 = M.x();
            if (J3 || x3 == obj) {
                x3 = bbk0.b(new lqv0(e));
                M.R(x3);
            }
            Triple triple3 = (Triple) ((mtk0) x3).getValue();
            M.K(1336770734);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1336770734, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:48)");
            }
            InputSelect$State inputSelect$State4 = (InputSelect$State) triple3.d();
            Boolean bool3 = (Boolean) triple3.h();
            boolean booleanValue3 = bool3.booleanValue();
            if (zzsVar3 == null) {
                M.K(800232315);
                M.j();
                r3 = th;
            } else {
                M.K(441455942);
                r3 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(((l5g) zzsVar3.invoke(inputSelect$State4, bool3, M, Integer.valueOf((i4 >> 12) & 896))).a, M);
            }
            if (r3 == 0) {
                M.K(441458068);
                s1v.k();
                j3 = on20.a.c(inputSelect$State4, booleanValue3, M);
                M.j();
            } else {
                M.K(441455247);
                M.j();
                j3 = r3.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            l5g c3 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j3, M);
            boolean J4 = M.J(e);
            Object x4 = M.x();
            if (J4 || x4 == obj) {
                x4 = bbk0.b(new mqv0(e));
                M.R(x4);
            }
            final wlp0.d c4 = ump0.c(e, c2, c3, VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$1.i.invoke(((mtk0) x4).getValue(), M, 0), itp0Var, M, 196608);
            Triple triple4 = (Triple) e.f();
            M.K(-1928206292);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1928206292, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:56)");
            }
            InputSelect$State inputSelect$State5 = (InputSelect$State) triple4.d();
            boolean booleanValue4 = ((Boolean) triple4.g()).booleanValue();
            boolean booleanValue5 = ((Boolean) triple4.h()).booleanValue();
            s1v.k();
            on20 on20Var = on20.a;
            long d = on20Var.d(inputSelect$State5, booleanValue4, booleanValue5, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            d8g g2 = l5g.g(d);
            boolean J5 = M.J(g2);
            Object x5 = M.x();
            if (J5 || x5 == obj) {
                x5 = (itp0) b9g.a.invoke(g2);
                M.R(x5);
            }
            itp0 itp0Var2 = (itp0) x5;
            if (e.g()) {
                M.K(1666827533);
                M.j();
                B2 = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J6 = M.J(e);
                B2 = M.x();
                if (J6 || B2 == obj) {
                    dak0 a2 = dak0.a.a();
                    ?? e3 = a2 != null ? a2.e() : th;
                    dak0 b2 = dak0.a.b(a2);
                    try {
                        Object B5 = z46Var.B();
                        dak0.a.d(a2, b2, e3);
                        M.R(B5);
                        B2 = B5;
                    } finally {
                    }
                }
                M.j();
            }
            Triple triple5 = (Triple) B2;
            M.K(-1928206292);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1928206292, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:56)");
            }
            InputSelect$State inputSelect$State6 = (InputSelect$State) triple5.d();
            boolean booleanValue6 = ((Boolean) triple5.g()).booleanValue();
            boolean booleanValue7 = ((Boolean) triple5.h()).booleanValue();
            s1v.k();
            long d2 = on20Var.d(inputSelect$State6, booleanValue6, booleanValue7, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            l5g c5 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(d2, M);
            boolean J7 = M.J(e);
            Object x6 = M.x();
            if (J7 || x6 == obj) {
                x6 = bbk0.b(new nqv0(e));
                M.R(x6);
            }
            Triple triple6 = (Triple) ((mtk0) x6).getValue();
            M.K(-1928206292);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1928206292, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:56)");
            }
            InputSelect$State inputSelect$State7 = (InputSelect$State) triple6.d();
            boolean booleanValue8 = ((Boolean) triple6.g()).booleanValue();
            boolean booleanValue9 = ((Boolean) triple6.h()).booleanValue();
            s1v.k();
            long d3 = on20Var.d(inputSelect$State7, booleanValue8, booleanValue9, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            l5g c6 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(d3, M);
            boolean J8 = M.J(e);
            Object x7 = M.x();
            if (J8 || x7 == obj) {
                x7 = bbk0.b(new oqv0(e));
                M.R(x7);
            }
            final wlp0.d c7 = ump0.c(e, c5, c6, VkTextFieldContainerKt$VkTextFieldContainer$$inlined$animateColor$4.i.invoke(((mtk0) x7).getValue(), M, 0), itp0Var2, M, 196608);
            s1v.k();
            final float f = on20.c;
            jtp0 jtp0Var = rte0.g;
            if (e.g()) {
                M.K(1666827533);
                M.j();
                B3 = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J9 = M.J(e);
                B3 = M.x();
                if (J9 || B3 == obj) {
                    dak0 a3 = dak0.a.a();
                    ?? e4 = a3 != null ? a3.e() : th;
                    dak0 b3 = dak0.a.b(a3);
                    try {
                        Object B6 = z46Var.B();
                        dak0.a.d(a3, b3, e4);
                        M.R(B6);
                        B3 = B6;
                    } finally {
                    }
                }
                M.j();
            }
            Triple triple7 = (Triple) B3;
            M.K(451482020);
            if (androidx.compose.runtime.b.d()) {
                i5 = 0;
                androidx.compose.runtime.b.f(451482020, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:65)");
            } else {
                i5 = 0;
            }
            float f2 = (dropdownSide3 != null && ((Boolean) triple7.g()).booleanValue()) ? i5 : f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            pco pcoVar = new pco(f2);
            boolean J10 = M.J(e);
            Object x8 = M.x();
            if (J10 || x8 == obj) {
                x8 = bbk0.b(new pqv0(e));
                M.R(x8);
            }
            Triple triple8 = (Triple) ((mtk0) x8).getValue();
            M.K(451482020);
            if (androidx.compose.runtime.b.d()) {
                i6 = 0;
                androidx.compose.runtime.b.f(451482020, 0, -1, "com.vk.core.compose.component.input.VkTextFieldContainer.<anonymous> (VkTextFieldContainer.kt:65)");
            } else {
                i6 = 0;
            }
            float f3 = (dropdownSide3 != null && ((Boolean) triple8.g()).booleanValue()) ? i6 : f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            pco pcoVar2 = new pco(f3);
            boolean J11 = M.J(e);
            Object x9 = M.x();
            if (J11 || x9 == obj) {
                x9 = bbk0.b(new qqv0(e));
                M.R(x9);
            }
            M.K(-1953972046);
            if (androidx.compose.runtime.b.d()) {
                z6 = false;
                androidx.compose.runtime.b.f(-1953972046, 0, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1997)");
            } else {
                z6 = false;
            }
            Object obj2 = c5u0.a;
            xmk0 c8 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new pco(0.4f), 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            boolean z8 = z6;
            final wlp0.d c9 = ump0.c(e, pcoVar, pcoVar2, c8, jtp0Var, M, 196608);
            s1v.k();
            float f4 = on20.b;
            boolean J12 = M.J(c4) | M.J(c7);
            if ((i4 & 57344) == 16384) {
                z8 = true;
            }
            boolean n = M.n(f4) | J12 | z8 | M.J(c9) | M.n(f);
            Object x10 = M.x();
            if (n || x10 == obj) {
                x10 = new izs() { // from class: xsna.jqv0
                    {
                        on20 on20Var2 = on20.a;
                    }

                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        on20 on20Var2 = on20.a;
                        return ((kw8) obj3).c(new lkn0(dropdownSide3, f, c4, c7, c9));
                    }
                };
                M.R(x10);
            }
            q630 e5 = bu00.e(q630.a.a, (izs) x10);
            s1v.k();
            q630Var2 = q630Var;
            q630 g3 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, on20.d, 1, e5).g(q630Var2);
            int i10 = ((i4 >> 9) & 896) | ((i4 >> 12) & 7168);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, cVar2, M, (i10 >> 3) & 112);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c10 = qri.c(M, g3);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c10, cri.a.d);
            jaiVar.invoke(tpg0.a, M, Integer.valueOf(((i10 >> 6) & 112) | 6));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dropdownSide2 = dropdownSide3;
        } else {
            M.h();
            dropdownSide2 = dropdownSide;
            zzsVar3 = zzsVar2;
        }
        final dt1.c cVar3 = cVar2;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kqv0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    rqv0.a(InputSelect$State.this, z, z2, q630Var2, dropdownSide2, cVar3, zzsVar3, jaiVar, (androidx.compose.runtime.a) obj3, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
