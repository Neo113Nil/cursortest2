package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;

/* compiled from: ControlsButtons.kt */
/* loaded from: classes16.dex */
public final class qqj {
    public static final boolean a;

    static {
        VideoFeatures.VIDEO_SMART_CAST.getClass();
        a = !com.vk.toggle.b.A.a(r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final xow xowVar, final ControlsState.c cVar, final jai jaiVar, final rqj rqjVar, final q630 q630Var, a.e eVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        a.e eVar2;
        final a.e eVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1092144496);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(xowVar) : M.y(xowVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(rqjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            eVar2 = eVar;
            i3 |= M.J(eVar2) ? 131072 : 65536;
            if (M.t(i3 & 1, (74899 & i3) == 74898)) {
                M.h();
                eVar3 = eVar2;
            } else {
                a.e eVar4 = i4 != 0 ? androidx.compose.foundation.layout.a.a : eVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1092144496, i3, -1, "com.vk.fullscreenvideo.icons.ControlsButtons (ControlsButtons.kt:25)");
                }
                dt1.a.getClass();
                int i5 = i3 >> 12;
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(eVar4, dt1.a.l, M, ((((i5 & 112) | ((i5 & 14) | 384)) >> 3) & 14) | 48);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                M.K(443109843);
                M.K(443104687);
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = xowVar.iterator();
                while (it.hasNext()) {
                    dqj b = b((a.d) it.next(), cVar, rqjVar, M, (i3 & 112) | ((i3 >> 3) & 896));
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                M.j();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jaiVar.invoke((dqj) it2.next(), M, Integer.valueOf((i3 >> 3) & 112));
                }
                if (gp.d(M)) {
                    androidx.compose.runtime.b.e();
                }
                eVar3 = eVar4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.pqj
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qqj.a(xow.this, cVar, jaiVar, rqjVar, q630Var, eVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        eVar2 = eVar;
        if (M.t(i3 & 1, (74899 & i3) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r8 != com.vk.fullscreenvideo.ControlsState.ResizeStatus.UNAVAILABLE) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x006a, code lost:
    
        if (r11 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0075, code lost:
    
        if (r11 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0082, code lost:
    
        if (r19.c == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0097, code lost:
    
        if (r11 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x00a4, code lost:
    
        if (r11 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00b1, code lost:
    
        if (r11 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00c5, code lost:
    
        if (r11 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dqj b(a.d dVar, ControlsState.c cVar, rqj rqjVar, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        long j;
        boolean z = cVar.i;
        boolean z2 = cVar.f;
        ControlsState.CastStatus castStatus = cVar.a;
        ControlsState.ResizeStatus resizeStatus = cVar.b;
        ControlsState.Like like = cVar.c;
        boolean z3 = rqjVar.a;
        boolean z4 = rqjVar.d;
        aVar.K(877097055);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(877097055, i, -1, "com.vk.fullscreenvideo.icons.fromActionToControlIcon (ControlsButtons.kt:46)");
        }
        int i2 = ((i >> 6) & 14) | (i & 112) | ((i << 6) & 896);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1854221760, i2, -1, "com.vk.fullscreenvideo.icons.canActionBeShown (ControlsButtons.kt:135)");
        }
        a.d.C1074d c1074d = a.d.C1074d.a;
        if (!epx.f(dVar, c1074d)) {
            if (epx.f(dVar, a.d.h.a)) {
                if (a) {
                    if (castStatus != ControlsState.CastStatus.UNAVAILABLE) {
                    }
                }
                z2 = false;
            } else if (dVar instanceof a.d.b.C1073b) {
                if (like != ControlsState.Like.UNAVAILABLE) {
                }
                z2 = false;
            } else if (dVar instanceof a.d.b.c) {
                if (cVar.e) {
                }
                z2 = false;
            } else if (!epx.f(dVar, a.d.f.a)) {
                if (dVar instanceof a.d.b.C1072a) {
                    if (!cVar.g) {
                    }
                    z2 = false;
                } else if (epx.f(dVar, a.d.g.a)) {
                    if (z3) {
                    }
                    z2 = false;
                } else if (epx.f(dVar, a.d.C1071a.a)) {
                    if (!z3) {
                    }
                    z2 = false;
                } else {
                    if (!epx.f(dVar, a.d.c.a)) {
                        if (!epx.f(dVar, a.d.i.a)) {
                            if (!epx.f(dVar, a.d.e.a)) {
                                if (!epx.f(dVar, a.d.j.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!rqjVar.b) {
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
            }
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (!z2) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return null;
        }
        int i3 = ((i >> 3) & 14) | ((i << 3) & 112);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1239491706, i3, -1, "com.vk.fullscreenvideo.icons.getIconForAction (ControlsButtons.kt:96)");
        }
        if (epx.f(dVar, c1074d)) {
            aVar.K(1445595285);
            if (resizeStatus == ControlsState.ResizeStatus.CROP) {
                aVar.K(1863836057);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(278369078, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VideoFillNone24> (VkIcons.kt:11552)");
                }
                b = pg90.a(R.drawable.vk_icon_video_fill_none_24, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                aVar.K(1863888509);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(134028422, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VideoFill24> (VkIcons.kt:11542)");
                }
                b = or.b(aVar, -1478696030, R.drawable.vk_icon_video_fill_24, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            }
            aVar.j();
        } else if (dVar instanceof a.d.b.C1073b) {
            aVar.K(1445602111);
            if (like == ControlsState.Like.LIKED) {
                aVar.K(1864033186);
                qzu0.a.getClass();
                b = qzu0.x0(aVar);
                aVar.j();
            } else {
                aVar.K(1864077051);
                qzu0.a.getClass();
                b = qzu0.y0(aVar);
                aVar.j();
            }
            aVar.j();
        } else if (epx.f(dVar, a.d.j.a)) {
            aVar.K(1445608009);
            if (cVar.h) {
                aVar.K(1864191007);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                }
                b = pg90.a(R.drawable.vk_icon_done_24, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                aVar.K(1864237786);
                qzu0.a.getClass();
                b = qzu0.y(aVar);
                aVar.j();
            }
            aVar.j();
        } else if (epx.f(dVar, a.d.h.a)) {
            aVar.K(1445613389);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1174492856, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ScreencastOutline24> (VkIcons.kt:9624)");
            }
            b = or.b(aVar, -1781709784, R.drawable.vk_icon_screencast_outline_24, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (epx.f(dVar, a.d.i.a)) {
            aVar.K(1445615911);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1586291574, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GearOutline24> (VkSdkIcons.kt:968)");
            }
            b = or.b(aVar, 313051417, R.drawable.vk_icon_gear_outline_24, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (dVar instanceof a.d.b.C1072a) {
            aVar.K(1445618570);
            qzu0.a.getClass();
            b = qzu0.z(aVar);
            aVar.j();
        } else if (dVar instanceof a.d.b.c) {
            aVar.K(1445621224);
            qzu0.a.getClass();
            b = qzu0.l1(aVar);
            aVar.j();
        } else if (epx.f(dVar, a.d.c.a)) {
            aVar.K(1445623499);
            qzu0.a.getClass();
            b = qzu0.L(aVar);
            aVar.j();
        } else if (epx.f(dVar, a.d.f.a)) {
            aVar.K(1445625995);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1195458188, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ListPlayOutline28> (VkSdkIcons.kt:2080)");
            }
            b = or.b(aVar, 26239954, R.drawable.vk_icon_list_play_outline_28, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (epx.f(dVar, a.d.e.a)) {
            aVar.K(1445628328);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
            }
            b = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (epx.f(dVar, a.d.g.a)) {
            aVar.K(1445630471);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-293803058, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-RateOutline24> (VkIcons.kt:9286)");
            }
            b = pg90.a(R.drawable.vk_icon_rate_outline_24, 0, aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            if (!epx.f(dVar, a.d.C1071a.a)) {
                throw alb0.c(1445594302, aVar);
            }
            aVar.K(1445632550);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1969191586, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BugOutline28> (VkIcons.kt:888)");
            }
            b = or.b(aVar, -771587067, R.drawable.vk_icon_bug_outline_28, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (dVar instanceof a.d.b.C1073b) {
            aVar.K(-982144107);
            if (like == ControlsState.Like.LIKED) {
                aVar.K(-982086044);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.q().m;
                aVar.j();
            } else {
                aVar.K(-982017565);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().c;
                aVar.j();
            }
            aVar.j();
        } else if (dVar.equals(a.d.h.a)) {
            aVar.K(-981887644);
            if (castStatus == ControlsState.CastStatus.CONNECTED) {
                aVar.K(1076709929);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().a;
            } else {
                aVar.K(1076711083);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.getIcon().c;
            }
            aVar.j();
            aVar.j();
        } else {
            if (!(dVar instanceof a.d.b.C1072a) && !(dVar instanceof a.d.b.c) && !dVar.equals(a.d.c.a) && !dVar.equals(a.d.f.a) && !dVar.equals(c1074d) && !dVar.equals(a.d.j.a) && !dVar.equals(a.d.e.a) && !dVar.equals(a.d.g.a) && !dVar.equals(a.d.C1071a.a) && !dVar.equals(a.d.i.a)) {
                throw alb0.c(1076695179, aVar);
            }
            aVar.K(1076727723);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var5.getIcon().c;
            aVar.j();
        }
        dqj dqjVar = new dqj(b, j, dVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return dqjVar;
    }
}
