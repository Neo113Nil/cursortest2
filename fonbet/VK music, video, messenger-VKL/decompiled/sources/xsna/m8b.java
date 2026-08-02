package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.common.im.Image;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.lrv0;
import xsna.mwv;
import xsna.tlo0;

/* compiled from: ChannelPinMsgComponent.kt */
/* loaded from: classes16.dex */
public final class m8b extends j8i {
    public final bpn0 A;
    public a B;
    public final long i;
    public final a1w j;
    public final lzv k;
    public final xbw l;
    public final lrv0 m;
    public final mwv<mwv.a> n;
    public final ChannelFragment.c o;
    public final io.reactivex.rxjava3.disposables.b p = new io.reactivex.rxjava3.disposables.b();
    public final vd7 q;
    public List<e0l0> r;
    public com.vk.im.design.view.pagination.pin.b s;
    public String t;
    public String u;
    public final bpn0 v;
    public final n8b w;
    public int x;
    public int y;
    public ViewGroup z;

    /* compiled from: ChannelPinMsgComponent.kt */
    public static final class a implements lrv0.a {
        public a() {
        }

        @Override // xsna.lrv0.a
        public final void xb() {
            m8b m8bVar = m8b.this;
            com.vk.im.design.view.pagination.pin.b bVar = m8bVar.s;
            if (bVar != null) {
                Context context = bVar.getView().getContext();
                m8bVar.Z0();
                bVar.setIndicatorColor(e3m.f(R.attr.vk_ui_icon_accent_themed, context));
            }
        }
    }

    public m8b(long j, a1w a1wVar, lzv lzvVar, xbw xbwVar, lrv0 lrv0Var, mwv mwvVar, ChannelFragment.c cVar) {
        this.i = j;
        this.j = a1wVar;
        this.k = lzvVar;
        this.l = xbwVar;
        this.m = lrv0Var;
        this.n = mwvVar;
        this.o = cVar;
        EmptyList emptyList = EmptyList.b;
        vd7 vd7Var = new vd7();
        vd7Var.b = emptyList;
        this.q = vd7Var;
        this.r = emptyList;
        this.t = "";
        this.u = "";
        this.v = new bpn0(new rj1(this, 13));
        this.w = new n8b(this);
        this.x = -1;
        this.y = -1;
        this.A = new bpn0(new no(this, 12));
    }

