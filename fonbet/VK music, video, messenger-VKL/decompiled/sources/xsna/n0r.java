package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.kpv;
import xsna.o4q0;
import xsna.phw;
import xsna.q630;
import xsna.rco0;
import xsna.vlt0;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class n0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColorFilter porterDuffColorFilter;
        efj a;
        lg90 a2;
        switch (this.b) {
            case 0:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1008197029, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:99)");
                    }
                    v0rVar.c(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                diu diuVar = (diu) this.c;
                View view = (View) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                float c = diuVar.getOrientationDelegate().c();
                view.setTranslationX(c == 90.0f ? -w65.h(view) : c == 270.0f ? w65.h(view) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setPivotX(intValue2 / 2.0f);
                view.setPivotY(intValue3 / 2.0f);
                return s3q0.a;
            case 2:
                p4q0 p4q0Var = (p4q0) this.c;
                wh50 wh50Var = p4q0Var.a;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-196299612, intValue4, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.modal.UnlinkBidProfileModalImpl.Content.<anonymous> (UnlinkBidProfileModal.kt:93)");
                    }
                    q630 q630Var = p4q0Var.f;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c2 = qri.c(aVar2, q630Var);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a3, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c2, cri.a.d);
                    String str = ((ynr0) ((zak0) wh50Var).getValue()).d;
                    y18 a4 = aqw.a((float) 0.5d, wlb0.h(aVar2).getImage().a);
                    q630 b = r18.b(a4.a, a4.b, q630.a.a, vog0.a);
                    if (str == null || drm0.N(str)) {
                        aVar2.K(163124490);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(441751566, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-WorkOutline28> (VkSdkIcons.kt:3814)");
                        }
                        lg90 b2 = or.b(aVar2, 441282325, R.drawable.vk_icon_work_outline_28, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        rek0 rek0Var = new rek0(wlb0.h(aVar2).getBackground().x);
                        long j = wlb0.h(aVar2).getIcon().n;
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        a = phw.a.a(b2, rek0Var, wkj.a.f, new oe7(j, 5, porterDuffColorFilter), null, aVar2, 197000, 16);
                        aVar2.j();
                    } else {
                        aVar2.K(163546276);
                        a = rco0.a.b(new ue2(e43.l(new l5g(f870.d(4290890454L)), new l5g(f870.d(4287074201L))), null, 135.0f), str, aVar2, 3072);
                        aVar2.j();
                    }
                    boolean z = ((ynr0) ((zak0) wh50Var).getValue()).c;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(415227575, 0, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.modal.UnlinkBidProfileModalImpl.buildBadge (UnlinkBidProfileModal.kt:171)");
                    }
                    if (z) {
                        aVar2.K(538988117);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1367706338, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckCircleFillGreen20> (VkIcons.kt:1238)");
                        }
                        a2 = pg90.a(R.drawable.vk_icon_check_circle_fill_green_20, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                    } else {
                        aVar2.K(539047668);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(55292128, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ErrorCircleFillYellow20> (VkIcons.kt:2426)");
                        }
                        a2 = pg90.a(R.drawable.vk_icon_error_circle_fill_yellow_20, 0, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                    }
                    kpv a5 = kpv.a.a(a2, l5g.k, 0L, BadgeAlignment.BottomRight, true, null, null, aVar2, 100884536, 204);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ldu0.b(a, 56, b, a5, null, false, null, null, null, aVar2, 48, 496);
                    f9t.e(p4q0Var.g, aVar2, 0);
                    yqv0.c(((ynr0) ((zak0) wh50Var).getValue()).a, null, wlb0.h(aVar2).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).z, aVar2, 0, 0, 8122);
                    androidx.compose.runtime.a aVar4 = aVar2;
                    String str2 = ((ynr0) ((zak0) wh50Var).getValue()).b;
                    if (str2 == null) {
                        aVar4.K(164308100);
                    } else {
                        aVar4.K(164308101);
                        f9t.e(p4q0Var.j, aVar4, 0);
                        yqv0.c(str2, null, wlb0.h(aVar4).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar4).i0, aVar4, 0, 0, 8122);
                        aVar4 = aVar4;
                    }
                    aVar4.j();
                    f9t.e(p4q0Var.h, aVar4, 0);
                    o4q0.b bVar = ((ynr0) ((zak0) wh50Var).getValue()).e;
                    if (bVar == null) {
                        aVar4.K(164797218);
                    } else {
                        aVar4.K(164797219);
                        androidx.compose.runtime.a aVar5 = aVar4;
                        bhu0.e((gzs) ((zak0) p4q0Var.b).getValue(), ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, p4q0Var.e, null, false, false, null, null, null, bVar.a, null, null, null, null, bVar.c, null, null, null, aVar5, X2.b.f, 0, 0, 4059104);
                        aVar4 = aVar5;
                        f9t.e(p4q0Var.i, aVar4, 0);
                    }
                    aVar4.j();
                    androidx.compose.runtime.a aVar6 = aVar4;
                    bhu0.e((gzs) ((zak0) p4q0Var.c).getValue(), ButtonSize.Large, ButtonStyle.Secondary, ButtonAppearance.Negative, p4q0Var.e, null, false, false, null, null, null, d370.N(R.string.unlink_vkbid_profile, 0, aVar4), null, null, null, null, false, null, null, null, aVar6, X2.b.f, 0, 0, 4190176);
                    aVar6.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                vlt0 vlt0Var = (vlt0) this.c;
                View view2 = (View) obj;
                ((Integer) obj3).getClass();
                vlt0Var.e.bk(new cet0(vlt0Var.d, ((vlt0.a) obj2).a == R.id.video_traffic_saving_enabled));
                vlt0Var.b(view2);
                return s3q0.a;
        }
    }
}
