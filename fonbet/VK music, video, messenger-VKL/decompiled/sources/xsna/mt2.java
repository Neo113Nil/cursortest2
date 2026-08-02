package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.invite.AnonymCallInviteFragment;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.khw0;
import xsna.uum;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mt2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mt2(pt2 pt2Var, boolean z) {
        this.b = 0;
        this.d = pt2Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                pt2 pt2Var = (pt2) obj2;
                wt2 wt2Var = (wt2) obj;
                AnonymCallInviteFragment.a aVar = pt2Var.q;
                if (aVar != null) {
                    aVar.a(false);
                }
                pt2Var.k.d(new khw0.a(jnw0.b(wt2Var, z, true), new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.JOIN_DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE_ANONYMOUS), null, null, null, 28));
                break;
            case 1:
                i5b i5bVar = (i5b) obj2;
                Pair pair = (Pair) obj;
                o5b o5bVar = (o5b) pair.d();
                Map map = (Map) pair.g();
                if (z) {
                    i5bVar.r.a.clear();
                    i5bVar.r.g.clear();
                }
                p5b p5bVar = i5bVar.r;
                p5bVar.a.addAll(o5bVar.a);
                p5bVar.c = o5bVar.b;
                p5bVar.d = o5bVar.c;
                p5bVar.g.putAll(map);
                i5bVar.Y0().a(p5bVar);
                break;
            default:
                kz30 kz30Var = (kz30) obj2;
                if (z) {
                    ChatFragment.k kVar = kz30Var.K;
                    ChatFragment.k kVar2 = kVar != null ? kVar : null;
                    ChatFragment chatFragment = ChatFragment.this;
                    io.reactivex.rxjava3.disposables.c cVar = chatFragment.F0;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    chatFragment.F0 = itg0.n(chatFragment.io().b(kVar2, new urm(Peer.a.b(chatFragment.ho()), Collections.singletonList(chatFragment.ko().a()), EmptyList.b, 0, null, true, null)).q(asu0.a.c()));
                } else {
                    ChatFragment.k kVar3 = kz30Var.K;
                    if (kVar3 == null) {
                        kVar3 = null;
                    }
                    ChatFragment chatFragment2 = ChatFragment.this;
                    DialogExt dialogExt = chatFragment2.V;
                    Dialog Cb = (dialogExt != null ? dialogExt : null).Cb();
                    if (Cb != null) {
                        xuo0.a.getClass();
                        boolean Ac = Cb.Ac(xuo0.a());
                        uum.a aVar2 = new uum.a();
                        aVar2.a(-1L, true ^ Ac);
                        aVar2.c = Boolean.valueOf(Cb.notificationsIsUseSound);
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        aVar2.a = Peer.a.b(chatFragment2.ho());
                        chatFragment2.jo().D(kVar3, new uum(aVar2));
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mt2(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
