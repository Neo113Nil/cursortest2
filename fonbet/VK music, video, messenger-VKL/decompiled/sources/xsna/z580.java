package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.g34;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: OnEventConsumer.kt */
/* loaded from: classes2.dex */
public final class z580 implements io.reactivex.rxjava3.functions.f<sxp> {
    public final com.vk.im.ui.components.msg_list.a b;

    public z580(com.vk.im.ui.components.msg_list.a aVar) {
        this.b = aVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        AttachWithTranscription bc;
        File i1;
        String path;
        File i12;
        String path2;
        vm30 vm30Var;
        sxp sxpVar2 = sxpVar;
        com.vk.im.ui.components.msg_list.a aVar = this.b;
        Handler handler = aVar.K;
        h34 h34Var = aVar.M;
        Context context = aVar.k;
        long j = aVar.n;
        if (sxpVar2 instanceof p680) {
            if (aVar.v0) {
                MsgListOpenMode msgListOpenMode = aVar.w0;
                aVar.p2();
                aVar.m2(j, msgListOpenMode);
            }
        } else if (!(sxpVar2 instanceof OnCacheInvalidateEvent)) {
            if (sxpVar2 instanceof r480) {
                wpp<Long, Dialog> wppVar = ((r480) sxpVar2).c;
            } else if (sxpVar2 instanceof u180) {
                ImBgSyncState a = ((u180) sxpVar2).b.a(LongPollType.MESSAGES);
                com.vk.im.ui.components.msg_list.c cVar = aVar.O0;
                cVar.getClass();
                cVar.l(true, new com.vk.catalog2.common.ui.holders.a(19, cVar, a));
            } else if (sxpVar2 instanceof r380) {
                List<Long> list = ((r380) sxpVar2).b;
                if (!aVar.i && list.contains(Long.valueOf(aVar.j.a))) {
                    aVar.i = true;
                    edw edwVar = edw.a;
                    edw.d(R.string.vkim_error_chat_does_not_exist, context, true);
                    bpn0 bpn0Var = enj.a;
                    e3m.h(context).onBackPressed();
                }
            }
        }
        if (sxpVar2.a() == aVar.m) {
            return;
        }
        if (sxpVar2 instanceof c180) {
            if (!(((c180) sxpVar2).b instanceof AttachVideo) || (vm30Var = aVar.o) == null) {
                return;
            }
            com.vk.im.popup.a.d(vm30Var.e0, e44.j, null, null, null, 14);
            return;
        }
        int i = 0;
        if (sxpVar2 instanceof d180) {
            d180 d180Var = (d180) sxpVar2;
            Attach attach = d180Var.b;
            int i2 = d180Var.c;
            int i3 = d180Var.d;
            ArrayList o = e43.o(Integer.valueOf(attach.xb()));
            ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
            if (ftx0Var != null && (i12 = ftx0Var.i1()) != null && (path2 = i12.getPath()) != null) {
                o.addAll(aVar.k1(path2));
            }
            if (aVar.v0) {
                int size = o.size();
                while (i < size) {
                    int intValue = ((Number) o.get(i)).intValue();
                    com.vk.im.ui.components.msg_list.a.T0.put(intValue, i2);
                    com.vk.im.ui.components.msg_list.a.U0.put(intValue, i3);
                    h34Var.b(intValue, i2, i3);
                    i++;
                }
            }
            aVar.s2(attach.xb(), i2, i3);
            return;
        }
        if (sxpVar2 instanceof x080) {
            int xb = ((x080) sxpVar2).b.xb();
            if (aVar.v0) {
                h34Var.b(xb, 0, 1);
            }
            aVar.s2(xb, 0, 1);
            return;
        }
        if (sxpVar2 instanceof w080) {
            aVar.g1(((w080) sxpVar2).b);
            return;
        }
        if (sxpVar2 instanceof a180) {
            aVar.g1(((a180) sxpVar2).b);
            return;
        }
        if (sxpVar2 instanceof z080) {
            Attach attach2 = ((z080) sxpVar2).b;
            if (aVar.v0) {
                ArrayList o2 = e43.o(Integer.valueOf(attach2.xb()));
                ftx0 ftx0Var2 = attach2 instanceof ftx0 ? (ftx0) attach2 : null;
                if (ftx0Var2 != null && (i1 = ftx0Var2.i1()) != null && (path = i1.getPath()) != null) {
                    o2.addAll(aVar.k1(path));
                }
                int size2 = o2.size();
                while (i < size2) {
                    int intValue2 = ((Number) o2.get(i)).intValue();
                    com.vk.im.ui.components.msg_list.a.T0.delete(intValue2);
                    com.vk.im.ui.components.msg_list.a.U0.delete(intValue2);
                    g34.a aVar2 = (g34.a) h34Var.a.get(Integer.valueOf(intValue2));
                    if (aVar2 != null) {
                        aVar2.c(intValue2);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (sxpVar2 instanceof ka80) {
            return;
        }
        if (sxpVar2 instanceof y080) {
            Attach attach3 = ((y080) sxpVar2).b;
            if ((attach3 instanceof AttachVideoMsg) && ((AttachVideoMsg) attach3).k == DownloadState.DOWNLOADED) {
                tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_video_saved_to_gallery);
                ikv0.a aVar3 = new ikv0.a(context);
                aVar3.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar3.n();
                return;
            }
            return;
        }
        if (sxpVar2 instanceof e980) {
            return;
        }
        if (sxpVar2 instanceof p980) {
            ((p980) sxpVar2).d.get(Long.valueOf(j));
            return;
        }
        if (sxpVar2 instanceof l980) {
            return;
        }
        if (sxpVar2 instanceof i980) {
            i980 i980Var = (i980) sxpVar2;
            if (j == i980Var.d) {
                zk70.e(i980Var.f);
                return;
            }
            return;
        }
        if (sxpVar2 instanceof u480) {
            return;
        }
        if (sxpVar2 instanceof v980) {
            Msg msg = ((v980) sxpVar2).b;
            if (j == msg.c) {
                MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                if (msgFromUser == null || (bc = msgFromUser.bc()) == null) {
                    return;
                }
                boolean z = bc instanceof AttachAudioMsg;
                eew eewVar = aVar.A.e;
                s140 s140Var = z ? eewVar.a : eewVar.b;
                s140Var.h(msg, bc);
                s140Var.f(msg, bc, true);
                a1w a1wVar = aVar.l;
                int i4 = msg.b;
                int xb2 = bc.xb();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                a1wVar.D(aVar, new wij0(i4, xb2, Peer.a.b(aVar.n)));
                return;
            }
            return;
        }
        if (!(sxpVar2 instanceof rhj0)) {
            if (sxpVar2 instanceof u6j0) {
                ArrayList arrayList = ((u6j0) sxpVar2).b;
                aVar.A0.clear();
                handler.removeCallbacksAndMessages(com.vk.im.ui.components.msg_list.a.S0);
                vm30 vm30Var2 = aVar.o;
                if (vm30Var2 != null) {
                    v14 v14Var = vm30Var2.u0;
                    if (v14Var != null) {
                        v14Var.dismiss();
                    }
                    vm30Var2.u0 = null;
                    vm30Var2.e0.dismiss();
                    vm30Var2.d0.a();
                    nr4.b().a(vm30Var2.a, arrayList);
                    return;
                }
                return;
            }
            return;
        }
        rhj0 rhj0Var = (rhj0) sxpVar2;
        int i5 = rhj0Var.b;
        ArrayList arrayList2 = rhj0Var.c;
        LinkedHashMap linkedHashMap = aVar.B0;
        Iterator it = arrayList2.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((AttachWithDownload) it.next()).getContentLength();
        }
        aVar.z0 = Integer.valueOf(i5);
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((AttachWithDownload) it2.next()).xb()));
        }
        aVar.A0 = j5g.R0(arrayList3);
        aVar.C0.clear();
        linkedHashMap.clear();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            linkedHashMap.put(Integer.valueOf(((AttachWithDownload) it3.next()).xb()), Double.valueOf(r4.getContentLength() / j2));
        }
        handler.postDelayed(new tou(2, aVar, arrayList2), com.vk.im.ui.components.msg_list.a.S0, 500L);
    }
}
