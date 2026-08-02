package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersItemV2.kt */
/* loaded from: classes2.dex */
public final class trr0 extends mqr0<yyb.d> {
    public final DisplayNameFormatter r;

    public trr0(jj0 jj0Var, ViewGroup viewGroup, int i) {
        super(jj0Var, viewGroup, i);
        this.r = new DisplayNameFormatter(null, 3, null);
    }

    @Override // xsna.mqr0
    public final String j6(yyb.d dVar) {
        yyb.d dVar2 = dVar;
        ProfilesInfo profilesInfo = dVar2.f;
        DialogMember dialogMember = dVar2.b;
        Peer peer = dialogMember.c;
        qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
        String a = this.r.a(peer, profilesInfo, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME);
        Peer peer2 = dialogMember.c;
        peer2.getClass();
        if (peer2.Ab(Peer.Type.UNKNOWN)) {
            return "";
        }
        qtd0 Bb = profilesInfo.Bb(peer2);
        return this.itemView.getContext().getString((Bb != null ? Bb.B2() : null) == UserSex.FEMALE ? R.string.vkim_chat_been_invited_f : R.string.vkim_chat_been_invited_m, a);
    }
}
