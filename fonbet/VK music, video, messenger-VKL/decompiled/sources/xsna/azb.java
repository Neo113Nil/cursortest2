package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.im.ui.fragments.ImEditChatControlParamsFragment;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cwb0;
import xsna.o0r0;
import xsna.ug30;

/* compiled from: ChatSettingsVc.kt */
/* loaded from: classes2.dex */
public final class azb {
    public final Peer a;
    public final Context b;
    public final ViewGroup c;
    public final View d;
    public final RecyclerView e;
    public final View f;
    public final TextView g;
    public final ryb h;
    public final bpn0 i;
    public String j;
    public tsu k;

    /* compiled from: ChatSettingsVc.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MemberAction.values().length];
            try {
                iArr2[MemberAction.ADMIN_SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[MemberAction.ADMIN_UNSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MemberAction.KICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MemberAction.OWNER_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MemberAction.WRITE_DISABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MemberAction.WRITE_ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public azb(Peer peer, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = peer;
        Context context = layoutInflater.getContext();
        this.b = context;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.vkim_chat_settings, viewGroup, false);
        this.c = viewGroup2;
        ((AppCompatActivity) e3m.h(context)).getSupportFragmentManager();
        this.d = viewGroup2.findViewById(R.id.progress);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.list);
        this.e = recyclerView;
        this.f = viewGroup2.findViewById(R.id.error_container);
        this.g = (TextView) viewGroup2.findViewById(R.id.error_text);
        ryb rybVar = new ryb(new a());
        this.h = rybVar;
        this.i = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.h(this, 16));
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setRecycledViewPool(new rru());
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(rybVar);
        d();
    }

    public final bzb0 a() {
        return (bzb0) this.i.getValue();
    }

    public final void b() {
        a().a();
    }

    public final void c(AvatarAction avatarAction) {
        if (b.$EnumSwitchMapping$0[avatarAction.ordinal()] == 1) {
            a().c(cwb0.g.e, new ag1(4, this, avatarAction));
        } else {
            a().c(cwb0.f.e, new com.vk.movika.sdk.android.defaultplayer.container.e(5, this, avatarAction));
        }
    }

    public final void d() {
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        this.d.setVisibility(0);
    }

    /* compiled from: ChatSettingsVc.kt */
    public final class a implements jj0 {
        public a() {
        }

