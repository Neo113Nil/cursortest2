package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoSeason;
import com.vk.profile.user.impl.domain.edit.nickname.popup.NicknamePopupChoice;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.Collections;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;
import xsna.yjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v9a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v9a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                return z9a.r((z9a) obj5, (List) obj, (List) obj2, true, (List) obj3, null, (String) obj4, 64);
            case 1:
                q630 q630Var = (q630) obj5;
                izs izsVar = (izs) obj4;
                kyl.e eVar = (kyl.e) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(eVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(331982051, intValue, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsMapSheetContent.<anonymous> (DeliveryPointsMapSheetContent.kt:18)");
                    }
                    if (eVar instanceof kyl.e.c) {
                        aVar.K(-1232335625);
                        f9t.e(txj0.h(q630Var, 1), aVar, 0);
                        aVar.j();
                    } else if (eVar instanceof kyl.e.a) {
                        aVar.K(-1231964679);
                        mwl.a(q630Var, aVar, 0);
                        aVar.j();
                    } else if (eVar instanceof kyl.e.C3216e) {
                        aVar.K(-1231816220);
                        bxl.d(izsVar, (kyl.e.C3216e) eVar, q630Var, aVar, 0);
                        aVar.j();
                    } else if (eVar instanceof kyl.e.f) {
                        aVar.K(-1231584402);
                        syl.b(q630Var, aVar, 0);
                        aVar.j();
                    } else if (eVar instanceof kyl.e.d) {
                        aVar.K(-1231422334);
                        hwl.d(izsVar, (kyl.e.d) eVar, q630Var, aVar, 0);
                        aVar.j();
                    } else {
                        if (!(eVar instanceof kyl.e.b)) {
                            throw alb0.c(1207172838, aVar);
                        }
                        aVar.K(-1231193833);
                        pyl.a(izsVar, ((kyl.e.b) eVar).c, q630Var, aVar, 0);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                yjq0.d dVar = (yjq0.d) obj5;
                izs izsVar2 = (izs) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(951581231, intValue2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.NicknameContainer.<anonymous>.<anonymous> (NicknameContainer.kt:57)");
                    }
                    for (NicknamePopupChoice nicknamePopupChoice : (Iterable) dVar.a) {
                        a270.b(d370.N(nicknamePopupChoice.j(), 0, aVar2), nicknamePopupChoice.i(), new jiq0(nicknamePopupChoice.h()), izsVar2, aVar2, 0);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                rbt0 rbt0Var = (rbt0) obj;
                int i2 = ((VideoSeason) obj5).b;
                int i3 = rbt0Var.a;
                return new c.s0.h(new mct0(i2, new k9x(i3, rbt0Var.b + i3, 1), ((com.vk.video.ui.discovery.minimizable.related_videos.e) obj4).c, rbt0Var.c, Collections.singletonList(rbt0Var), (VideoFile) obj2, (VideoFile) obj3));
            case 4:
                poa poaVar = (poa) obj5;
                voa voaVar = (voa) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-10608847, intValue3, -1, "com.vk.core.compose.component.cell.VkCellSkeleton.<anonymous> (VkCellSkeleton.kt:34)");
                    }
                    fvr.n();
                    q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.vk.core.compose.component.defaults.c.b, 1, q630.a.a);
                    fvr.n();
                    q630 C = s200.C(b, fsk.o(aVar3));
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, aVar3, 48);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    if (poaVar == null) {
                        aVar3.K(1889211419);
                    } else {
                        aVar3.K(1889211420);
                        poaVar.a(54, aVar3);
                    }
                    aVar3.j();
                    if (voaVar == null) {
                        aVar3.K(1889257051);
                    } else {
                        aVar3.K(1889257052);
                        voaVar.a(54, aVar3);
                    }
                    aVar3.j();
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                List list = (List) obj5;
                Context context = (Context) obj4;
                int intValue4 = ((Integer) obj).intValue();
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar5.o(intValue4) ? 4 : 2;
                }
                if (aVar5.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-498904322, intValue5, -1, "com.vk.music.design.compose.equalizer.EqualizerGraphRow.<anonymous> (VkMusicEqualizer.kt:55)");
                    }
                    int intValue6 = ((Number) list.get(intValue4)).intValue() / 1000;
                    q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 5);
                    String b2 = t5v0.b(intValue6, context);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(b2, H, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.v0.b(aVar5), aVar5, 48, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }
}
