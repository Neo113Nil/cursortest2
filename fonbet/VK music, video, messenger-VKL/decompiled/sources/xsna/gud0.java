package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zxe;

/* compiled from: ProfileButtons.kt */
/* loaded from: classes17.dex */
public final class gud0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1439899899);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1439899899, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.AddProfileActionButtons (ProfileButtons.kt:162)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630Var;
            q630 c = qri.c(M, q630Var2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.clips_profile_switch_add_vkclips_profile, 0, M);
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(ahn.E(aVar3, "addingClipGroupAddCommunityBtn"), 1.0f);
            ButtonSize buttonSize = ButtonSize.Large;
            e(gzsVar, f, null, N, false, buttonSize, M, (i2 & 14) | 196656, 20);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            e(gzsVar2, ahn.E(txj0.f(aVar3, 1.0f), "addingClipGroupCreateCommunityBtn"), null, d370.N(R.string.clips_profile_switch_create_community_btn, 0, M), false, buttonSize, M, ((i2 >> 3) & 14) | 196656, 20);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new br0(i, 11, gzsVar, gzsVar2, q630Var2);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        gzs gzsVar3;
        gzs gzsVar4;
        androidx.compose.runtime.a M = aVar.M(652111468);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(652111468, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.AnonUserActionButtons (ProfileButtons.kt:132)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "anonymousProfileInterestsBtn");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 g = E.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String N = d370.N(R.string.clips_profile_switch_interests, 0, M);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2004280830, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-HeartSettingsOutline20> (VkIcons.kt:3326)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_heart_settings_outline_20, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            e(gzsVar, g, a2, N, false, null, M, (i2 & 14) | 512, 48);
            f9t.e(txj0.v(aVar3, 8), M, 6);
            q630 E2 = ahn.E(aVar3, "anonymousProfileLoginBtn");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            gzsVar4 = gzsVar2;
            gzsVar3 = gzsVar;
            e(gzsVar4, E2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, d370.N(R.string.log_in, 0, M), false, null, M, (i2 >> 3) & 14, 52);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar;
            gzsVar4 = gzsVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fy7(i, gzsVar3, gzsVar4, q630Var);
        }
    }

    public static final void c(boolean z, boolean z2, gzs gzsVar, q630 q630Var, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2002205058);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072 | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2002205058, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.OtherUserNotSubscribedProfileButtons (ProfileButtons.kt:191)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.clips_subscribe, 0, M);
            q630 E = ahn.E(aVar3, "authorClipsSubscribeBtn");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d = defpackage.j0.d(1.0f, E, true);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(90035042, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AddSquareOutline20> (VkIcons.kt:162)");
            }
            lg90 b = or.b(M, -2120446146, R.drawable.vk_icon_add_square_outline_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            e(gzsVar, d, b, N, z2, null, M, ((i2 >> 6) & 14) | 512 | ((i2 << 9) & 57344), 32);
            if (z) {
                M.K(334507738);
                aVar2 = aVar3;
                f9t.e(txj0.v(aVar2, 8), M, 6);
                e(gzsVar2, ahn.E(aVar2, "authorClipsCommunityChatBtn"), qzu0.M0(M), null, false, null, M, ((i2 >> 12) & 14) | 560, 56);
            } else {
                aVar2 = aVar3;
                M.K(325460264);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f97(z, z2, gzsVar, q630Var2, gzsVar2, i);
        }
    }

    public static final void d(final zxe.d dVar, final gzs gzsVar, final gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-132418156);
        int i2 = i | (M.J(dVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-132418156, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.OtherUserSubscribedProfileButtons (ProfileButtons.kt:222)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (dVar.c) {
                M.K(-1290814729);
                String N = d370.N(R.string.clips_grid_message, 0, M);
                q630 E = ahn.E(aVar3, "authorClipsCommunityChatBtn");
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                aVar2 = aVar3;
                e(gzsVar2, E.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, N, false, null, M, (i2 >> 6) & 14, 52);
                f9t.e(txj0.v(aVar2, 8), M, 6);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1704427474, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Check20> (VkIcons.kt:1184)");
                }
                lg90 b = or.b(M, 1495668955, R.drawable.vk_icon_check_20, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                e(gzsVar, null, b, null, dVar.d, null, M, ((i2 >> 3) & 14) | 512, 42);
                M.j();
            } else {
                aVar2 = aVar3;
                M.K(-1290287419);
                String N2 = d370.N(R.string.clips_subscribed, 0, M);
                q630 E2 = ahn.E(aVar2, "authorClipsSubscribeBtn");
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                e(gzsVar, E2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, N2, dVar.d, null, M, (i2 >> 3) & 14, 36);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, gzsVar2, q630Var2, i) { // from class: xsna.eud0
                public final /* synthetic */ gzs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    gud0.d(zxe.d.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final gzs<s3q0> gzsVar, q630 q630Var, lg90 lg90Var, String str, boolean z, ButtonSize buttonSize, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        androidx.compose.runtime.a aVar2;
        final ButtonSize buttonSize2;
        final lg90 lg90Var2;
        final q630 q630Var3;
        final String str3;
        final boolean z2;
        androidx.compose.runtime.f s;
        lg90 lg90Var3 = lg90Var;
        androidx.compose.runtime.a M = aVar.M(24318850);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? M.J(lg90Var3) : M.y(lg90Var3) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= M.J(str2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= M.l(z) ? 16384 : 8192;
                    i7 = i2 & 32;
                    int i9 = 196608;
                    if (i7 == 0) {
                        if ((196608 & i) == 0) {
                            i9 = M.o(buttonSize == null ? -1 : buttonSize.ordinal()) ? 131072 : 65536;
                        }
                        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            if (i4 != 0) {
                                lg90Var3 = null;
                            }
                            lg90 lg90Var4 = lg90Var3;
                            String str4 = i5 != 0 ? "" : str2;
                            boolean z3 = i6 != 0 ? true : z;
                            ButtonSize buttonSize3 = i7 != 0 ? ButtonSize.Medium : buttonSize;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(24318850, i3, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.ProfileButton (ProfileButtons.kt:262)");
                            }
                            int i10 = i3 << 9;
                            aVar2 = M;
                            bhu0.e(gzsVar, buttonSize3, ButtonStyle.Secondary, ButtonAppearance.Neutral, q630Var4, null, false, false, lg90Var4, null, new pco(20), str4, null, null, null, null, z3, null, null, null, aVar2, (i3 & 14) | 3456 | ((i3 >> 12) & 112) | (57344 & i10) | 1073741824 | ((i3 << 21) & 1879048192), ((i3 >> 3) & 896) | 48 | (29360128 & i10), 0, 4056544);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            buttonSize2 = buttonSize3;
                            q630Var3 = q630Var4;
                            lg90Var2 = lg90Var4;
                            str3 = str4;
                            z2 = z3;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            buttonSize2 = buttonSize;
                            lg90Var2 = lg90Var3;
                            q630Var3 = q630Var2;
                            str3 = str2;
                            z2 = z;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.fud0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    gud0.e(gzs.this, q630Var3, lg90Var2, str3, z2, buttonSize2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i3 |= i9;
                    if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                i7 = i2 & 32;
                int i92 = 196608;
                if (i7 == 0) {
                }
                i3 |= i92;
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            i7 = i2 & 32;
            int i922 = 196608;
            if (i7 == 0) {
            }
            i3 |= i922;
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        i7 = i2 & 32;
        int i9222 = 196608;
        if (i7 == 0) {
        }
        i3 |= i9222;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void f(zxe zxeVar, izs<? super sxe, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1601070909);
        int i2 = (M.J(zxeVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1601070909, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.ProfileButtons (ProfileButtons.kt:40)");
            }
            xh2.a(zxeVar, s200.H(q630.a.a, r490.d(R.dimen.clips_profile_switch_horizontal_padding, M), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r490.d(R.dimen.clips_profile_switch_horizontal_padding, M), 16, 2), null, null, null, null, kai.c(363792605, new dud0(izsVar, 0), M), M, (i2 & 14) | 1572864, 60);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new do7(zxeVar, izsVar, i, 8);
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(539302787);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(539302787, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.components.UserActionsButtons (ProfileButtons.kt:103)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630Var;
            q630 c = qri.c(M, q630Var2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "authorClipsStatisticsBtn");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            e(gzsVar, E.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, d370.N(R.string.clips_profile_switch_stats, 0, M), false, null, M, i2 & 14, 52);
            f9t.e(txj0.v(aVar3, 8), M, 6);
            q630 E2 = ahn.E(aVar3, "authorClipsPromotionBtn");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            e(gzsVar2, E2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, d370.N(R.string.clip_feed_promotion, 0, M), false, null, M, (i2 >> 3) & 14, 52);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xc4(i, 4, gzsVar, gzsVar2, q630Var2);
        }
    }
}
