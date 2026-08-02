package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.MsgPartTextWithEndIconView;
import com.vkontakte.android.R;

/* compiled from: MsgPartUserNameHolder.kt */
/* loaded from: classes2.dex */
public final class gu30 extends hr30<Attach, hu30> {
    public MsgPartTextWithEndIconView d;
    public final qyd0 e = qyd0.a;
    public final v5t f = new v5t(R.layout.vkim_msg_part_user_name);

    public gu30() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Unknown unknown = Peer.Unknown.e;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartTextWithEndIconView msgPartTextWithEndIconView = this.d;
        if (msgPartTextWithEndIconView == null) {
            msgPartTextWithEndIconView = null;
        }
        msgPartTextWithEndIconView.setColor(bubbleColors.k);
    }

    @Override // xsna.hr30
    public final void p(hu30 hu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        qtd0 qtd0Var = hu30Var.c;
        MsgPartTextWithEndIconView msgPartTextWithEndIconView = this.d;
        if (msgPartTextWithEndIconView == null) {
            msgPartTextWithEndIconView = null;
        }
        this.e.getClass();
        msgPartTextWithEndIconView.setText(qyd0.a(qtd0Var));
        b25 a = o25.a();
        if (qtd0Var != null && o25.b(a) && qtd0Var.t1() && qtd0Var.q9().b) {
            MsgPartTextWithEndIconView msgPartTextWithEndIconView2 = this.d;
            (msgPartTextWithEndIconView2 == null ? null : msgPartTextWithEndIconView2).setIconDrawable(m33.a(R.drawable.vk_icon_education_12, (msgPartTextWithEndIconView2 != null ? msgPartTextWithEndIconView2 : null).getContext()));
        } else {
            MsgPartTextWithEndIconView msgPartTextWithEndIconView3 = this.d;
            if (msgPartTextWithEndIconView3 == null) {
                msgPartTextWithEndIconView3 = null;
            }
            msgPartTextWithEndIconView3.setIconDrawable(null);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ((View) viewGroup.getParent()).setImportantForAccessibility(2);
        MsgPartTextWithEndIconView msgPartTextWithEndIconView = (MsgPartTextWithEndIconView) this.f.c(layoutInflater, viewGroup);
        this.d = msgPartTextWithEndIconView;
        if (msgPartTextWithEndIconView == null) {
            return null;
        }
        return msgPartTextWithEndIconView;
    }
}
