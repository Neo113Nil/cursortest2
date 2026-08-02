package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FilledDescriptionSlotImpl.kt */
/* loaded from: classes5.dex */
public final class acr implements l95 {
    public final wh50 a;
    public final wh50 b;

    public acr(CharSequence charSequence, boolean z) {
        this.a = androidx.compose.runtime.k.b(charSequence);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        acr acrVar;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        String str;
        String str2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1787662558);
        int i4 = i & 48;
        q630.a aVar3 = q630.a.a;
        if (i4 == 0) {
            i2 = (M.J(aVar3) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1787662558, i2, -1, "com.vk.profile.design.compose.header.info.FilledDescriptionSlotImpl.Content (FilledDescriptionSlotImpl.kt:47)");
            }
            final izs izsVar = (izs) M.r(h85.a);
            boolean J = M.J(izsVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                x = new ybr(izsVar, 0);
                M.R(x);
            }
            final izs izsVar2 = (izs) x;
            final wjo0 a = xjo0.a(0, 1, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final frv0 frv0Var = wuv0Var.U;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j = ylu0Var.getText().m;
            String obj = ((CharSequence) ((zak0) this.a).getValue()).toString();
            String N = d370.N(R.string.author_header_description_expand_text, 0, M);
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                str = obj;
                str2 = N;
                c0012a = c0012a2;
                i3 = (int) (wjo0.a(a, str2, frv0Var.a, 0, 0L, 1020).c >> 32);
            } else {
                c0012a = c0012a2;
                str = obj;
                str2 = N;
                i3 = 0;
            }
            q630 E = ahn.E(aVar3, "author_header_description");
            boolean J2 = M.J(str);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new dgk(str, 1);
                M.R(x2);
            }
            float f = 16;
            q630 G = s200.G(egi0.b(E, false, (izs) x2), f, 4, f, 8);
            final String str3 = str;
            final int i5 = i3;
            final String str4 = str2;
            yzs yzsVar = new yzs() { // from class: xsna.zbr
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    LayoutNode.a aVar4;
                    acr acrVar2;
                    wh50 wh50Var;
                    boolean z;
                    q630.a aVar5;
                    int i6;
                    long j2;
                    izs izsVar3;
                    cri.a.d dVar;
                    cri.a.c cVar;
                    cri.a.C2678a c2678a;
                    float f2;
                    acr acrVar3 = this;
                    wh50 wh50Var2 = acrVar3.a;
                    va8 va8Var = (va8) obj2;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar6.J(va8Var) ? 4 : 2;
                    }
                    if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-539481736, intValue, -1, "com.vk.profile.design.compose.header.info.FilledDescriptionSlotImpl.Content.<anonymous> (FilledDescriptionSlotImpl.kt:75)");
                        }
                        int i7 = o6j.i(va8Var.f());
                        frv0 frv0Var2 = frv0Var;
                        nmo0 nmo0Var = frv0Var2.a;
                        int i8 = i7 - i5;
                        ljo0 a2 = wjo0.a(wjo0.this, str3, nmo0Var, 2, s6j.b(0, i8 < 0 ? 0 : i8, 0, 0, 13), 972);
                        m540 m540Var = a2.b;
                        int i9 = m540Var.f - 1;
                        int min = Math.min(1, i9);
                        int f3 = m540Var.f(min);
                        boolean z2 = a2.e() || a2.i(min) - a2.h(min) >= ((float) i8);
                        q630.a aVar7 = q630.a.a;
                        q630 f4 = txj0.f(aVar7, 1.0f);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar6, 0);
                        int hashCode = Long.hashCode(n34.n(aVar6));
                        sy90 D = aVar6.D();
                        q630 c = qri.c(aVar6, f4);
                        cri.h7.getClass();
                        LayoutNode.a aVar8 = cri.a.b;
                        if (aVar6.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar6.H();
                        if (aVar6.L()) {
                            aVar6.I(aVar8);
                        } else {
                            aVar6.f();
                        }
                        cri.a.c cVar2 = cri.a.f;
                        k9q0.w(aVar6, a3, cVar2);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar6, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar6, valueOf, bVar);
                        cri.a.C2678a c2678a2 = cri.a.h;
                        k9q0.t(aVar6, c2678a2);
                        cri.a.d dVar2 = cri.a.d;
                        k9q0.w(aVar6, c, dVar2);
                        izs izsVar4 = izsVar2;
                        long j3 = j;
                        if (f3 != 0) {
                            aVar6.K(134287513);
                            wh50Var = wh50Var2;
                            us2 d = ws2.d(((CharSequence) ((zak0) wh50Var2).getValue()).subSequence(0, f3), izsVar4);
                            f2 = 1.0f;
                            j2 = j3;
                            z = z2;
                            aVar5 = aVar7;
                            i6 = f3;
                            aVar4 = aVar8;
                            acrVar2 = acrVar3;
                            izsVar3 = izsVar4;
                            dVar = dVar2;
                            cVar = cVar2;
                            c2678a = c2678a2;
                            yqv0.d(d, txj0.f(aVar7, 1.0f), j2, 0, null, 0, false, i9, null, null, frv0Var2, aVar6, 48, 0, 7160);
                            aVar6 = aVar6;
                        } else {
                            aVar4 = aVar8;
                            acrVar2 = acrVar3;
                            wh50Var = wh50Var2;
                            z = z2;
                            aVar5 = aVar7;
                            i6 = f3;
                            j2 = j3;
                            izsVar3 = izsVar4;
                            dVar = dVar2;
                            cVar = cVar2;
                            c2678a = c2678a2;
                            f2 = 1.0f;
                            aVar6.K(130228404);
                        }
                        aVar6.j();
                        q630 f5 = txj0.f(aVar5, f2);
                        androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar6, 54);
                        int hashCode2 = Long.hashCode(n34.n(aVar6));
                        sy90 D2 = aVar6.D();
                        q630 c2 = qri.c(aVar6, f5);
                        if (aVar6.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar6.H();
                        if (aVar6.L()) {
                            aVar6.I(aVar4);
                        } else {
                            aVar6.f();
                        }
                        k9q0.w(aVar6, a4, cVar);
                        k9q0.w(aVar6, D2, eVar);
                        ur.d(hashCode2, aVar6, bVar, aVar6, c2678a);
                        k9q0.w(aVar6, c2, dVar);
                        us2 d2 = ws2.d(((CharSequence) ((zak0) wh50Var).getValue()).subSequence(i6, ((CharSequence) ((zak0) wh50Var).getValue()).length()), izsVar3);
                        if (f2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        xpy xpyVar = new xpy(f2, false);
                        boolean z3 = z;
                        androidx.compose.runtime.a aVar9 = aVar6;
                        yqv0.d(d2, ajq.a(xpyVar, z3), j2, 0, null, 0, false, 1, null, null, frv0Var2, aVar9, 805306368, 6, 6648);
                        androidx.compose.runtime.a aVar10 = aVar9;
                        if (((Boolean) ((zak0) acrVar2.b).getValue()).booleanValue()) {
                            aVar10.K(1906813090);
                            if (z3) {
                                aVar10.K(1901400304);
                                aVar10.j();
                            } else {
                                aVar10.K(1906841393);
                                mq.d(aVar5, 8, aVar10, 6);
                            }
                            q630 E2 = ahn.E(aVar5, "author_header_description_expand");
                            izs izsVar5 = izsVar;
                            boolean J3 = aVar10.J(izsVar5);
                            Object x3 = aVar10.x();
                            if (J3 || x3 == a.C0011a.a) {
                                x3 = new ddn(izsVar5, 1);
                                aVar10.R(x3);
                            }
                            q630 c3 = ojc.c(E2, false, null, null, (gzs) x3, 15);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar10.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            yqv0.c(str4, c3, ylu0Var2.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, aVar10, 0, 0, 8184);
                            aVar10 = aVar10;
                        } else {
                            aVar10.K(1901400304);
                        }
                        aVar10.j();
                        if (kr.f(aVar10)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            };
            acrVar = this;
            aVar2 = M;
            ua8.a(G, null, false, kai.c(-539481736, yzsVar, M), aVar2, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            acrVar = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xbo(acrVar, i);
        }
    }
}
