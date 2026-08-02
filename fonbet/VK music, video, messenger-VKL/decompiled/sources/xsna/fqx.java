package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;
import xsna.dqx;

/* compiled from: InvitationBroadcastUserItemVh.kt */
/* loaded from: classes2.dex */
public final class fqx extends eqx<dqx.b> {
    public final gp80 s;

    public fqx(View view, iou iouVar) {
        super(view, iouVar);
        this.s = new gp80(this.itemView.getContext());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        dqx.b bVar = (dqx.b) hfzVar;
        User user = bVar.d;
        this.m.Y0(user);
        fp80.a(this.n, user);
        DisplayNameFormatter displayNameFormatter = this.r;
        displayNameFormatter.getClass();
        this.o.setText(displayNameFormatter.e(user, UserNameCase.NOM));
        boolean z = user.P;
        TextView textView = this.p;
        if (z) {
            String d = imj0.d(this.s, user);
            awt0.v(textView, !drm0.N(d));
            textView.setText(d);
            this.itemView.setAlpha(1.0f);
        } else {
            textView.setText(user.g == UserSex.FEMALE ? R.string.vkm_chat_invitation_broadcast_item_not_allowed_f : R.string.vkm_chat_invitation_broadcast_item_not_allowed_m);
            textView.setVisibility(0);
            this.itemView.setAlpha(0.5f);
        }
        jjc.g(this.itemView, new uf1(22, this, bVar));
        j6(bVar);
    }

    @Override // xsna.eqx
    public final boolean h6(dqx.b bVar) {
        return bVar.d.P;
    }

    @Override // xsna.eqx
    public final Peer i6(dqx.b bVar) {
        return bVar.d.B7();
    }
}
