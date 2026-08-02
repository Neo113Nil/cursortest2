package xsna;

import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;
import xsna.dqx;

/* compiled from: InvitationBroadcastContactItemVh.kt */
/* loaded from: classes2.dex */
public final class cqx extends eqx<dqx.a> {
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        dqx.a aVar = (dqx.a) hfzVar;
        Contact contact = aVar.d;
        this.m.Y0(contact);
        fp80.a(this.n, contact);
        DisplayNameFormatter displayNameFormatter = this.r;
        displayNameFormatter.getClass();
        this.o.setText(displayNameFormatter.e(contact, UserNameCase.NOM));
        boolean z = contact.n;
        TextView textView = this.p;
        if (z) {
            textView.setText(R.string.vkm_chat_invitation_broadcast_item_contact);
            this.itemView.setAlpha(1.0f);
        } else {
            textView.setText(UserSex.UNKNOWN == UserSex.FEMALE ? R.string.vkm_chat_invitation_broadcast_item_not_allowed_f : R.string.vkm_chat_invitation_broadcast_item_not_allowed_m);
            this.itemView.setAlpha(0.5f);
        }
        textView.setVisibility(0);
        jjc.g(this.itemView, new uf1(22, this, aVar));
        j6(aVar);
    }

    @Override // xsna.eqx
    public final boolean h6(dqx.a aVar) {
        return aVar.d.n;
    }

    @Override // xsna.eqx
    public final Peer i6(dqx.a aVar) {
        return aVar.d.B7();
    }
}
