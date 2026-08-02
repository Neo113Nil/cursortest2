package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$Debounce$1$1;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.f7p0;

/* compiled from: StorefrontServicesTopBar.kt */
/* loaded from: classes18.dex */
public final class rol0 {
    public static final void a(gzs gzsVar, long j, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        long j2;
        androidx.compose.runtime.a M = aVar.M(1287989223);
        int i2 = i | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1287989223, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.Debounce (StorefrontServicesTopBar.kt:110)");
            }
            s3q0 s3q0Var = s3q0.a;
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            j2 = 300;
            if (z || x == a.C0011a.a) {
                StorefrontServicesTopBarKt$Debounce$1$1 storefrontServicesTopBarKt$Debounce$1$1 = new StorefrontServicesTopBarKt$Debounce$1$1(gzsVar, 300L, izsVar, null);
                M.R(storefrontServicesTopBarKt$Debounce$1$1);
                x = storefrontServicesTopBarKt$Debounce$1$1;
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r5g(gzsVar, j2, izsVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x019d, code lost:
    
        if (r2 == r13) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(sol0 sol0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        boolean z;
        int i2;
        a.C0011a.C0012a c0012a;
        int i3;
        androidx.compose.runtime.a aVar3;
        TopBar$Middle a;
        com.vk.core.compose.component.topbar.a aVar4;
        int i4;
        int i5;
        int i6;
        d.c.C0760d c0760d;
        f7p0.c cVar;
        d.c.C0760d a2;
        int i7;
        Object x;
        f7p0.c cVar2;
        d.b.a a3;
        d.b.a aVar5;
        int i8;
        com.vk.core.compose.component.topbar.a a4;
        int i9;
        d.c.C0760d a5;
        int i10;
        a.C0011a.C0012a c0012a2;
        int i11 = sol0Var.d;
        boolean z2 = sol0Var.c;
        boolean z3 = sol0Var.a;
        tlo0 tlo0Var = sol0Var.f;
        boolean z4 = sol0Var.b;
        androidx.compose.runtime.a M = aVar.M(1296876790);
        int i12 = i | (M.J(sol0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i12 & 1, (i12 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1296876790, i12, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBar (StorefrontServicesTopBar.kt:43)");
            }
            ogr ogrVar = sol0Var.g;
            if (ogrVar == null) {
                M.K(2025829490);
            } else {
                M.K(2025829491);
                rfr.a(ogrVar, null, izsVar, M, (i12 << 3) & 896);
                s3q0 s3q0Var = s3q0.a;
            }
            M.j();
            String str = sol0Var.e;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x2 == c0012a3) {
                x2 = io.reactivex.rxjava3.internal.operators.mixed.j.d(str.length() > 0, M);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a3) {
                int length = str.length();
                wh50Var = wh50Var2;
                x3 = androidx.compose.runtime.k.b(new tho0(str, jgz.c(length, length), 4));
                M.R(x3);
            } else {
                wh50Var = wh50Var2;
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a3) {
                x4 = new a2k(3, wh50Var3);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            int i13 = i12 & 112;
            boolean z5 = i13 == 32;
            Object x5 = M.x();
            if (z5 || x5 == c0012a3) {
                z = true;
                x5 = new x8j0(izsVar, 1);
                M.R(x5);
            } else {
                z = true;
            }
            wh50 wh50Var4 = wh50Var;
            boolean z6 = z;
            a(gzsVar, 0L, (izs) x5, M, 6);
            boolean J = M.J(str);
            Object x6 = M.x();
            if (J || x6 == c0012a3) {
                x6 = new qol0(str, wh50Var3, wh50Var4, null);
                M.R(x6);
            }
            bap.g(str, (wzs) x6, M, 0);
            Object x7 = M.x();
            if (x7 == c0012a3) {
                x7 = io.reactivex.rxjava3.internal.operators.mixed.j.d(tlo0Var == null ? z6 : false, M);
            }
            wh50 wh50Var5 = (wh50) x7;
            boolean z7 = i13 == 32 ? z6 : false;
            Object x8 = M.x();
            if (z7 || x8 == c0012a3) {
                x8 = new fe1(izsVar, 3);
                M.R(x8);
            }
            TopBar$Before.e a6 = e.a.a((gzs) x8, null, null, null, null, M, 196608, 30);
            int i14 = 22;
            if (((Boolean) wh50Var5.getValue()).booleanValue() && z4) {
                M.K(2026669715);
                String N = d370.N(R.string.storefront_services_search, 0, M);
                tho0 tho0Var = (tho0) wh50Var3.getValue();
                boolean z8 = i13 == 32 ? z6 : false;
                Object x9 = M.x();
                if (z8) {
                    c0012a2 = c0012a3;
                } else {
                    c0012a2 = c0012a3;
                }
                x9 = new zyf(izsVar, 7);
                M.R(x9);
                fkg0 l = mnh0.l((gzs) x9, M, 11);
                Object x10 = M.x();
                if (x10 == c0012a2) {
                    x10 = new z6u(i14);
                    M.R(x10);
                }
                com.vk.core.compose.component.semantics.a a7 = com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3);
                Object x11 = M.x();
                if (x11 == c0012a2) {
                    x11 = new fk4(2, wh50Var3);
                    M.R(x11);
                }
                izs izsVar2 = (izs) x11;
                Object x12 = M.x();
                if (x12 == c0012a2) {
                    x12 = new ape0(wh50Var4, 9);
                    M.R(x12);
                }
                izs izsVar3 = (izs) x12;
                i2 = 9;
                c0012a = c0012a2;
                i3 = 3;
                a = TopBar$Middle.b.a.a(N, tho0Var, izsVar2, null, l, null, null, null, a7, false, izsVar3, false, M, 384, 390, 2792);
                aVar3 = M;
                aVar3.j();
            } else {
                i2 = 9;
                c0012a = c0012a3;
                i3 = 3;
                M.K(2027194793);
                aVar3 = M;
                a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(kq01.g(tlo0Var, M), null, null, null, null, M, 196608, 30), null, null, null, aVar3, 14);
                aVar3.j();
            }
            TopBar$Middle topBar$Middle = a;
            if (((Boolean) wh50Var4.getValue()).booleanValue()) {
                aVar3.K(2027818791);
                aVar3.j();
                aVar4 = null;
            } else {
                aVar3.K(2027338943);
                boolean booleanValue = ((Boolean) wh50Var5.getValue()).booleanValue();
                Object x13 = aVar3.x();
                if (x13 == c0012a) {
                    x13 = new wp40(wh50Var5, 25);
                    aVar3.R(x13);
                }
                gzs gzsVar2 = (gzs) x13;
                int i15 = (i12 & 14) | 384 | ((i12 << 6) & 7168);
                if (androidx.compose.runtime.b.d()) {
                    i4 = -1;
                    androidx.compose.runtime.b.f(-1088420477, i15, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.getRightIcon (StorefrontServicesTopBar.kt:126)");
                } else {
                    i4 = -1;
                }
                if (z3) {
                    aVar3.K(1999950647);
                    if (sol0Var.h) {
                        aVar3.K(1868956342);
                        if (androidx.compose.runtime.b.d()) {
                            i10 = 0;
                            androidx.compose.runtime.b.f(2048237034, 0, i4, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SettingsOutline28> (VkSdkIcons.kt:3322)");
                        } else {
                            i10 = 0;
                        }
                        lg90 b = or.b(aVar3, 429284277, R.drawable.vk_icon_settings_outline_28, aVar3, i10);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean z9 = ((((i15 & 7168) ^ 3072) <= 2048 || !aVar3.J(izsVar)) && (i15 & 3072) != 2048) ? false : z6;
                        Object x14 = aVar3.x();
                        if (z9 || x14 == c0012a) {
                            x14 = new yd1(izsVar, i2);
                            aVar3.R(x14);
                        }
                        gzs gzsVar3 = (gzs) x14;
                        Object x15 = aVar3.x();
                        if (x15 == c0012a) {
                            x15 = new wx30(14);
                            aVar3.R(x15);
                        }
                        com.vk.core.compose.component.semantics.a a8 = com.vk.core.compose.component.semantics.b.a(null, (izs) x15, i3);
                        androidx.compose.runtime.a aVar6 = aVar3;
                        i5 = i15;
                        i6 = i4;
                        a5 = d.c.C0760d.a.a(b, null, gzsVar3, null, null, a8, aVar6, 1572872, 26);
                        aVar3 = aVar6;
                        aVar3.j();
                    } else {
                        i5 = i15;
                        i6 = i4;
                        aVar3.K(1869320003);
                        if (androidx.compose.runtime.b.d()) {
                            i9 = 0;
                            androidx.compose.runtime.b.f(-1869183844, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                        } else {
                            i9 = 0;
                        }
                        lg90 b2 = or.b(aVar3, -604730424, R.drawable.vk_icon_add_outline_28, aVar3, i9);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean z10 = ((((i5 & 7168) ^ 3072) <= 2048 || !aVar3.J(izsVar)) && (i5 & 3072) != 2048) ? false : z6;
                        Object x16 = aVar3.x();
                        if (z10 || x16 == c0012a) {
                            x16 = new mv7(izsVar, 8);
                            aVar3.R(x16);
                        }
                        gzs gzsVar4 = (gzs) x16;
                        Object x17 = aVar3.x();
                        if (x17 == c0012a) {
                            x17 = new rgl0(2);
                            aVar3.R(x17);
                        }
                        androidx.compose.runtime.a aVar7 = aVar3;
                        a5 = d.c.C0760d.a.a(b2, null, gzsVar4, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x17, 3), aVar7, 1572872, 26);
                        aVar3 = aVar7;
                        aVar3.j();
                    }
                    a2 = a5;
                    aVar3.j();
                } else {
                    i5 = i15;
                    i6 = i4;
                    if (!booleanValue && z4) {
                        aVar3.K(1999976350);
                        if (androidx.compose.runtime.b.d()) {
                            i7 = 0;
                            androidx.compose.runtime.b.f(-1717878368, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SearchOutline28> (VkSdkIcons.kt:3020)");
                        } else {
                            i7 = 0;
                        }
                        lg90 b3 = or.b(aVar3, 1516014657, R.drawable.vk_icon_search_outline_28, aVar3, i7);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar8 = aVar3;
                        a2 = d.c.C0760d.a.a(b3, null, gzsVar2, null, null, null, aVar8, 1573256, 58);
                        aVar3 = aVar8;
                        aVar3.j();
                    } else if (z2) {
                        aVar3.K(1869848708);
                        lg90 a9 = pg90.a(R.drawable.vk_icon_bookmark_outline_28, 0, aVar3);
                        if (i11 > 0) {
                            aVar3.K(1999985640);
                            f7p0.c a10 = f7p0.c.a.a(sol0Var.d, null, null, null, aVar3, 24576, 14);
                            aVar3.j();
                            cVar = a10;
                        } else {
                            aVar3.K(1870069210);
                            aVar3.j();
                            cVar = null;
                        }
                        Object x18 = aVar3.x();
                        if (x18 == c0012a) {
                            x18 = new quz(22);
                            aVar3.R(x18);
                        }
                        com.vk.core.compose.component.semantics.a a11 = com.vk.core.compose.component.semantics.b.a(null, (izs) x18, 3);
                        boolean z11 = ((((i5 & 7168) ^ 3072) <= 2048 || !aVar3.J(izsVar)) && (i5 & 3072) != 2048) ? false : z6;
                        Object x19 = aVar3.x();
                        if (z11 || x19 == c0012a) {
                            x19 = new nac(izsVar, 7);
                            aVar3.R(x19);
                        }
                        androidx.compose.runtime.a aVar9 = aVar3;
                        a2 = d.c.C0760d.a.a(a9, null, (gzs) x19, cVar, null, a11, aVar9, 1572872, 18);
                        aVar3 = aVar9;
                        aVar3.j();
                    } else {
                        aVar3.K(1870319194);
                        aVar3.j();
                        c0760d = null;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean booleanValue2 = ((Boolean) wh50Var5.getValue()).booleanValue();
                        x = aVar3.x();
                        if (x == c0012a) {
                            x = new ye80(wh50Var5, 22);
                            aVar3.R(x);
                        }
                        gzs gzsVar5 = (gzs) x;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1716586705, i5, i6, "com.vk.ecomm.storefrontservices.impl.presentation.ui.getLeftIcon (StorefrontServicesTopBar.kt:169)");
                        }
                        if (z3) {
                            aVar3.K(-1340822644);
                            aVar3.j();
                        } else {
                            if (!booleanValue2 && z4) {
                                aVar3.K(372393708);
                                if (androidx.compose.runtime.b.d()) {
                                    i8 = 0;
                                    androidx.compose.runtime.b.f(-1717878368, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SearchOutline28> (VkSdkIcons.kt:3020)");
                                } else {
                                    i8 = 0;
                                }
                                lg90 b4 = or.b(aVar3, 1516014657, R.drawable.vk_icon_search_outline_28, aVar3, i8);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                androidx.compose.runtime.a aVar10 = aVar3;
                                a3 = d.b.a.C0757a.a(b4, null, gzsVar5, null, null, null, aVar10, 12583304, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                aVar3 = aVar10;
                                aVar3.j();
                            } else if (z2) {
                                aVar3.K(-1340571946);
                                lg90 a12 = pg90.a(R.drawable.vk_icon_bookmark_outline_28, 0, aVar3);
                                if (i11 > 0) {
                                    aVar3.K(372403030);
                                    f7p0.c a13 = f7p0.c.a.a(sol0Var.d, null, null, null, aVar3, 24576, 14);
                                    aVar3.j();
                                    cVar2 = a13;
                                } else {
                                    aVar3.K(-1340351444);
                                    aVar3.j();
                                    cVar2 = null;
                                }
                                Object x20 = aVar3.x();
                                if (x20 == c0012a) {
                                    x20 = new n9w(29);
                                    aVar3.R(x20);
                                }
                                com.vk.core.compose.component.semantics.a a14 = com.vk.core.compose.component.semantics.b.a(null, (izs) x20, 3);
                                if ((((i5 & 7168) ^ 3072) <= 2048 || !aVar3.J(izsVar)) && (i5 & 3072) != 2048) {
                                    z6 = false;
                                }
                                Object x21 = aVar3.x();
                                if (z6 || x21 == c0012a) {
                                    x21 = new o2h(izsVar, 6);
                                    aVar3.R(x21);
                                }
                                androidx.compose.runtime.a aVar11 = aVar3;
                                a3 = d.b.a.C0757a.a(a12, null, (gzs) x21, cVar2, null, a14, aVar11, 12582920, 82);
                                aVar3 = aVar11;
                                aVar3.j();
                            } else {
                                aVar3.K(-1340101460);
                                aVar3.j();
                            }
                            aVar5 = a3;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (c0760d == null) {
                                aVar3.K(2027770121);
                                aVar3.j();
                                a4 = null;
                            } else {
                                aVar3.K(2027770122);
                                a4 = d.a.a(c0760d, aVar5, null, null, aVar3, 24576, 12);
                                aVar3.j();
                            }
                            aVar3.j();
                            aVar4 = a4;
                        }
                        aVar5 = null;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (c0760d == null) {
                        }
                        aVar3.j();
                        aVar4 = a4;
                    }
                }
                c0760d = a2;
                if (androidx.compose.runtime.b.d()) {
                }
                boolean booleanValue22 = ((Boolean) wh50Var5.getValue()).booleanValue();
                x = aVar3.x();
                if (x == c0012a) {
                }
                gzs gzsVar52 = (gzs) x;
                if (androidx.compose.runtime.b.d()) {
                }
                if (z3) {
                }
                aVar5 = null;
                if (androidx.compose.runtime.b.d()) {
                }
                if (c0760d == null) {
                }
                aVar3.j();
                aVar4 = a4;
            }
            androidx.compose.runtime.a aVar12 = aVar3;
            muv0.h(topBar$Middle, q630Var, null, null, a6, null, aVar4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar12, 48, 0, 8108);
            aVar2 = aVar12;
            vvr vvrVar = (vvr) aVar2.r(uvi.i);
            Boolean bool = (Boolean) wh50Var4.getValue();
            bool.getClass();
            boolean y = aVar2.y(vvrVar);
            Object x22 = aVar2.x();
            if (y || x22 == c0012a) {
                x22 = new pol0(vvrVar, wh50Var4, null);
                aVar2.R(x22);
            }
            bap.g(bool, (wzs) x22, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ss0(i, 5, sol0Var, izsVar, q630Var);
        }
    }
}