        @Override // xsna.jj0
        public final void c() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                ((xyb) tsuVar.b).Y0();
            }
        }

        @Override // xsna.jj0
        public final void d(String str) {
            ImChatSettingsFragment.a aVar;
            azb azbVar = azb.this;
            azbVar.j = str;
            tsu tsuVar = azbVar.k;
            if (tsuVar == null || (aVar = ((xyb) tsuVar.b).B) == null) {
                return;
            }
            ImChatSettingsFragment.this.eo(str, true);
        }

        @Override // xsna.jj0
        public final void e() {
            xyb xybVar;
            ImChatSettingsFragment.a aVar;
            tsu tsuVar = azb.this.k;
            if (tsuVar == null || (aVar = (xybVar = (xyb) tsuVar.b).B) == null) {
                return;
            }
            DialogExt dialogExt = xybVar.q.a;
            ImEditChatControlParamsFragment.a aVar2 = new ImEditChatControlParamsFragment.a(ImEditChatControlParamsFragment.class, null, null);
            if (dialogExt.j) {
                n34.w(aVar2.j, dialogExt, null);
                aVar2.i(new jbs(ImChatSettingsFragment.this), 38918);
            } else {
                throw new IllegalArgumentException("Dialog is not chat id=" + dialogExt.e);
            }
        }

        @Override // xsna.jj0
        public final void f(DialogMember dialogMember, ProfilesInfo profilesInfo, tow towVar) {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                mb8 mb8Var = xybVar.j.a.a.e;
                Peer peer = dialogMember.b;
                new ug30.c0(peer, towVar);
                xybVar.n.d().m(xybVar.i, com.vk.dto.common.a.b(peer), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            }
        }

        @Override // xsna.jj0
        public final void g() {
            xyb xybVar;
            ImChatSettingsFragment.a aVar;
            ChatSettings Hb;
            Long l;
            ChatSettings Hb2;
            tsu tsuVar = azb.this.k;
            if (tsuVar == null || (aVar = (xybVar = (xyb) tsuVar.b).B) == null) {
                return;
            }
            ohm ohmVar = xybVar.q.i;
            EmptyList emptyList = EmptyList.b;
            ImChatSettingsFragment imChatSettingsFragment = ImChatSettingsFragment.this;
            DialogExt dialogExt = imChatSettingsFragment.P;
            if (!(dialogExt == null ? null : dialogExt).l) {
                o0r0 d = imChatSettingsFragment.O.d();
                jbs jbsVar = new jbs(imChatSettingsFragment);
                String string = imChatSettingsFragment.requireContext().getString(R.string.vkim_empty_selection_hint);
                String string2 = imChatSettingsFragment.requireContext().getString(R.string.vkim_add_users);
                ArrayList arrayList = new ArrayList(c5g.u(emptyList, 10));
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_FRIENDS_ADD;
                DialogExt dialogExt2 = imChatSettingsFragment.P;
                o0r0.h(d, jbsVar, true, false, 38920, null, string, string2, null, null, arrayList, null, mobileOfficialAppsCoreNavStat$EventScreen, (dialogExt2 != null ? dialogExt2 : null).f, 112212);
                return;
            }
            if (dialogExt == null) {
                dialogExt = null;
            }
            Dialog Cb = dialogExt.Cb();
            if (Cb == null || (Hb = Cb.Hb()) == null || (l = Hb.C) == null) {
                return;
            }
            long longValue = l.longValue();
            ImSelectDonutContactsFragment.a aVar2 = new ImSelectDonutContactsFragment.a();
            String string3 = imChatSettingsFragment.requireContext().getString(R.string.vkim_choose_members);
            Bundle bundle = aVar2.j;
            bundle.putString("title", string3);
            bundle.putString("hint", imChatSettingsFragment.requireContext().getString(R.string.vkim_empty_selection_donut_hint));
            bundle.putLongArray("ids", j5g.P0(emptyList));
            DialogExt dialogExt3 = imChatSettingsFragment.P;
            if (dialogExt3 == null) {
                dialogExt3 = null;
            }
            bundle.putParcelable("donut_root_dialog_peer", dialogExt3.f);
            bundle.putString("text", imChatSettingsFragment.requireContext().getString(R.string.vkim_select_members));
            bundle.putSerializable("visitSource", MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_FRIENDS_ADD);
            bundle.putLong("donut_chat_owner_id", longValue);
            DialogExt dialogExt4 = imChatSettingsFragment.P;
            if (dialogExt4 == null) {
                dialogExt4 = null;
            }
            Peer q = imChatSettingsFragment.N.q();
            Dialog dialog = dialogExt4.d.d;
            bundle.putSerializable("factory", (dialog == null || (Hb2 = dialog.Hb()) == null || !Hb2.e.contains(q)) ? DonutContactsListFactory.SELECT_DONUT_FRIENDS_VKAPP : DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP);
            Intent n = aVar2.n(imChatSettingsFragment.kn());
            LayoutInflater.Factory activity = imChatSettingsFragment.getActivity();
            ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
            ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
            if (Y == null || !Y.q(38920, n, imChatSettingsFragment)) {
                imChatSettingsFragment.startActivityForResult(n, 38920, null);
            }
        }

        @Override // xsna.jj0
        public final void h() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                xybVar.n.b().E(xybVar.i, xybVar.q.a);
            }
        }

        @Override // xsna.jj0
        public final void i(String str) {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                ((xyb) tsuVar.b).z.b(str);
            }
        }

        @Override // xsna.jj0
        public final void k() {
            PinnedMsg dc;
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                Dialog Cb = xybVar.q.a.Cb();
                if (Cb == null || (dc = Cb.dc()) == null) {
                    return;
                }
                xybVar.n.b().z(xybVar.i, dc, xybVar.q.a, xybVar.k.a());
            }
        }

        @Override // xsna.jj0
        public final void l() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                xybVar.n.b().v(xybVar.i, xybVar.q.a, false, xybVar.k.a());
            }
        }

        @Override // xsna.jj0
        public final void m() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                xybVar.n.b().A(xybVar.i, xybVar.q.a);
            }
        }

        @Override // xsna.jj0
        public final void n(boolean z) {
            azb azbVar = azb.this;
            if (!z) {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                azbVar.a().b(cwb0.a0.o, new a8(azbVar, 21), new eu1(azbVar, 12));
            } else {
                tsu tsuVar = azbVar.k;
                if (tsuVar != null) {
                    tsuVar.f(-1L, true);
                }
            }
        }

        @Override // xsna.jj0
        public final void o() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                Dialog Cb = xybVar.q.a.Cb();
                ChatSettings Hb = Cb != null ? Cb.Hb() : null;
                if (Hb != null) {
                    Peer peer = Hb.d;
                    peer.getClass();
                    if (peer.Ab(Peer.Type.UNKNOWN)) {
                        return;
                    }
                    xybVar.n.d().m(xybVar.i, com.vk.dto.common.a.b(peer), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
            }
        }

        @Override // xsna.jj0
        public final void p() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                ((xyb) tsuVar.b).y.c();
            }
        }

        @Override // xsna.jj0
        public final void q(String str) {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                xybVar.n.b().h(xybVar.i, str);
            }
        }

        @Override // xsna.jj0
        public final void r() {
            azb azbVar = azb.this;
            bzb0.d(azbVar.a(), new cwb0.s(azbVar.b), new ji0(azbVar, 14), null, null, 28);
        }

        @Override // xsna.jj0
        public final void s() {
            azb azbVar = azb.this;
            bzb0 a = azbVar.a();
            Context context = azbVar.b;
            bzb0.d(a, new cwb0.y(R.string.vkim_msg_header_delete_spam_chat_title, null, R.string.vkim_msg_header_delete_spam_chat_submit_desc, null, 0, cqm0.c(e3m.f(R.attr.vk_ui_background_negative, context), context.getString(R.string.vkim_yes)), R.string.vkim_kick_submit_no, null, null, null, 922), new ey0(azbVar, 13), null, null, 28);
        }

        @Override // xsna.jj0
        public final void t() {
            azb azbVar = azb.this;
            bzb0 a = azbVar.a();
            Context context = azbVar.b;
            ryb rybVar = azbVar.h;
            rybVar.getClass();
            bzb0.e(a, new cwb0.h0(context, new DialogExt(rybVar.j, rybVar.k)), new za(azbVar, 26));
        }

        @Override // xsna.jj0
        public final void u(DialogMember dialogMember) {
            azb azbVar = azb.this;
            Dialog dialog = azbVar.h.j;
            Peer peer = azbVar.a;
            azbVar.a().b(new cwb0.k0(r490.c(dialog, dialogMember, peer), false, dialogMember.equals(peer)), new uf1(13, azbVar, dialogMember), null);
        }

        @Override // xsna.jj0
        public final void v() {
            azb azbVar = azb.this;
            bzb0.d(azbVar.a(), new cwb0.o(null), new com.vk.movika.sdk.base.model.e(azbVar, 11), null, null, 28);
        }

        @Override // xsna.jj0
        public final void w() {
            ImChatSettingsFragment.a aVar;
            tsu tsuVar = azb.this.k;
            if (tsuVar == null || (aVar = ((xyb) tsuVar.b).B) == null) {
                return;
            }
            ImChatSettingsFragment.this.eo("", false);
        }

        @Override // xsna.jj0
        public final void x() {
            tsu tsuVar = azb.this.k;
            if (tsuVar != null) {
                xyb xybVar = (xyb) tsuVar.b;
                if (hg1.d(xybVar.v)) {
                    return;
                }
                Serializer.c<Peer> cVar = Peer.CREATOR;
                io.reactivex.rxjava3.internal.operators.single.j jVar = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xybVar.l.b(xybVar, new ivm(Peer.a.b(xybVar.q.a.e), xyb.D)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new defpackage.z(new com.vk.movika.sdk.base.data.a(xybVar, 18), 12)), new lx6(xybVar, 2));
                new xr0(10);
                xybVar.v = jVar.subscribe(new tyb(), new om1(new on(xybVar, 16), 6));
            }
        }

        @Override // xsna.jj0
        public final void y() {
            ImChatSettingsFragment.a aVar;
            tsu tsuVar = azb.this.k;
            if (tsuVar == null || (aVar = ((xyb) tsuVar.b).B) == null) {
                return;
            }
            ImChatSettingsFragment imChatSettingsFragment = ImChatSettingsFragment.this;
            o0w b = imChatSettingsFragment.O.b();
            FragmentActivity kn = imChatSettingsFragment.kn();
            DialogExt dialogExt = imChatSettingsFragment.P;
            if (dialogExt == null) {
                dialogExt = null;
            }
            b.Q(kn, dialogExt, imChatSettingsFragment.N.q(), null);
        }

        @Override // xsna.jj0
        public final void j(String str) {
        }
    }
}
