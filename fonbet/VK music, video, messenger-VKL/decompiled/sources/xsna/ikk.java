package xsna;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.TooltipsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.CellLeftTooltipType;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Triple;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CtaCell.kt */
/* loaded from: classes17.dex */
public final class ikk {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018c, code lost:
    
        if (r12 == r8) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, android.graphics.Rect] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(qow qowVar, TooltipsData tooltipsData, CellLeftTooltipType cellLeftTooltipType, gzs gzsVar, gzs gzsVar2, izs izsVar, izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        Context context;
        ClipInvolvementActionButton clipInvolvementActionButton;
        Ref$ObjectRef ref$ObjectRef;
        String str;
        Object a;
        androidx.compose.runtime.a aVar2;
        int i2;
        String str2;
        Ref$ObjectRef ref$ObjectRef2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.a aVar3;
        Triple triple;
        int i7;
        int i8;
        int i9;
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(1859947404);
        int i10 = i | (M.J(qowVar) ? 4 : 2) | (M.J(tooltipsData) ? 32 : 16) | (M.o(cellLeftTooltipType == null ? -1 : cellLeftTooltipType.ordinal()) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192) | (M.y(izsVar) ? 131072 : 65536) | (M.y(izsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(q630Var) ? 8388608 : 4194304);
        if (M.t(i10 & 1, (i10 & 4793491) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1859947404, i10, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CtaCell (CtaCell.kt:42)");
            }
            Context context2 = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new Rect();
                M.R(x);
            }
            ref$ObjectRef3.element = (Rect) x;
            if (qowVar != null) {
                context = context2;
                clipInvolvementActionButton = (ClipInvolvementActionButton) qowVar.a;
            } else {
                context = context2;
                clipInvolvementActionButton = null;
            }
            if (cellLeftTooltipType != null) {
                M.K(320630533);
                int i11 = (i10 >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-465690862, i11, -1, "com.vk.clips.upload.vk.ui.impl.fragment.entity.type.CellLeftTooltipType.<get-title> (CellLeftTooltipType.kt:11)");
                }
                int i12 = CellLeftTooltipType.a.$EnumSwitchMapping$0[cellLeftTooltipType.ordinal()];
                if (i12 == 1) {
                    i7 = 0;
                    i8 = -852317335;
                    i9 = R.string.clips_publish_open_channel_tip;
                } else {
                    if (i12 != 2) {
                        throw alb0.c(-852318744, M);
                    }
                    i8 = -852314383;
                    i9 = R.string.clips_publish_ticket_action_button_tip;
                    i7 = 0;
                }
                String a2 = zq.a(M, i8, i9, M, i7);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                qzu0.a.getClass();
                lg90 i1 = qzu0.i1(M);
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                if (androidx.compose.runtime.b.d()) {
                    lg90Var = i1;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    lg90Var = i1;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().a;
                ref$ObjectRef = ref$ObjectRef3;
                com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.f.a(lg90Var, size, j, null, null, M, 196664, 24);
                aVar2 = M;
                boolean z = (i10 & 7168) == 2048;
                Object x2 = aVar2.x();
                if (z) {
                    c0012a = c0012a;
                } else {
                    c0012a = c0012a;
                }
                x2 = new m3(2, gzsVar);
                aVar2.R(x2);
                gzs gzsVar3 = (gzs) x2;
                boolean z2 = ((i10 & 896) == 256) | ((3670016 & i10) == 1048576);
                Object x3 = aVar2.x();
                if (z2 || x3 == c0012a) {
                    x3 = new yk(7, izsVar2, cellLeftTooltipType);
                    aVar2.R(x3);
                }
                a = new hna(a2, a3, gzsVar3, (gzs) x3);
                aVar2.j();
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            } else {
                ref$ObjectRef = ref$ObjectRef3;
                M.K(321058674);
                qzu0.a.getClass();
                lg90 b0 = qzu0.b0(M);
                Cell$Left.Main.Size size2 = Cell$Left.Main.Size.Medium;
                if (androidx.compose.runtime.b.d()) {
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                } else {
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = com.vk.core.compose.component.cell.content.f.a(b0, size2, ylu0Var2.getIcon().a, null, null, M, 196664, 24);
                aVar2 = M;
                aVar2.j();
            }
            if (clipInvolvementActionButton == null) {
                aVar2.K(321307821);
                androidx.compose.runtime.a aVar4 = aVar2;
                aVar3 = aVar4;
                triple = new Triple(a, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.clips_publish_involvement_button, 0, aVar2), null, null, 0, null, null, aVar4, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar4, 196608, 30), o.b.a.a(null, null, 0L, false, aVar4, 196608, 31));
                aVar3.j();
                i2 = i10;
                ref$ObjectRef2 = ref$ObjectRef;
            } else {
                aVar2.K(321606506);
                boolean y = ((458752 & i10) == 131072) | aVar2.y(clipInvolvementActionButton);
                Object x4 = aVar2.x();
                if (y || x4 == c0012a) {
                    x4 = new m84(9, izsVar, clipInvolvementActionButton);
                    aVar2.R(x4);
                }
                gzs gzsVar4 = (gzs) x4;
                int i13 = ((i10 >> 9) & 112) | ((i10 >> 3) & 896) | ((i10 << 6) & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2088103080, i13, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.getSelectedCellContent (CtaCell.kt:132)");
                }
                int i14 = (i13 >> 6) & 112;
                aVar2.K(-1030971351);
                if (androidx.compose.runtime.b.d()) {
                    i2 = i10;
                    androidx.compose.runtime.b.f(-1030971351, i14, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.getDonutCtaTooltipString (CtaCell.kt:175)");
                } else {
                    i2 = i10;
                }
                if (tooltipsData.j && (clipInvolvementActionButton instanceof ClipInvolvementActionButton.DonutLevel)) {
                    str2 = zq.a(aVar2, -356154574, R.string.clips_publish_donut_tip, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                } else {
                    if (oq.h(-363218823, aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                    str2 = null;
                }
                qzu0.a.getClass();
                lg90 i15 = qzu0.i1(aVar2);
                Cell$Left.Main.Size size3 = Cell$Left.Main.Size.Medium;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) aVar2.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ref$ObjectRef2 = ref$ObjectRef;
                androidx.compose.runtime.a aVar5 = aVar2;
                hna hnaVar = new hna(str2, com.vk.core.compose.component.cell.content.f.a(i15, size3, ylu0Var3.getIcon().a, null, null, aVar5, 196664, 24), gzsVar, gzsVar4);
                com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(d370.N(R.string.clips_publish_involvement_button_title, 0, aVar5), null, null, 0, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (clipInvolvementActionButton instanceof ClipInvolvementActionButton.DonutLevel) {
                    aVar5.K(-917298339);
                    aVar5.j();
                    str3 = ((ClipInvolvementActionButton.DonutLevel) clipInvolvementActionButton).f;
                } else {
                    if (clipInvolvementActionButton.equals(ClipInvolvementActionButton.MessageToBusinessCommunity.e)) {
                        i4 = -917295600;
                        i5 = R.string.clips_publish_involvement_write;
                        i3 = 0;
                    } else {
                        i3 = 0;
                        if (clipInvolvementActionButton.equals(ClipInvolvementActionButton.OnlineBooking.e)) {
                            i4 = -917291694;
                            i5 = R.string.clips_publish_involvement_booking;
                        } else if (clipInvolvementActionButton.equals(ClipInvolvementActionButton.OpenChannel.e)) {
                            i4 = -917287785;
                            i5 = R.string.clips_publish_involvement_open_channel;
                        } else {
                            if (!(clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket)) {
                                throw alb0.c(-917300355, aVar5);
                            }
                            aVar5.K(1628977490);
                            ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams = ((ClipInvolvementActionButton.VkTicket) clipInvolvementActionButton).g;
                            String zb = vkTicketParams != null ? vkTicketParams.zb() : null;
                            if (zb == null) {
                                str3 = zq.a(aVar5, -917281804, R.string.clips_publish_involvement_vk_ticket, aVar5, 0);
                            } else {
                                aVar5.K(-917283664);
                                aVar5.j();
                                str3 = zb;
                            }
                            aVar5.j();
                        }
                    }
                    str3 = zq.a(aVar5, i4, i5, aVar5, i3);
                }
                com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a4, Cell$Middle.c.b.b(str3, 0, null, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar5, 196608, 28);
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
                } else {
                    i6 = 0;
                }
                lg90 b = or.b(aVar5, -187349011, R.drawable.vk_icon_cancel_20, aVar5, i6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i6, -1, str);
                }
                ylu0 ylu0Var4 = (ylu0) aVar5.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var4.getIcon().l;
                float f = 20;
                aVar3 = aVar5;
                Triple triple2 = new Triple(hnaVar, a5, o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b, j2, byc0.b(f, f), d370.N(R.string.clips_publish_remove_attachment_a11y, 0, aVar5), gzsVar2, null, aVar5, 1573256 | (57344 & (i13 << 9)), 32), null, null, null, aVar5, 61));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                triple = triple2;
            }
            Cell$Left.Main main = (Cell$Left.Main) triple.d();
            Cell$Middle cell$Middle = (Cell$Middle) triple.g();
            com.vk.core.compose.component.cell.content.o oVar = (com.vk.core.compose.component.cell.content.o) triple.h();
            a.C0011a.C0012a c0012a2 = c0012a;
            Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef2;
            bap.f(tooltipsData, clipInvolvementActionButton, new hkk(clipInvolvementActionButton, tooltipsData, context, ref$ObjectRef4, izsVar, null), aVar3, (i2 >> 3) & 14);
            Object x5 = aVar3.x();
            if (x5 == c0012a2) {
                x5 = ir.h(aVar3);
            }
            androidx.compose.runtime.a aVar6 = aVar3;
            wiu0.b(egi.o(ojc.b(q630Var, (sg50) x5, null, false, null, gzsVar, 28), new j6e(ref$ObjectRef4, 13)), false, main, cell$Middle, oVar, null, null, aVar6, 0, 98);
            M = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gkk(qowVar, tooltipsData, cellLeftTooltipType, gzsVar, gzsVar2, izsVar, izsVar2, q630Var, i);
        }
    }
}
