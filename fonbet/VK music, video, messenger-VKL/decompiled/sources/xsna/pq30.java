package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;

/* compiled from: MsgPartFwdSenderHolder.kt */
/* loaded from: classes2.dex */
public final class pq30 extends hr30<Attach, qq30> {
    public static final /* synthetic */ int k = 0;
    public final View d;
    public pk30 e;
    public final ImAvatarView f;
    public final TextView g;
    public final TextView h;
    public final bj30 i;
    public Peer j;

    public pq30(View view) {
        this.d = view;
        this.f = (ImAvatarView) view.findViewById(R.id.avatar);
        this.g = (TextView) view.findViewById(R.id.title);
        this.h = (TextView) view.findViewById(R.id.subtitle);
        new DisplayNameFormatter(null, 3, null);
        this.i = new bj30(view.getContext());
        jjc.g(view, new vam(this, 26));
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        this.g.setTextColor(bubbleColors.n);
        this.h.setTextColor(bubbleColors.i);
    }

    @Override // xsna.hr30
    public final void p(qq30 qq30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        qq30 qq30Var2 = qq30Var;
        this.e = pk30Var;
        Peer peer = qq30Var2.b;
        this.j = peer;
        this.g.setText(qq30Var2.e);
        ImageList imageList = qq30Var2.f;
        String str = qq30Var2.d;
        Peer.Type type = peer.c;
        boolean z = qq30Var2.g;
        ImAvatarView imAvatarView = this.f;
        imAvatarView.getClass();
        imAvatarView.p1(imageList, imAvatarView.t.e(str, type), z ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE);
        this.h.setText(this.i.a(qq30Var2.c));
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.d;
    }

    @Override // xsna.hr30
    public final void r() {
        this.e = null;
    }
}
