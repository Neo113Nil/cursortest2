package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.text.Collator;
import java.util.Comparator;
import xsna.ohm;

/* compiled from: DialogMembersList.kt */
/* loaded from: classes2.dex */
public final class nhm implements Comparator<DialogMember> {
    public final /* synthetic */ Peer b;
    public final /* synthetic */ ProfilesInfo c;

    public nhm(Peer peer, ProfilesInfo profilesInfo) {
        this.b = peer;
        this.c = profilesInfo;
    }

    @Override // java.util.Comparator
    public final int compare(DialogMember dialogMember, DialogMember dialogMember2) {
        DialogMember dialogMember3 = dialogMember;
        DialogMember dialogMember4 = dialogMember2;
        Peer peer = dialogMember3.b;
        Peer peer2 = this.b;
        boolean f = epx.f(peer, peer2);
        Peer peer3 = dialogMember4.b;
        boolean f2 = epx.f(peer3, peer2);
        bpn0 bpn0Var = ohm.c;
        int g = epx.g(ohm.a.b(dialogMember3, f), ohm.a.b(dialogMember4, f2));
        if (g != 0) {
            return g;
        }
        ProfilesInfo profilesInfo = this.c;
        qtd0 Bb = profilesInfo.Bb(peer);
        String a = Bb != null ? ohm.a.a(Bb) : null;
        qtd0 Bb2 = profilesInfo.Bb(peer3);
        String a2 = Bb2 != null ? ohm.a.a(Bb2) : null;
        if (a == null && a2 == null) {
            return 0;
        }
        if (a == null) {
            return -1;
        }
        if (a2 == null) {
            return 1;
        }
        return ((Collator) ohm.c.getValue()).compare(a, a2);
    }
}
