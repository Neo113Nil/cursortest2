package xsna;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.VhMsgServiceChatOwnerUpdateItem;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VhMsgChatOwnerUpdate.kt */
/* loaded from: classes2.dex */
public final class ptr0 extends osr0<VhMsgServiceChatOwnerUpdateItem> {
    public static final /* synthetic */ int s = 0;
    public final Context m;
    public final qz30 n;
    public final List<Object> o;
    public final TextView p;
    public Peer q;
    public pk30 r;

    /* compiled from: VhMsgChatOwnerUpdate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VhMsgServiceChatOwnerUpdateItem.Type.values().length];
            try {
                iArr[VhMsgServiceChatOwnerUpdateItem.Type.CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VhMsgServiceChatOwnerUpdateItem.Type.ANY_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VhMsgServiceChatOwnerUpdateItem.Type.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VhMsgServiceChatOwnerUpdateItem.Type.ANY_ADMIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VhMsgChatOwnerUpdate.kt */
    public static final class b extends u120 {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            ptr0 ptr0Var = ptr0.this;
            Peer peer = ptr0Var.q;
            if (peer == null || (pk30Var = ptr0Var.r) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public ptr0(View view) {
        super(view);
        Context context = view.getContext();
        this.m = context;
        this.n = new qz30(context);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.p = textView;
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ChatOwnerUpdate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.o = e43.l(new StyleSpan(1), new b());
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        CharSequence b2;
        String str;
        VhMsgServiceChatOwnerUpdateItem vhMsgServiceChatOwnerUpdateItem = (VhMsgServiceChatOwnerUpdateItem) obj;
        qtd0 qtd0Var = vhMsgServiceChatOwnerUpdateItem.d;
        this.r = pk30Var;
        boolean z = vhMsgServiceChatOwnerUpdateItem.g;
        TextView textView = this.p;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.q = vhMsgServiceChatOwnerUpdateItem.e;
        int i = a.$EnumSwitchMapping$0[vhMsgServiceChatOwnerUpdateItem.f.ordinal()];
        if (i != 1) {
            Context context = this.m;
            if (i == 2) {
                b2 = context.getString(R.string.vkim_msg_owner_update_anyuser);
            } else if (i == 3) {
                if (qtd0Var == null || (str = qtd0Var.name()) == null) {
                    str = "…";
                }
                b2 = context.getString(R.string.vkim_msg_owner_update_user, str);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                b2 = context.getString(R.string.vkim_msg_owner_update_anyadmin);
            }
        } else {
            qz30 qz30Var = this.n;
            qz30Var.getClass();
            b2 = qz30.b(qz30Var, qtd0Var, this.o, R.string.vkim_msg_owner_update_female, R.string.vkim_msg_owner_update_male, R.string.vkim_msg_owner_update_you, "%who_name%", 64);
        }
        textView.setText(b2);
    }
}
