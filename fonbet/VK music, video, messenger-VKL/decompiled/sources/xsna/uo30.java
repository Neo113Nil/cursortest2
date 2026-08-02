package xsna;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.dto.attaches.AttachDoc;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: MsgPartChannelAttachStubDocHolder.kt */
/* loaded from: classes2.dex */
public final class uo30 extends hr30<AttachDoc, wo30> {
    public MsgPartIconTwoRowView d;
    public final StringBuilder e = new StringBuilder();

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.j;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        msgPartIconTwoRowView.setTitleTextColor(i);
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.d;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        msgPartIconTwoRowView2.setSubtitleTextColor(i);
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.d;
        (msgPartIconTwoRowView3 != null ? msgPartIconTwoRowView3 : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(wo30 wo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        wo30 wo30Var2 = wo30Var;
        AttachChannelStub attachChannelStub = wo30Var2.b;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        ucp ucpVar = ucp.a;
        msgPartIconTwoRowView.setTitleText(ucp.i(attachChannelStub.e));
        StringBuilder sb = this.e;
        sb.setLength(0);
        lar larVar = lar.a;
        long j = attachChannelStub.g;
        larVar.getClass();
        lar.b(j, sb);
        String str = attachChannelStub.h;
        if (!drm0.N(str)) {
            sb.append(" · ");
            sb.append(str.toUpperCase(Locale.ROOT));
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.d;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        msgPartIconTwoRowView2.setSubtitleText(sb);
        jr30 jr30Var = wo30Var2.d;
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.d;
        hr30.m(jr30Var, msgPartIconTwoRowView3 != null ? msgPartIconTwoRowView3 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getContext();
        MsgPartIconTwoRowView msgPartIconTwoRowView = (MsgPartIconTwoRowView) layoutInflater.inflate(R.layout.vkim_msg_part_doc_simple, viewGroup, false);
        this.d = msgPartIconTwoRowView;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        f4m.j(msgPartIconTwoRowView.getProgressView());
        MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.d;
        if (msgPartIconTwoRowView2 == null) {
            msgPartIconTwoRowView2 = null;
        }
        ImageView iconView = msgPartIconTwoRowView2.getIconView();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        iconView.setBackground(shapeDrawable);
        iconView.setClipToOutline(true);
        iconView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        com.vk.core.view.shimmer.a aVar = new com.vk.core.view.shimmer.a();
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        aVar.b(((Shimmer.c) ((Shimmer.c) cVar.j()).d()).a());
        aVar.c();
        iconView.setImageDrawable(aVar);
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.d;
        if (msgPartIconTwoRowView3 == null) {
            return null;
        }
        return msgPartIconTwoRowView3;
    }
}
