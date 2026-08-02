package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.external.AudioTrack;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.dg20;
import xsna.hfr;
import xsna.mwv;
import xsna.pyv;
import xsna.ryv;
import xsna.ug30;
import xsna.vm30;

/* compiled from: MessagesListComponent.kt */
/* loaded from: classes16.dex */
public final class sf20 {
    public static final Object y = new Object();
    public final tf20 a;
    public final boolean b;
    public final boolean c;
    public final lq4 d;
    public final h34 e;
    public final sxd0 f;
    public final g5v g;
    public final h1l h;
    public final lqb0 i;
    public final e2l0 j;
    public final eg20 k;
    public final nf20 l;
    public final lua m;
    public final ChannelFragment.b n;
    public vm30 o;
    public final io.reactivex.rxjava3.disposables.b p;
    public xf20 q;
    public final rf20 r;
    public final Handler s;
    public final ieb t;
    public final SparseIntArray u;
    public final SparseIntArray v;
    public final mb w;
    public final LinkedHashSet x;

    /* compiled from: MessagesListComponent.kt */
    public static final class b implements b5q0, g0t {
        public final /* synthetic */ gzs b;

        public b(gzs gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.b5q0
        public final /* synthetic */ int a() {
            return ((Number) this.b.invoke()).intValue();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof b5q0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public sf20(tf20 tf20Var, boolean z, boolean z2) {
        this.a = tf20Var;
        this.b = z;
        this.c = z2;
        lq4 lq4Var = new lq4();
        this.d = lq4Var;
        h34 h34Var = new h34();
        this.e = h34Var;
        sxd0 sxd0Var = new sxd0();
        this.f = sxd0Var;
        g5v g5vVar = new g5v();
        this.g = g5vVar;
        h1l h1lVar = new h1l();
        this.h = h1lVar;
        lqb0 lqb0Var = new lqb0();
        this.i = lqb0Var;
        e2l0 e2l0Var = tf20Var.u;
        this.j = e2l0Var;
        eo9 eo9Var = (eo9) tf20Var.c.b;
        r920 r920Var = (r920) tf20Var.e.b;
        n4n n4nVar = tf20Var.d;
        vf20 vf20Var = new vf20(eo9Var, r920Var, new ia20((s101) n4nVar.a, (euz) n4nVar.b, (ruf0) n4nVar.c), tf20Var.n);
        cg20 cg20Var = tf20Var.a;
        nj0 nj0Var = new nj0(cg20Var.a, tf20Var.r, tf20Var.s, tf20Var.t);
        of20 of20Var = tf20Var.g;
        rwa rwaVar = tf20Var.q;
        eg20 eg20Var = new eg20(vf20Var, nj0Var, of20Var, rwaVar.a, tf20Var.n, z2);
        nmx0 nmx0Var = cg20Var.f;
        tk30 tk30Var = nj0Var.a;
        tk30Var.q(nmx0Var);
        di5 di5Var = tf20Var.b;
        tk30Var.m((b9w) di5Var.a);
        tk30Var.o(sxd0Var);
        tk30Var.l(g5vVar);
        tk30Var.i(h34Var);
        tk30Var.j(lq4Var);
        tk30Var.k(h1lVar);
        eg20Var.g(rwaVar.d);
        tk30Var.G(true);
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, new h5q0(R.string.vkim_channel_msg_list_unread), null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 1073741823));
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lqb0Var, -1, 1072693247));
        tk30Var.p(e2l0Var);
        this.k = eg20Var;
        qf20 qf20Var = tf20Var.f;
        this.l = qf20Var.c;
        this.m = (lua) di5Var.b;
        this.n = qf20Var.d;
        this.p = new io.reactivex.rxjava3.disposables.b();
        this.r = new rf20(this, 0);
        this.s = new Handler(Looper.getMainLooper());
        this.t = (ieb) tf20Var.h.b;
        this.u = new SparseIntArray();
        this.v = new SparseIntArray();
        this.w = tf20Var.v;
        this.x = new LinkedHashSet();
    }

    public final void a(MsgIdType msgIdType, int i, boolean z) {
        this.g.e(msgIdType, i);
        Handler handler = this.s;
        Object obj = y;
        handler.removeCallbacksAndMessages(obj);
        if (z) {
            handler.postAtTime(new w29(this, 7), obj, SystemClock.uptimeMillis() + 2000);
        }
    }

    public final Integer b(View view) {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            RecyclerView.e0 findContainingViewHolder = vm30Var.u.findContainingViewHolder(view);
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = findContainingViewHolder instanceof com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a ? (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) findContainingViewHolder : null;
            Msg msg = aVar != null ? aVar.p.R : null;
            if (msg != null) {
                return Integer.valueOf(msg.d);
            }
        }
        return null;
    }

    public final void c(boolean z) {
        vm30 vm30Var = this.o;
        View view = vm30Var != null ? vm30Var.t : null;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void d() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.N();
        }
        e2l0 e2l0Var = this.j;
        if (e2l0Var.b != StickerAnimationState.DISABLE) {
            e2l0Var.d(StickerAnimationState.PLAY);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.O();
        }
        ChannelFragment channelFragment = ChannelFragment.this;
        z9x0 z9x0Var = channelFragment.T0;
        LinkedHashSet linkedHashSet = z9x0Var.h;
        z9x0Var.a(linkedHashSet, linkedHashSet);
        z9x0Var.g.clear();
        ChannelStubAttachesReporter channelStubAttachesReporter = z9x0Var.d;
        if (channelStubAttachesReporter != null) {
            channelStubAttachesReporter.a();
        }
        p8s0 p8s0Var = (p8s0) channelFragment.U0.getValue();
        if (p8s0Var != null) {
            LinkedHashSet linkedHashSet2 = p8s0Var.c;
            p8s0Var.a(linkedHashSet2, linkedHashSet2);
        }
        e2l0 e2l0Var = this.j;
        if (e2l0Var.b != StickerAnimationState.DISABLE) {
            e2l0Var.d(StickerAnimationState.PAUSE);
        }
    }

    /* compiled from: MessagesListComponent.kt */
    public final class a implements ym30 {
        public a() {
        }

        @Override // xsna.ym30
        public final void A0() {
            cbn0.i(q7n0.a().a(), sf20.this.k.d.a, InternalVkMiniApps.TELEGRAM_TRANSFER.h().a, null, 12);
        }

        @Override // xsna.ym30
        public final void C(int i) {
            eg20 eg20Var = sf20.this.k;
            Msg b = eg20.b(eg20Var.a.a.c(), Integer.valueOf(i));
            if (b == null) {
                return;
            }
            eg20Var.a(new dg20.h(b));
        }

        @Override // xsna.ym30
        public final void E0(String str) {
            g2v.c().k().b(sf20.this.k.d.a, str);
        }

        @Override // xsna.ym30
        public final void J(Msg msg, int i) {
            sf20.this.l.T(i);
        }

        @Override // xsna.ym30
        public final void M(Attach attach, Msg msg, NestedMsg nestedMsg) {
            eg20 eg20Var = sf20.this.k;
            eg20Var.getClass();
            eg20Var.a(new dg20.a(attach, msg, nestedMsg));
        }

        @Override // xsna.ym30
        public final void O(Attach attach) {
            sf20 sf20Var = sf20.this;
            ieb iebVar = sf20Var.t;
            boolean z = sf20Var.c;
            iebVar.getClass();
            String str = "attach_cancel_cmd" + attach.xb();
            a1w a1wVar = iebVar.a;
            a1wVar.D(str, new y04(attach.xb()));
            a1wVar.D(str, new iua(attach, z));
        }

        @Override // xsna.ym30
        public final void Q(Msg msg, sz30 sz30Var) {
            sf20.this.l.Q(msg, sz30Var);
        }

        @Override // xsna.ym30
        public final void R(Attach attach, Msg msg, NestedMsg nestedMsg) {
            eg20 eg20Var = sf20.this.k;
            eg20Var.getClass();
            eg20Var.a(new dg20.b(attach, msg, nestedMsg));
        }

        @Override // xsna.ym30
        public final void T(ug30 ug30Var, Msg msg) {
            if (ug30Var instanceof ug30.c0) {
                eg20 eg20Var = sf20.this.k;
                Peer peer = ((ug30.c0) ug30Var).a;
                eg20Var.getClass();
                eg20Var.a(new dg20.f(peer));
            }
        }

        @Override // xsna.ym30
        public final void U(Attach attach, Msg msg, NestedMsg nestedMsg) {
            eg20 eg20Var = sf20.this.k;
            eg20Var.getClass();
            eg20Var.a(new dg20.c(attach, msg, nestedMsg));
        }

        @Override // xsna.ym30
        public final void W() {
            lya lyaVar = sf20.this.k.d;
            Channel b = lyaVar.d.b();
            if (b != null) {
                lyaVar.e.a(new pyv.a(b.A.d, b.b));
            }
        }

        @Override // xsna.ym30
        public final void b() {
            sf20.this.l.b();
        }

        @Override // xsna.ym30
        public final void b0() {
            lya lyaVar = sf20.this.k.d;
            Context context = lyaVar.a;
            Channel b = lyaVar.d.b();
            if (b != null) {
                long j = b.b;
                Peer peer = b.A;
                mwv<mwv.a> mwvVar = lyaVar.e;
                long j2 = peer.d;
                mwvVar.a(new ryv.b(j2, j));
                if (b.L && b.p) {
                    new ChannelDonutSupportFragment.a(new UserId(j2)).k(context);
                } else {
                    new ChannelMonetizationFragment.a(new UserId(j2), new UserId(j)).k(context);
                }
            }
        }

        @Override // xsna.ym30
        public final void d(int i, String str) {
            g2v.c().k().b(sf20.this.k.d.a, str);
        }

        /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.ym30
        public final void d0(Collection<? extends Msg> collection, Map<Msg, vm30.e> map) {
            VideoFile videoFile;
            String r;
            Msg msg;
            io.reactivex.rxjava3.subjects.f<List<Integer>> fVar;
            ChannelFragment.b bVar = sf20.this.n;
            LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), new id20(((vm30.e) entry.getValue()).a, ((vm30.e) entry.getValue()).b));
            }
            ChannelFragment channelFragment = ChannelFragment.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (((Msg) obj).Mb()) {
                    arrayList.add(obj);
                }
            }
            p5u0 p5u0Var = (p5u0) channelFragment.Q0.getValue();
            p5u0Var.getClass();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Msg msg2 = (Msg) it2.next();
                if (msg2 instanceof MsgFromChannel) {
                    p5u0Var.b.onNext(msg2);
                }
            }
            q4b q4bVar = (q4b) channelFragment.R0.getValue();
            if (q4bVar != null && (fVar = q4bVar.b) != null) {
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Msg) it3.next()).d));
                }
                fVar.onNext(arrayList2);
            }
            dgq dgqVar = (dgq) channelFragment.m0.getValue();
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                if (next instanceof MsgFromChannel) {
                    arrayList3.add(next);
                }
            }
            dgqVar.getClass();
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (!dgqVar.d.contains(Integer.valueOf(((MsgFromChannel) next2).d))) {
                    arrayList4.add(next2);
                }
            }
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                MsgFromChannel.ExternalViewTracking externalViewTracking = ((MsgFromChannel) it6.next()).U;
                io.reactivex.rxjava3.disposables.b bVar2 = dgqVar.c;
                ia4 ia4Var = dgqVar.a;
                List<String> list = externalViewTracking.b;
                ArrayList arrayList5 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(dgqVar.b.a((String) it7.next()).b(AudienceResearchSurfaceCode.MESSENGER_CHANNEL_POST).build());
                }
                bVar2.b(ia4Var.d(arrayList5).subscribe());
                for (MsgFromChannel.ExternalViewTracking.ViewEvent viewEvent : externalViewTracking.c) {
                    long j = viewEvent.b;
                    gzs<s3q0> gzsVar = fkq0.a;
                    bVar2.b(ia4Var.c(new UserId(j), viewEvent.c).subscribe());
                }
            }
            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                arrayList6.add(Integer.valueOf(((MsgFromChannel) it8.next()).d));
            }
            dgqVar.d = j5g.S0(arrayList6);
            if (!channelFragment.isPostponed()) {
                vta vtaVar = (vta) channelFragment.F0.getValue();
                vtaVar.getClass();
                hfr.a aVar = new hfr.a(rli0.j(new i5g(linkedHashMap.entrySet()), new d40(7)));
                if (aVar.hasNext()) {
                    msg = (Msg) ((Map.Entry) aVar.next()).getKey();
                    if (aVar.hasNext()) {
                        int i = msg.d;
                        do {
                            Msg msg3 = (Msg) ((Map.Entry) aVar.next()).getKey();
                            int i2 = msg3.d;
                            if (i > i2) {
                                msg = msg3;
                                i = i2;
                            }
                        } while (aVar.hasNext());
                    }
                } else {
                    msg = null;
                }
                if (msg != null) {
                    vtaVar.a.invoke(msg);
                }
            }
            p8s0 p8s0Var = (p8s0) channelFragment.U0.getValue();
            if (p8s0Var != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), new vm30.e(((id20) entry2.getValue()).a, ((id20) entry2.getValue()).b));
                }
                LinkedHashSet linkedHashSet = p8s0Var.d;
                LinkedHashSet linkedHashSet2 = p8s0Var.c;
                linkedHashSet2.clear();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    Object key = entry3.getKey();
                    MsgFromChannel msgFromChannel = key instanceof MsgFromChannel ? (MsgFromChannel) key : null;
                    if (msgFromChannel != null) {
                        for (Attach attach : msgFromChannel.Yb().o) {
                            AttachVideo attachVideo = attach instanceof AttachVideo ? (AttachVideo) attach : null;
                            if (attachVideo != null && (videoFile = attachVideo.b) != null && (r = videoFile.r()) != null) {
                                vm30.e eVar = (vm30.e) entry3.getValue();
                                Float f = eVar.b;
                                p4g.a(r, linkedHashSet2, eVar.a >= 0.8f || (f != null && f.floatValue() >= 0.8f));
                            }
                        }
                    }
                }
                linkedHashSet.removeAll(linkedHashSet2);
                p8s0Var.a(linkedHashSet2, linkedHashSet);
                linkedHashSet.clear();
                linkedHashSet.addAll(linkedHashSet2);
            }
            z9x0 z9x0Var = channelFragment.T0;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(on00.e(linkedHashMap.size()));
            for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                linkedHashMap3.put(entry4.getKey(), new vm30.e(((id20) entry4.getValue()).a, ((id20) entry4.getValue()).b));
            }
            LinkedHashSet linkedHashSet3 = z9x0Var.i;
            ArrayList arrayList7 = new ArrayList();
            LinkedHashSet linkedHashSet4 = z9x0Var.h;
            linkedHashSet4.clear();
            for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                Object key2 = entry5.getKey();
                MsgFromChannel msgFromChannel2 = key2 instanceof MsgFromChannel ? (MsgFromChannel) key2 : null;
                if (msgFromChannel2 != null) {
                    vm30.e eVar2 = (vm30.e) entry5.getValue();
                    AttachWall Yb = msgFromChannel2.Yb();
                    String c = z9x0.c(Yb);
                    p4g.a(c, linkedHashSet4, eVar2.a());
                    HashMap<String, String> hashMap = z9x0Var.g;
                    hashMap.putIfAbsent(c, Yb.C);
                    arrayList7.add(Yb);
                    for (Attach attach2 : Yb.o) {
                        if (attach2 instanceof AttachWall) {
                            AttachWall attachWall = (AttachWall) attach2;
                            String c2 = z9x0.c(attachWall);
                            p4g.a(c2, linkedHashSet4, eVar2.a());
                            hashMap.putIfAbsent(c2, attachWall.C);
                            arrayList7.add(attach2);
                        }
                    }
                    vm30.e eVar3 = (vm30.e) entry5.getValue();
                    ChannelStubAttachesReporter channelStubAttachesReporter = z9x0Var.d;
                    if (channelStubAttachesReporter != null && !channelStubAttachesReporter.equals(ChannelStubAttachesReporter.a.a)) {
                        if (eVar3.a()) {
                            channelStubAttachesReporter.o(msgFromChannel2);
                        } else {
                            channelStubAttachesReporter.j(msgFromChannel2.b);
                        }
                    }
                }
            }
            z9x0Var.b(arrayList7);
            linkedHashSet3.removeAll(linkedHashSet4);
            z9x0Var.a(linkedHashSet4, linkedHashSet3);
            linkedHashSet3.clear();
            linkedHashSet3.addAll(linkedHashSet4);
        }

        @Override // xsna.ym30
        public final void g(int i) {
            eg20 eg20Var = sf20.this.k;
            Msg b = eg20.b(eg20Var.a.a.c(), Integer.valueOf(i));
            if (b == null) {
                return;
            }
            eg20Var.a(new dg20.g(b));
        }

        @Override // xsna.ym30
        public final void i(List<AudioTrack> list, AudioTrack audioTrack, Long l) {
            sf20.this.m.a.g(list, audioTrack, l);
        }

        @Override // xsna.ym30
        public final void i0() {
            Object obj;
            sf20 sf20Var = sf20.this;
            vm30 vm30Var = sf20Var.o;
            if (vm30Var == null) {
                return;
            }
            LinkedHashSet f = vm30Var.f();
            eg20 eg20Var = sf20Var.k;
            xf20 P0 = eg20Var.l.P0();
            if (P0 == null) {
                return;
            }
            Integer P02 = eg20Var.m.P0();
            int intValue = P02 != null ? P02.intValue() : -1;
            Iterator it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Msg) obj).d > intValue) {
                        break;
                    }
                }
            }
            Msg msg = (Msg) obj;
            int i = msg != null ? msg.d : -1;
            boolean z = P0.d;
            if (z && i > 0) {
                eg20Var.e("scrollToActual.hasUnreadIncoming");
            } else if (z) {
                eg20Var.f(MsgIdType.CNV_ID, P0.a, false, "scrollToActual.hasUnreadIncoming");
            } else {
                eg20Var.e("scrollToActual.else");
            }
        }

        @Override // xsna.ym30
        public final void m0() {
            lya lyaVar = sf20.this.k.d;
            FragmentManager supportFragmentManager = ((AppCompatActivity) e3m.h(lyaVar.a)).getSupportFragmentManager();
            Channel b = lyaVar.d.b();
            if (b != null) {
                int i = qcb.h1;
                long j = b.b;
                qcb qcbVar = new qcb();
                qcbVar.setArguments(yfb.b(new Pair("channel_id", Long.valueOf(j))));
                qcbVar.Td(supportFragmentManager, "CHANNEL_SETTINGS_BOTTOM_SHEET");
            }
        }

        @Override // xsna.ym30
        public final void n(Msg msg) {
            sf20.this.l.n(msg);
        }

        @Override // xsna.ym30
        public final void p() {
            sf20.this.m.a.pause();
        }

        @Override // xsna.ym30
        public final void q0(Msg msg) {
            eg20 eg20Var = sf20.this.k;
            xf20 P0 = eg20Var.l.P0();
            if (P0 != null && P0.d) {
                int i = P0.a;
                int i2 = msg.d;
                if (i < i2) {
                    eg20Var.l.onNext(new xf20(i2, P0.b, P0.c));
                    eg20Var.c.d(msg.d);
                }
            }
        }

        @Override // xsna.ym30
        public final void r0() {
            lya lyaVar = sf20.this.k.d;
            String b = lyaVar.c.b();
            if (b != null) {
                lyaVar.b.b(lyaVar.a, b);
            }
        }

        @Override // xsna.ym30
        public final void s(int i, String str) {
            lya lyaVar = sf20.this.k.d;
            g2v.c().k().b(lyaVar.a, str);
            Channel b = lyaVar.d.b();
            if (b != null) {
                lyaVar.e.a(new ryv.d(b.b, i));
            }
        }

        @Override // xsna.ym30
        public final void u0(int i) {
            eg20 eg20Var = sf20.this.k;
            Msg b = eg20.b(eg20Var.a.a.c(), Integer.valueOf(i));
            if (b == null) {
                return;
            }
            eg20Var.a(new dg20.i(b));
        }

        @Override // xsna.ym30
        public final int v0(Direction direction) {
            sf20.this.a.e.getClass();
            return 30;
        }

        @Override // xsna.ym30
        public final void x(uh30 uh30Var) {
            eg20 eg20Var = sf20.this.k;
            eg20Var.getClass();
            eg20Var.a(new dg20.j(uh30Var));
        }

        @Override // xsna.ym30
        public final void z0(String str, Direction direction) {
            sf20 sf20Var = sf20.this;
            sf20Var.k.a.a.b(direction);
            sf20Var.n.getClass();
        }

        @Override // xsna.ym30
        public final void B0() {
        }

        @Override // xsna.ym30
        public final void C0() {
        }

        @Override // xsna.ym30
        public final void D() {
        }

        @Override // xsna.ym30
        public final void D0() {
        }

        @Override // xsna.ym30
        public final void E() {
        }

        @Override // xsna.ym30
        public final void L() {
        }

        @Override // xsna.ym30
        public final void S() {
        }

        @Override // xsna.ym30
        public final void Y() {
        }

        @Override // xsna.ym30
        public final void a0() {
        }

        @Override // xsna.ym30
        public final void c0() {
        }

        @Override // xsna.ym30
        public final void l0() {
        }

        @Override // xsna.ym30
        public final void o0() {
        }

        @Override // xsna.ym30
        public final void s0() {
        }

        @Override // xsna.ym30
        public final void t() {
        }

        @Override // xsna.ym30
        public final void w0() {
        }

        @Override // xsna.ym30
        public final void x0() {
        }

        @Override // xsna.ym30
        public final void y() {
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
        public final void V(float f) {
        }

        @Override // xsna.ym30
        public final void a(MsgSendSource.b bVar) {
        }

        @Override // xsna.ym30
        public final void e(List<Integer> list) {
        }

        @Override // xsna.ym30
        public final void f0(View view) {
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
        public final void j0(Attach attach) {
        }

        @Override // xsna.ym30
        public final void k(Attach attach) {
        }

        @Override // xsna.ym30
        public final void m(Peer peer) {
        }

        @Override // xsna.ym30
        public final void r(Attach attach) {
        }

        @Override // xsna.ym30
        public final void t0(Msg msg) {
        }

        @Override // xsna.ym30
        public final void u(Attach attach) {
        }

        @Override // xsna.ym30
        public final void v(biu biuVar) {
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
        public final void N(Msg msg, int i) {
        }

        @Override // xsna.ym30
        public final void Z(Msg msg, StickerItem stickerItem) {
        }

        @Override // xsna.ym30
        public final void c(int i, View view) {
        }

        @Override // xsna.ym30
        public final void e0(Collection<? extends Msg> collection, boolean z) {
        }

        @Override // xsna.ym30
        public final void f(Msg msg, NestedMsg nestedMsg) {
        }

        @Override // xsna.ym30
        public final void k0(Msg msg, Integer num) {
        }

        @Override // xsna.ym30
        public final void p0(Group group, View view) {
        }

        @Override // xsna.ym30
        public final void y0(Msg msg, AttachWithTranscription attachWithTranscription) {
        }

        @Override // xsna.ym30
        public final void A(Peer peer, boolean z, Attach attach) {
        }

        @Override // xsna.ym30
        public final void X(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType) {
        }

        @Override // xsna.ym30
        public final void l(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg) {
        }

        @Override // xsna.ym30
        public final void n0(Attach attach, Boolean bool, long j) {
        }

        @Override // xsna.ym30
        public final void o(ImageList imageList, Msg msg, int i) {
        }

        @Override // xsna.ym30
        public final void q(Msg msg, AttachWithTranscription attachWithTranscription, boolean z) {
        }
    }
}
