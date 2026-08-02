package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: EducationFilterBottomSheetContent.kt */
/* loaded from: classes5.dex */
public final class a8p {
    public static final void a(final String str, boolean z, gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final boolean z2 = z;
        final gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(348248770);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(348248770, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.ApplyButton (EducationFilterBottomSheetContent.kt:254)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, s200.F(18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), null, false, false, null, null, null, str, null, null, null, null, z2, null, null, null, aVar2, ((i2 >> 6) & 14) | 28080, ((i2 << 6) & 896) | ((i2 << 18) & 29360128), 0, 4059104);
            gzsVar2 = gzsVar;
            z2 = z2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, z2, gzsVar2, i) { // from class: xsna.z7p
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    a8p.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1025893541);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1025893541, i, -1, "com.vk.search.params.impl.presentation.modal.education.view.EmptyState (EducationFilterBottomSheetContent.kt:122)");
            }
            q630 D = s200.D(txj0.d(q630.a.a, 1.0f), 16);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.vk_search_empty, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, null, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8122);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new kli(i);
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final String str, final String str2, final String str3, final gzs gzsVar, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-1838003942);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1838003942, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.Institution (EducationFilterBottomSheetContent.kt:211)");
            }
            hly a = h8s.a.a(str, false, null, null, null, M, (i2 & 14) | 196608, 30);
            String str4 = str2 == null ? "" : str2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            u2x a2 = g8s.b.a.a(s2x.b.a.a(str4, gzsVar, str3, ylu0Var.getText().m, null, null, M, ((i2 >> 9) & 112) | 805306368 | (i2 & 896), 496), null, z, null, M, ((i2 >> 3) & 896) | 24576, 10);
            M = M;
            nvu0.a(a2, null, a, null, null, M, 0, 26);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, str, str2, str3, gzsVar, z) { // from class: xsna.x7p
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;

                {
                    this.b = str;
                    this.c = str2;
                    this.d = str3;
                    this.e = z;
                    this.f = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a8p.c(ne7.I(1), (androidx.compose.runtime.a) obj, this.b, this.c, this.d, this.f, this.e);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(String str, String str2, String str3, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(668331585);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(668331585, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.InstitutionCity (EducationFilterBottomSheetContent.kt:188)");
            }
            hly a = h8s.a.a(str, false, null, null, null, M, (i2 & 14) | 196608, 30);
            String str4 = str2 == null ? "" : str2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            u2x a2 = g8s.b.a.a(s2x.b.a.a(str4, gzsVar, str3, ylu0Var.getText().m, null, null, M, ((i2 >> 6) & 112) | 805306368 | (i2 & 896), 496), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a2, null, a, null, null, M, 0, 26);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y7p(str, str2, str3, gzsVar, i);
        }
    }

    public static final void e(final int i, androidx.compose.runtime.a aVar, final String str, final String str2, final izs izsVar, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-1642905216);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1642905216, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.InstitutionType (EducationFilterBottomSheetContent.kt:145)");
            }
            ejv0.a(s200.D(txj0.f(q630.a.a, 1.0f), 16), Integer.valueOf(!z ? 1 : 0), false, null, kai.c(44048467, new yzs() { // from class: xsna.u7p
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    y4i0 y4i0Var = (y4i0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(y4i0Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(44048467, intValue, -1, "com.vk.search.params.impl.presentation.modal.education.view.InstitutionType.<anonymous> (EducationFilterBottomSheetContent.kt:152)");
                        }
                        izs izsVar2 = izsVar;
                        boolean J = aVar2.J(izsVar2);
                        Object x = aVar2.x();
                        Object obj4 = a.C0011a.a;
                        if (J || x == obj4) {
                            x = new c97(izsVar2, 2);
                            aVar2.R(x);
                        }
                        gzs gzsVar = (gzs) x;
                        int i3 = intValue & 14;
                        String str3 = str;
                        boolean z2 = z;
                        a8p.f(i3, aVar2, str3, gzsVar, y4i0Var, z2);
                        boolean z3 = !z2;
                        boolean J2 = aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == obj4) {
                            x2 = new iyl(izsVar2, 1);
                            aVar2.R(x2);
                        }
                        a8p.f(i3, aVar2, str2, (gzs) x2, y4i0Var, z3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 24582, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, str, str2, izsVar, z) { // from class: xsna.v7p
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ izs e;

                {
                    this.b = str;
                    this.c = str2;
                    this.d = z;
                    this.e = izsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a8p.e(ne7.I(1), (androidx.compose.runtime.a) obj, this.b, this.c, this.e, this.d);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, y4i0 y4i0Var, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1221395619);
        if ((i & 6) == 0) {
            i2 = (M.J(y4i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1221395619, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.InstitutionTypeSegment (EducationFilterBottomSheetContent.kt:168)");
            }
            int i3 = i2 >> 6;
            y4i0Var.c(z, gzsVar, kai.c(1949233929, new s7p(str, 0), M), null, M, (i3 & 112) | (i3 & 14) | 384 | ((i2 << 12) & 57344), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t7p(i, str, gzsVar, y4i0Var, z);
        }
    }

    public static final void g(String str, Integer num, String str2, ArrayList arrayList, wzs wzsVar, boolean z, androidx.compose.runtime.a aVar, int i) {
        String str3;
        androidx.compose.runtime.a M = aVar.M(2124788071);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(num) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.J(arrayList) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2124788071, i2, -1, "com.vk.search.params.impl.presentation.modal.education.view.Year (EducationFilterBottomSheetContent.kt:236)");
            }
            String N = d370.N(R.string.search_params_any_date_title, 0, M);
            if (num == null || (str3 = num.toString()) == null) {
                str3 = "";
            }
            String str4 = str3;
            boolean J = M.J(N);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new zl1(N, 1);
                M.R(x);
            }
            wsh0.d(str, arrayList, (izs) x, wzsVar, null, str4, str2, z, null, M, (i2 & 14) | ((i2 >> 6) & 112) | ((i2 >> 3) & 7168) | ((i2 << 12) & 3670016) | ((i2 << 6) & 29360128), 272);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w7p(str, num, str2, arrayList, wzsVar, z, i);
        }
    }
}