    public static final void X0(m8b m8bVar, List list) {
        Object obj;
        ImPinItem b1;
        ViewGroup viewGroup;
        vd7 vd7Var = m8bVar.q;
        bpn0 bpn0Var = m8bVar.A;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.i, new Object[]{"ChannelPinMsgComponent", "handle update = " + j5g.g0(list, null, null, null, 0, new ci3(7), 31)});
        }
        List list2 = list;
        int size = list2.size();
        if (!m8bVar.d && (viewGroup = m8bVar.z) != null) {
            m8bVar.D0(viewGroup.getContext(), viewGroup, (ViewStub) viewGroup.findViewById(R.id.channel_pinned_msgs), null);
        }
        if (size == 0) {
            ((vtt0) bpn0Var.getValue()).d(true);
            m8bVar.o.a();
        } else {
            vtt0.g((vtt0) bpn0Var.getValue(), true);
            View view = m8bVar.g;
            if (view != null) {
                view.post(new x52(m8bVar, 1));
            }
        }
        boolean z = ((List) vd7Var.b).size() == list2.size();
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.i, new Object[]{"ChannelPinMsgComponent", "isSamePinCount = " + z + " ; lastPinCnvId = " + m8bVar.y + " ; lastCnvId = " + m8bVar.x});
        }
        vd7Var.b = list;
        com.vk.im.design.view.pagination.pin.b bVar = m8bVar.s;
        if (bVar != null) {
            List<MsgFromChannel> list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (MsgFromChannel msgFromChannel : list3) {
                if (msgFromChannel.E.isEmpty()) {
                    b1 = new ImPinItem.a(msgFromChannel.d, oq.d(tlo0.Companion, m8bVar.t), new tlo0.h(msgFromChannel.dc() ? m8bVar.u : msgFromChannel.I.a));
                } else if (msgFromChannel.dc()) {
                    m8bVar.Z0();
                    b1 = new ImPinItem.WithAttach(msgFromChannel.d, new ImPinItem.WithAttach.a(new ulw(R.drawable.vk_icon_donut_coin_circle_fill_yellow_28), ImPinItem.WithAttach.Style.Rounded, 12), oq.d(tlo0.Companion, m8bVar.t), new tlo0.h(m8bVar.u), false, null);
                } else {
                    Iterator<T> it = msgFromChannel.E.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Attach attach = (Attach) obj;
                        if ((attach instanceof AttachImage) || (attach instanceof AttachVideo) || (attach instanceof AttachVideoMsg) || (attach instanceof AttachDoc)) {
                            break;
                        }
                    }
                    Attach attach2 = (Attach) obj;
                    b1 = attach2 != null ? m8bVar.b1(msgFromChannel, attach2) : m8bVar.b1(msgFromChannel, (Attach) j5g.Y(msgFromChannel.E));
                }
                arrayList.add(b1);
            }
            bVar.setItemList(arrayList);
        }
        int Y0 = m8bVar.Y0(m8bVar.x);
        m8bVar.c1(m8bVar.x, z);
        int Y02 = m8bVar.Y0(m8bVar.x);
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.i, new Object[]{"ChannelPinMsgComponent", "position update [old = " + Y0 + " ; new = " + Y02 + ']'});
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        KeyEvent.Callback inflate = viewStub != null ? viewStub.inflate() : null;
        com.vk.im.design.view.pagination.pin.b bVar = inflate instanceof com.vk.im.design.view.pagination.pin.b ? (com.vk.im.design.view.pagination.pin.b) inflate : null;
        if (bVar != null) {
            bVar.setClickListener(this.w);
            bVar.setImageControllerFactory(adg0.a);
        } else {
            bVar = null;
        }
        this.s = bVar;
        this.t = layoutInflater.getContext().getString(R.string.vkim_channel_pin_title);
        layoutInflater.getContext().getString(R.string.vkim_channel_pin_subtitle_attach);
        this.u = layoutInflater.getContext().getString(R.string.vkim_channel_pin_subtitle_donut);
        com.vk.im.design.view.pagination.pin.b bVar2 = this.s;
        if (bVar2 != null) {
            return bVar2.getView();
        }
        return null;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.z = null;
        a aVar = this.B;
        if (aVar != null) {
            this.m.d(aVar);
        }
        this.B = null;
    }

    @Override // xsna.j8i
    public final void S0(View view) {
        a aVar = new a();
        this.m.a(aVar);
        this.B = aVar;
    }

    public final int Y0(int i) {
        vd7 vd7Var = this.q;
        MsgFromChannel msgFromChannel = (MsgFromChannel) j5g.a0((List) vd7Var.b);
        if (i <= (msgFromChannel != null ? msgFromChannel.d : -1)) {
            return e43.h((List) vd7Var.b);
        }
        MsgFromChannel msgFromChannel2 = (MsgFromChannel) j5g.k0((List) vd7Var.b);
        int i2 = msgFromChannel2 != null ? msgFromChannel2.d : -1;
        if (i2 < i) {
            return e43.h((List) vd7Var.b);
        }
        if (i2 == i) {
            return e43.h((List) vd7Var.b) - 1;
        }
        Iterator it = j5g.y0((List) vd7Var.b).iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            Object next = it.next();
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            int i4 = ((MsgFromChannel) next).d;
            if (i > i4 && i != i4) {
                break;
            }
            i3++;
        }
        Integer valueOf = i3 != -1 ? Integer.valueOf(i3) : null;
        if (valueOf != null) {
            return e43.h((List) vd7Var.b) - valueOf.intValue();
        }
        return -1;
    }

    public final void Z0() {
        View view;
        com.vk.im.design.view.pagination.pin.b bVar = this.s;
        if (((bVar == null || (view = bVar.getView()) == null) ? null : view.getContext()) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final hny a1(int i) {
        View view;
        com.vk.im.design.view.pagination.pin.b bVar = this.s;
        Context context = (bVar == null || (view = bVar.getView()) == null) ? null : view.getContext();
        if (context == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        hny hnyVar = new hny(context);
        Z0();
        Z0();
        hnyVar.c(iah0.b(10.0f), R.attr.vk_ui_background);
        Z0();
        hnyVar.d(i, R.attr.vk_ui_icon_secondary);
        return hnyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImPinItem b1(MsgFromChannel msgFromChannel, Attach attach) {
        ImPinItem.WithAttach.a aVar;
        ImPinItem.WithAttach.a aVar2;
        boolean z = attach instanceof AttachImage;
        int i = 12;
        ImPinItem.WithAttach.b bVar = null;
        if (z) {
            AttachImage attachImage = (AttachImage) attach;
            Image Ab = attachImage.r.Ab();
            if (Ab == null) {
                Ab = attachImage.q.Ab();
            }
            String str = Ab != null ? Ab.d : null;
            aVar2 = new ImPinItem.WithAttach.a(new vlw(str != null ? str : "", null), ImPinItem.WithAttach.Style.Rounded, i);
        } else if (attach instanceof AttachVideo) {
            AttachVideo attachVideo = (AttachVideo) attach;
            Image Ab2 = attachVideo.f.Ab();
            if (Ab2 == null) {
                Ab2 = attachVideo.c.Ab();
            }
            String str2 = Ab2 != null ? Ab2.d : null;
            aVar2 = new ImPinItem.WithAttach.a(new vlw(str2 != null ? str2 : "", null), ImPinItem.WithAttach.Style.Rounded, 8);
        } else {
            if (!(attach instanceof AttachAudio)) {
                if (attach instanceof AttachDoc) {
                    Z0();
                    aVar = new ImPinItem.WithAttach.a(new slw(a1(R.drawable.vk_icon_document_outline_20)), ImPinItem.WithAttach.Style.Rounded, i);
                } else if (attach instanceof AttachMap) {
                    Z0();
                    aVar2 = new ImPinItem.WithAttach.a(new ulw(R.drawable.vk_icon_illustration_messenger_map_pin_40h), ImPinItem.WithAttach.Style.Rounded, i);
                } else if (attach instanceof AttachPoll) {
                    Z0();
                    aVar2 = new ImPinItem.WithAttach.a(new slw(a1(R.drawable.vk_icon_poll_outline_20)), ImPinItem.WithAttach.Style.Rounded, i);
                } else if (attach instanceof AttachAudioMsg) {
                    Z0();
                    aVar2 = new ImPinItem.WithAttach.a(new slw(a1(R.drawable.vk_icon_voice_outline_20)), ImPinItem.WithAttach.Style.Circle, i);
                } else if (attach instanceof AttachVideoMsg) {
                    AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach;
                    Image Ab3 = attachVideoMsg.g.Ab();
                    if (Ab3 == null) {
                        Ab3 = attachVideoMsg.d.Ab();
                    }
                    String str3 = Ab3 != null ? Ab3.d : null;
                    aVar2 = new ImPinItem.WithAttach.a(new vlw(str3 != null ? str3 : "", null), ImPinItem.WithAttach.Style.Stencil, true, cdi.z(Integer.valueOf(attachVideoMsg.c), this.r));
                } else {
                    aVar = null;
                }
                tlo0.h d = !msgFromChannel.k8() ? oq.d(tlo0.Companion, msgFromChannel.I.a) : u11.f(tlo0.Companion, ((com.vk.im.ui.formatters.a) this.v.getValue()).c(msgFromChannel.E));
                if (aVar != null) {
                    return new ImPinItem.a(msgFromChannel.d, oq.d(tlo0.Companion, this.t), d);
                }
                int i2 = msgFromChannel.d;
                tlo0.h d2 = oq.d(tlo0.Companion, this.t);
                boolean z2 = msgFromChannel.E.size() > 1;
                if (z) {
                    if (((AttachImage) attach).v != null) {
                        bVar = new ImPinItem.WithAttach.b(new kf1(attach, 11));
                    }
                } else if ((attach instanceof AttachVideo) && ((AttachVideo) attach).b.O() != null) {
                    bVar = new ImPinItem.WithAttach.b(new ka(attach, 14));
                }
                return new ImPinItem.WithAttach(i2, aVar, d2, d, z2, bVar);
            }
            String Kb = ((AttachAudio) attach).b.Kb(iah0.a(40));
            aVar2 = new ImPinItem.WithAttach.a(new vlw(Kb != null ? Kb : "", null), ImPinItem.WithAttach.Style.Rounded, i);
        }
        aVar = aVar2;
        tlo0.h d3 = !msgFromChannel.k8() ? oq.d(tlo0.Companion, msgFromChannel.I.a) : u11.f(tlo0.Companion, ((com.vk.im.ui.formatters.a) this.v.getValue()).c(msgFromChannel.E));
        if (aVar != null) {
        }
    }

    public final void c1(int i, boolean z) {
        MsgFromChannel msgFromChannel;
        int Y0 = Y0(i);
        if (Y0 == -1 || (msgFromChannel = (MsgFromChannel) j5g.b0(Y0, (List) this.q.b)) == null) {
            return;
        }
        int i2 = msgFromChannel.d;
        if (this.y == i2 && z) {
            return;
        }
        this.y = i2;
        com.vk.im.design.view.pagination.pin.b bVar = this.s;
        if (bVar != null) {
            bVar.setCurrentItem(Y0);
        }
    }
}
