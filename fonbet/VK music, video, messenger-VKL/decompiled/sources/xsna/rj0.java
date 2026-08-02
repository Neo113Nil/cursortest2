package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.ArrayList;
import java.util.ListIterator;
import org.json.JSONObject;
import xsna.yyb;

/* compiled from: AdapterMemberItemsHelper.kt */
/* loaded from: classes2.dex */
public final class rj0 {

    /* compiled from: AdapterMemberItemsHelper.kt */
    public static final class a {
        public final ohm a;
        public final ProfilesInfo b;
        public final Peer c;
        public final boolean d;
        public final boolean e;

        public a(ohm ohmVar, ProfilesInfo profilesInfo, Peer peer, boolean z, boolean z2) {
            this.a = ohmVar;
            this.b = profilesInfo;
            this.c = peer;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(bh10.a(ur.b(this.b, this.a.b.hashCode() * 31, 31), 31, this.c.b), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MemberInfo(membersList=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", currentMember=");
            sb.append(this.c);
            sb.append(", isFullList=");
            sb.append(this.d);
            sb.append(", isSearchEnabled=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    public static void a(ArrayList arrayList, Dialog dialog, ChatSettings chatSettings, a aVar, boolean z) {
        hfz fVar;
        ChatSettings Hb;
        boolean z2 = chatSettings.Q;
        Peer peer = aVar.c;
        ohm ohmVar = aVar.a;
        boolean z3 = false;
        p4g.a(yyb.i.b, arrayList, BuildInfo.t() || aVar.e);
        yyb.h hVar = new yyb.h(AdapterEntryType.TYPE_CHAT_MEMBER_INVITE);
        peer.getClass();
        p4g.a(hVar, arrayList, (peer.Ab(Peer.Type.GROUP) || !chatSettings.n || (BuildInfo.s() && dialog.sc()) || dialog.oc().a == WritePermission.State.DISABLED_MOVED_TO_MAX) ? false : true);
        ArrayList arrayList2 = ohmVar.b;
        ArrayList arrayList3 = ohmVar.b;
        if (arrayList2.size() == 0 && (Hb = dialog.Hb()) != null && Hb.Q && !z) {
            arrayList.add(new yyb.e(false));
            return;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        ArrayList arrayList5 = new ArrayList(0);
        ListIterator listIterator = arrayList3.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            DialogMember dialogMember = (DialogMember) next;
            boolean f = epx.f(chatSettings.d, dialogMember.b);
            boolean contains = chatSettings.e.contains(dialogMember.b);
            if (dialogMember.zb()) {
                boolean b = b(peer, dialogMember, chatSettings);
                ProfilesInfo profilesInfo = aVar.b;
                JSONObject Yb = dialog.Yb();
                fVar = new yyb.d(dialogMember, b, f, contains, profilesInfo, Yb != null ? new tow(Yb) : null);
            } else {
                boolean b2 = b(peer, dialogMember, chatSettings);
                ProfilesInfo profilesInfo2 = aVar.b;
                JSONObject Yb2 = dialog.Yb();
                fVar = new yyb.f(dialogMember, b2, f, contains, profilesInfo2, Yb2 != null ? new tow(Yb2) : null);
            }
            if (dialogMember.e) {
                arrayList5.add(fVar);
            } else {
                arrayList4.add(fVar);
            }
            i = i2;
        }
        if (z2) {
            arrayList.addAll(arrayList4);
        }
        yyb.e eVar = new yyb.e(!z);
        if (z2 && !aVar.d) {
            z3 = true;
        }
        p4g.a(eVar, arrayList, z3);
        p4g.a(new yyb.g(dialog, arrayList5.size(), true), arrayList, !arrayList5.isEmpty());
        if (arrayList5.isEmpty()) {
            return;
        }
        arrayList.addAll(arrayList5);
    }

    public static boolean b(Peer peer, DialogMember dialogMember, ChatSettings chatSettings) {
        Peer peer2 = chatSettings.d;
        Peer peer3 = dialogMember.b;
        return !(epx.f(peer, peer3) || epx.f(peer2, peer3) || (!dialogMember.i && !dialogMember.e && !chatSettings.r)) || (!epx.f(peer2, peer3) && chatSettings.p);
    }
}
