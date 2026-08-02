package xsna;

import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.messages.MessagesType;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Pair;
import xsna.uz30;

/* compiled from: WallPostStatisticHelper.kt */
/* loaded from: classes2.dex */
public final class z9x0 {
    public final uz30 a;
    public final MessagesType b;
    public final a1w c;
    public final ChannelStubAttachesReporter d;
    public final HashMap<String, Long> e = new HashMap<>();
    public final HashSet<String> f = new HashSet<>();
    public final HashMap<String, String> g = new HashMap<>();
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashSet i = new LinkedHashSet();

    public z9x0(uz30 uz30Var, MessagesType messagesType, a1w a1wVar, ChannelStubAttachesReporter channelStubAttachesReporter) {
        this.a = uz30Var;
        this.b = messagesType;
        this.c = a1wVar;
        this.d = channelStubAttachesReporter;
    }

    public static String c(AttachWall attachWall) {
        StringBuilder sb = new StringBuilder();
        sb.append(attachWall.b);
        sb.append(attachWall.e);
        sb.append('_');
        sb.append(attachWall.p);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = linkedHashSet2 instanceof List;
        uz30 uz30Var = this.a;
        HashMap<String, String> hashMap = this.g;
        HashMap<String, Long> hashMap2 = this.e;
        if (z && (linkedHashSet2 instanceof RandomAccess)) {
            List list = (List) linkedHashSet2;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                Long l = hashMap2.get(str);
                String str2 = hashMap.get(str);
                if (l != null && str2 != null) {
                    uz30Var.b(new uz30.a(str2, l.longValue(), currentTimeMillis));
                }
                hashMap2.remove(str);
            }
        } else {
            Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                Long l2 = hashMap2.get(str3);
                String str4 = hashMap.get(str3);
                if (l2 != null && str4 != null) {
                    uz30Var.b(new uz30.a(str4, l2.longValue(), currentTimeMillis));
                }
                hashMap2.remove(str3);
            }
        }
        if (!(linkedHashSet instanceof List) || !(linkedHashSet instanceof RandomAccess)) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                if (hashMap2.get(str5) == null) {
                    hashMap2.put(str5, Long.valueOf(currentTimeMillis));
                }
            }
            return;
        }
        List list2 = (List) linkedHashSet;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str6 = (String) list2.get(i2);
            if (hashMap2.get(str6) == null) {
                hashMap2.put(str6, Long.valueOf(currentTimeMillis));
            }
        }
    }

    public final void b(ArrayList arrayList) {
        HashSet<String> hashSet;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.f;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            AttachWall attachWall = (AttachWall) next;
            if (!attachWall.q && !hashSet.contains(c(attachWall))) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            hashSet.add(c((AttachWall) it2.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (((AttachWall) next2).b == 0) {
                arrayList3.add(next2);
            } else {
                arrayList4.add(next2);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        List list = (List) pair.d();
        boolean isEmpty = ((List) pair.g()).isEmpty();
        a1w a1wVar = this.c;
        if (!isEmpty) {
            a1wVar.D(this, new s7q0(arrayList2, this.b));
        }
        if (list.isEmpty()) {
            return;
        }
        List<AttachWall> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (AttachWall attachWall2 : list2) {
            Pair pair2 = new Pair(Long.valueOf(attachWall2.d.b), Integer.valueOf(attachWall2.e));
            linkedHashMap.put(pair2.i(), pair2.j());
        }
        a1wVar.D(this, new y7q0(linkedHashMap));
    }
}
