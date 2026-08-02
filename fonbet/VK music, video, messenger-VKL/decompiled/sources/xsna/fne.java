package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.k;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.profile.community.impl.ui.profile.d;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.aoj0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.qvm;
import xsna.ush;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fne implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fne(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        q630.a aVar;
        TopBar$Middle.Text.d dVar;
        androidx.compose.runtime.a aVar2;
        char c;
        cne cneVar;
        boolean z;
        com.vk.core.compose.component.cell.content.i0 i0Var;
        int i = this.b;
        int i2 = 7;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i3 = -1;
        char c2 = 2;
        int i4 = 9;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                gne gneVar = (gne) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = gne.j1;
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1497571489, intValue, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.card.ClipsNotInterestedModalCard.ThemedContent.<anonymous> (ClipsNotInterestedModalCard.kt:32)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-427206054, 0, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.card.ClipsNotInterestedModalCard.NotInterestedMenuContent (ClipsNotInterestedModalCard.kt:38)");
                    }
                    Object x = aVar3.x();
                    if (x == c0012a) {
                        x = new od3(11);
                        aVar3.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    q630.a aVar4 = q630.a.a;
                    q630 b = com.vk.core.compose.component.semantics.b.b(aVar4, a);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c3 = qri.c(aVar3, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a2, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c3, cri.a.d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1991469658, 0, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.card.ClipsNotInterestedModalCard.NotInterestedTopBar (ClipsNotInterestedModalCard.kt:53)");
                    }
                    Object x2 = aVar3.x();
                    if (x2 == c0012a) {
                        CharSequence charSequence = gneVar.I;
                        x2 = charSequence != null ? charSequence.toString() : null;
                        aVar3.R(x2);
                    }
                    String str = (String) x2;
                    Object x3 = aVar3.x();
                    if (x3 == c0012a) {
                        CharSequence charSequence2 = gneVar.Q;
                        x3 = charSequence2 != null ? charSequence2.toString() : null;
                        aVar3.R(x3);
                    }
                    String str2 = (String) x3;
                    if (str == null && str2 == null) {
                        aVar3.K(1487387432);
                        aVar3.j();
                        aVar = aVar4;
                        aVar2 = aVar3;
                    } else {
                        aVar3.K(1489653625);
                        k.a.C0761a c0761a = k.a.C0761a.a;
                        TopBar$Middle.a aVar6 = TopBar$Middle.a.c;
                        if (str == null) {
                            str = "";
                        }
                        Object x4 = aVar3.x();
                        if (x4 == c0012a) {
                            x4 = new vr0(16);
                            aVar3.R(x4);
                        }
                        String str3 = str;
                        aVar = aVar4;
                        TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(str3, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar3, 196608, 14);
                        if (str2 != null) {
                            aVar3.K(1490179075);
                            Object x5 = aVar3.x();
                            if (x5 == c0012a) {
                                x5 = new sc(i4);
                                aVar3.R(x5);
                            }
                            TopBar$Middle.Text.d a4 = TopBar$Middle.Text.d.a.a(str2, 0, 0, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), aVar3, 196614, 14);
                            aVar3.j();
                            dVar = a4;
                        } else {
                            aVar3.K(1490529716);
                            aVar3.j();
                            dVar = null;
                        }
                        muv0.h(aVar6, null, c0761a, TopBar$Middle.Text.b.a(a3, dVar, null, null, aVar3, 12), null, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 390, 0, 8178);
                        aVar2 = aVar3;
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(196483069, 0, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.card.ClipsNotInterestedModalCard.NotInterestedActions (ClipsNotInterestedModalCard.kt:84)");
                    }
                    Object x6 = aVar2.x();
                    if (x6 == c0012a) {
                        x6 = gneVar.h1;
                        if (x6 == null) {
                            x6 = null;
                        }
                        aVar2.R(x6);
                    }
                    aVar2.K(-158327109);
                    for (cne cneVar2 : (List) x6) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-699942448, 0, i3, "com.vk.clips.viewer.impl.feed.view.notinterested.card.ClipsNotInterestedModalCard.NotInterestedAction (ClipsNotInterestedModalCard.kt:93)");
                        }
                        wzs<androidx.compose.runtime.a, Integer, lg90> wzsVar = cneVar2.c;
                        Object x7 = aVar2.x();
                        if (x7 == c0012a) {
                            x7 = new tc(i4);
                            aVar2.R(x7);
                        }
                        q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3));
                        boolean z2 = cneVar2.d;
                        if (wzsVar != null) {
                            aVar2.K(81217071);
                            lg90 invoke = wzsVar.invoke(aVar2, 0);
                            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j = ylu0Var.getIcon().c;
                            Object x8 = aVar2.x();
                            if (x8 == c0012a) {
                                x8 = new wr0(i4);
                                aVar2.R(x8);
                            }
                            androidx.compose.runtime.a aVar7 = aVar2;
                            z = z2;
                            cneVar = cneVar2;
                            com.vk.core.compose.component.cell.content.x a5 = com.vk.core.compose.component.cell.content.f.a(invoke, size, j, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x8, 3), aVar7, 196664, 8);
                            aVar2 = aVar7;
                            c = 2;
                            com.vk.core.compose.component.cell.content.i0 a6 = Cell$Left.a.a(a5, null, aVar2, 2);
                            aVar2.j();
                            i0Var = a6;
                        } else {
                            c = c2;
                            cneVar = cneVar2;
                            z = z2;
                            aVar2.K(81688302);
                            aVar2.j();
                            i0Var = null;
                        }
                        String str4 = cneVar.b;
                        Object x9 = aVar2.x();
                        if (x9 == c0012a) {
                            x9 = new xr0(14);
                            aVar2.R(x9);
                        }
                        com.vk.core.compose.component.semantics.a a7 = com.vk.core.compose.component.semantics.b.a(null, (izs) x9, 3);
                        char c4 = c;
                        androidx.compose.runtime.a aVar8 = aVar2;
                        com.vk.core.compose.component.cell.content.k0 a8 = Cell$Middle.a.a(Cell$Middle.d.b.a(str4, null, null, 0, a7, null, aVar8, 12582912, 94), null, null, null, aVar8, 196608, 30);
                        boolean y = aVar8.y(gneVar) | aVar8.J(cneVar);
                        Object x10 = aVar8.x();
                        if (y || x10 == c0012a) {
                            x10 = new com.vk.movika.sdk.base.flow.binding.g(6, gneVar, cneVar);
                            aVar8.R(x10);
                        }
                        wiu0.b(b2, z, i0Var, a8, null, (gzs) x10, null, aVar8, 0, 80);
                        aVar2 = aVar8;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c2 = c4;
                        i3 = -1;
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 1:
                ush.a aVar9 = (ush.a) obj;
                l3f l3fVar = ((ush) obj3).f;
                List list = aVar9.a;
                if (list == null) {
                    list = EmptyList.b;
                }
                l3fVar.invoke(new d.n.c.b.C1617b(list, aVar9.c));
                return s3q0.a;
            case 2:
                ((ham) obj3).a((kkm) obj2);
                return s3q0.a;
            case 3:
                lvm lvmVar = (lvm) obj3;
                qvm.a aVar10 = new qvm.a(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                lvmVar.getClass();
                xn50.a.c(lvmVar, aVar10);
                return s3q0.a;
            case 4:
                DonutLevelsFragment donutLevelsFragment = (DonutLevelsFragment) obj3;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = DonutLevelsFragment.R;
                if (aVar11.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1747635878, intValue2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment.onCreateView.<anonymous>.<anonymous> (DonutLevelsFragment.kt:117)");
                    }
                    DonutLevel donutLevel = (DonutLevel) ((zak0) donutLevelsFragment.N).getValue();
                    List<T> list2 = ((wow) ((zak0) donutLevelsFragment.O).getValue()).b;
                    boolean y2 = aVar11.y(donutLevelsFragment);
                    Object x11 = aVar11.x();
                    if (y2 || x11 == c0012a) {
                        x11 = new enh(donutLevelsFragment, 10);
                        aVar11.R(x11);
                    }
                    gzs gzsVar = (gzs) x11;
                    boolean y3 = aVar11.y(donutLevelsFragment);
                    Object x12 = aVar11.x();
                    int i7 = 4;
                    if (y3 || x12 == c0012a) {
                        x12 = new t2l(donutLevelsFragment, i7);
                        aVar11.R(x12);
                    }
                    gzs gzsVar2 = (gzs) x12;
                    boolean y4 = aVar11.y(donutLevelsFragment);
                    Object x13 = aVar11.x();
                    if (y4 || x13 == c0012a) {
                        x13 = new g1j(donutLevelsFragment, i7);
                        aVar11.R(x13);
                    }
                    o0o.b(donutLevel, list2, gzsVar, gzsVar2, (izs) x13, aVar11, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((v0r) obj3).j(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((xzy) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                return Integer.valueOf(((j1d0) obj3).c.compare(((d1d0) obj).a, ((d1d0) obj2).a));
            case 8:
                aoj0.a aVar12 = (aoj0.a) obj3;
                androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar13.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(731996223, intValue3, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.SimilarSliderEmptyDelegate.ViewHolder.<anonymous> (SimilarSliderEmptyDelegate.kt:52)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(-1965775684, new y5(aVar12, i4), aVar13), aVar13, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar13.h();
                }
                return s3q0.a;
            case 9:
                fuv0 fuv0Var = (fuv0) obj3;
                androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar14.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1435360944, intValue4, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ShowTooltipComposeButtons.<anonymous>.<anonymous>.<anonymous> (TooltipScreenContent.kt:415)");
                    }
                    boolean J = aVar14.J(fuv0Var);
                    Object x14 = aVar14.x();
                    if (J || x14 == c0012a) {
                        x14 = new afl0(fuv0Var, i2);
                        aVar14.R(x14);
                    }
                    mpj0.a(6, 2, aVar14, "Long text (3 lines)", (gzs) x14, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar14.h();
                }
                return s3q0.a;
            case 10:
                return ((jmq0) obj3).e.q(((Integer) obj).intValue(), 20);
            case 11:
                maz.c(((com.vk.catalog2.common.ui.mvp.configuration.a) obj3).k0().e(), (Context) obj, (String) obj2, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 12:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar15 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar15.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1190743628, intValue5, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheetBuilder.setContent.<anonymous>.<anonymous> (VkComposeModalBottomSheetBuilder.kt:22)");
                    }
                    if (cq.i(0, aVar15, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar15.h();
                }
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                hqv0.a((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                hnx0.a((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((apx0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ fne(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
