package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dll0;
import xsna.f7p0;

/* compiled from: StorefrontAlbumsScreen.kt */
/* loaded from: classes18.dex */
public final class tkl0 {
    public static final void a(dll0 dll0Var, Object obj, yw90 yw90Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1325980123);
        if ((i & 6) == 0) {
            i2 = (M.J(dll0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(yw90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1325980123, i2, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsContent (StorefrontAlbumsScreen.kt:72)");
            }
            rrv0.d(null, null, null, null, kai.c(233260438, new r1k(dll0Var, izsVar, obj, yw90Var, 1), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qqd(dll0Var, obj, yw90Var, izsVar, i, 3);
        }
    }

    public static final void b(vkl0 vkl0Var, final Object obj, final yw90 yw90Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2007344383);
        int i2 = (M.J(vkl0Var) ? 4 : 2) | i | (M.J(obj) ? 32 : 16) | (M.J(yw90Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2007344383, i2, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsScreen (StorefrontAlbumsScreen.kt:40)");
            }
            kpl0 kpl0Var = new kpl0();
            boolean J = ((i2 & 14) == 4) | M.J(kpl0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new k82(24, vkl0Var, kpl0Var);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z = (i2 & 7168) == 2048;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new skl0(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(-839887534, new zzs() { // from class: xsna.nkl0
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    z37 z37Var = (z37) obj2;
                    dll0 dll0Var = (dll0) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(dll0Var) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-839887534, i3, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsScreen.<anonymous> (StorefrontAlbumsScreen.kt:56)");
                        }
                        boolean z2 = (i3 & 14) == 4;
                        Object x3 = aVar2.x();
                        if (z2 || x3 == a.C0011a.a) {
                            whe wheVar = new whe(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0, 13);
                            aVar2.R(wheVar);
                            x3 = wheVar;
                        }
                        tkl0.a(dll0Var, obj, yw90Var, (izs) ((fcy) x3), aVar2, (i3 >> 3) & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xph0(vkl0Var, obj, yw90Var, izsVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        if (r12 == r11) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(dll0.b bVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        a.C0011a.C0012a c0012a;
        int i6;
        d.c.C0760d c0760d;
        int i7;
        f7p0.c cVar;
        d.c.C0760d a;
        f7p0.c cVar2;
        a.C0011a.C0012a c0012a2;
        boolean z4 = bVar.a;
        androidx.compose.runtime.a M = aVar.M(1180953823);
        int i8 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i8 & 1, (i8 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1180953823, i8, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.TopBarImpl (StorefrontAlbumsScreen.kt:121)");
            }
            int i9 = i8 & 112;
            Object[] objArr = i9 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (objArr != false || x == c0012a3) {
                x = new u78(izsVar, 7);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, null, null, null, null, M, 196608, 30);
            TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(d370.N(R.string.community_market_albums, 0, M), null, null, null, null, M, 196608, 30);
            androidx.compose.runtime.a aVar2 = M;
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(a3, null, null, null, aVar2, 14);
            int i10 = i8 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2050152262, i10, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.getMainIcon (StorefrontAlbumsScreen.kt:152)");
            }
            int i11 = bVar.b;
            boolean z5 = bVar.c;
            int i12 = bVar.e;
            boolean z6 = bVar.d;
            d.b.a aVar3 = null;
            com.vk.core.compose.component.topbar.a a5 = null;
            f7p0.c cVar3 = null;
            f7p0.c cVar4 = null;
            if (z4) {
                aVar2.K(1651294522);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1869183844, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                }
                lg90 b = or.b(aVar2, -604730424, R.drawable.vk_icon_add_outline_28, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object[] objArr2 = ((i9 ^ 48) > 32 && aVar2.J(izsVar)) || (i8 & 48) == 32;
                Object x2 = aVar2.x();
                if (objArr2 == true) {
                    c0012a2 = c0012a3;
                } else {
                    c0012a2 = c0012a3;
                }
                x2 = new gr7(izsVar, 8);
                aVar2.R(x2);
                z2 = z5;
                i4 = i12;
                z3 = z6;
                i2 = i9;
                str = "com.vk.core.compose.icons.generated.VkSdkIcons.<get-BookmarkOutline28> (VkSdkIcons.kt:158)";
                z = z4;
                i5 = i8;
                i3 = i10;
                c0012a = c0012a2;
                i6 = 963857668;
                a = d.c.C0760d.a.a(b, null, (gzs) x2, null, null, null, aVar2, 1572872, 58);
                aVar2 = aVar2;
                aVar2.j();
            } else {
                i2 = i9;
                str = "com.vk.core.compose.icons.generated.VkSdkIcons.<get-BookmarkOutline28> (VkSdkIcons.kt:158)";
                z = z4;
                i3 = i10;
                z2 = z5;
                i4 = i12;
                z3 = z6;
                i5 = i8;
                c0012a = c0012a3;
                i6 = 963857668;
                if (z3) {
                    aVar2.K(1651556999);
                    qzu0.a.getClass();
                    lg90 m1 = qzu0.m1(aVar2);
                    if (i4 > 0) {
                        aVar2.K(-1193644346);
                        f7p0.c a6 = f7p0.c.a.a(bVar.e, null, null, null, aVar2, 24576, 14);
                        aVar2.j();
                        cVar2 = a6;
                    } else {
                        aVar2.K(1651790583);
                        aVar2.j();
                        cVar2 = null;
                    }
                    boolean z7 = ((i2 ^ 48) > 32 && aVar2.J(izsVar)) || (i5 & 48) == 32;
                    Object x3 = aVar2.x();
                    if (z7 || x3 == c0012a) {
                        x3 = new zje(izsVar, 7);
                        aVar2.R(x3);
                    }
                    a = d.c.C0760d.a.a(m1, null, (gzs) x3, cVar2, null, null, aVar2, 1572872, 50);
                    aVar2 = aVar2;
                    aVar2.j();
                } else if (z2) {
                    aVar2.K(1651998346);
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(963857668, 0, -1, str);
                    } else {
                        i7 = 0;
                    }
                    lg90 b2 = or.b(aVar2, -1867375013, R.drawable.vk_icon_bookmark_outline_28, aVar2, i7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (i11 > 0) {
                        aVar2.K(-1193629991);
                        f7p0.c a7 = f7p0.c.a.a(bVar.b, null, null, null, aVar2, 24576, 14);
                        aVar2.j();
                        cVar = a7;
                    } else {
                        aVar2.K(1652285591);
                        aVar2.j();
                        cVar = null;
                    }
                    boolean z8 = ((i2 ^ 48) > 32 && aVar2.J(izsVar)) || (i5 & 48) == 32;
                    Object x4 = aVar2.x();
                    if (z8 || x4 == c0012a) {
                        x4 = new iyl(izsVar, 6);
                        aVar2.R(x4);
                    }
                    a = d.c.C0760d.a.a(b2, null, (gzs) x4, cVar, null, null, aVar2, 1572872, 50);
                    aVar2 = aVar2;
                    aVar2.j();
                } else {
                    aVar2.K(1652464151);
                    aVar2.j();
                    c0760d = null;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (c0760d != null) {
                        aVar2.K(1718799840);
                    } else {
                        aVar2.K(1718799841);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-364389955, i3, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.getExtra (StorefrontAlbumsScreen.kt:200)");
                        }
                        if (z && z3) {
                            aVar2.K(2136407695);
                            qzu0.a.getClass();
                            lg90 m12 = qzu0.m1(aVar2);
                            if (i4 > 0) {
                                aVar2.K(2008584669);
                                cVar3 = f7p0.c.a.a(bVar.e, null, null, null, aVar2, 24576, 14);
                                aVar2.j();
                            } else {
                                aVar2.K(2136642240);
                                aVar2.j();
                            }
                            f7p0.c cVar5 = cVar3;
                            boolean z9 = ((i2 ^ 48) > 32 && aVar2.J(izsVar)) || (i5 & 48) == 32;
                            Object x5 = aVar2.x();
                            if (z9 || x5 == c0012a) {
                                x5 = new v78(izsVar, 5);
                                aVar2.R(x5);
                            }
                            androidx.compose.runtime.a aVar4 = aVar2;
                            aVar3 = d.b.a.C0757a.a(m12, null, (gzs) x5, cVar5, null, null, aVar4, 12582920, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                            aVar2 = aVar4;
                            aVar2.j();
                        } else if (z2 && z3) {
                            aVar2.K(2136872850);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(i6, 0, -1, str);
                            }
                            lg90 b3 = or.b(aVar2, -1867375013, R.drawable.vk_icon_bookmark_outline_28, aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (i11 > 0) {
                                aVar2.K(2008599792);
                                cVar4 = f7p0.c.a.a(bVar.b, null, null, null, aVar2, 24576, 14);
                                aVar2.j();
                            } else {
                                aVar2.K(2137161056);
                                aVar2.j();
                            }
                            f7p0.c cVar6 = cVar4;
                            Object[] objArr3 = ((i2 ^ 48) > 32 && aVar2.J(izsVar)) || (i5 & 48) == 32;
                            Object x6 = aVar2.x();
                            if (objArr3 != false || x6 == c0012a) {
                                x6 = new qq5(izsVar, 9);
                                aVar2.R(x6);
                            }
                            androidx.compose.runtime.a aVar5 = aVar2;
                            aVar3 = d.b.a.C0757a.a(b3, null, (gzs) x6, cVar6, null, null, aVar5, 12582920, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                            aVar2 = aVar5;
                            aVar2.j();
                        } else {
                            aVar2.K(2137339616);
                            aVar2.j();
                        }
                        d.b.a aVar6 = aVar3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a5 = d.a.a(c0760d, aVar6, null, null, aVar2, 24576, 12);
                    }
                    aVar2.j();
                    androidx.compose.runtime.a aVar7 = aVar2;
                    muv0.h(a4, null, null, null, a2, null, a5, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar7, 0, 0, 8110);
                    M = aVar7;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            c0760d = a;
            if (androidx.compose.runtime.b.d()) {
            }
            if (c0760d != null) {
            }
            aVar2.j();
            androidx.compose.runtime.a aVar72 = aVar2;
            muv0.h(a4, null, null, null, a2, null, a5, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar72, 0, 0, 8110);
            M = aVar72;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new io7(bVar, izsVar, i, 9);
        }
    }
}
