package xsna;

import android.graphics.RectF;
import androidx.compose.runtime.a;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.HighlightRemoteStoryCover;
import com.vk.dto.narratives.Narrative;
import com.vk.ecomm.market.good.ui.j;
import com.vk.im.design.view.placeholder.ImChipPlaceholder;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.TitleViewState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.dz40;
import xsna.gfp0;
import xsna.gu1;
import xsna.p5g;
import xsna.phw;
import xsna.q630;
import xsna.qrd0;
import xsna.xpv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qq0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qq0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.cell.content.x a;
        androidx.compose.runtime.a aVar;
        com.vk.core.compose.component.cell.content.x xVar;
        RectF d;
        int i;
        lg90 b;
        efj a2;
        androidx.compose.runtime.a aVar2;
        int i2;
        String f;
        androidx.compose.runtime.a aVar3;
        qow qowVar;
        Image image;
        ArrayList arrayList;
        k18 a3;
        int i3;
        int i4;
        int i5 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i5) {
            case 0:
                ((Integer) obj2).getClass();
                ((hr0) obj5).o((gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((yp7) obj5).i((com.vk.ecomm.onlinebooking.impl.edit.q) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                gu1.b bVar = (gu1.b) obj5;
                m5v m5vVar = (m5v) obj4;
                String str = (String) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(662319862, intValue, -1, "com.vk.narratives.impl.highlights.list.HighlightViewHolder.onBind.<anonymous>.<anonymous> (HighlightViewHolder.kt:80)");
                    }
                    boolean z = bVar.c;
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (z) {
                        aVar4.K(91335588);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                        }
                        lg90 b2 = or.b(aVar4, 1833859693, R.drawable.vk_icon_cancel_24, aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.l().Q;
                        float f2 = 24;
                        long b3 = byc0.b(f2, f2);
                        boolean y = aVar4.y(m5vVar);
                        Object x = aVar4.x();
                        if (y || x == c0012a2) {
                            x = new z0h(m5vVar, 21);
                            aVar4.R(x);
                        }
                        gzs gzsVar = (gzs) x;
                        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                        Object x2 = aVar4.x();
                        if (x2 == c0012a2) {
                            x2 = new yy(29);
                            aVar4.R(x2);
                        }
                        com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
                        c0012a = c0012a2;
                        a = com.vk.core.compose.component.cell.content.p.a(b2, j, b3, null, gzsVar, a4, aVar4, 1573256, 8);
                        aVar = aVar4;
                        aVar.j();
                    } else {
                        c0012a = c0012a2;
                        aVar4.K(92229907);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                        }
                        lg90 a5 = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.l().Q;
                        float f3 = 24;
                        long b4 = byc0.b(f3, f3);
                        boolean y2 = aVar4.y(m5vVar);
                        Object x3 = aVar4.x();
                        if (y2 || x3 == c0012a) {
                            x3 = new wqf(m5vVar, 27);
                            aVar4.R(x3);
                        }
                        gzs gzsVar2 = (gzs) x3;
                        SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.Merge;
                        Object x4 = aVar4.x();
                        if (x4 == c0012a) {
                            x4 = new oc0(25);
                            aVar4.R(x4);
                        }
                        a = com.vk.core.compose.component.cell.content.p.a(a5, j2, b4, null, gzsVar2, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x4, 2), aVar4, 1573256, 8);
                        aVar = aVar4;
                        aVar.j();
                    }
                    if (z) {
                        aVar.K(92908156);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = 0;
                            androidx.compose.runtime.b.f(1416148378, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Reorder24> (VkSdkIcons.kt:2948)");
                        } else {
                            i4 = 0;
                        }
                        lg90 b5 = or.b(aVar, -987250162, R.drawable.vk_icon_reorder_24, aVar, i4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i4, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j3 = ylu0Var3.l().Q;
                        SemanticsConfiguration.Mode mode3 = SemanticsConfiguration.Mode.Merge;
                        Object x5 = aVar.x();
                        if (x5 == c0012a) {
                            x5 = new rvq(4);
                            aVar.R(x5);
                        }
                        androidx.compose.runtime.a aVar5 = aVar;
                        xVar = com.vk.core.compose.component.cell.content.d.a(b5, j3, com.vk.core.compose.component.semantics.b.a(mode3, (izs) x5, 2), aVar5, 28);
                        aVar = aVar5;
                        aVar.j();
                    } else {
                        aVar.K(93361376);
                        aVar.j();
                        xVar = null;
                    }
                    q630 d2 = txj0.d(q630.a.a, 1.0f);
                    boolean y3 = aVar.y(m5vVar);
                    Object x6 = aVar.x();
                    if (y3 || x6 == c0012a) {
                        x6 = new uoh(m5vVar, 24);
                        aVar.R(x6);
                    }
                    q630 b6 = egi0.b(d2, false, (izs) x6);
                    Narrative narrative = bVar.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1443619543, 0, -1, "com.vk.narratives.impl.highlights.list.HighlightViewHolder.buildAvatarImage (HighlightViewHolder.kt:155)");
                    }
                    HighlightCover highlightCover = narrative.e;
                    bqj0 bqj0Var = (highlightCover == null || (highlightCover instanceof HighlightRemoteStoryCover) || (d = highlightCover.d()) == null) ? null : new bqj0(d);
                    Serializer.c<Narrative> cVar = Narrative.CREATOR;
                    int a6 = iah0.a(64);
                    HighlightCover highlightCover2 = narrative.e;
                    if ((highlightCover2 != null ? highlightCover2.e(a6) : null) == null) {
                        aVar.K(-1361772524);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            i3 = 0;
                            androidx.compose.runtime.b.f(-204205150, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-NarrativeActiveOutline24> (VkIcons.kt:7962)");
                        } else {
                            i3 = 0;
                        }
                        lg90 a7 = pg90.a(R.drawable.vk_icon_narrative_active_outline_24, i3, aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i3, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar6 = aVar;
                        a2 = xpv.a.a(a7, ylu0Var4.p().a, null, aVar6, 24584, 12);
                        aVar2 = aVar6;
                        aVar2.j();
                    } else if (narrative.Ab()) {
                        aVar.K(-1361530259);
                        HighlightCover highlightCover3 = ((gu1.b) m5vVar.m).b.e;
                        HighlightRemoteStoryCover highlightRemoteStoryCover = highlightCover3 instanceof HighlightRemoteStoryCover ? (HighlightRemoteStoryCover) highlightCover3 : null;
                        if (highlightRemoteStoryCover == null || (image = highlightRemoteStoryCover.b) == null || (arrayList = image.b) == null || (f = ixj0.h(arrayList)) == null) {
                            HighlightCover highlightCover4 = ((gu1.b) m5vVar.m).b.e;
                            f = highlightCover4 != null ? highlightCover4.f() : "";
                        }
                        String str2 = f;
                        if (bqj0Var != null) {
                            aVar3 = aVar;
                            qowVar = new qow(bqj0Var);
                        } else {
                            aVar3 = aVar;
                            qowVar = null;
                        }
                        androidx.compose.runtime.a aVar7 = aVar3;
                        a2 = phw.a.a(fwu0.l(null, str2, null, qowVar, aVar3, 0, 29), null, null, null, null, aVar7, 196616, 30);
                        aVar2 = aVar7;
                        aVar2.j();
                    } else {
                        aVar.K(-1361056083);
                        if (narrative.h) {
                            aVar.K(-1361007351);
                            if (androidx.compose.runtime.b.d()) {
                                i2 = 0;
                                androidx.compose.runtime.b.f(-1066817700, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Delete24> (VkSdkIcons.kt:606)");
                            } else {
                                i2 = 0;
                            }
                            b = or.b(aVar, 1192058125, R.drawable.vk_icon_delete_24, aVar, i2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar.j();
                            i = 0;
                        } else {
                            aVar.K(-1360953783);
                            qzu0.a.getClass();
                            if (androidx.compose.runtime.b.d()) {
                                i = 0;
                                androidx.compose.runtime.b.f(-1857889950, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Report24> (VkIcons.kt:9500)");
                            } else {
                                i = 0;
                            }
                            b = or.b(aVar, 844208458, R.drawable.vk_icon_report_24, aVar, i);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar8 = aVar;
                        a2 = xpv.a.a(b, ylu0Var5.p().a, null, aVar8, 24584, 12);
                        aVar2 = aVar8;
                        aVar2.j();
                    }
                    if (z) {
                        aVar2.K(-1360686346);
                        aVar2.j();
                        a3 = wep.a;
                    } else {
                        aVar2.K(-1360642171);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var6 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar9 = aVar2;
                        a3 = p5g.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 196656, 28, ylu0Var6.p().a, aVar9, true);
                        aVar2 = aVar9;
                        aVar2.j();
                    }
                    Cell$Left.Main.Size size = Cell$Left.Main.Size.Large;
                    Object x7 = aVar2.x();
                    if (x7 == c0012a) {
                        x7 = new jr3(19);
                        aVar2.R(x7);
                    }
                    com.vk.core.compose.component.semantics.a a8 = com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3);
                    boolean y4 = aVar2.y(m5vVar) | aVar2.y(narrative);
                    Object x8 = aVar2.x();
                    if (y4 || x8 == c0012a) {
                        x8 = new com.vk.movika.tools.controls.seekbar.f(11, m5vVar, narrative);
                        aVar2.R(x8);
                    }
                    androidx.compose.runtime.a aVar10 = aVar2;
                    com.vk.core.compose.component.cell.content.t a9 = com.vk.core.compose.component.cell.content.e.a(a2, size, null, a3, null, (gzs) x8, a8, aVar10, 100663344, 84);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    com.vk.core.compose.component.cell.content.i0 a10 = Cell$Left.a.a(a9, xVar, aVar10, 0);
                    RichCell$Middle.Size size2 = RichCell$Middle.Size.Medium;
                    String str3 = m5vVar.q6().d;
                    SemanticsConfiguration.Mode mode4 = SemanticsConfiguration.Mode.Merge;
                    boolean y5 = aVar10.y(m5vVar);
                    Object x9 = aVar10.x();
                    if (y5 || x9 == c0012a) {
                        x9 = new zkh(m5vVar, 23);
                        aVar10.R(x9);
                    }
                    com.vk.core.compose.component.cell.content.f1 a11 = RichCell$Middle.h.b.a(str3, null, null, com.vk.core.compose.component.semantics.b.a(mode4, (izs) x9, 2), aVar10, 196608, 14);
                    Object x10 = aVar10.x();
                    if (x10 == c0012a) {
                        x10 = new azt(3);
                        aVar10.R(x10);
                    }
                    ygv0.a(b6, a10, RichCell$Middle.b.a(null, a11, null, RichCell$Middle.c.b.a(str, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3), aVar10, 196608, 14), null, null, null, null, null, aVar10, 6, CommonConstant.RETCODE.INDEPENDENT_AUTH_NOT_ALLOW), a, null, aVar10, 0, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 3:
                tlo0 tlo0Var = (tlo0) obj5;
                ImChipPlaceholder imChipPlaceholder = (ImChipPlaceholder) obj4;
                com.vk.movika.sdk.base.model.props.a aVar11 = (com.vk.movika.sdk.base.model.props.a) obj3;
                androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = ImChipPlaceholder.c;
                if (aVar12.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1878710674, intValue2, -1, "com.vk.im.design.view.placeholder.ImChipPlaceholder.setChip.<anonymous>.<anonymous> (ImChipPlaceholder.kt:45)");
                    }
                    bzv.a(0, aVar12, tlo0Var.a(imChipPlaceholder.getContext()).toString(), aVar11, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar12.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((mnw) obj5).a((q630) obj4, (pco) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                oi70.b((NotificationImage) obj5, (NotificationImage.Shape) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cgb0.b((gfp0.c) obj5, (dz40.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.market.good.ui.j) obj5).d((hid0) obj4, (j.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((qrd0) obj5).q6((qrd0.f) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.a.a((TitleViewState) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                o5p0 o5p0Var = (o5p0) obj5;
                spg0 spg0Var = (spg0) obj4;
                q630 q630Var = (q630) obj3;
                androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar13.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1732497932, intValue3, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.TooltipIconWrapper.Content.<anonymous> (ProductsPickerEntryPointCell.kt:180)");
                    }
                    o5p0Var.b(spg0Var, o5p0Var.b, q630Var, aVar13, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar13.h();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.video.videocard.a.c((VideoCardViewState.Size) obj5, (VideoCardViewState.b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                txs0 txs0Var = (txs0) obj5;
                ao50 ao50Var = (ao50) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar14.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1000764301, intValue4, -1, "com.vk.video.ui.share.impl.compose.VideoMviComposeView.Content.<anonymous> (VideoMviComposeView.kt:22)");
                    }
                    ((f7j0) txs0Var).a(ao50Var, izsVar, aVar14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar14.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qq0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
