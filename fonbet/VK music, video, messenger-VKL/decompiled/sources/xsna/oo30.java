package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vkontakte.android.R;

/* compiled from: MsgPartCallHolder.kt */
/* loaded from: classes2.dex */
public final class oo30 extends hr30<AttachCall, po30> {
    public static final /* synthetic */ int h = 0;
    public final MsgPartIconTwoRowView d;
    public pk30 e;
    public po30 f;
    public final ha9 g;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            oo30 oo30Var = oo30.this;
            pk30 pk30Var = oo30Var.e;
            po30 po30Var = oo30Var.f;
            Msg msg = po30Var != null ? po30Var.k : null;
            Attach attach = po30Var != null ? po30Var.m : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, po30Var != null ? po30Var.l : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            oo30 oo30Var = oo30.this;
            pk30 pk30Var = oo30Var.e;
            po30 po30Var = oo30Var.f;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = po30Var != null ? po30Var.k : null;
            Attach attach = po30Var != null ? po30Var.m : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, po30Var != null ? po30Var.l : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public oo30(MsgPartIconTwoRowView msgPartIconTwoRowView) {
        this.d = msgPartIconTwoRowView;
        this.g = new ha9(msgPartIconTwoRowView.getContext());
        t040 t040Var = t040.a;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        hr30.j(this.d, bubbleColors);
    }

    @Override // xsna.hr30
    public final void p(po30 po30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        po30 po30Var2 = po30Var;
        this.e = pk30Var;
        this.f = po30Var2;
        int i = po30Var2.e ? R.string.vkim_msg_list_call_outgoing : R.string.vkim_msg_list_call_incoming;
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        msgPartIconTwoRowView.setTitleText(i);
        boolean z = po30Var2.e;
        CallState callState = po30Var2.h;
        int i2 = po30Var2.g;
        ha9 ha9Var = this.g;
        String a2 = ha9Var.a(z, i2, callState, false);
        String str = ((Object) msgPartIconTwoRowView.getTitleText()) + ", " + ((Object) ha9Var.a(z, i2, callState, true));
        int i3 = callState == CallState.DONE ? R.style.VkIm_MsgPart_Call_Duration : R.style.VkIm_MsgPart_Call_Failure;
        msgPartIconTwoRowView.setSubtitleText(a2);
        msgPartIconTwoRowView.setContentDescription(str);
        msgPartIconTwoRowView.setSubtitleTextAppearance(i3);
        msgPartIconTwoRowView.setIcon(po30Var2.f ? R.drawable.vkim_ic_attach_video_call : R.drawable.vkim_ic_attach_call);
        hr30.l(msgPartIconTwoRowView.getTimeAndStatusView(), po30Var2.b, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        a aVar = new a();
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.d;
        jjc.g(msgPartIconTwoRowView, aVar);
        msgPartIconTwoRowView.setOnLongClickListener(new b());
        return msgPartIconTwoRowView;
    }

    @Override // xsna.hr30
    public final void r() {
        this.e = null;
        this.f = null;
    }
}
