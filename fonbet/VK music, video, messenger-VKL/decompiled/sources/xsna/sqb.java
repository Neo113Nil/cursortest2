package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vkontakte.android.R;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sqb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sqb(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                Source source = (Source) obj4;
                ChatFragment chatFragment = (ChatFragment) obj3;
                MsgIdType msgIdType = (MsgIdType) obj2;
                wpp wppVar = (wpp) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                Msg msg = (Msg) j5g.Z(wppVar.c.values());
                Object[] objArr = msg != null && (msg.n || msg.m);
                if (msg != null || source != Source.CACHE) {
                    if (msg == null) {
                        edw edwVar = edw.a;
                        edw.d(R.string.vkim_pinned_msg_not_found, chatFragment.requireContext(), true);
                    } else if (objArr == true) {
                        NestedMsg nestedMsg = new NestedMsg(msg, NestedMsg.Type.REPLY);
                        o0w b = chatFragment.r0.b();
                        FragmentActivity kn = chatFragment.kn();
                        DialogExt dialogExt = chatFragment.V;
                        b.q(kn, nestedMsg, dialogExt != null ? dialogExt : null, chatFragment.no());
                        com.vk.metrics.eventtracking.b.a.n("messages_reply_view");
                    } else {
                        chatFragment.Ao(MsgIdType.CNV_ID, msg.d);
                    }
                }
                if (objArr == false && source == Source.CACHE && (msg == null || wppVar.f())) {
                    chatFragment.zo(msgIdType, i2, Source.NETWORK, msg == null);
                }
                break;
            default:
                pfv pfvVar = (pfv) obj4;
                ep10 ep10Var = (ep10) obj3;
                tra0 tra0Var = (tra0) obj2;
                tra0.a aVar = (tra0.a) obj;
                int i3 = pfvVar.b;
                xgo0 xgo0Var = pfvVar.a;
                klp0 klp0Var = pfvVar.c;
                mjo0 invoke = pfvVar.d.invoke();
                xgo0Var.a(Orientation.Horizontal, vgo0.a(aVar, i3, klp0Var, invoke != null ? invoke.a : null, ep10Var.getLayoutDirection() == LayoutDirection.Rtl, tra0Var.b), i2, tra0Var.b);
                tra0.a.x(aVar, tra0Var, Math.round(-((vak0) xgo0Var.a).getFloatValue()), 0);
                break;
        }
        return s3q0.a;
    }
}
