package xsna;

import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhMsgSystemType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhMsgChatAvatarUpdate.kt */
/* loaded from: classes2.dex */
public final class vsr0 extends osr0<wsr0> {
    public static final /* synthetic */ int s = 0;
    public final TextView m;
    public final FrescoImageView n;
    public final qz30 o;
    public final List<Object> p;
    public Peer q;
    public pk30 r;

    /* compiled from: VhMsgChatAvatarUpdate.kt */
    public static final class a extends u120 {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            pk30 pk30Var;
            vsr0 vsr0Var = vsr0.this;
            Peer peer = vsr0Var.q;
            if (peer == null || (pk30Var = vsr0Var.r) == null) {
                return;
            }
            pk30Var.L(peer);
        }
    }

    public vsr0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.m = textView;
        FrescoImageView frescoImageView = (FrescoImageView) view.findViewById(R.id.image);
        this.n = frescoImageView;
        this.o = new qz30(view.getContext());
        new ImageList(null, 1, null);
        view.setTag(R.id.autotests_system_msg_type, VhMsgSystemType.ChatAvatarUpdate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        frescoImageView.setIsCircle(true);
        frescoImageView.setPlaceholder(new rcc((Object) null));
        bwt0.i0(frescoImageView, new ye40(this, 24));
        this.p = e43.l(new StyleSpan(1), new a());
    }

    @Override // xsna.osr0
    /* renamed from: a6, reason: merged with bridge method [inline-methods] */
    public final void V5(wsr0 wsr0Var, pk30 pk30Var) {
        ImageList imageList = wsr0Var.f;
        boolean z = wsr0Var.b;
        TextView textView = this.m;
        if (z) {
            az60.b(textView, R.attr.vk_legacy_im_service_message_text_alternate, R.drawable.bg_im_system_msg);
        } else {
            yil0.c(textView, R.attr.vk_legacy_im_service_message_text, null);
        }
        this.r = pk30Var;
        this.q = wsr0Var.d;
        boolean z2 = wsr0Var.e;
        textView.setText(this.o.d(wsr0Var.c, this.p, z2));
        FrescoImageView frescoImageView = this.n;
        frescoImageView.setRemoteImage(imageList);
        frescoImageView.setVisible(imageList.Jb());
    }
}
