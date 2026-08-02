package xsna;

import android.os.SystemClock;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.pe20;
import xsna.pum;

/* compiled from: DialogsHistoryGetByNetworkHelper.kt */
/* loaded from: classes2.dex */
public final class krm {
    public static final krm a = new krm();

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    public final DialogsHistory a(final w2w w2wVar, drm drmVar, final String str) {
        int i;
        Ref$IntRef ref$IntRef;
        pe20.b bVar;
        List<com.vk.im.engine.models.dialogs.a> list;
        Object obj;
        vjm vjmVar;
        gkx0 gkx0Var;
        final boolean z;
        ArrayList arrayList;
        DialogsHistory dialogsHistory;
        String str2;
        String str3;
        final drm drmVar2 = drmVar;
        pum pumVar = drmVar2.b;
        Object obj2 = drmVar2.f;
        int i2 = drmVar2.c;
        HashMap hashMap = new HashMap(5);
        long uptimeMillis = SystemClock.uptimeMillis();
        w2wVar.c1(true, LongPollType.MESSAGES);
        s3q0 s3q0Var = s3q0.a;
        hashMap.put("long_poll", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        gkx0 gkx0Var2 = drmVar2.a;
        Pair<Integer, Integer> pair = lmm.a;
        int j = (int) xo9.j(gkx0Var2.b, lmm.a);
        long j2 = gkx0Var2.b;
        int j3 = (int) xo9.j(j2, lmm.c);
        vjm vjmVar2 = new vjm(j, j3);
        int max = Math.max(2, i2);
        final boolean F = w2wVar.getExperiments().F();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (j3 == 0) {
            ref$IntRef = ref$IntRef2;
            bVar = new pe20.b(EmptyList.b, jgp.b, new ProfilesSimpleInfo());
            i = max;
        } else {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            final pe20 pe20Var = new pe20(vjmVar2, drmVar2.b, max, w2wVar.Q0(), drmVar2.e);
            i = max;
            ref$IntRef = ref$IntRef2;
            izs izsVar = new izs() { // from class: xsna.irm
                @Override // xsna.izs
                public final Object invoke(Object obj3) {
                    int intValue = ((Integer) obj3).intValue();
                    w2w w2wVar2 = w2w.this;
                    yz2 y = w2wVar2.K().y();
                    int a2 = cq.a(w2wVar2);
                    StringBuilder b = ho8.b(str, " -> DialogsHistoryGetByNetworkHelper since ");
                    drm drmVar3 = drmVar2;
                    b.append(drmVar3.a.b);
                    b.append(" mode ");
                    pum pumVar2 = drmVar3.b;
                    b.append(pumVar2);
                    b.append(" isToggleOn ");
                    b.append(F);
                    String sb = b.toString();
                    pum.b bVar2 = pumVar2 instanceof pum.b ? (pum.b) pumVar2 : null;
                    y.a(intValue, a2, bVar2 != null ? bVar2.a : 0, sb);
                    return (pe20.b) bz2.c(pe20Var, "MessagesGetConversationsApiCmd");
                }
            };
            drmVar2 = drmVar2;
            Pair n = aqw.n(w2wVar, izsVar);
            int intValue = ((Number) n.d()).intValue();
            bVar = (pe20.b) n.g();
            ref$IntRef.element = intValue;
            hashMap.put("conversation_history", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
        }
        f900.a.a("DialogsHistoryGetByNetworkHelper load tryCnt = " + ref$IntRef.element + " pts= " + w2wVar.I0().system().q() + " time= " + System.currentTimeMillis());
        List<com.vk.im.engine.models.dialogs.a> list2 = bVar.a;
        long j4 = j2;
        final ?? r8 = bVar.b;
        List<com.vk.im.engine.models.dialogs.a> list3 = list2;
        Iterator<T> it = list3.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                vjm vjmVar3 = ((com.vk.im.engine.models.dialogs.a) next).c;
                while (true) {
                    Object next2 = it.next();
                    list = list2;
                    vjm vjmVar4 = ((com.vk.im.engine.models.dialogs.a) next2).c;
                    vjmVar3.getClass();
                    if (vjmVar3.compareTo(vjmVar4) > 0) {
                        vjmVar3 = vjmVar4;
                        next = next2;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    vjmVar3 = vjmVar3;
                    bVar = bVar;
                    vjmVar2 = vjmVar2;
                    j4 = j4;
                    drmVar2 = drmVar;
                    list2 = list;
                }
            } else {
                list = list2;
            }
            obj = next;
        } else {
            obj = null;
            list = list2;
        }
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) obj;
        if (aVar == null || (vjmVar = aVar.c) == null) {
            vjmVar = vjm.l;
        }
        final ProfilesSimpleInfo profilesSimpleInfo = bVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list3) {
            pe20.b bVar2 = bVar;
            vjm vjmVar5 = vjmVar;
            com.vk.im.engine.models.dialogs.a aVar2 = (com.vk.im.engine.models.dialogs.a) obj3;
            long j5 = j4;
            if (aVar2.I && aVar2.c.c == 0) {
                arrayList2.add(obj3);
            }
            vjmVar = vjmVar5;
            bVar = bVar2;
            j4 = j5;
        }
        pe20.b bVar3 = bVar;
        final vjm vjmVar6 = vjmVar;
        long j6 = j4;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it2.next()).a));
        }
        if (!arrayList3.isEmpty()) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Unexpected scenario: got stale dialogs " + arrayList3));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list3) {
            if (((com.vk.im.engine.models.dialogs.a) obj4).c.i()) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it3.next()).a));
        }
        if (!arrayList5.isEmpty()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"DialogMissedIssue", "DialogNetworkHelper: pinned dialogs " + arrayList5 + ' ' + drmVar2});
            }
        }
        final boolean equals = vjmVar2.equals(vjm.m);
        if (list.size() < i) {
            gkx0Var = gkx0Var2;
            z = true;
        } else {
            gkx0Var = gkx0Var2;
            z = false;
        }
        long uptimeMillis3 = SystemClock.uptimeMillis();
        gkx0 gkx0Var3 = gkx0Var;
        final vjm vjmVar7 = vjmVar2;
        final List<com.vk.im.engine.models.dialogs.a> list4 = list;
        w2wVar.I0().u(new izs() { // from class: xsna.jrm
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
            @Override // xsna.izs
            public final Object invoke(Object obj5) {
                pum pumVar2 = drmVar2.b;
                List list5 = list4;
                mrm mrmVar = new mrm(list5, vjmVar7, vjmVar6, equals, z, pumVar2);
                w2w w2wVar2 = w2w.this;
                mrmVar.o(w2wVar2);
                Iterator it4 = list5.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    com.vk.im.engine.models.dialogs.a aVar3 = (com.vk.im.engine.models.dialogs.a) it4.next();
                    Msg msg = (Msg) r8.get(Long.valueOf(aVar3.a));
                    boolean z2 = msg == null;
                    long j7 = aVar3.a;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    new com.vk.im.engine.internal.merge.messages.b(Peer.a.b(j7), msg, z2, true, 48).o(w2wVar2);
                }
                ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
                if (!profilesSimpleInfo2.isEmpty()) {
                    xuo0.a.getClass();
                    new h1e0(profilesSimpleInfo2, xuo0.a(), true).o(w2wVar2);
                }
                return s3q0.a;
            }
        });
        s3q0 s3q0Var2 = s3q0.a;
        hashMap.put(X3.a.k, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3));
        com.vk.metrics.eventtracking.b bVar4 = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("CRUCIAL.IM.DIALOGS_REFRESH");
        b.b("refresh_limit", Integer.valueOf(i2));
        for (Map.Entry entry : hashMap.entrySet()) {
            b.b((String) entry.getKey(), (Number) entry.getValue());
        }
        bVar4.k(b.e());
        DialogsHistory dialogsHistory2 = (DialogsHistory) w2wVar.I0().c(new bi0(15, w2wVar, drmVar2));
        ArrayList r = dialogsHistory2.r();
        List<com.vk.im.engine.models.dialogs.a> list5 = bVar3.a;
        ArrayList arrayList6 = new ArrayList(c5g.u(list5, 10));
        Iterator<T> it4 = list5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it4.next()).a));
        }
        List t0 = j5g.t0(r, arrayList6);
        String str4 = ", servIdsSize= ";
        String str5 = " cachedIdsSize= ";
        if (pumVar instanceof pum.b) {
            w2wVar.K().y().a(-1, cq.a(w2wVar), ((pum.b) pumVar).a, "DialogsHistoryGetByNetworkHelper since " + j6 + " mode " + pumVar + " missiedIds= " + t0 + " expSize= " + dialogsHistory2.d().size() + " cachedIdsSize= " + r.size() + ", servIdsSize= " + arrayList6.size());
            return dialogsHistory2;
        }
        if (list4.isEmpty()) {
            w2wVar.S0().j(obj2);
            arrayList = arrayList6;
            dialogsHistory = dialogsHistory2;
            str2 = ", servIdsSize= ";
            str3 = " cachedIdsSize= ";
        } else {
            arrayList = arrayList6;
            dialogsHistory = dialogsHistory2;
            w2wVar.S0().o(obj2 == null ? this : obj2, obj2, equals ? gkx0.e : gkx0Var3, list4.size());
            bzp S0 = w2wVar.S0();
            List<com.vk.im.engine.models.dialogs.a> list6 = list4;
            ArrayList arrayList7 = new ArrayList(c5g.u(list6, 10));
            Iterator<T> it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it5.next()).a));
                str5 = str5;
                str4 = str4;
            }
            str2 = str4;
            str3 = str5;
            S0.n(obj2, arrayList7);
            w2wVar.S0().p(obj2, profilesSimpleInfo);
            w2wVar.S0().G(obj2, r8.values());
        }
        w2wVar.K().y().a(-1, cq.a(w2wVar), 0, "DialogsHistoryGetByNetworkHelper since " + j6 + " mode " + pumVar + " missiedIds= " + t0 + " expSize= " + dialogsHistory.d().size() + str3 + r.size() + str2 + arrayList.size());
        return dialogsHistory;
    }
}
