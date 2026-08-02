package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vk.im.ui.components.common.NotifyId;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.cwb0;
import xsna.ikv0;
import xsna.qsb;
import xsna.tlo0;

/* compiled from: ChatMakeLinkVcV2Impl.kt */
/* loaded from: classes2.dex */
public final class vsb implements tsb {
    public final qsb.a a;
    public final ssb b;
    public final View c;
    public final VkGroupHeader d;
    public final VkCellButton e;
    public final VkText f;
    public final VkSpinner g;
    public final bzb0 h;

    /* JADX WARN: Multi-variable type inference failed */
    public vsb(LayoutInflater layoutInflater, ViewGroup viewGroup, qsb.a aVar, ssb ssbVar) {
        int i;
        int i2 = ssbVar.e;
        this.a = aVar;
        this.b = ssbVar;
        View inflate = layoutInflater.inflate(R.layout.vkim_chat_make_link_v2, viewGroup, false);
        this.c = inflate;
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.vkimShowLastMessages);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) inflate.findViewById(R.id.vkimLinkHint);
        this.d = vkGroupHeader;
        VkCellButton vkCellButton = (VkCellButton) inflate.findViewById(R.id.vkimShare);
        VkCellButton vkCellButton2 = (VkCellButton) inflate.findViewById(R.id.vkimCopy);
        VkCellButton vkCellButton3 = (VkCellButton) inflate.findViewById(R.id.vkimShareQr);
        VkCellButton vkCellButton4 = (VkCellButton) inflate.findViewById(R.id.vkimLinkInvalidate);
        this.e = vkCellButton4;
        VkText vkText = (VkText) inflate.findViewById(R.id.vkimChatLink);
        this.f = vkText;
        this.g = (VkSpinner) inflate.findViewById(R.id.vkimProgress);
        inflate.getContext();
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.root);
        this.h = new bzb0(inflate.getContext());
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        }
        vkGroupHeader.setTitle(new VkGroupHeader.d(vkGroupHeader.getContext().getString(R.string.vkim_chat_make_link_hint), null, null, null, 0, null, 510));
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        if (i2 > 0) {
            vkCell.setVisibility(0);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
            VkCell.Right.e eVar = null;
            VkCell.Right.ExtraAction.a aVar2 = null;
            vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.f((gzs) new km1(4, ref$BooleanRef, this), ref$BooleanRef.element, true), eVar, aVar2, (VkCell.Right.b) null, 30));
            tlo0.a aVar3 = tlo0.Companion;
            String string = vkCell.getContext().getString(R.string.vkim_show_chat_history);
            aVar3.getClass();
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            VkCell.Middle.c cVar = null;
            Object[] objArr3 = 0 == true ? 1 : 0;
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.h(string), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.h(vkCell.getContext().getString(R.string.vkim_invite_share_msgs_description, Integer.valueOf(i2))), (gzs) objArr2, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), cVar, (VkCell.Middle.Size) objArr3, 12));
        }
        if (vkCell == null) {
            f4m.j(vkCell);
            s3q0 s3q0Var = s3q0.a;
        }
        if (ssbVar.a) {
            i = 0;
            vkCellButton.setVisibility(0);
            jjc.g(vkCellButton, new sz(this, 13));
        } else {
            i = 0;
            f4m.j(vkCellButton);
        }
        if (ssbVar.b) {
            vkCellButton2.setVisibility(i);
            jjc.g(vkCellButton2, new com.vk.movika.sdk.base.observable.w(this, 19));
        } else {
            f4m.j(vkCellButton2);
        }
        if (ssbVar.c) {
            vkCellButton3.setVisibility(i);
            jjc.g(vkCellButton3, new ec(this, 22));
        } else {
            f4m.j(vkCellButton3);
        }
        if (ssbVar.d) {
            vkCellButton4.setVisibility(i);
            jjc.g(vkCellButton4, new e5(this, 20));
            f4m.t(e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkCellButton4.getContext()), vkCellButton4);
            f4m.q(e3m.a(R.dimen.vk_ui_spacing_size2_xl, vkCellButton4.getContext()), vkCellButton4);
        } else {
            f4m.j(vkCellButton4);
        }
        jjc.g(vkText, new pz(this, 12));
        f4m.l(0, 0, vkText);
        f4m.t(0, vkText);
        f4m.q(0, vkText);
    }

    @Override // xsna.tsb
    public final void a(Throwable th) {
        e();
        zk70.e(th);
    }

    @Override // xsna.tsb
    public final void b(NotifyId notifyId) {
        g2v.c().getClass();
        this.c.getContext();
        zk70.c(notifyId);
    }

    @Override // xsna.tsb
    public final void c() {
        Context context = this.c.getContext();
        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_chat_make_link);
        ikv0.a aVar = new ikv0.a(context);
        float f = 28;
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
        aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    @Override // xsna.tsb
    public final void d(msx msxVar) {
        VkText vkText = this.f;
        vkText.setVisibility(0);
        this.g.setVisibility(4);
        vkText.setText(msxVar.b);
        this.h.a();
        if (this.b.d) {
            boolean z = msxVar.c;
            VkCellButton vkCellButton = this.e;
            if (z) {
                f4m.j(vkCellButton);
                g(R.string.vkim_channel_link_hint);
            } else {
                vkCellButton.setVisibility(0);
                g(R.string.vkim_chat_make_link_hint);
            }
        }
    }

    @Override // xsna.tsb
    public final void destroy() {
        this.h.a();
    }

    @Override // xsna.tsb
    public final void e() {
        this.f.setVisibility(4);
        this.g.setVisibility(0);
    }

    @Override // xsna.tsb
    public final void f(z4 z4Var) {
        bzb0.d(this.h, cwb0.l.l, z4Var, null, null, 28);
    }

    public final void g(int i) {
        this.d.setTitle(new VkGroupHeader.d(this.c.getContext().getString(i), null, null, null, 0, null, 510));
    }

    @Override // xsna.tsb
    public final View getView() {
        return this.c;
    }
}
