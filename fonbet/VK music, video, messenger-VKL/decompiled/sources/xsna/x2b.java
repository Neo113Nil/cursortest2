package xsna;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.channels.api.Channel;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.popup.a;
import com.vk.im.reporters.api.analytics.click.ImPinClickAnalyticsItem;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import xsna.c5v0;
import xsna.cwb0;
import xsna.r1f0;
import xsna.tlo0;
import xsna.ug30;
import xsna.x2b;

/* compiled from: ChannelMessagesInteractionHandler.kt */
/* loaded from: classes16.dex */
public final class x2b implements nf20 {
    public final FragmentActivity a;
    public final a1w b;
    public final hju0 c;
    public final g24 d;
    public final m14 e;
    public final com.vk.im.popup.a f;
    public final bzb0 g;
    public final q1b h;
    public final b2b i;
    public final ixa j;
    public final v8b k;
    public final r920 l;
    public final r1f0 m;
    public final boolean n;
    public final ya20 o;
    public final tb p;
    public a q;

    /* compiled from: ChannelMessagesInteractionHandler.kt */
    public final class a {
        public q1f0 a;
        public czb0 b;
        public a.b<ug30> c;
    }

    public x2b(FragmentActivity fragmentActivity, a1w a1wVar, hju0 hju0Var, gza gzaVar, m14 m14Var, com.vk.im.popup.a aVar, bzb0 bzb0Var, q1b q1bVar, b2b b2bVar, lxa lxaVar, w8b w8bVar, r920 r920Var, r1f0 r1f0Var, boolean z, ya20 ya20Var, tb tbVar) {
        this.a = fragmentActivity;
        this.b = a1wVar;
        this.c = hju0Var;
        this.d = gzaVar;
        this.e = m14Var;
        this.f = aVar;
        this.g = bzb0Var;
        this.h = q1bVar;
        this.i = b2bVar;
        this.j = lxaVar;
        this.k = w8bVar;
        this.l = r920Var;
        this.m = r1f0Var;
        this.n = z;
        this.o = ya20Var;
        this.p = tbVar;
    }

    @Override // xsna.nf20
    public final void L(Peer peer) {
        this.h.a(this.a, peer);
    }

