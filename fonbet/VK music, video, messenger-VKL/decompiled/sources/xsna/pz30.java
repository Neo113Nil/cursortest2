package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: MsgSendViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class pz30 extends le6<List<? extends Msg>> {
    public final Peer b;
    public final String c;
    public final MsgTextFormat d;
    public final MsgSendSource e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List<Attach> j;
    public final Set<CnvMsgId> k;
    public final Integer l;
    public final String m;
    public final ly30 n;
    public final boolean o;

    public pz30() {
        throw null;
    }

    public pz30(Peer peer, String str, MsgTextFormat msgTextFormat, MsgSendSource msgSendSource, String str2, String str3, String str4, String str5, List list, Set set, Integer num, String str6, ly30 ly30Var, int i) {
        String str7 = (i & 2) != 0 ? "" : str;
        MsgTextFormat msgTextFormat2 = (i & 4) != 0 ? MsgTextFormat.d : msgTextFormat;
        MsgSendSource msgSendSource2 = (i & 8) != 0 ? MsgSendSource.e.a : msgSendSource;
        String str8 = (i & 16) != 0 ? "" : str2;
        String str9 = (i & 32) != 0 ? "" : str3;
        String str10 = (i & 64) != 0 ? "" : str4;
        String str11 = (i & 128) != 0 ? "unknown" : str5;
        List list2 = (i & 256) != 0 ? EmptyList.b : list;
        Set set2 = (i & 512) != 0 ? EmptySet.b : set;
        Integer num2 = (i & 1024) != 0 ? null : num;
        String str12 = (i & 2048) == 0 ? str6 : "";
        ly30 ly30Var2 = (i & 4096) != 0 ? ly30.f : ly30Var;
        this.b = peer;
        this.c = str7;
        this.d = msgTextFormat2;
        this.e = msgSendSource2;
        this.f = str8;
        this.g = str9;
        this.h = str10;
        this.i = str11;
        this.j = list2;
        this.k = set2;
        this.l = num2;
        this.m = str12;
        this.n = ly30Var2;
        this.o = false;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Illegal dialog id value");
        }
        List list3 = list2;
        zir0.a(list3);
        boolean N = drm0.N(str7);
        boolean isEmpty = list3.isEmpty();
        boolean isEmpty2 = set2.isEmpty();
        if (N && isEmpty && isEmpty2) {
            throw new IllegalArgumentException("Message content is not defined");
        }
    }

    public static boolean f(Msg msg) {
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        return msgFromUser != null && msgFromUser.H.isEmpty() && msgFromUser.F.length() > 0 && msgFromUser.Q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cb  */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<? extends Msg> e(w2w w2wVar) {
        NestedMsg nestedMsg;
        Long l;
        ly30 ly30Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        MsgRequestStatus msgRequestStatus;
        defpackage.h0 h0Var;
        w2w w2wVar2;
        MsgFromUser msgFromUser;
        String str;
        MsgTextFormat msgTextFormat;
        int i;
        com.vk.im.engine.models.dialogs.b c;
        MsgRequestStatus msgRequestStatus2;
        Peer peer;
        int i2;
        Peer peer2;
        ConversationCard conversationCard;
        String str2;
        Attach attach;
        Integer num;
        int i3;
        String str3;
        String str4;
        String str5;
        long j;
        List list;
        List list2;
        String str6;
        List list3;
        ly30 ly30Var2;
        String str7;
        VideoFile videoFile;
        Long l2;
        Iterable iterable;
        defpackage.h0 h0Var2 = new defpackage.h0(19, w2wVar, this);
        Integer num2 = this.l;
        ph30 ph30Var = ph30.a;
        Peer peer3 = this.b;
        long j2 = peer3.b;
        String str8 = this.c;
        MsgTextFormat msgTextFormat2 = this.d;
        MsgSendSource msgSendSource = this.e;
        List<MsgTextFormatItem> list4 = msgTextFormat2.c;
        int length = str8.length() - 1;
        int i4 = 0;
        boolean z5 = false;
        while (i4 <= length) {
            boolean z6 = epx.g(str8.charAt(!z5 ? i4 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length--;
            } else if (z6) {
                i4++;
            } else {
                z5 = true;
            }
        }
        String obj = str8.subSequence(i4, length + 1).toString();
        if (com.vk.dto.common.b.a(j2) && (msgSendSource instanceof MsgSendSource.b)) {
            Peer Ab = ((MsgSendSource.b) msgSendSource).a.Ab();
            long j3 = Ab.d;
            qtd0 Bb = ((ProfilesInfo) w2wVar.L0(ph30Var, new d1e0(new g1e0(Ab, Source.CACHE)))).Bb(Ab);
            obj = v1v.a(' ', "[club" + j3 + '|' + (Bb == null ? "@" + Ab.b : "@" + Bb.Ra()) + ']', str8);
            int length2 = obj.length() - str8.length();
            if (!list4.isEmpty()) {
                List<MsgTextFormatItem> list5 = list4;
                ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                for (MsgTextFormatItem msgTextFormatItem : list5) {
                    arrayList2.add(MsgTextFormatItem.zb(msgTextFormatItem, msgTextFormatItem.b + length2, 0, null, 14));
                }
                msgTextFormat2 = new MsgTextFormat(0, arrayList2, 1, null);
            }
        }
        MsgTextFormat msgTextFormat3 = msgTextFormat2;
        List b = ph30.b(this.j, w2wVar);
        Set<CnvMsgId> set = this.k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : set) {
            Long valueOf = Long.valueOf(((CnvMsgId) obj2).b);
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list6 = (List) entry.getValue();
            ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
            Iterator it = list6.iterator();
            while (it.hasNext()) {
                arrayList4.add(Integer.valueOf(((CnvMsgId) it.next()).c));
            }
            if (arrayList4.isEmpty()) {
                iterable = EmptyList.b;
            } else {
                List D0 = j5g.D0(new x39(1), zik0.g(w2wVar.I0().o().I0(longValue, arrayList4)));
                ArrayList arrayList5 = new ArrayList(c5g.u(D0, 10));
                Iterator it2 = D0.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new NestedMsg((Msg) it2.next(), NestedMsg.Type.FWD));
                }
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    w2wVar.I0().u(new com.vk.im.engine.commands.messages.a(0, (NestedMsg) it3.next(), w2wVar));
                }
                iterable = arrayList5;
            }
            g5g.y(iterable, arrayList3);
        }
        Msg t0 = num2 != null ? w2wVar.I0().o().t0(num2.intValue(), peer3.b) : null;
        if (t0 != null) {
            NestedMsg nestedMsg2 = new NestedMsg(t0, NestedMsg.Type.REPLY);
            w2wVar.I0().u(new com.vk.im.engine.commands.messages.a(0, nestedMsg2, w2wVar));
            nestedMsg = nestedMsg2;
        } else {
            nestedMsg = null;
        }
        ly30 ly30Var3 = (t0 == null || (l2 = t0.v) == null) ? (t0 == null || (l = t0.w) == null) ? this.n : new ly30(Long.valueOf(l.longValue()), null, null, 13) : new ly30(null, Long.valueOf(l2.longValue()), null, 11);
        long j4 = peer3.b;
        String str9 = this.f;
        String str10 = this.g;
        String str11 = this.h;
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(g5g.E(b, AttachGraffiti.class));
        ArrayList arrayList7 = new ArrayList(b);
        arrayList7.removeAll(arrayList6);
        if (obj.length() > 0 && arrayList3.isEmpty() && nestedMsg == null) {
            ly30Var = ly30Var3;
            if (b.size() == 1) {
                z = true;
                if (z) {
                    z2 = z;
                } else {
                    Object Y = j5g.Y(b);
                    z2 = z;
                    AttachVideo attachVideo = Y instanceof AttachVideo ? (AttachVideo) Y : null;
                    if (attachVideo != null && (videoFile = attachVideo.b) != null && videoFile.C2()) {
                        z3 = true;
                        Attach attach2 = (!z3 || (!z2 && ((j5g.Y(b) instanceof AttachWall) || (j5g.Y(b) instanceof AttachChannelMessage)))) ? (Attach) j5g.Y(b) : null;
                        ArrayList u0 = erm0.u0(4000, obj);
                        ArrayList U0 = j5g.U0(arrayList6, 1, 1, true);
                        w2wVar.getConfig().getClass();
                        ArrayList U02 = j5g.U0(arrayList7, 10, 10, true);
                        ArrayList U03 = j5g.U0(arrayList3, 99, 99, true);
                        Attach attach3 = attach2;
                        z4 = Math.max(Math.max(u0.size(), U0.size()), Math.max(U02.size(), U03.size())) != 1 && attach3 == null;
                        ArrayList arrayList8 = new ArrayList();
                        if (z4) {
                            if (u0.isEmpty()) {
                                str3 = null;
                                i3 = 0;
                            } else {
                                i3 = 0;
                                str3 = (String) u0.get(0);
                            }
                            if (!U0.isEmpty()) {
                                list2 = (List) U0.get(i3);
                            } else if (U02.isEmpty()) {
                                str4 = str9;
                                str5 = str3;
                                j = j4;
                                list = null;
                                if (U03.isEmpty()) {
                                    arrayList = arrayList8;
                                    str6 = str11;
                                    list3 = (List) U03.get(i3);
                                    ly30Var2 = ly30Var;
                                    msgRequestStatus = null;
                                    str7 = str4;
                                } else {
                                    arrayList = arrayList8;
                                    str6 = str11;
                                    list3 = null;
                                    str7 = str4;
                                    ly30Var2 = ly30Var;
                                    msgRequestStatus = null;
                                }
                                arrayList.add(ph30.a(w2wVar, j, str5, msgTextFormat3, str7, list, list3, nestedMsg, str10, str6, ly30Var2));
                                w2wVar2 = w2wVar;
                                h0Var = h0Var2;
                            } else {
                                list2 = (List) U02.get(i3);
                            }
                            list = list2;
                            str4 = str9;
                            str5 = str3;
                            j = j4;
                            if (U03.isEmpty()) {
                            }
                            arrayList.add(ph30.a(w2wVar, j, str5, msgTextFormat3, str7, list, list3, nestedMsg, str10, str6, ly30Var2));
                            w2wVar2 = w2wVar;
                            h0Var = h0Var2;
                        } else {
                            arrayList = arrayList8;
                            ArrayList arrayList9 = U03;
                            ly30 ly30Var4 = ly30Var;
                            msgRequestStatus = null;
                            if (attach3 != null) {
                                ArrayList arrayList10 = new ArrayList();
                                MsgFromUser a = ph30.a(w2wVar, j4, null, null, str9, Collections.singletonList(attach3), null, null, str10, str11, ly30Var4);
                                String str12 = (String) j5g.b0(0, u0);
                                if (u0.size() == 1) {
                                    msgFromUser = a;
                                    str = str12;
                                    msgTextFormat = msgTextFormat3;
                                } else {
                                    msgFromUser = a;
                                    str = str12;
                                    msgTextFormat = null;
                                }
                                h0Var = h0Var2;
                                MsgFromUser msgFromUser2 = msgFromUser;
                                MsgFromUser a2 = ph30.a(w2wVar, j4, str, msgTextFormat, str9, null, null, null, str10, str11, ly30Var4);
                                msgFromUser2.Q = Integer.valueOf(a2.b);
                                a2.Q = Integer.valueOf(msgFromUser2.b);
                                arrayList10.add(msgFromUser2);
                                arrayList10.add(a2);
                                int size = u0.size();
                                int i5 = 1;
                                while (i5 < size) {
                                    String str13 = (String) j5g.b0(i5, u0);
                                    if (str13 != null) {
                                        i = i5;
                                        arrayList10.add(ph30.a(w2wVar, j4, str13, null, str9, null, null, null, str10, str11, ly30Var4));
                                    } else {
                                        i = i5;
                                    }
                                    i5 = i + 1;
                                }
                                arrayList.addAll(arrayList10);
                            } else {
                                h0Var = h0Var2;
                                LinkedList linkedList = new LinkedList();
                                if (nestedMsg != null) {
                                    linkedList.add(nestedMsg);
                                }
                                int max = Math.max(u0.size(), U02.size());
                                int i6 = 0;
                                while (i6 < max) {
                                    arrayList.add(ph30.a(w2wVar, j4, (String) j5g.b0(i6, u0), null, str9, (List) j5g.b0(i6, U02), null, (NestedMsg) linkedList.poll(), str10, str11, ly30Var4));
                                    i6++;
                                    U02 = U02;
                                    max = max;
                                    arrayList9 = arrayList9;
                                }
                                ArrayList arrayList11 = arrayList9;
                                Iterator it4 = U0.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add(ph30.a(w2wVar, j4, null, null, str9, (List) it4.next(), null, (NestedMsg) linkedList.poll(), str10, str11, ly30Var4));
                                }
                                Iterator it5 = arrayList11.iterator();
                                while (it5.hasNext()) {
                                    arrayList.add(ph30.a(w2wVar, j4, null, null, null, null, (List) it5.next(), (NestedMsg) linkedList.poll(), str10, str11, ly30Var4));
                                }
                            }
                            w2wVar2 = w2wVar;
                        }
                        List<? extends Msg> list7 = (List) new oj30(arrayList, WeightStrategy.FORCE_LATEST, h0Var).o(w2wVar2);
                        hpm c2 = sn.c(w2wVar2);
                        Peer peer4 = this.b;
                        boolean V = c2.V(peer4.b);
                        for (Msg msg : list7) {
                            if (f(msg)) {
                                MsgFromUser msgFromUser3 = msg instanceof MsgFromUser ? (MsgFromUser) msg : msgRequestStatus;
                                if (msgFromUser3 != 0 && (num = msgFromUser3.Q) != null) {
                                    Msg L = w2wVar2.I0().o().L(num.intValue());
                                    ((MsgFromUser) msg).R = L != null ? Integer.valueOf(L.d) : msgRequestStatus;
                                    w2wVar2.I0().o().o(msg);
                                }
                            }
                            long f = msg instanceof MsgFromUser ? l2l0.f(w2wVar2, (MsgFromUser) msg) : w2wVar2.getConfig().p;
                            Set<Class<? extends Object>> set2 = fz30.a;
                            boolean z7 = msg instanceof MsgFromUser;
                            ny30 ny30Var = new ny30(peer4.b, msg.b, false, false, this.i, false, f, V, !z7 ? false : fz30.b(((MsgFromUser) msg).H), this.m, this.e);
                            if (!this.o) {
                                MsgFromUser msgFromUser4 = z7 ? (MsgFromUser) msg : msgRequestStatus;
                                if (msgFromUser4 != 0 && msgFromUser4.H.size() == 1 && msgFromUser4.Q != null && (attach = (Attach) j5g.a0(msgFromUser4.H)) != null) {
                                    AttachVideo attachVideo2 = attach instanceof AttachVideo ? (AttachVideo) attach : msgRequestStatus;
                                    if (attachVideo2 != 0) {
                                        VideoFile videoFile2 = attachVideo2.b;
                                        if (videoFile2 != null && videoFile2.C2()) {
                                        }
                                    }
                                    if (!(attach instanceof AttachWall)) {
                                        if (attach instanceof AttachChannelMessage) {
                                        }
                                    }
                                }
                                if (!f(msg)) {
                                    w2wVar2.O0().a(ny30Var);
                                }
                            }
                            w2wVar2.O0().d(ny30Var);
                        }
                        c = sn.c(w2wVar2).c(this.b.b);
                        if (c != null || (msgRequestStatus2 = c.I) == null) {
                            msgRequestStatus2 = c != null ? c.F : msgRequestStatus;
                        }
                        InfoBar infoBar = c != null ? c.w : msgRequestStatus;
                        if ((msgRequestStatus2 != null && msgRequestStatus2 == MsgRequestStatus.PENDING) || ((msgRequestStatus2 != null && msgRequestStatus2 == MsgRequestStatus.REJECTED) || (infoBar != 0 && epx.f(infoBar.b, "message_request_banner")))) {
                            w2wVar2.J0(this, new yv30(this.b, MsgRequestStatus.ACCEPTED, false)).await();
                        }
                        peer = this.b;
                        peer.getClass();
                        if (peer.Ab(Peer.Type.GROUP)) {
                            i2 = 1;
                        } else {
                            w2wVar2.O0().b("old msg receive enabled, because user sent message", new nt10(this, 4));
                            i2 = 1;
                            w2wVar2.I0().n().f(peer.d, true, true);
                        }
                        hpm c3 = sn.c(w2wVar2);
                        long j5 = this.b.b;
                        c3.c.a(Long.valueOf(j5), new g54(20), new ddm(c3, j5, i2));
                        hpm e = w2wVar2.I0().b().e();
                        peer2 = this.b;
                        com.vk.im.engine.models.dialogs.b c4 = e.c(peer2.b);
                        conversationCard = c4 == null ? c4.x : msgRequestStatus;
                        str2 = conversationCard == 0 ? conversationCard.h : msgRequestStatus;
                        if (conversationCard != 0 && conversationCard.b == ConversationCard.ConversationBarType.GIFT && str2 != 0) {
                            w2wVar2.L0(this, new xcm(peer2.b, str2));
                        }
                        pbw K = w2wVar2.K();
                        K.d().e(list7);
                        Object obj4 = prp.a;
                        long j6 = this.b.b;
                        String str14 = this.i;
                        synchronized (prp.a) {
                            prp.b = w2wVar2.a().subscribe(new qz(new g53(18), 14), kwg0.b());
                            prp.a(j6, str14, w2wVar2);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        K.s().a(this.b.b, this.e);
                        int size2 = this.j.size();
                        w2wVar2.getConfig().getClass();
                        if (size2 > 10) {
                            K.d().a(this.b.b, this.j);
                        }
                        w2wVar2.S0().o(this, "xsna.pz30", gkx0.e, 1);
                        w2wVar2.S0().v(this.b.b, w2wVar2);
                        return list7;
                    }
                }
                z3 = false;
                if (z3) {
                }
                ArrayList u02 = erm0.u0(4000, obj);
                ArrayList U04 = j5g.U0(arrayList6, 1, 1, true);
                w2wVar.getConfig().getClass();
                ArrayList U022 = j5g.U0(arrayList7, 10, 10, true);
                ArrayList U032 = j5g.U0(arrayList3, 99, 99, true);
                Attach attach32 = attach2;
                if (Math.max(Math.max(u02.size(), U04.size()), Math.max(U022.size(), U032.size())) != 1) {
                }
                ArrayList arrayList82 = new ArrayList();
                if (z4) {
                }
                List<? extends Msg> list72 = (List) new oj30(arrayList, WeightStrategy.FORCE_LATEST, h0Var).o(w2wVar2);
                hpm c22 = sn.c(w2wVar2);
                Peer peer42 = this.b;
                boolean V2 = c22.V(peer42.b);
                while (r1.hasNext()) {
                }
                c = sn.c(w2wVar2).c(this.b.b);
                if (c != null) {
                }
                if (c != null) {
                }
                if (c != null) {
                }
                if (msgRequestStatus2 != null) {
                    w2wVar2.J0(this, new yv30(this.b, MsgRequestStatus.ACCEPTED, false)).await();
                    peer = this.b;
                    peer.getClass();
                    if (peer.Ab(Peer.Type.GROUP)) {
                    }
                    hpm c32 = sn.c(w2wVar2);
                    long j52 = this.b.b;
                    c32.c.a(Long.valueOf(j52), new g54(20), new ddm(c32, j52, i2));
                    hpm e2 = w2wVar2.I0().b().e();
                    peer2 = this.b;
                    com.vk.im.engine.models.dialogs.b c42 = e2.c(peer2.b);
                    if (c42 == null) {
                    }
                    if (conversationCard == 0) {
                    }
                    if (conversationCard != 0) {
                        w2wVar2.L0(this, new xcm(peer2.b, str2));
                    }
                    pbw K2 = w2wVar2.K();
                    K2.d().e(list72);
                    Object obj42 = prp.a;
                    long j62 = this.b.b;
                    String str142 = this.i;
                    synchronized (prp.a) {
                    }
                }
                w2wVar2.J0(this, new yv30(this.b, MsgRequestStatus.ACCEPTED, false)).await();
                peer = this.b;
                peer.getClass();
                if (peer.Ab(Peer.Type.GROUP)) {
                }
                hpm c322 = sn.c(w2wVar2);
                long j522 = this.b.b;
                c322.c.a(Long.valueOf(j522), new g54(20), new ddm(c322, j522, i2));
                hpm e22 = w2wVar2.I0().b().e();
                peer2 = this.b;
                com.vk.im.engine.models.dialogs.b c422 = e22.c(peer2.b);
                if (c422 == null) {
                }
                if (conversationCard == 0) {
                }
                if (conversationCard != 0) {
                }
                pbw K22 = w2wVar2.K();
                K22.d().e(list72);
                Object obj422 = prp.a;
                long j622 = this.b.b;
                String str1422 = this.i;
                synchronized (prp.a) {
                }
            }
        } else {
            ly30Var = ly30Var3;
        }
        z = false;
        if (z) {
        }
        z3 = false;
        if (z3) {
        }
        ArrayList u022 = erm0.u0(4000, obj);
        ArrayList U042 = j5g.U0(arrayList6, 1, 1, true);
        w2wVar.getConfig().getClass();
        ArrayList U0222 = j5g.U0(arrayList7, 10, 10, true);
        ArrayList U0322 = j5g.U0(arrayList3, 99, 99, true);
        Attach attach322 = attach2;
        if (Math.max(Math.max(u022.size(), U042.size()), Math.max(U0222.size(), U0322.size())) != 1) {
        }
        ArrayList arrayList822 = new ArrayList();
        if (z4) {
        }
        List<? extends Msg> list722 = (List) new oj30(arrayList, WeightStrategy.FORCE_LATEST, h0Var).o(w2wVar2);
        hpm c222 = sn.c(w2wVar2);
        Peer peer422 = this.b;
        boolean V22 = c222.V(peer422.b);
        while (r1.hasNext()) {
        }
        c = sn.c(w2wVar2).c(this.b.b);
        if (c != null) {
        }
        if (c != null) {
        }
        if (c != null) {
        }
        if (msgRequestStatus2 != null) {
        }
        w2wVar2.J0(this, new yv30(this.b, MsgRequestStatus.ACCEPTED, false)).await();
        peer = this.b;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
        }
        hpm c3222 = sn.c(w2wVar2);
        long j5222 = this.b.b;
        c3222.c.a(Long.valueOf(j5222), new g54(20), new ddm(c3222, j5222, i2));
        hpm e222 = w2wVar2.I0().b().e();
        peer2 = this.b;
        com.vk.im.engine.models.dialogs.b c4222 = e222.c(peer2.b);
        if (c4222 == null) {
        }
        if (conversationCard == 0) {
        }
        if (conversationCard != 0) {
        }
        pbw K222 = w2wVar2.K();
        K222.d().e(list722);
        Object obj4222 = prp.a;
        long j6222 = this.b.b;
        String str14222 = this.i;
        synchronized (prp.a) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz30)) {
            return false;
        }
        pz30 pz30Var = (pz30) obj;
        return epx.f(this.b, pz30Var.b) && epx.f(this.c, pz30Var.c) && epx.f(this.d, pz30Var.d) && epx.f(this.e, pz30Var.e) && epx.f(this.f, pz30Var.f) && epx.f(this.g, pz30Var.g) && epx.f(this.h, pz30Var.h) && epx.f(this.i, pz30Var.i) && epx.f(this.j, pz30Var.j) && epx.f(this.k, pz30Var.k) && epx.f(this.l, pz30Var.l) && epx.f(this.m, pz30Var.m) && epx.f(this.n, pz30Var.n) && this.o == pz30Var.o;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = fw3.b(fw3.a(urd0.a(urd0.a(urd0.a(urd0.a((this.e.hashCode() + ((this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Integer num = this.l;
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + urd0.a((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.m)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSendViaBgCmd (peer=");
        sb.append(this.b);
        sb.append(", text='");
        BuildInfo.Client client = BuildInfo.a;
        sb.append(BuildInfo.d(this.c));
        sb.append("', textFormat = '");
        sb.append(BuildInfo.d(this.d.toString()));
        sb.append("', source=");
        sb.append(this.e);
        sb.append(", payload='");
        sb.append(this.f);
        sb.append("', ref='");
        sb.append(this.g);
        sb.append("', refSource='");
        sb.append(this.h);
        sb.append("', entryPoint='");
        sb.append(this.i);
        sb.append("', attachList=");
        sb.append(this.j);
        sb.append(", fwdMsgIds=");
        sb.append(this.k);
        sb.append(", replyMsgCnvId=");
        sb.append(this.l);
        sb.append(", trackCode='");
        sb.append(this.m);
        sb.append("', msgSendConfig=");
        sb.append(this.n);
        sb.append(", awaitJobExecution=");
        return defpackage.q0.a(sb, this.o, ')');
    }
}
