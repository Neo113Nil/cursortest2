package xsna;

import com.vk.channels.api.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ImChannelsHistoryMerger.kt */
/* loaded from: classes2.dex */
public final class yyv {
    public static qfb a(qfb qfbVar, qfb qfbVar2, aeb aebVar) {
        List list;
        List list2;
        ArrayList arrayList = qfbVar2.f;
        aeb aebVar2 = arrayList.isEmpty() ? aeb.d : ((Channel) j5g.i0(arrayList)).s;
        ArrayList arrayList2 = qfbVar.f;
        if (!arrayList2.isEmpty()) {
            aeb aebVar3 = ((Channel) j5g.Y(arrayList2)).s;
            aeb aebVar4 = ((Channel) j5g.i0(arrayList2)).s;
            if (aebVar.compareTo(aebVar3) < 0 || aebVar2.compareTo(aebVar4) > 0) {
                if (!arrayList2.isEmpty()) {
                    aeb aebVar5 = ((Channel) j5g.Y(arrayList2)).s;
                    aeb aebVar6 = ((Channel) j5g.i0(arrayList2)).s;
                    if (aebVar.compareTo(aebVar5) >= 0 && aebVar2.compareTo(aebVar6) > 0) {
                        if (!qfbVar2.b || !qfbVar2.c) {
                            return qfbVar2.r();
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Channel channel = (Channel) next;
                            if (channel.s.compareTo(aebVar2) < 0 && !qfbVar2.l(channel.b)) {
                                arrayList3.add(next);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            return qfbVar2.r();
                        }
                        qfb r = qfbVar2.r();
                        r.f.addAll(arrayList3);
                        c(r, qfbVar, arrayList3);
                        b(r, qfbVar, arrayList3);
                        r.b = qfbVar.b;
                        r.c = qfbVar.c;
                        return r;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    aeb aebVar7 = ((Channel) j5g.Y(arrayList2)).s;
                    aeb aebVar8 = ((Channel) j5g.i0(arrayList2)).s;
                    if (aebVar.compareTo(aebVar7) < 0 && aebVar2.compareTo(aebVar8) <= 0) {
                        if (!qfbVar2.d || !qfbVar2.e) {
                            return qfbVar2.r();
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            Channel channel2 = (Channel) next2;
                            if (channel2.s.compareTo(aebVar) > 0 && !qfbVar2.l(channel2.b)) {
                                arrayList4.add(next2);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return qfbVar2.r();
                        }
                        qfb r2 = qfbVar2.r();
                        r2.f.addAll(0, arrayList4);
                        c(r2, qfbVar, arrayList4);
                        b(r2, qfbVar, arrayList4);
                        r2.d = qfbVar.d;
                        r2.e = qfbVar.e;
                        return r2;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    aeb aebVar9 = ((Channel) j5g.Y(arrayList2)).s;
                    aeb aebVar10 = ((Channel) j5g.i0(arrayList2)).s;
                    if (aebVar.compareTo(aebVar9) < 0 && aebVar2.compareTo(aebVar10) > 0) {
                        boolean z = true;
                        boolean z2 = (qfbVar2.d && qfbVar2.e) ? false : true;
                        boolean z3 = (qfbVar2.b && qfbVar2.c) ? false : true;
                        if (z3 && z2) {
                            return qfbVar2.r();
                        }
                        if (z2) {
                            list = EmptyList.b;
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                Channel channel3 = (Channel) next3;
                                if (channel3.s.compareTo(aebVar) > 0 && !qfbVar2.l(channel3.b)) {
                                    arrayList5.add(next3);
                                }
                            }
                            list = arrayList5;
                        }
                        if (z3) {
                            list2 = EmptyList.b;
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next4 = it4.next();
                                Channel channel4 = (Channel) next4;
                                if (channel4.s.compareTo(aebVar2) < 0 && !qfbVar2.l(channel4.b)) {
                                    arrayList6.add(next4);
                                }
                            }
                            list2 = arrayList6;
                        }
                        boolean z4 = z2 || list.isEmpty();
                        if (!z3 && !list2.isEmpty()) {
                            z = false;
                        }
                        qfb r3 = qfbVar2.r();
                        ArrayList arrayList7 = r3.f;
                        arrayList7.addAll(0, list);
                        arrayList7.addAll(list2);
                        c(r3, qfbVar, list);
                        c(r3, qfbVar, list2);
                        b(r3, qfbVar, list);
                        b(r3, qfbVar, list2);
                        if (z4) {
                            r3.d = qfbVar2.d;
                            r3.e = qfbVar2.e;
                        } else {
                            r3.d = qfbVar.d;
                            r3.e = qfbVar.e;
                        }
                        if (z) {
                            r3.b = qfbVar2.b;
                            r3.c = qfbVar2.c;
                            return r3;
                        }
                        r3.b = qfbVar.b;
                        r3.c = qfbVar.c;
                        return r3;
                    }
                }
                return qfbVar2.r();
            }
        }
        return qfbVar2.r();
    }

    public static void b(qfb qfbVar, qfb qfbVar2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Channel channel = (Channel) it.next();
            if (qfbVar2.d().contains(Long.valueOf(channel.b))) {
                qfbVar.d().add(Long.valueOf(channel.b));
            }
        }
    }

    public static void c(qfb qfbVar, qfb qfbVar2, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Channel) it.next()).b));
        }
        LinkedHashMap linkedHashMap = qfbVar.g;
        LinkedHashMap linkedHashMap2 = qfbVar2.g;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.putAll(linkedHashMap3);
    }
}