    @Override // xsna.nf20
    public final void Q(Msg msg, sz30 sz30Var) {
        Channel b = this.j.b();
        if (b != null) {
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel == null) {
                return;
            }
            b2b b2bVar = this.i;
            if (b2bVar.a(msgFromChannel)) {
                return;
            }
            b2bVar.k.a(b2bVar.b, b, msgFromChannel, sz30Var);
        }
    }

    @Override // xsna.nf20
    public final void R(Msg msg) {
        c(msg);
    }

    @Override // xsna.nf20
    public final void S(Msg msg) {
        c(msg);
    }

    @Override // xsna.nf20
    public final void T(int i) {
        if (i < 0) {
            Channel b = this.j.b();
            if (b == null || !b.N) {
                b2b b2bVar = this.i;
                b2bVar.e.g(b2bVar.b.getString(R.string.vkim_channels_paid_reactions_disabled));
            }
        }
    }

    @Override // xsna.nf20
    public final void U(Msg msg) {
        if (this.n) {
            return;
        }
        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
        if (msgFromChannel == null || msgFromChannel.dc()) {
            return;
        }
        zdw zdwVar = i7o0.b;
        j3f0 e = (zdwVar != null ? zdwVar : null).e();
        if (e != null) {
            b2b b2bVar = this.i;
            e.g(b2bVar.a).a(msgFromChannel, msgFromChannel.H, false, true, b2bVar.b);
        }
    }

    @Override // xsna.nf20
    public final void V(uh30 uh30Var) {
        this.o.a(this.a, uh30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.nf20
    public final void W(Msg msg, NestedMsg nestedMsg, Attach attach, View view) {
        PostDonut postDonut;
        com.vk.im.engine.models.messages.a aVar = nestedMsg;
        if (attach.G0() != AttachSyncState.DONE) {
            return;
        }
        if (nestedMsg == null) {
            aVar = (com.vk.im.engine.models.messages.a) msg;
        }
        boolean z = aVar instanceof MsgFromChannel;
        com.vk.im.engine.models.messages.a p920Var = z ? new p920((MsgFromChannel) aVar, aVar.K0().contains(attach)) : aVar;
        if (attach instanceof AttachImage) {
            AttachImage attachImage = (AttachImage) attach;
            PostDonut.Paywall paywall = null;
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel != null && (postDonut = msgFromChannel.I.g) != null) {
                paywall = postDonut.g;
            }
            ImFeatures imFeatures = ImFeatures.BLUR_POST;
            imFeatures.getClass();
            boolean a2 = com.vk.toggle.b.A.a(imFeatures);
            if (a2 && attachImage.x && paywall != null) {
                this.i.a((MsgFromChannel) msg);
                return;
            } else if (a2 && hpt0.q(attachImage)) {
                this.b.D(this, new tfg0(attachImage.d, attachImage.e, msg.d));
                return;
            } else {
                this.d.a(attachImage, p920Var);
                return;
            }
        }
        if (!(attach instanceof AttachDoc)) {
            boolean z2 = attach instanceof AttachSticker;
            FragmentActivity fragmentActivity = this.a;
            hju0 hju0Var = this.c;
            if (!z2) {
                hju0Var.a(fragmentActivity, p920Var, attach, view);
                return;
            }
            AttachSticker attachSticker = (AttachSticker) attach;
            PopupStickerAnimation popupStickerAnimation = attachSticker.g.k;
            if (popupStickerAnimation != null) {
                this.p.invoke(popupStickerAnimation);
                return;
            } else {
                hju0Var.a(fragmentActivity, p920Var, attachSticker, view);
                return;
            }
        }
        AttachDoc attachDoc = (AttachDoc) attach;
        if (z) {
            MsgFromChannel msgFromChannel2 = (MsgFromChannel) aVar;
            boolean D = drm0.D(rwv.a(attachDoc), "image", false);
            m14 m14Var = this.e;
            if (D && attachDoc.i()) {
                m14Var.e.a(attachDoc, msgFromChannel2);
                return;
            }
            k14 k14Var = new k14(m14Var, attachDoc, msgFromChannel2, 0);
            if (gz80.a(34)) {
                k14Var.invoke();
                return;
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            Context context = m14Var.a;
            permissionHelper.getClass();
            PermissionHelper.f(permissionHelper, context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, k14Var, null, 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.im.engine.models.messages.Msg] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.vk.im.engine.models.messages.a] */
    @Override // xsna.nf20
    public final void X(Msg msg, NestedMsg nestedMsg, Attach attach, View view) {
        NestedMsg nestedMsg2 = nestedMsg;
        if (attach.G0() != AttachSyncState.DONE) {
            return;
        }
        if (nestedMsg == null) {
            nestedMsg2 = (com.vk.im.engine.models.messages.a) msg;
        }
        if (attach instanceof AttachDonutLink) {
            this.c.a(this.a, nestedMsg2, attach, view);
        }
    }

    @Override // xsna.nf20
    public final void Y(Msg msg) {
        c(msg);
    }

    public final void a(MsgFromChannel msgFromChannel, ug30 ug30Var, cwb0.l0 l0Var) {
        AuthorAd authorAd;
        AuthorAd authorAd2;
        ChannelType channelType;
        MsgFromChannel msgFromChannel2 = msgFromChannel;
        boolean z = ug30Var instanceof ug30.f;
        b2b b2bVar = this.i;
        if (z || (ug30Var instanceof ug30.c)) {
            FragmentActivity fragmentActivity = b2bVar.b;
            fvr.l(fragmentActivity, msgFromChannel2.I.a);
            if (Build.VERSION.SDK_INT <= 32) {
                b2bVar.e.c(fragmentActivity.getString(R.string.vkim_channels_post_text_copied), null);
            }
        } else {
            boolean z2 = ug30Var instanceof ug30.m;
            ixa ixaVar = this.j;
            if (z2) {
                Channel b = ixaVar.b();
                if (b != null) {
                    sz30 sz30Var = new sz30(false);
                    if (msgFromChannel2 == null) {
                        msgFromChannel2 = null;
                    }
                    if (msgFromChannel2 != null && !b2bVar.a(msgFromChannel2)) {
                        b2bVar.k.a(b2bVar.b, b, msgFromChannel2, sz30Var);
                    }
                }
            } else if (ug30Var instanceof ug30.e) {
                if (ixaVar.b() != null) {
                    FragmentActivity fragmentActivity2 = b2bVar.b;
                    b2bVar.m.getClass();
                    fvr.l(fragmentActivity2, msgFromChannel2.mc());
                    b2bVar.e.c(fragmentActivity2.getString(R.string.vkim_channels_post_link_copied), null);
                }
            } else if (ug30Var instanceof ug30.s) {
                Channel b2 = b2bVar.h.b();
                if (b2 != null && (channelType = b2.z) != null) {
                    b2bVar.l.a(b2bVar.b, msgFromChannel2.h.b, msgFromChannel2.d, channelType);
                }
            } else if (ug30Var instanceof ug30.g) {
                Channel b3 = ixaVar.b();
                com.vk.im.popup.a.d(this.f, new t1b(), new mi1(this, msgFromChannel2, b3 != null ? b3.z : null, 1), null, null, 12);
            } else if (ug30Var instanceof ug30.j) {
                b2bVar.g.d(msgFromChannel2);
            } else if (ug30Var instanceof ug30.k) {
                b2bVar.g.c(msgFromChannel2);
            } else if (ug30Var instanceof ug30.v) {
                b2bVar.g.a(msgFromChannel2);
            } else if (ug30Var instanceof ug30.a) {
                if (msgFromChannel2 == null) {
                    msgFromChannel2 = null;
                }
                String str = (msgFromChannel2 == null || (authorAd2 = msgFromChannel2.I.h) == null) ? null : authorAd2.b;
                if (str != null && !drm0.N(str)) {
                    b2bVar.m.k().b(b2bVar.b, str);
                }
            } else if (ug30Var instanceof ug30.d) {
                FragmentActivity fragmentActivity3 = b2bVar.b;
                if (msgFromChannel2 == null) {
                    msgFromChannel2 = null;
                }
                String str2 = (msgFromChannel2 == null || (authorAd = msgFromChannel2.I.h) == null) ? null : authorAd.c;
                if (str2 != null && !drm0.N(str2)) {
                    fvr.l(fragmentActivity3, str2);
                    if (Build.VERSION.SDK_INT <= 32) {
                        b2bVar.e.c(fragmentActivity3.getString(R.string.vkim_channels_post_erid_copied), null);
                    }
                }
            } else if (epx.f(ug30Var, ug30.b.a)) {
                Iterable iterable = l0Var.l;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (j5g.P(l0Var.m, ((jwb0) obj).f)) {
                        arrayList.add(obj);
                    }
                }
                a aVar = this.q;
                if (aVar != null) {
                    q1f0 q1f0Var = aVar.a;
                    if (q1f0Var != null) {
                        q1f0Var.e();
                    }
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures.getClass();
                    if (com.vk.toggle.b.A.a(imFeatures)) {
                        a.b<ug30> bVar = aVar.c;
                        if (bVar != null) {
                            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                jwb0 jwb0Var = (jwb0) it.next();
                                arrayList2.add(new lwb0(jwb0Var.a, jwb0Var.b, jwb0Var.c, jwb0Var.d, jwb0Var.e, jwb0Var.f, jwb0Var.h, jwb0Var.i, jwb0Var.j, false, 1536));
                            }
                            bVar.setItems(arrayList2);
                        }
                    } else {
                        czb0 czb0Var = aVar.b;
                        if (czb0Var != null) {
                            czb0Var.a(arrayList);
                        }
                    }
                }
            } else if (ug30Var instanceof ug30.p) {
                b2bVar.j.a(new ImPinClickAnalyticsItem.PinnedMessage(ImPinClickAnalyticsItem.PinnedMessage.ClickType.PIN, ImPinClickAnalyticsItem.PinnedMessage.ConversationType.CHANNEL, msgFromChannel2.c, msgFromChannel2.d));
                a3b a3bVar = b2bVar.c;
                a3bVar.getClass();
                io.reactivex.rxjava3.core.x b4 = a3bVar.d.b(a3bVar, new l8b(msgFromChannel2.d, msgFromChannel2.h));
                asu0 asu0Var = asu0.a;
                io.reactivex.rxjava3.internal.operators.completable.u o = new io.reactivex.rxjava3.internal.operators.single.s(b4.q(asu0Var.c()), new u5(new tc(5), 4)).o(asu0Var.d());
                com.vk.im.popup.a aVar2 = b2bVar.d;
                ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures2.getClass();
                b2bVar.f.b(com.vk.im.popup.e.a(o, aVar2, new ehd0(com.vk.toggle.b.A.a(imFeatures2))).subscribe(new a2b(b2bVar, 0), new ff3(new com.vk.im.ui.fragments.b(b2bVar, 18), 6)));
            } else if (ug30Var instanceof ug30.b0) {
                b2bVar.j.a(new ImPinClickAnalyticsItem.PinnedMessage(ImPinClickAnalyticsItem.PinnedMessage.ClickType.UNPIN, ImPinClickAnalyticsItem.PinnedMessage.ConversationType.CHANNEL, msgFromChannel2.c, msgFromChannel2.d));
                a3b a3bVar2 = b2bVar.c;
                a3bVar2.getClass();
                io.reactivex.rxjava3.core.x b5 = a3bVar2.d.b(a3bVar2, new udb(msgFromChannel2.d, msgFromChannel2.h));
                asu0 asu0Var2 = asu0.a;
                io.reactivex.rxjava3.internal.operators.completable.u o2 = new io.reactivex.rxjava3.internal.operators.single.s(b5.q(asu0Var2.c()), new qs6(new xr0(8), 4)).o(asu0Var2.d());
                com.vk.im.popup.a aVar3 = b2bVar.d;
                ImFeatures imFeatures3 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures3.getClass();
                b2bVar.f.b(com.vk.im.popup.e.a(o2, aVar3, new ehd0(com.vk.toggle.b.A.a(imFeatures3))).subscribe(new bq1(b2bVar, 1), new um0(new jy(b2bVar, 24), 12)));
            } else if (ug30Var instanceof ug30.t) {
                a3b a3bVar3 = b2bVar.c;
                a3bVar3.getClass();
                io.reactivex.rxjava3.core.x b6 = a3bVar3.d.b(a3bVar3, new e5b(msgFromChannel2.b));
                asu0 asu0Var3 = asu0.a;
                io.reactivex.rxjava3.internal.operators.completable.u o3 = new io.reactivex.rxjava3.internal.operators.completable.p(b6.q(asu0Var3.c())).o(asu0Var3.d());
                com.vk.im.popup.a aVar4 = b2bVar.d;
                ImFeatures imFeatures4 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures4.getClass();
                b2bVar.f.b(io.reactivex.rxjava3.kotlin.c.g(com.vk.im.popup.e.a(o3, aVar4, new ehd0(com.vk.toggle.b.A.a(imFeatures4))), new x7(b2bVar, 20), null, 2));
            } else if (ug30Var instanceof ug30.u) {
                a3b a3bVar4 = b2bVar.c;
                a3bVar4.getClass();
                io.reactivex.rxjava3.internal.operators.single.y l = a3bVar4.f(msgFromChannel2.b, a3bVar4.b).l(new zj0(new d40(8), 3));
                asu0 asu0Var4 = asu0.a;
                b2bVar.f.b(l.q(asu0Var4.c()).m(asu0Var4.d()).subscribe(new az(new ml1(5, b2bVar, msgFromChannel2), 10), new f60(new za(b2bVar, 21), 11)));
            } else {
                com.vk.metrics.eventtracking.b.a.q(new UnsupportedOperationException("Message action (" + qjg.a(ug30Var) + ") was not handled."));
            }
        }
        if (epx.f(ug30Var, ug30.b.a)) {
            return;
        }
        this.q = null;
    }

    @Override // xsna.nf20
    public final void b() {
        tjq tjqVar = new tjq();
        VkModal.Mode mode = VkModal.Mode.Card;
        c5v0.c.b bVar = new c5v0.c.b(new gko(R.drawable.vk_icon_illustration_unreliable_112h), null, null, 12);
        c5v0.b bVar2 = new c5v0.b(12, tq.h(tlo0.Companion, R.string.vkim_channel_msg_fake_news_bottom_sheet_title), new tlo0.f(R.string.vkim_channel_msg_fake_news_bottom_sheet_subtitle));
        c5v0.a.C2643a c2643a = new c5v0.a.C2643a(new tlo0.f(R.string.vkim_channel_msg_fake_news_bottom_sheet_top_button), new v3n(tjqVar, 5), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED);
        tlo0.f fVar = new tlo0.f(R.string.vkim_channel_msg_fake_news_bottom_sheet_bottom_button);
        VkButton.Mode mode2 = VkButton.Mode.Secondary;
        FragmentActivity fragmentActivity = this.a;
        tjqVar.a = new VkModal(mode, new b.a.C0790b(bVar, bVar2, null, new c5v0.a(c2643a, new c5v0.a.C2643a(fVar, new yq1(9, fragmentActivity, tjqVar), null, mode2, null, false, 444), 4), 52), new nuj(tjqVar, 7), false, 20).b(fragmentActivity, "FakeNewsInfoModalBottomSheet");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Msg msg) {
        boolean z;
        boolean z2;
        ListBuilder g;
        String str;
        boolean z3;
        ixa ixaVar = this.j;
        Channel b = ixaVar.b();
        if (b == null) {
            return;
        }
        boolean z4 = b.x;
        if (msg instanceof MsgFromChannel) {
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            boolean z5 = this.n;
            if (z5) {
                ListBuilder e = e43.e();
                boolean z6 = msgFromChannel.I.j.length() == 0;
                boolean z7 = msgFromChannel.o == MsgSyncState.SENDING;
                boolean Pb = msgFromChannel.Pb();
                boolean z8 = (!z4 || !z6 || z7 || msgFromChannel.F0() || msgFromChannel.ic()) ? false : true;
                p4g.a(ug30.v.a, e, z4 && !z7);
                p4g.a(ug30.k.a, e, z4 && z6 && !z7);
                p4g.a(ug30.u.a, e, z4 && Pb);
                p4g.a(ug30.j.a, e, z8);
                p4g.a(ug30.f.a, e, msgFromChannel.I.a.length() > 0);
                p4g.a(ug30.g.a, e, z4);
                g = e.g();
                z = z5;
            } else {
                AuthorAd authorAd = msgFromChannel.I.h;
                String str2 = authorAd != null ? authorAd.c : null;
                if (str2 == null) {
                    str2 = "";
                }
                boolean Qb = msgFromChannel.Qb();
                boolean Pb2 = msgFromChannel.Pb();
                AuthorAd authorAd2 = msgFromChannel.I.h;
                boolean z9 = authorAd2 != null && (str = authorAd2.b) != null && str.length() > 0 && authorAd2.c.length() > 0 && Qb;
                boolean hc = msgFromChannel.hc(this.k.b());
                ListBuilder e2 = e43.e();
                p4g.a(ug30.m.a, e2, hc);
                p4g.a(ug30.e.a, e2, Qb);
                p4g.a(ug30.p.a, e2, z4 && !msgFromChannel.M && Qb);
                p4g.a(ug30.b0.a, e2, z4 && msgFromChannel.M);
                p4g.a(ug30.c.a, e2, msgFromChannel.I.a.length() > 0);
                p4g.a(ug30.t.a, e2, z4 && Pb2);
                p4g.a(ug30.g.a, e2, z4);
                ug30.j jVar = ug30.j.a;
                boolean z10 = msgFromChannel.o == MsgSyncState.SENDING;
                boolean z11 = msgFromChannel.I.j.length() == 0;
                if (!z4 || !z11 || z10 || b.z == null || msgFromChannel.F0() || msgFromChannel.ic()) {
                    z = z5;
                } else {
                    xuo0.a.getClass();
                    z = z5;
                    if (xuo0.a() - msgFromChannel.g < this.b.r().s) {
                        z2 = true;
                        p4g.a(jVar, e2, z2);
                        p4g.a(ug30.s.a, e2, z4 && Qb);
                        p4g.a(ug30.a.a, e2, z9);
                        p4g.a(new ug30.d(str2), e2, str2.length() <= 0 && Qb);
                        g = e2.g();
                    }
                }
                z2 = false;
                p4g.a(jVar, e2, z2);
                p4g.a(ug30.s.a, e2, z4 && Qb);
                p4g.a(ug30.a.a, e2, z9);
                p4g.a(new ug30.d(str2), e2, str2.length() <= 0 && Qb);
                g = e2.g();
            }
            if (g.isEmpty()) {
                return;
            }
            boolean dc = msgFromChannel.dc();
            bzb0 bzb0Var = this.g;
            com.vk.im.popup.a aVar = this.f;
            if (dc || !drm0.N(msgFromChannel.I.j) || z || !msg.Qb()) {
                cwb0.l0 l0Var = new cwb0.l0(this.a, g, null, null, 28);
                dda ddaVar = new dda(this, msgFromChannel, l0Var, 1);
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    aVar.c(gwb0.a(l0Var), ddaVar, null);
                    return;
                } else {
                    bzb0.h(bzb0Var, l0Var, ddaVar, null);
                    return;
                }
            }
            FrameLayout frameLayout = new FrameLayout(this.a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            final a aVar2 = new a();
            aVar2.a = null;
            aVar2.b = null;
            aVar2.c = null;
            ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures2.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            final boolean a2 = bVar.a(imFeatures2);
            gzs gzsVar = new gzs() { // from class: xsna.v2b
                @Override // xsna.gzs
                public final Object invoke() {
                    boolean z12 = a2;
                    x2b.a aVar3 = aVar2;
                    if (z12) {
                        a.b<ug30> bVar2 = aVar3.c;
                        if (bVar2 != null) {
                            bVar2.setItems(Collections.singletonList(new lwb0(null, R.string.vkim_msg_action_back_to_post_actions, null, null, R.drawable.vk_icon_arrow_left_outline_28, ug30.b.a, false, null, false, false, 1741)));
                        }
                    } else {
                        czb0 czb0Var = aVar3.b;
                        if (czb0Var != null) {
                            czb0Var.a(Collections.singletonList(new jwb0(null, R.string.vkim_msg_action_back_to_post_actions, null, null, R.drawable.vk_icon_arrow_left_outline_28, ug30.b.a, false, null, 461)));
                        }
                    }
                    return s3q0.a;
                }
            };
            Channel b2 = ixaVar.b();
            if (b2 != null ? b2.N : false) {
                ImFeatures imFeatures3 = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
                imFeatures3.getClass();
                if (bVar.a(imFeatures3)) {
                    z3 = true;
                    aVar2.a = this.m.b(new r1f0.c(frameLayout, false, z3, true, new wzs() { // from class: xsna.w2b
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z12 = a2;
                            x2b x2bVar = this;
                            if (z12) {
                                x2bVar.f.dismiss();
                            } else {
                                x2bVar.g.a();
                            }
                            return s3q0.a;
                        }
                    }, "", msgFromChannel, gzsVar, !a2));
                    cwb0.l0 l0Var2 = new cwb0.l0(this.a, g, null, null, 28);
                    zu1 zu1Var = new zu1(this, msgFromChannel, l0Var2, 1);
                    if (a2) {
                        aVar2.b = bzb0.h(bzb0Var, l0Var2, zu1Var, frameLayout);
                    } else {
                        aVar2.c = aVar.g(gwb0.a(l0Var2), zu1Var, new mm1(5, this, frameLayout));
                    }
                    this.q = aVar2;
                }
            }
            z3 = false;
            aVar2.a = this.m.b(new r1f0.c(frameLayout, false, z3, true, new wzs() { // from class: xsna.w2b
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    boolean z12 = a2;
                    x2b x2bVar = this;
                    if (z12) {
                        x2bVar.f.dismiss();
                    } else {
                        x2bVar.g.a();
                    }
                    return s3q0.a;
                }
            }, "", msgFromChannel, gzsVar, !a2));
            cwb0.l0 l0Var22 = new cwb0.l0(this.a, g, null, null, 28);
            zu1 zu1Var2 = new zu1(this, msgFromChannel, l0Var22, 1);
            if (a2) {
            }
            this.q = aVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2b)) {
            return false;
        }
        x2b x2bVar = (x2b) obj;
        return epx.f(this.a, x2bVar.a) && epx.f(this.b, x2bVar.b) && epx.f(this.c, x2bVar.c) && epx.f(this.d, x2bVar.d) && this.e.equals(x2bVar.e) && epx.f(this.f, x2bVar.f) && epx.f(this.g, x2bVar.g) && epx.f(this.h, x2bVar.h) && this.i.equals(x2bVar.i) && epx.f(this.j, x2bVar.j) && epx.f(this.k, x2bVar.k) && epx.f(this.l, x2bVar.l) && epx.f(this.m, x2bVar.m) && this.n == x2bVar.n && epx.f(this.o, x2bVar.o) && this.p.equals(x2bVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.o.hashCode() + qoy.b((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.n)) * 31);
    }

    @Override // xsna.nf20
    public final void n(Msg msg) {
        if (msg.Qb()) {
            b2b b2bVar = this.i;
            io.reactivex.rxjava3.core.a l = b2bVar.m.a().l(xa4.L(b2bVar.b), msg);
            int i = kwg0.a;
            b2bVar.f.b(l.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new n20(new cu4(b2bVar, 1), 14)));
        }
    }

    public final String toString() {
        return "ChannelMessagesInteractionHandler(activity=" + this.a + ", engine=" + this.b + ", channelMessagesAttachRouter=" + this.c + ", attachImageViewer=" + this.d + ", attachDocumentViewer=" + this.e + ", popupVc=" + this.f + ", deprecatedPopupVc=" + this.g + ", channelMembersRouter=" + this.h + ", channelMessagesActionHandler=" + this.i + ", channelDataSource=" + this.j + ", channelProfileDataSource=" + this.k + ", messageHistoryLoader=" + this.l + ", reactionPickerFactory=" + this.m + ", isPostponed=" + this.n + ", messageProductsNavigationHelper=" + this.o + ", popupStickerClickListener=" + this.p + ')';
    }
}
