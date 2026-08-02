package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: CtaSwitchCell.kt */
/* loaded from: classes17.dex */
public final class mkk {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Object obj, final boolean z, final boolean z2, final gzs gzsVar, final gzs gzsVar2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        String a;
        com.vk.core.compose.component.cell.content.o a2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(1461810576);
        int i4 = i | (M.J(obj) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.l(z2) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1461810576, i4, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CtaSwitchCell (CtaSwitchCell.kt:32)");
            }
            ClipInvolvementActionButton clipInvolvementActionButton = (ClipInvolvementActionButton) obj;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, M);
            }
            wh50 wh50Var = (wh50) x;
            boolean z3 = (i4 & 7168) == 2048;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new com.vk.movika.tools.controls.seekbar.f(5, gzsVar, wh50Var);
                M.R(x2);
            }
            gzs gzsVar3 = (gzs) x2;
            qzu0.a.getClass();
            lg90 b0 = qzu0.b0(M);
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.f.a(b0, size, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(d370.N(R.string.clips_publish_involvement_button_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (clipInvolvementActionButton instanceof ClipInvolvementActionButton.DonutLevel) {
                M.K(345687509);
                M.j();
                a = ((ClipInvolvementActionButton.DonutLevel) clipInvolvementActionButton).f;
            } else {
                if (epx.f(clipInvolvementActionButton, ClipInvolvementActionButton.MessageToBusinessCommunity.e)) {
                    i2 = 345690120;
                    i3 = R.string.clips_publish_involvement_write;
                } else if (epx.f(clipInvolvementActionButton, ClipInvolvementActionButton.OnlineBooking.e)) {
                    i2 = 345693898;
                    i3 = R.string.clips_publish_involvement_booking;
                } else if (epx.f(clipInvolvementActionButton, ClipInvolvementActionButton.OpenChannel.e)) {
                    i2 = 345697679;
                    i3 = R.string.clips_publish_involvement_open_channel;
                } else {
                    if (!(clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket)) {
                        throw alb0.c(345685537, M);
                    }
                    i2 = 345701612;
                    i3 = R.string.clips_publish_involvement_vk_ticket;
                }
                a = zq.a(M, i2, i3, M, 0);
            }
            com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(a4, Cell$Middle.c.b.b(a, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            if (z2) {
                M.K(2126961578);
                a2 = new hoa(VkTooltip$MarkerSize.Size96, gzsVar2, gzsVar3, kai.c(-163613587, new phg(wh50Var, 1), M));
                M.j();
                aVar3 = M;
            } else {
                M.K(2127317706);
                a2 = o.c.a(com.vk.core.compose.component.cell.content.n.a(((Boolean) wh50Var.getValue()).booleanValue(), null, false, null, M, 24576, 14), null, null, null, null, M, 62);
                aVar3 = M;
                aVar3.j();
            }
            Object x3 = aVar3.x();
            if (x3 == c0012a) {
                x3 = ir.h(aVar3);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(ojc.b(q630Var, (sg50) x3, null, false, null, gzsVar3, 28), false, a3, a5, a2, null, null, aVar4, 0, 98);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(obj, z, z2, gzsVar, gzsVar2, q630Var, i) { // from class: xsna.lkk
                public final /* synthetic */ Object b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    mkk.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
