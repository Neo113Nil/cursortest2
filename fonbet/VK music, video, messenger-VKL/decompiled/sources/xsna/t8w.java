package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: ImItemsUtils.kt */
/* loaded from: classes2.dex */
public final class t8w {

    /* compiled from: ImItemsUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImItemType.values().length];
            try {
                iArr[ImItemType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImItemType.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final d5w a(s8v s8vVar, w2w w2wVar, Object obj) {
        t8v t8vVar = s8vVar.a;
        el3<b5w> el3Var = t8vVar.d;
        el3 el3Var2 = new el3(0);
        int i = el3Var.d;
        el3Var2.c(el3Var2.d + i);
        if (el3Var2.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                el3Var2.add(el3Var.c[i2]);
            }
        } else if (i > 0) {
            jw5.i(0, i, 6, el3Var.b, el3Var2.b);
            jw5.k(el3Var.c, 0, el3Var2.c, i, 6);
            if (el3Var2.d != 0) {
                throw new ConcurrentModificationException();
            }
            el3Var2.d = i;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Triple triple = (Triple) w2wVar.I0().c(new s8w(w2wVar, s8vVar, obj, el3Var2, linkedHashMap, 0));
        wpp wppVar = (wpp) triple.d();
        wpp wppVar2 = (wpp) triple.g();
        com.vk.im.engine.models.im_item.a aVar = (com.vk.im.engine.models.im_item.a) triple.h();
        for (Map.Entry entry : t8vVar.c.entrySet()) {
            linkedHashMap.put(new b5w(((Number) entry.getKey()).longValue(), ImItemType.CHANNEL), entry.getValue());
        }
        ArrayList arrayList2 = t8vVar.a;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            v7w v7wVar = (v7w) arrayList2.get(i3);
            b5w b5wVar = v7wVar.a;
            x7w x7wVar = v7wVar.b;
            int i4 = a.$EnumSwitchMapping$0[b5wVar.b.ordinal()];
            if (i4 == 1) {
                Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(b5wVar.a));
                if (dialog != null) {
                    dialog.cd(x7wVar);
                    arrayList.add(dialog);
                }
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Channel channel = (Channel) wppVar2.c.get(Long.valueOf(b5wVar.a));
                if (channel != null) {
                    channel.P = x7wVar;
                    arrayList.add(channel);
                }
            }
        }
        u8v u8vVar = s8vVar.b;
        return new d5w(arrayList, linkedHashMap, el3Var2, u8vVar.a, u8vVar.c, u8vVar.b, u8vVar.d, aVar, false);
    }

    public static final t8v b(w2w w2wVar, List<v7w> list, c2a0 c2a0Var) {
        Set set;
        Set set2;
        Pair pair;
        int i = c2a0Var.a;
        ArrayList arrayList = new ArrayList(list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            int i3 = 2;
            int i4 = 1;
            if (i2 >= size) {
                Pair pair2 = new Pair(linkedHashSet, linkedHashSet2);
                Set set3 = (Set) pair2.d();
                Set set4 = (Set) pair2.g();
                Map<Long, lj30> R = w2wVar.I0().o().R(set3);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Long, lj30> entry : R.entrySet()) {
                    if (!entry.getValue().j) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                Map<Long, Msg> t = w2wVar.I0().y().t(set4);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : ((HashMap) t).entrySet()) {
                    if (!((Msg) entry2.getValue()).r) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v7w v7wVar = (v7w) it.next();
                    if (v7wVar.a.b == ImItemType.DIALOG && !v7wVar.c && !v7wVar.d && !com.vk.im.engine.models.im_item.b.b(v7wVar.b)) {
                        it.remove();
                    }
                }
                el3 el3Var = new el3(0);
                int size2 = arrayList.size();
                int i5 = 0;
                while (i5 < size2) {
                    v7w v7wVar2 = (v7w) arrayList.get(i5);
                    b5w b5wVar = v7wVar2.a;
                    int i6 = v7wVar2.e;
                    int i7 = a.$EnumSwitchMapping$0[b5wVar.b.ordinal()];
                    if (i7 == i4) {
                        set = set3;
                        set2 = set4;
                        boolean z = i6 != i;
                        lj30 lj30Var = (lj30) linkedHashMap2.get(Long.valueOf(b5wVar.a));
                        boolean z2 = (lj30Var == null || lj30Var.l == i) ? false : true;
                        pair = new Pair(Boolean.valueOf(z || z2), zy60.c("isDialog=", ", isMsg=", z, z2));
                    } else {
                        if (i7 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int intValue = c2a0Var.c.invoke(Long.valueOf(b5wVar.a)).intValue();
                        boolean z3 = i6 != intValue;
                        set = set3;
                        set2 = set4;
                        Msg msg = (Msg) linkedHashMap4.get(Long.valueOf(b5wVar.a));
                        boolean z4 = (msg == null || msg.u == intValue) ? false : true;
                        pair = new Pair(Boolean.valueOf(z3 || z4), zy60.c("isChannel=", ", isMsg=", z3, z4));
                    }
                    boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                    String str = (String) pair.g();
                    if (booleanValue) {
                        b5wVar.c = str;
                        el3Var.add(b5wVar);
                    }
                    i5++;
                    set3 = set;
                    set4 = set2;
                    i3 = 2;
                    i4 = 1;
                }
                return new t8v(arrayList, linkedHashMap2, linkedHashMap4, el3Var, set3, set4);
            }
            b5w b5wVar2 = ((v7w) arrayList.get(i2)).a;
            ImItemType imItemType = b5wVar2.b;
            long j = b5wVar2.a;
            int i8 = a.$EnumSwitchMapping$0[imItemType.ordinal()];
            if (i8 == 1) {
                linkedHashSet.add(Long.valueOf(j));
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashSet2.add(Long.valueOf(j));
            }
            i2++;
        }
    }
}
