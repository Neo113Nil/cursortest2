package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachGroupCallFinished;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.external.AudioTrack;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.im.ui.reporters.ShareType;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.popup.PopupStickerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.o0r0;
import xsna.ug30;
import xsna.vm30;

/* compiled from: VcCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class skr0 implements ym30 {
    public final j140 a;

    public skr0(j140 j140Var) {
        this.a = j140Var;
    }

    @Override // xsna.ym30
    public final void C0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void D0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void L() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void M(Attach attach, Msg msg, NestedMsg nestedMsg) {
        PopupStickerAnimation popupStickerAnimation;
        vm30 vm30Var;
        sfj sfjVar = this.a.S;
        if (sfjVar != null) {
            j140 j140Var = sfjVar.e;
            boolean z = attach instanceof AttachDonutLink;
            if (z) {
                com.vk.im.engine.models.messages.a aVar = nestedMsg != null ? nestedMsg : msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                AttachDonutLink attachDonutLink = (AttachDonutLink) attach;
                int i = attachDonutLink.b;
                vm30 vm30Var2 = j140Var.R;
                iwv.l(sfjVar.c.k(), sfjVar.a.kn(), attach, aVar, j140Var.Q.d.Cb(Long.valueOf(attachDonutLink.d.b)), aVar != null ? Long.valueOf(aVar.ob()) : null, vm30Var2 != null ? vm30Var2.e(i) : null, false, 64);
            } else if (attach instanceof AttachSticker) {
                AttachSticker attachSticker = (AttachSticker) attach;
                if (attachSticker.g.z9() && (popupStickerAnimation = attachSticker.g.k) != null && (vm30Var = j140Var.R) != null) {
                    PopupStickerView popupStickerView = new PopupStickerView(vm30Var.q, null, 0, 14, 0);
                    popupStickerView.setLoadingCallback(new xm30(attach));
                    PopupStickerView.d(popupStickerView, popupStickerAnimation, false, new nuj(vm30Var, 20), 4);
                    ((ViewGroup) vm30Var.t).addView(popupStickerView, new FrameLayout.LayoutParams(-1, -1));
                }
            }
            if (z) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("donut_click_pay");
                b.a(((AttachDonutLink) attach).d, "owner_id");
                b.c("source", "snippet_message");
                com.vk.movika.sdk.base.model.n.c(b, thp0.c, bVar);
            }
        }
    }

    @Override // xsna.ym30
    public final void O(Attach attach) {
        a1w a1wVar = this.a.k;
        a1wVar.D(this, new a14(attach));
        a1wVar.D(this, new y04(attach.xb()));
    }

    @Override // xsna.ym30
    public final void Q(Msg msg, sz30 sz30Var) {
        ArrayList arrayList;
        boolean b = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.b(msg);
        j140 j140Var = this.a;
        if (!b || !msg.Qb()) {
            o0w b2 = j140Var.m.b();
            if ((msg instanceof MsgFromUser) && msg.Qb()) {
                o0w.C(b2, j140Var.o, b2.b(j140Var.k.q(), Collections.singletonList(msg)), false, 12);
                Object obj = xg30.a;
                xg30.b(ShareType.BUTTON);
                return;
            }
            return;
        }
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        Attach attach = (msgFromUser == null || (arrayList = msgFromUser.H) == null) ? null : (Attach) j5g.a0(arrayList);
        if (attach != null) {
            g2v.c().getClass();
            FragmentActivity fragmentActivity = j140Var.i;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            kbj0.e(nr4.b(), fragmentActivity, wdw.b(attach, null, false, 6), false, null, false, Peer.Unknown.e, 28);
        }
    }

    @Override // xsna.ym30
    public final void R(Attach attach, Msg msg, NestedMsg nestedMsg) {
        io.reactivex.rxjava3.core.x n;
        io.reactivex.rxjava3.core.x n2;
        sfj sfjVar = this.a.S;
        if (sfjVar != null) {
            if (attach instanceof AttachImage) {
                sfjVar.a(msg, nestedMsg, (AttachWithImage) attach);
            } else if (attach instanceof AttachDoc) {
                AttachDoc attachDoc = (AttachDoc) attach;
                if (attachDoc.i()) {
                    sfjVar.a(msg, nestedMsg, (AttachWithImage) attach);
                } else {
                    sfjVar.c.k().o(sfjVar.a.kn(), attachDoc);
                }
            } else {
                int i = 17;
                int i2 = 16;
                if (attach instanceof AttachCall) {
                    DialogExt dialogExt = sfjVar.e.j;
                    VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_MESSAGE, MobileOfficialAppsCoreNavStat$EventScreen.IM_PINNED_MESSAGE);
                    FragmentActivity kn = sfjVar.a.kn();
                    boolean z = ((AttachCall) attach).h;
                    cau0 cau0Var = sfjVar.b.r().h;
                    kyv j = sfjVar.c.j();
                    if (dialogExt.Cb() != null) {
                        n2 = io.reactivex.rxjava3.core.x.k(dialogExt);
                    } else {
                        a1w a1wVar = q1w.a;
                        if (a1wVar == null) {
                            a1wVar = null;
                        }
                        n2 = hg1.n(a1wVar.E("DialogBundle", new uqm(dialogExt.f, Source.ACTUAL)).l(new y7(new oce(dialogExt, i2), i)), kn, false, null, 62);
                    }
                    hg1.i(n2, new ba9(kn, voipCallSource, cau0Var, j, z));
                } else if (attach instanceof AttachGroupCallFinished) {
                    DialogExt dialogExt2 = sfjVar.e.j;
                    VoipCallSource voipCallSource2 = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_MESSAGE, MobileOfficialAppsCoreNavStat$EventScreen.IM_PINNED_MESSAGE);
                    FragmentActivity kn2 = sfjVar.a.kn();
                    cau0 cau0Var2 = sfjVar.b.r().h;
                    if (dialogExt2.Cb() != null) {
                        n = io.reactivex.rxjava3.core.x.k(dialogExt2);
                    } else {
                        a1w a1wVar2 = q1w.a;
                        if (a1wVar2 == null) {
                            a1wVar2 = null;
                        }
                        n = hg1.n(a1wVar2.E("DialogBundle", new uqm(dialogExt2.f, Source.ACTUAL)).l(new y7(new oce(dialogExt2, i2), i)), kn2, false, null, 62);
                    }
                    hg1.i(n, new vd6(kn2, voipCallSource2, cau0Var2, 2));
                } else if (attach instanceof AttachDonutLink) {
                    qex0.a().a(sfjVar.a.kn(), ((AttachDonutLink) attach).n);
                } else {
                    com.vk.im.engine.models.messages.a aVar = nestedMsg != null ? nestedMsg : (MsgFromUser) msg;
                    j140 j140Var = sfjVar.e;
                    int xb = attach.xb();
                    vm30 vm30Var = j140Var.R;
                    View e = vm30Var != null ? vm30Var.e(xb) : null;
                    iwv.l(sfjVar.c.k(), sfjVar.a.kn(), attach, aVar, sfjVar.e.Q.d.Cb(Long.valueOf(attach.q().b)), Long.valueOf(aVar.ob()), e, false, 64);
                }
            }
            if (attach instanceof AttachDonutLink) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("donut_snippet_click");
                b.a(((AttachDonutLink) attach).d, "owner_id");
                b.c("source", "snippet_message");
                com.vk.movika.sdk.base.model.n.c(b, thp0.c, bVar);
            }
        }
    }

    @Override // xsna.ym30
    public final void S() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void T(ug30 ug30Var, Msg msg) {
        sfj sfjVar;
        boolean z = ug30Var instanceof ug30.c;
        j140 j140Var = this.a;
        if (!z) {
            if (!(ug30Var instanceof ug30.c0) || (sfjVar = j140Var.S) == null) {
                return;
            }
            mb8 mb8Var = sfjVar.b.a.a.e;
            MsgViewFragment msgViewFragment = sfjVar.a;
            msgViewFragment.kn();
            sfjVar.c.d().m(msgViewFragment.kn(), com.vk.dto.common.a.b(((ug30.c0) ug30Var).a), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            return;
        }
        FragmentActivity fragmentActivity = j140Var.i;
        x040 x040Var = new x040(fragmentActivity);
        ctk0 ctk0Var = j140Var.Q;
        fvr.l(fragmentActivity, x040Var.a(Collections.singletonList(ctk0Var.c), ctk0Var.d.Ob(), ctk0Var.b));
        if (j140Var.R != null) {
            zk70.c(NotifyId.COPY_TO_CLIPBOARD_DONE);
        }
    }

    @Override // xsna.ym30
    public final void V(float f) {
        this.a.q.B(f);
    }

    @Override // xsna.ym30
    public final void Z(Msg msg, StickerItem stickerItem) {
        this.a.k.D(this, new f9q0(msg, stickerItem, m5j.a));
    }

    @Override // xsna.ym30
    public final void a(MsgSendSource.b bVar) {
        j140 j140Var = this.a;
        FragmentActivity fragmentActivity = j140Var.i;
        mxv mxvVar = j140Var.m;
        DialogExt dialogExt = j140Var.j;
        e38 e38Var = j140Var.G;
        BotButton botButton = bVar.a;
        if (botButton instanceof BotButton.Text) {
            BotButton.Text text = (BotButton.Text) botButton;
            j140.Z0(j140Var, text.j, text.h, null, botButton, 4);
            return;
        }
        if (botButton instanceof BotButton.VkPay) {
            e38Var.a(dialogExt.e, bVar);
            mxvVar.k();
            hf3.f(fragmentActivity, ((BotButton.VkPay) botButton).j);
            return;
        }
        if (botButton instanceof BotButton.VkApps) {
            e38Var.a(dialogExt.e, bVar);
            BotButton.VkApps vkApps = (BotButton.VkApps) botButton;
            iwv.f(mxvVar.k(), j140Var.i, vkApps.j, vkApps.l, "bot_keyboard", vkApps.k, null, 32);
        } else {
            if (botButton instanceof BotButton.Location) {
                j140Var.E.Y0(((BotButton.Location) botButton).h, bVar);
                return;
            }
            if (botButton instanceof BotButton.Callback) {
                j140Var.k.D(j140Var, new q28(bVar.a()));
            } else if (botButton instanceof BotButton.Unsupported) {
                edw edwVar = edw.a;
                edw.d(R.string.unavailable, fragmentActivity, true);
            }
        }
    }

    @Override // xsna.ym30
    public final void a0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void c0() {
        this.a.q.q(jw5.d);
    }

    @Override // xsna.ym30
    public final void d0(Collection<? extends Msg> collection, Map<Msg, vm30.e> map) {
        j140 j140Var = this.a;
        a1w a1wVar = j140Var.k;
        t6g0 t6g0Var = t6g0.b;
        io.reactivex.rxjava3.internal.operators.completable.y q = new io.reactivex.rxjava3.internal.operators.completable.p(a1wVar.C("onVisibleMsgsChanged callback", new wk70(null, collection, t6g0.d().k0().b(j140Var.j.e), 1))).q(asu0.a.c());
        int i = kwg0.a;
        j140Var.I0(io.reactivex.rxjava3.kotlin.c.d(q, new nof0(5), new nu2("onVisibleMsgsChanged: failed", 2)));
    }

    @Override // xsna.ym30
    public final void e0(Collection collection, boolean z) {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void f0(View view) {
        mhy.d(view);
    }

    @Override // xsna.ym30
    public final void g(int i) {
        vm30 vm30Var;
        j140 j140Var = this.a;
        DialogExt dialogExt = j140Var.j;
        ChatSettings Bb = dialogExt.Bb();
        if (((Bb == null || Bb.N) ? Collections.singletonList(ug30.c.a) : EmptyList.b).isEmpty()) {
            return;
        }
        Msg msg = j140Var.Q.c;
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser == null || (vm30Var = j140Var.R) == null) {
            return;
        }
        ChatSettings Bb2 = dialogExt.Bb();
        vm30Var.F(msgFromUser, (Bb2 == null || Bb2.N) ? Collections.singletonList(ug30.c.a) : EmptyList.b, false, false);
    }

    @Override // xsna.ym30
    public final void i(List<AudioTrack> list, AudioTrack audioTrack, Long l) {
        this.a.p.g(list, audioTrack, l);
    }

    @Override // xsna.ym30
    public final void i0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void j0(Attach attach) {
        sfj sfjVar = this.a.S;
        if (sfjVar != null) {
            sfjVar.c.k().u(sfjVar.a.kn());
        }
    }

    @Override // xsna.ym30
    public final void k(Attach attach) {
        sfj sfjVar = this.a.S;
        if (sfjVar != null) {
            MsgViewFragment msgViewFragment = sfjVar.a;
            mxv mxvVar = sfjVar.c;
            if (attach instanceof AttachGift) {
                AttachGift attachGift = (AttachGift) attach;
                long j = attachGift.b;
                if (attachGift.e()) {
                    mxvVar.k();
                    ams.a().g(msgViewFragment.kn(), defpackage.k0.a(-j, "gift_reply_"), EmptyList.b);
                    return;
                }
                mxvVar.k();
                ams.a().g(msgViewFragment.kn(), defpackage.k0.a(j, "gift_reply_"), EmptyList.b);
            }
        }
    }

    @Override // xsna.ym30
    public final void k0(Msg msg, Integer num) {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void l(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg) {
        j140 j140Var = this.a;
        ir4 ir4Var = j140Var.q;
        ur4 b = ir4Var.b();
        lza0 lza0Var = jw5.d;
        if (b != null && b.a == attachAudioMsg.b) {
            ir4Var.p(lza0Var);
            return;
        }
        ArrayList m9 = aVar.m9(AttachAudioMsg.class, true, false);
        ArrayList arrayList = new ArrayList(c5g.u(m9, 10));
        Iterator it = m9.iterator();
        while (it.hasNext()) {
            arrayList.add(hr80.D((AttachAudioMsg) it.next(), msg, j140Var.Q.d));
        }
        ir4Var.r(lza0Var, arrayList);
        ir4Var.C(lza0Var, hr80.D(attachAudioMsg, msg, j140Var.Q.d));
        ir4Var.p(lza0Var);
    }

    @Override // xsna.ym30
    public final void l0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void n0(Attach attach, Boolean bool, long j) {
        sfj sfjVar = this.a.S;
        if (sfjVar != null) {
            sfjVar.c.k().q(sfjVar.a.kn(), attach, bool, j);
        }
    }

    @Override // xsna.ym30
    public final void o0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void p() {
        this.a.p.pause();
    }

    @Override // xsna.ym30
    public final void s0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void t() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void t0(Msg msg) {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void v(biu biuVar) {
        com.vk.metrics.eventtracking.b.a.q(new RuntimeException("Unexpected call of group call join button"));
    }

    @Override // xsna.ym30
    public final int v0(Direction direction) {
        return 10;
    }

    @Override // xsna.ym30
    public final void w0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void x(uh30 uh30Var) {
        sfj sfjVar = this.a.S;
        if (sfjVar != null) {
            j140 j140Var = sfjVar.e;
            j140Var.w.a(j140Var.i, uh30Var);
        }
    }

    @Override // xsna.ym30
    public final void x0() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void y() {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void z0(String str, Direction direction) {
        sdy.w();
        throw null;
    }

    @Override // xsna.ym30
    public final void A0() {
    }

    @Override // xsna.ym30
    public final void B0() {
    }

    @Override // xsna.ym30
    public final void D() {
    }

    @Override // xsna.ym30
    public final void E() {
    }

    @Override // xsna.ym30
    public final void W() {
    }

    @Override // xsna.ym30
    public final void Y() {
    }

    @Override // xsna.ym30
    public final void b() {
    }

    @Override // xsna.ym30
    public final void b0() {
    }

    @Override // xsna.ym30
    public final void m0() {
    }

    @Override // xsna.ym30
    public final void r0() {
    }

    @Override // xsna.ym30
    public final void C(int i) {
    }

    @Override // xsna.ym30
    public final void E0(String str) {
    }

    @Override // xsna.ym30
    public final void F(StoryEntry storyEntry) {
    }

    @Override // xsna.ym30
    public final void G(Peer peer) {
    }

    @Override // xsna.ym30
    public final void H(int i) {
    }

    @Override // xsna.ym30
    public final void I(boolean z) {
    }

    @Override // xsna.ym30
    public final void K(Action action) {
    }

    @Override // xsna.ym30
    public final void P(String str) {
    }

    @Override // xsna.ym30
    public final void e(List<Integer> list) {
    }

    @Override // xsna.ym30
    public final void g0(Msg msg) {
    }

    @Override // xsna.ym30
    public final void h(List<Integer> list) {
    }

    @Override // xsna.ym30
    public final void h0(qtd0 qtd0Var) {
    }

    @Override // xsna.ym30
    public final void j(Msg msg) {
    }

    @Override // xsna.ym30
    public final void m(Peer peer) {
    }

    @Override // xsna.ym30
    public final void n(Msg msg) {
    }

    @Override // xsna.ym30
    public final void q0(Msg msg) {
    }

    @Override // xsna.ym30
    public final void r(Attach attach) {
    }

    @Override // xsna.ym30
    public final void u(Attach attach) {
    }

    @Override // xsna.ym30
    public final void u0(int i) {
    }

    @Override // xsna.ym30
    public final void w(com.vk.im.engine.models.messages.a aVar) {
    }

    @Override // xsna.ym30
    public final void z(int i) {
    }

    @Override // xsna.ym30
    public final void B(Peer peer, boolean z) {
    }

    @Override // xsna.ym30
    public final void J(Msg msg, int i) {
    }

    @Override // xsna.ym30
    public final void N(Msg msg, int i) {
    }

    @Override // xsna.ym30
    public final void c(int i, View view) {
    }

    @Override // xsna.ym30
    public final void d(int i, String str) {
    }

    @Override // xsna.ym30
    public final void f(Msg msg, NestedMsg nestedMsg) {
    }

    @Override // xsna.ym30
    public final void p0(Group group, View view) {
    }

    @Override // xsna.ym30
    public final void s(int i, String str) {
    }

    @Override // xsna.ym30
    public final void y0(Msg msg, AttachWithTranscription attachWithTranscription) {
    }

    @Override // xsna.ym30
    public final void A(Peer peer, boolean z, Attach attach) {
    }

    @Override // xsna.ym30
    public final void U(Attach attach, Msg msg, NestedMsg nestedMsg) {
    }

    @Override // xsna.ym30
    public final void X(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType) {
    }

    @Override // xsna.ym30
    public final void o(ImageList imageList, Msg msg, int i) {
    }

    @Override // xsna.ym30
    public final void q(Msg msg, AttachWithTranscription attachWithTranscription, boolean z) {
    }
}
