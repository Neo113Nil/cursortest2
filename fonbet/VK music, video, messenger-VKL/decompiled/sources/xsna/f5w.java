package xsna;

import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImItemHistoryGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class f5w extends le6<m5w> {
    public final g5w b;

    /* compiled from: ImItemHistoryGetByIdCmd.kt */
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

    public f5w(g5w g5wVar) {
        this.b = g5wVar;
    }

    @Override // xsna.le6
    public final m5w e(w2w w2wVar) {
        a5w a5wVar;
        x7w x7wVar;
        g5w g5wVar = this.b;
        List<a5w> list = g5wVar.b.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a5w) it.next()).t3());
        }
        Set S0 = j5g.S0(arrayList);
        List<a5w> list2 = g5wVar.b.a;
        ListIterator<a5w> listIterator = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                a5wVar = null;
                break;
            }
            a5wVar = listIterator.previous();
            if (a5wVar.M8() == ImItemType.DIALOG) {
                break;
            }
        }
        a5w a5wVar2 = a5wVar;
        if (a5wVar2 == null || (x7wVar = a5wVar2.y9()) == null) {
            x7wVar = x7w.f;
        }
        Map<b5w, sew> c = w2wVar.I0().j().c(g5wVar.a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<b5w, sew> entry : c.entrySet()) {
            int i = a.$EnumSwitchMapping$0[entry.getValue().a.b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!S0.contains(entry.getKey()) && entry.getValue().b.compareTo(x7wVar) < 0) {
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        Set keySet = linkedHashMap.keySet();
        if (keySet.isEmpty()) {
            return (m5w) m5w.c.getValue();
        }
        d5w a2 = t8w.a((s8v) w2wVar.I0().c(new il7(w2wVar, this, keySet)), w2wVar, this);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemHistoryGetByIdCmd " + a2});
        }
        List<a5w> list3 = a2.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((a5w) it2.next()).t3());
        }
        m5w m5wVar = new m5w(a2, izi0.g(keySet, j5g.S0(arrayList2)));
        L.d(new fg1(12, keySet, m5wVar));
        return m5wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5w) && epx.f(this.b, ((f5w) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ImItemHistoryGetByIdCmd(args=" + this.b + ')';
    }
}
