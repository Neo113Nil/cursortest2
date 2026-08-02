package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.deactivation.Deactivation;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.hud0;
import xsna.phw;
import xsna.q630;
import xsna.tlo0;
import xsna.tt9;
import xsna.us2;

/* compiled from: AccountsCards.kt */
/* loaded from: classes17.dex */
public final class rt {
    public static final void a(final List list, mc90 mc90Var, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1522445216);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.J(mc90Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1522445216, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.ProfileCardsPager (AccountsCards.kt:51)");
            }
            int i3 = (i2 >> 3) & 14;
            h4o0 A = x19.A(mc90Var, new gc90(0), M, i3, 28);
            q630 H = s200.H(n34.t(q630.a.a, fz5.z(null, M, 1), null), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new m7(list, 1);
                M.R(x);
            }
            aVar2 = M;
            nb90.a(mc90Var, H, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, A, false, (izs) x, null, null, null, kai.c(-560381505, new zzs() { // from class: xsna.lt
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:49:0x05cc  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x05d5  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x05e1  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x06c1  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x06d3  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x05ee  */
                @Override // xsna.zzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    String str;
                    hud0.e eVar;
                    String str2;
                    izs izsVar2;
                    hud0.e eVar2;
                    ut9 ut9Var;
                    tt9.b.C3771b.a.C3772a c3772a;
                    Image image;
                    Pair pair;
                    int i4;
                    int i5;
                    int i6;
                    tt9.b.C3771b.a.C3773b c3773b;
                    us2 e;
                    int i7;
                    com.vk.core.compose.component.semantics.a a;
                    tt9.b bVar;
                    int i8;
                    String a2;
                    q630 q630Var;
                    tt9.a.C3768a c3768a;
                    tt9.a.C3768a c3768a2;
                    ImageSize Cb;
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-560381505, intValue2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.ProfileCardsPager.<anonymous> (AccountsCards.kt:63)");
                    }
                    hud0 hud0Var = (hud0) list.get(intValue);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-577770488, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.top (AccountsCards.kt:79)");
                    }
                    boolean z2 = hud0Var instanceof hud0.a;
                    if (z2) {
                        aVar3.K(1868859063);
                        Image image2 = ((hud0.a) hud0Var).a;
                        if (image2 == null) {
                            aVar3.K(1868669590);
                            aVar3.j();
                            Cb = null;
                        } else {
                            aVar3.K(-1186646325);
                            azl azlVar = (azl) aVar3.r(uvi.h);
                            f870.A().getClass();
                            Cb = image2.Cb(azlVar.r0(er5.a()), true, false);
                            aVar3.j();
                        }
                        str = Cb != null ? Cb.d.d : null;
                        aVar3.j();
                    } else if (hud0Var instanceof hud0.b.a) {
                        aVar3.K(-1186637218);
                        List list2 = ((hud0.b.a) hud0Var).a;
                        azl azlVar2 = (azl) aVar3.r(uvi.h);
                        f870.A().getClass();
                        int r0 = azlVar2.r0(er5.a());
                        Iterator it = list2.iterator();
                        BaseImageDto baseImageDto = null;
                        while (it.hasNext()) {
                            T t = ((qow) it.next()).a;
                            if (baseImageDto == null) {
                                baseImageDto = (BaseImageDto) t;
                            } else {
                                BaseImageDto baseImageDto2 = (BaseImageDto) t;
                                if (baseImageDto.getWidth() < baseImageDto2.getWidth()) {
                                    if (baseImageDto.getWidth() >= r0) {
                                        if (Math.abs(baseImageDto2.getWidth() - r0) < Math.abs(baseImageDto.getWidth() - r0)) {
                                        }
                                    }
                                    baseImageDto = baseImageDto2;
                                }
                            }
                        }
                        str = baseImageDto != null ? baseImageDto.getUrl() : null;
                        aVar3.j();
                    } else {
                        if (!(hud0Var instanceof hud0.e)) {
                            throw alb0.c(-1186648729, aVar3);
                        }
                        aVar3.K(-1186628690);
                        aVar3.j();
                        str = ((hud0.e) hud0Var).b().c.b;
                    }
                    phw a3 = phw.a.a(fwu0.l(null, str, null, null, aVar3, 0, 61), null, null, null, null, aVar3, 196616, 30);
                    Object x2 = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x2 == c0012a) {
                        x2 = new qt(0);
                        aVar3.R(x2);
                    }
                    com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
                    boolean J = aVar3.J(hud0Var);
                    izs izsVar3 = izsVar;
                    boolean J2 = J | aVar3.J(izsVar3);
                    Object x3 = aVar3.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new g4(1, hud0Var, izsVar3);
                        aVar3.R(x3);
                    }
                    ut9 ut9Var2 = new ut9(a3, a4, (gzs) x3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(461318748, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.middle (AccountsCards.kt:115)");
                    }
                    if (z2) {
                        aVar3.K(945691923);
                        hud0.a aVar4 = (hud0.a) hud0Var;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1758200417, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.anonMiddle (AccountsCards.kt:234)");
                        }
                        tlo0.a aVar5 = tlo0.Companion;
                        String str3 = aVar4.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        tlo0.h d = oq.d(aVar5, str3);
                        Object x4 = aVar3.x();
                        if (x4 == c0012a) {
                            x4 = new nt(0);
                            aVar3.R(x4);
                        }
                        tt9.b.C3771b c3771b = new tt9.b.C3771b(new tt9.b.C3771b.C3774b(d, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3)));
                        us2 us2Var = new us2(d370.N(R.string.clip_grid_anonym_login_invitation, 0, aVar3));
                        Object x5 = aVar3.x();
                        if (x5 == c0012a) {
                            x5 = new v7(1);
                            aVar3.R(x5);
                        }
                        bVar = new tt9.b(c3771b, new tt9.b.a.C3770b(us2Var, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3)));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar3.j();
                    } else {
                        if (!(hud0Var instanceof hud0.b.a)) {
                            if (!(hud0Var instanceof hud0.e)) {
                                throw alb0.c(945690255, aVar3);
                            }
                            aVar3.K(945696480);
                            hud0.e eVar3 = (hud0.e) hud0Var;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1299393603, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.profileMiddle (AccountsCards.kt:129)");
                            }
                            tlo0.h d2 = oq.d(tlo0.Companion, eVar3.b().c.c);
                            Object x6 = aVar3.x();
                            if (x6 == c0012a) {
                                x6 = new gt(0);
                                aVar3.R(x6);
                            }
                            tt9.b.C3771b.C3774b c3774b = new tt9.b.C3771b.C3774b(d2, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3));
                            qow<ImageStatus> qowVar = eVar3.b().c.h;
                            if (qowVar == null) {
                                aVar3.K(306032651);
                                aVar3.j();
                                eVar2 = eVar3;
                                ut9Var = ut9Var2;
                                izsVar2 = izsVar3;
                                c3772a = null;
                            } else {
                                aVar3.K(306032652);
                                ImageStatus imageStatus = qowVar.a;
                                if (imageStatus == null || (image = imageStatus.d) == null) {
                                    eVar = eVar3;
                                    str2 = null;
                                } else {
                                    Serializer.c<Owner> cVar = Owner.CREATOR;
                                    String a5 = Owner.a.a(20, image);
                                    eVar = eVar3;
                                    str2 = a5;
                                }
                                izsVar2 = izsVar3;
                                eVar2 = eVar;
                                ut9Var = ut9Var2;
                                lg90 l = fwu0.l(str2, null, null, null, aVar3, 0, 62);
                                boolean J3 = aVar3.J(izsVar2) | aVar3.J(eVar2);
                                Object x7 = aVar3.x();
                                if (J3 || x7 == c0012a) {
                                    x7 = new xk(1, izsVar2, eVar2);
                                    aVar3.R(x7);
                                }
                                c3772a = new tt9.b.C3771b.a.C3772a((gzs) x7, l);
                                aVar3.j();
                            }
                            qow<VerifyInfo> qowVar2 = eVar2.b().c.g;
                            VerifyInfo verifyInfo = qowVar2 != null ? qowVar2.a : null;
                            if (verifyInfo == null) {
                                aVar3.K(306620287);
                                aVar3.j();
                                pair = null;
                            } else {
                                aVar3.K(306620288);
                                boolean z3 = verifyInfo.b;
                                boolean z4 = !z3 && verifyInfo.d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-522397899, 27696, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.VerifiedComposeIconHelper.icon16 (VerifiedComposeIconHelper.kt:17)");
                                }
                                if (z3) {
                                    aVar3.K(-2088884174);
                                    if (androidx.compose.runtime.b.d()) {
                                        i6 = -1;
                                        androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
                                    } else {
                                        i6 = -1;
                                    }
                                    lg90 a6 = pg90.a(R.drawable.vk_icon_verified_16, 0, aVar3);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    Pair pair2 = new Pair(a6, new l5g(ylu0Var.getIcon().a));
                                    aVar3.j();
                                    pair = pair2;
                                } else if (z4) {
                                    aVar3.K(-2088754129);
                                    if (androidx.compose.runtime.b.d()) {
                                        i4 = 0;
                                        i5 = -1;
                                        androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
                                    } else {
                                        i4 = 0;
                                        i5 = -1;
                                    }
                                    lg90 a7 = pg90.a(R.drawable.vk_icon_verified_16, i4, aVar3);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, i4, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    pair = new Pair(a7, new l5g(ylu0Var2.getIcon().l));
                                    aVar3.j();
                                } else {
                                    aVar3.K(-2088524792);
                                    aVar3.j();
                                    pair = null;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar3.j();
                            }
                            if (pair == null) {
                                aVar3.K(306998797);
                                aVar3.j();
                                c3773b = null;
                            } else {
                                aVar3.K(306998798);
                                lg90 lg90Var = (lg90) pair.d();
                                long j = ((l5g) pair.g()).a;
                                boolean J4 = aVar3.J(izsVar2) | aVar3.J(eVar2);
                                Object x8 = aVar3.x();
                                if (J4 || x8 == c0012a) {
                                    x8 = new kg(2, izsVar2, eVar2);
                                    aVar3.R(x8);
                                }
                                c3773b = new tt9.b.C3771b.a.C3773b(j, (gzs) x8, lg90Var);
                                aVar3.j();
                            }
                            tt9.b.C3771b c3771b2 = new tt9.b.C3771b(c3774b, new tt9.b.C3771b.a(c3772a, c3773b));
                            if (eVar2.b().c.a.a.length() > 0) {
                                aVar3.K(307664678);
                                e = eVar2.b().c.a.j(8, aVar3);
                                aVar3.j();
                            } else if (eVar2 instanceof hud0.b.C3022b) {
                                aVar3.K(307833535);
                                hik0 c = bkt0.c(new klv0(VkTypographyToken.SubheadMedium, VkColorToken.TextPrimary), aVar3);
                                us2.b bVar2 = new us2.b();
                                aVar3.K(1118316590);
                                int m = bVar2.m(c);
                                try {
                                    bVar2.g(d370.N(R.string.clips_profile_switch_add_description, 0, aVar3));
                                    s3q0 s3q0Var = s3q0.a;
                                    bVar2.k(m);
                                    aVar3.j();
                                    e = bVar2.n();
                                    aVar3.j();
                                } catch (Throwable th) {
                                    bVar2.k(m);
                                    throw th;
                                }
                            } else {
                                aVar3.K(308246455);
                                aVar3.j();
                                e = ws2.e("");
                            }
                            String N = d370.N(R.string.clip_description_expand, 0, aVar3);
                            if (eVar2.b().c.a.a.length() <= 0 && (eVar2 instanceof hud0.b.C3022b)) {
                                aVar3.K(308524029);
                                Object x9 = aVar3.x();
                                if (x9 == c0012a) {
                                    x9 = new ht(0);
                                    aVar3.R(x9);
                                }
                                i7 = 3;
                                a = com.vk.core.compose.component.semantics.b.a(null, (izs) x9, 3);
                                aVar3.j();
                            } else {
                                i7 = 3;
                                aVar3.K(308696358);
                                Object x10 = aVar3.x();
                                if (x10 == c0012a) {
                                    x10 = new jt(0);
                                    aVar3.R(x10);
                                }
                                a = com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3);
                                aVar3.j();
                            }
                            aVar3.K(1118345186);
                            String str4 = eVar2.b().c.a.j(8, aVar3).c;
                            boolean J5 = aVar3.J(izsVar2) | aVar3.J(eVar2) | aVar3.J(str4);
                            Object x11 = aVar3.x();
                            if (J5 || x11 == c0012a) {
                                x11 = new kt(izsVar2, eVar2, str4, 0);
                                aVar3.R(x11);
                            }
                            gzs gzsVar = (gzs) x11;
                            aVar3.j();
                            if (!eVar2.b().f) {
                                gzsVar = null;
                            }
                            bVar = new tt9.b(c3771b2, new tt9.b.a.C3769a(e, N, gzsVar, a));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar3.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-920557681, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.bottom (AccountsCards.kt:254)");
                            }
                            if (!z2) {
                                aVar3.K(-967542770);
                                aVar3.j();
                            } else {
                                if (!(hud0Var instanceof hud0.b.a)) {
                                    if (hud0Var instanceof hud0.c) {
                                        aVar3.K(-966933991);
                                        aVar3.j();
                                        Deactivation deactivation = ((ClipsAuthor) ((hud0.c) hud0Var).a.a).j;
                                        if (deactivation != null) {
                                            tlo0 d3 = myc0.f(deactivation.q5()) ? oq.d(tlo0.Companion, deactivation.q5()) : deactivation.O4() > 0 ? tq.h(tlo0.Companion, deactivation.O4()) : null;
                                            if (d3 != null) {
                                                c3768a2 = new tt9.a.C3768a(d3, null);
                                                c3768a = c3768a2;
                                                q630Var = null;
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                nud0.f(new tt9(ut9Var, bVar, c3768a), q630Var, aVar3, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                return s3q0.a;
                                            }
                                        }
                                        c3768a2 = null;
                                        c3768a = c3768a2;
                                        q630Var = null;
                                        if (androidx.compose.runtime.b.d()) {
                                        }
                                        nud0.f(new tt9(ut9Var, bVar, c3768a), q630Var, aVar3, 0);
                                        if (androidx.compose.runtime.b.d()) {
                                        }
                                        return s3q0.a;
                                    }
                                    if (!(hud0Var instanceof hud0.e)) {
                                        throw alb0.c(107335907, aVar3);
                                    }
                                    aVar3.K(107361352);
                                    tlo0.a aVar6 = tlo0.Companion;
                                    hud0.e eVar4 = (hud0.e) hud0Var;
                                    if (eVar4.b().c.e > 0) {
                                        aVar3.K(-966663299);
                                        i8 = 0;
                                        a2 = d370.F(R.plurals.clip_counter, (int) eVar4.b().c.e, new Object[]{Long.valueOf(eVar4.b().c.e)}, aVar3, 0);
                                        aVar3.j();
                                    } else {
                                        i8 = 0;
                                        a2 = zq.a(aVar3, -966386965, R.string.clips_profile_switch_no_clips_text, aVar3, 0);
                                    }
                                    tlo0.h d4 = oq.d(aVar6, a2);
                                    Object x12 = aVar3.x();
                                    if (x12 == c0012a) {
                                        x12 = new pt(i8);
                                        aVar3.R(x12);
                                    }
                                    q630Var = null;
                                    c3768a = new tt9.a.C3768a(d4, com.vk.core.compose.component.semantics.b.a(null, (izs) x12, i7));
                                    aVar3.j();
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    nud0.f(new tt9(ut9Var, bVar, c3768a), q630Var, aVar3, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    return s3q0.a;
                                }
                                aVar3.K(-967485234);
                                aVar3.j();
                            }
                            c3768a = null;
                            q630Var = null;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            nud0.f(new tt9(ut9Var, bVar, c3768a), q630Var, aVar3, 0);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            return s3q0.a;
                        }
                        aVar3.K(945694385);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1010172270, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.addNewProfileMiddle (AccountsCards.kt:215)");
                        }
                        tlo0.h d5 = oq.d(tlo0.Companion, d370.N(R.string.clips_profile_switch_add_page_title, 0, aVar3));
                        Object x13 = aVar3.x();
                        if (x13 == c0012a) {
                            x13 = new db(2);
                            aVar3.R(x13);
                        }
                        tt9.b.C3771b c3771b3 = new tt9.b.C3771b(new tt9.b.C3771b.C3774b(d5, com.vk.core.compose.component.semantics.b.a(null, (izs) x13, 3)));
                        us2 us2Var2 = new us2(d370.N(R.string.clips_profile_switch_add_page_subtitle, 0, aVar3));
                        Object x14 = aVar3.x();
                        if (x14 == c0012a) {
                            x14 = new ot(0);
                            aVar3.R(x14);
                        }
                        bVar = new tt9.b(c3771b3, new tt9.b.a.C3770b(us2Var2, com.vk.core.compose.component.semantics.b.a(null, (izs) x14, 3)));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar3.j();
                    }
                    i7 = 3;
                    ut9Var = ut9Var2;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (!z2) {
                    }
                    c3768a = null;
                    q630Var = null;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    nud0.f(new tt9(ut9Var, bVar, c3768a), q630Var, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    return s3q0.a;
                }
            }, M), aVar2, i3, 24576, 15228);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new mt(i, 0, list, mc90Var, izsVar);
        }
    }
}
