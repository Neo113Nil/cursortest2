package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class pgg0 {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(kgg0.d, Range.create(2160, 4319));
        hashMap.put(kgg0.c, Range.create(1080, 1439));
        hashMap.put(kgg0.b, Range.create(720, 1079));
        hashMap.put(kgg0.a, Range.create(241, Integer.valueOf(sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD)));
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        hashMap2.put(0, x83.a);
        hashMap2.put(1, x83.c);
    }

    public pgg0(List list, HashMap hashMap) {
        HashMap hashMap2;
        Integer num;
        kgg0 kgg0Var;
        HashMap hashMap3 = b;
        Iterator it = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap2 = c;
            if (!hasNext) {
                break;
            }
            kgg0 kgg0Var2 = (kgg0) it.next();
            this.a.put(new z74(kgg0Var2, -1), new ArrayList());
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                this.a.put(new z74(kgg0Var2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list2 = (List) this.a.get(new z74((kgg0) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = hashMap3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    kgg0Var = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    kgg0Var = (kgg0) entry2.getKey();
                    break;
                }
            }
            if (kgg0Var != null) {
                Iterator it5 = hashMap2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (x83.a(size, (Rational) entry3.getValue(), vjs0.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.a.get(new z74(kgg0Var, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.a.entrySet()) {
            Size size2 = (Size) hashMap.get(((z74) entry4.getKey()).a);
            if (size2 != null) {
                Size size3 = vjs0.a;
                Collections.sort((List) entry4.getValue(), new af3(size2.getHeight() * size2.getWidth(), 1));
            }
        }
    }
}
