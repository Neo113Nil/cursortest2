package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.user.ImAddChatUserSource;
import com.vk.im.ui.components.chat_invite.InviteEntity;
import com.vk.im.ui.components.dialogs_list.ChooseMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.im.ui.fragments.ChatAttachmentHistoryFragment;
import com.vk.im.ui.fragments.ChatMakeLinkFragment;
import com.vk.im.ui.fragments.ChatProfileFragment;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.im.ui.fragments.ImCreateChatFastFragment;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.im.ui.fragments.ImCreateConversationFragment;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.im.ui.fragments.ImMsgSearchFragment;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.im.ui.fragments.SharedChatsFragment;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.z8r;

/* compiled from: ImDialogsBridge.kt */
/* loaded from: classes.dex */
public interface o0w {

    /* compiled from: ImDialogsBridge.kt */
    /* loaded from: classes2.dex */
    public static final class a implements izs {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            this.b.invoke();
            return s3q0.a;
        }
    }

    static /* synthetic */ void C(o0w o0wVar, u90 u90Var, Bundle bundle, boolean z, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        o0wVar.W(u90Var, bundle, z);
    }

    static void P(o0w o0wVar, u90 u90Var, List list, List list2, Peer peer, int i) {
        if ((i & 2) != 0) {
            list = EmptyList.b;
        }
        if ((i & 4) != 0) {
            list2 = EmptyList.b;
        }
        if ((i & 16) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        o0wVar.I(u90Var, list, list2, peer);
    }

    static Intent j(o0w o0wVar, Context context, Long l, long j, DialogExt dialogExt, MsgListOpenMode msgListOpenMode, String str, Class cls, Integer num, int i) {
        Boolean bool = Boolean.TRUE;
        Long l2 = (i & 2) != 0 ? null : l;
        DialogExt dialogExt2 = (i & 8) != 0 ? null : dialogExt;
        MsgListOpenMode msgListOpenMode2 = (i & 32) != 0 ? MsgListOpenAtUnreadMode.b : msgListOpenMode;
        EmptyList emptyList = EmptyList.b;
        return o0wVar.F(context, l2, j, dialogExt2, msgListOpenMode2, emptyList, emptyList, emptyList, (i & 8192) != 0 ? null : str, (i & 16384) != 0 ? null : "push", (131072 & i) != 0 ? null : bool, (262144 & i) != 0 ? null : bool, (33554432 & i) != 0 ? null : cls, (i & 67108864) != 0 ? null : num);
    }

    static oz50 r(o0w o0wVar, Context context, Long l, long j, DialogExt dialogExt, List list, List list2, String str, List list3, String str2, String str3, String str4, MsgListOpenMode msgListOpenMode, boolean z, String str5, String str6, BotButton botButton, String str7, Boolean bool, Boolean bool2, Boolean bool3, boolean z2, ChatAnalyticsParams chatAnalyticsParams, Integer num, Class cls, boolean z3, Integer num2, int i) {
        return o0wVar.u(context, l, j, dialogExt, list, list2, str, list3, str2, str3, str4, msgListOpenMode, z, str5, str6, botButton, str7, bool, bool2, bool3, null, "", z2, (i & 33554432) != 0 ? null : chatAnalyticsParams, (i & 67108864) != 0 ? null : num, cls, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? false : z3, (i & 1073741824) != 0 ? null : num2);
    }

    static void x(o0w o0wVar, Context context, Long l, long j, DialogExt dialogExt, String str, MsgListOpenMode msgListOpenMode, boolean z, List list, List list2, List list3, String str2, String str3, String str4, String str5, String str6, BotButton botButton, String str7, boolean z2, String str8, Class cls, ChatAnalyticsParams chatAnalyticsParams, f880 f880Var, c230 c230Var, int i) {
        Boolean bool = Boolean.TRUE;
        o0wVar.w(context, (i & 2) != 0 ? null : l, j, (i & 8) != 0 ? null : dialogExt, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? MsgListOpenAtUnreadMode.b : msgListOpenMode, (i & 64) != 0 ? false : z, (i & 128) != 0 ? EmptyList.b : list, (i & 256) != 0 ? EmptyList.b : list2, (i & 512) != 0 ? EmptyList.b : list3, (i & 1024) != 0 ? "" : str2, (i & 2048) != 0 ? "" : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : botButton, (65536 & i) != 0 ? null : str7, (131072 & i) != 0 ? null : bool, (262144 & i) != 0 ? null : bool, (524288 & i) != 0 ? null : bool, (2097152 & i) != 0 ? false : z2, (4194304 & i) != 0 ? null : 1, (8388608 & i) != 0 ? null : str8, (16777216 & i) != 0 ? null : cls, (33554432 & i) != 0 ? null : chatAnalyticsParams, (134217728 & i) == 0, (268435456 & i) != 0 ? null : f880Var, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : c230Var);
    }

    default void A(Context context, DialogExt dialogExt) {
        new ChatAttachmentHistoryFragment.a(dialogExt.Db(), dialogExt.Bb()).k(context);
    }

    default void B(Context context, Peer peer, String str, List<? extends Attachment> list, String str2, String str3, boolean z) {
        x(this, context, null, peer.b, null, str == null ? "" : str, null, false, null, list == null ? EmptyList.b : list, null, null, null, null, str2, str3, null, null, z, null, null, null, null, null, 1071619818);
    }

    Class<? extends FragmentImpl> D();

    default void E(Context context, DialogExt dialogExt) {
        new ImSettingsDialogThemeFragment.a(dialogExt).k(context);
    }

    default Intent F(Context context, Long l, long j, DialogExt dialogExt, MsgListOpenMode msgListOpenMode, List list, List list2, List list3, String str, String str2, Boolean bool, Boolean bool2, Class cls, Integer num) {
        return r(this, context, l, j, dialogExt, list, list2, "", list3, "", "", null, msgListOpenMode, false, str, str2, null, null, bool2, null, bool, false, null, null, cls, false, num, 654311424).n(context);
    }

    default void I(u90 u90Var, List list, List list2, Peer peer) {
        new ImCreateChatFragment.a(list, list2, false, false, peer, 24).m(u90Var);
    }

    Intent K(Context context);

    default void L(Context context, String str, String str2, long j) {
        x(this, context, null, j, null, null, null, false, null, null, null, str, null, null, str2, null, null, null, false, null, null, null, null, null, 1073732602);
    }

    default void M(Context context, Peer peer) {
        x(this, context, null, peer.b, null, null, null, false, null, null, null, "conversation_bar", null, null, null, null, null, null, false, null, null, null, null, null, 1073740794);
    }

    default void N(bc6 bc6Var, Peer peer, String str) {
        ImSelectContactsFragment.a aVar = new ImSelectContactsFragment.a();
        aVar.L(bc6Var.B().getString(R.string.vkim_choose_members));
        aVar.K(bc6Var.B().getString(R.string.vkim_choose_members));
        aVar.y(true);
        aVar.A(true);
        aVar.M(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT_CREATE_CONTACTS_LIST);
        aVar.I(peer, false);
        aVar.J(str);
        aVar.E(bc6Var.B().getString(R.string.vkim_select_members));
        bc6Var.D(aVar.n(bc6Var.B()), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null);
    }

    default void O(u90 u90Var, String str, Peer peer, ImAddChatUserSource imAddChatUserSource) {
        osx.a.a(peer, str);
        ImDialogsSelectionFragment.a aVar = new ImDialogsSelectionFragment.a(new ChooseMode.InviteToChat(imAddChatUserSource));
        aVar.z(peer);
        aVar.y();
        aVar.m(u90Var);
    }

    default void Q(Context context, DialogExt dialogExt, Peer peer, String str) {
        new ImMsgSearchFragment.a(dialogExt, peer, str).k(context);
    }

    void R(Context context);

    default void S(Context context, String str) {
        new SimpleDialogsFilterFragment.a(DialogsFilter.BUSINESS_NOTIFY).k(context);
    }

    default void T(Context context, String str, String str2) {
        new ChatMakeLinkFragment.a(new InviteEntity.Channel(str, str2)).k(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default boolean V(Context context, String str) {
        ww50<?> Y;
        Activity h = e3m.h(context);
        boolean z = (h != 0 && h.isTaskRoot()) || str.equals("conversation_link");
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        return z && (ey50Var != null && (Y = ey50Var.Y()) != null && Y.b.n().p() == 1);
    }

    default void W(u90 u90Var, Bundle bundle, boolean z) {
        ImDialogsSelectionFragment.a aVar = new ImDialogsSelectionFragment.a(new ChooseMode.ReturnDialog());
        aVar.B(bundle);
        aVar.y();
        aVar.A(z);
        aVar.i(u90Var, 201);
    }

    default void a(Context context) {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        kh20 kh20Var = zdwVar.q;
        com.vk.archive.impl.a aVar = kh20Var != null ? new com.vk.archive.impl.a(kh20Var.a.h) : null;
        if (aVar != null) {
            aVar.b(context);
        } else {
            new SimpleDialogsFilterFragment.a(DialogsFilter.ARCHIVE).k(context);
        }
    }

    default Bundle b(Peer peer, Collection<? extends Msg> collection) {
        Bundle bundle = new Bundle();
        ArrayList<Msg> arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Msg) obj).Mb()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (Msg msg : arrayList) {
            arrayList2.add(new CnvMsgId(msg.y(), msg.Z5()));
        }
        bundle.putParcelableArrayList("fwd_ids", new ArrayList<>(arrayList2));
        bundle.putParcelable("owner_id", peer);
        return bundle;
    }

    default void c(u90 u90Var, int i, String str, String str2, List<Long> list, List<Long> list2, String str3) {
        ImCreateChatFastFragment.a aVar = new ImCreateChatFastFragment.a();
        if (str == null) {
            str = u90Var.B().getString(R.string.vkim_choose_members);
        }
        aVar.H(str);
        aVar.G(u90Var.B().getString(R.string.vkim_choose_members));
        aVar.z(list);
        aVar.C(list2);
        aVar.y();
        aVar.A();
        aVar.B();
        aVar.I(MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_CREATE_FRIENDS_ADD);
        if (str2 == null) {
            str2 = u90Var.B().getString(R.string.vkim_select_members);
        }
        aVar.D(str2);
        aVar.E(str3);
        aVar.F();
        aVar.i(u90Var, i);
    }

    default void d(long j, Context context) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        drb drbVar = new drb(false);
        drbVar.S(j);
        drbVar.k(context);
    }

    default void e(bc6 bc6Var, List list, boolean z) {
        bc6Var.D(new ImCreateChatFragment.a(list, null, false, z, null, 46).n(bc6Var.B()), 224, null);
    }

    default void f(Context context) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        DialogsFragment.b bVar = new DialogsFragment.b();
        bVar.y();
        bVar.k(h);
    }

    default void g(Context context, DialogExt dialogExt) {
        new SharedChatsFragment.a(dialogExt).k(context);
    }

    void h(Context context, String str);

    void i(Context context);

    default void k(Context context, long j, Long l, DialogExt dialogExt, MsgListOpenMode msgListOpenMode, FolderType folderType) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        drb drbVar = new drb(false);
        drbVar.S(j);
        drbVar.D(dialogExt);
        drbVar.O(msgListOpenMode);
        if (l != null) {
            drbVar.Q(l.longValue());
        }
        drbVar.G("list_all");
        drbVar.I(folderType);
        drbVar.k(context);
    }

    default void l(Context context) {
        new ImRequestsFragment.a(0).k(context);
    }

    default void m(u90 u90Var, boolean z, boolean z2) {
        ImCreateConversationFragment.a aVar = new ImCreateConversationFragment.a();
        if (z) {
            aVar.B();
        }
        if (BuildInfo.s()) {
            aVar.y(R.attr.im_ic_back_toolbar);
            aVar.A(u90Var.B().getString(R.string.write_a_message_2));
            aVar.z(z2);
        }
        if (BuildInfo.t()) {
            aVar.A(u90Var.B().getString(R.string.start_chat));
        }
        aVar.m(u90Var);
    }

    default void n(Context context, UserId userId, String str, List<? extends Attach> list, String str2, gzs<s3q0> gzsVar) {
        List<? extends Attach> list2 = list == null ? EmptyList.b : list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (Attach attach : list2) {
            if (attach instanceof AttachImage) {
                attach = y(context, (AttachImage) attach);
            }
            arrayList.add(attach);
        }
        Peer a2 = com.vk.dto.common.a.a(userId);
        String str3 = (str == null || str.length() == 0) ? "" : str;
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        pz30 pz30Var = new pz30(a2, str3, null, null, null, null, null, str2, arrayList, null, null, null, null, 7804);
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        itg0.h(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(a1wVar.E("User send attaches", pz30Var), new m20(new qm0(25), 24)), new io.reactivex.rxjava3.functions.a() { // from class: xsna.m0w
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                yvv yvvVar;
                if (BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
                    return;
                }
                yvvVar.b();
                throw null;
            }
        }), new a(gzsVar), new n0w(context, 0));
    }

    default void o(Context context, DialogExt dialogExt, Peer peer) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        ChatProfileFragment.a aVar = new ChatProfileFragment.a(dialogExt, false, peer);
        aVar.s(true);
        aVar.k(context);
    }

    void p(Context context, String str);

    default void q(FragmentActivity fragmentActivity, NestedMsg nestedMsg, DialogExt dialogExt, Peer peer) {
        new MsgViewFragment.a(nestedMsg, dialogExt, peer).k(fragmentActivity);
    }

    default void s(FragmentActivity fragmentActivity, MsgFromUser msgFromUser, DialogExt dialogExt, Peer peer) {
        new MsgViewFragment.a(msgFromUser, dialogExt, peer).k(fragmentActivity);
    }

    default void t(Context context, long j, DialogExt dialogExt, String str, String str2) {
        x(this, context, null, j, dialogExt, null, null, false, null, null, null, null, null, null, str, str2, null, null, false, null, null, null, null, null, 1073717234);
    }

    default drb u(Context context, Long l, long j, DialogExt dialogExt, List list, List list2, String str, List list3, String str2, String str3, String str4, MsgListOpenMode msgListOpenMode, boolean z, String str5, String str6, BotButton botButton, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str8, boolean z2, ChatAnalyticsParams chatAnalyticsParams, Integer num, Class cls, boolean z3, Integer num2) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        drb drbVar = new drb(false);
        drbVar.S(j);
        if (dialogExt != null) {
            drbVar.D(dialogExt);
        }
        drbVar.B(new ArrayList(list));
        drbVar.C((Attachment[]) list2.toArray(new Attachment[0]));
        drbVar.X(str);
        drbVar.J(list3);
        drbVar.U(str2);
        drbVar.V(str3);
        drbVar.R(str4);
        drbVar.O(msgListOpenMode);
        drbVar.K(z);
        drbVar.G(str5);
        drbVar.A(str6);
        drbVar.P();
        drbVar.F(num);
        drbVar.z(chatAnalyticsParams);
        drbVar.W();
        drbVar.E(z3);
        if (l != null) {
            drbVar.Q(l.longValue());
        }
        if (botButton != null) {
            drbVar.T(botButton);
        }
        if (str7 != null) {
            drbVar.L(str7);
        }
        Boolean bool5 = Boolean.TRUE;
        epx.f(bool, bool5);
        if (epx.f(bool3, bool5)) {
            drbVar.y();
        }
        if (epx.f(bool2, bool5)) {
            drbVar.d = true;
        }
        if (z2) {
            drbVar.M();
        }
        if (epx.f(bool4, bool5)) {
            drbVar.N();
        }
        if (epx.f(bool4, bool5)) {
            drbVar.Y(str8);
        }
        if (num2 != null) {
            drbVar.H(num2.intValue());
        }
        drbVar.v(cls);
        return drbVar;
    }

    default void v(Context context, DialogExt dialogExt, boolean z, Peer peer) {
        ChatMakeLinkFragment.a aVar = new ChatMakeLinkFragment.a(new InviteEntity.Chat(dialogExt.getId(), peer, dialogExt.Gb()));
        aVar.y(z);
        aVar.k(context);
    }

    default void w(Context context, Long l, long j, DialogExt dialogExt, String str, MsgListOpenMode msgListOpenMode, boolean z, List list, List list2, List list3, String str2, String str3, String str4, String str5, String str6, BotButton botButton, String str7, Boolean bool, Boolean bool2, Boolean bool3, boolean z2, Integer num, String str8, Class cls, ChatAnalyticsParams chatAnalyticsParams, boolean z3, gzs gzsVar, izs izsVar) {
        r(this, context, l, j, dialogExt, list, list2, str, list3, str2, str3, str4, msgListOpenMode, z, str5, str6, botButton, str7, bool2, bool3, bool, z2, chatAnalyticsParams, num, cls, z3, null, 1096810496).k(context);
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    default Attach y(Context context, AttachImage attachImage) {
        File i1 = attachImage.i1();
        fxj0 fxj0Var = (fxj0) j5g.Z(attachImage.Y8());
        String url = fxj0Var != null ? fxj0Var.getUrl() : null;
        if (i1 != null) {
            z8r.a a2 = z8r.a(context, Uri.fromFile(i1));
            if (a2.a + a2.b > 24000) {
                Serializer.c<AttachDoc> cVar = AttachDoc.CREATOR;
                return AttachDoc.a.a(i1);
            }
        } else {
            if (url == null) {
                tv4.b("Wrong AttachImage - no files attached", com.vk.metrics.eventtracking.b.a);
                return attachImage;
            }
            Uri parse = Uri.parse(url);
            z8r.a a3 = z8r.a(context, parse);
            if (a3.a + a3.b > 24000) {
                Serializer.c<AttachDoc> cVar2 = AttachDoc.CREATOR;
                return AttachDoc.a.b(parse);
            }
        }
        return attachImage;
    }

    default void z(Context context, PinnedMsg pinnedMsg, DialogExt dialogExt, Peer peer) {
        new MsgViewFragment.a(pinnedMsg, dialogExt, peer).k(context);
    }

    default void G(Context context, Peer peer) {
    }

    default void H(Context context, FolderType folderType) {
    }

    default void J(Context context, Peer peer) {
    }

    default void U(Context context, FolderType folderType) {
    }
}
