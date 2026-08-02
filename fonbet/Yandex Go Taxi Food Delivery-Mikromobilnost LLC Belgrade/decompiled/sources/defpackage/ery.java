package defpackage;

import com.google.crypto.tink.shaded.protobuf.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ery extends gry {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List list = (List) y321.c.i(j, obj);
        if (list.isEmpty()) {
            List lVar = list instanceof h7y ? new l(i) : ((list instanceof i2f0) && (list instanceof nqw)) ? ((nqw) list).w(i) : new ArrayList(i);
            y321.p(j, obj, lVar);
            return lVar;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            y321.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof k221) {
            k221 k221Var = (k221) list;
            l lVar2 = new l(k221Var.size() + i);
            lVar2.addAll(k221Var);
            y321.p(j, obj, lVar2);
            return lVar2;
        }
        if ((list instanceof i2f0) && (list instanceof nqw)) {
            nqw nqwVar = (nqw) list;
            if (!((o9) nqwVar).a) {
                nqw w = nqwVar.w(list.size() + i);
                y321.p(j, obj, w);
                return w;
            }
        }
        return list;
    }

    @Override // defpackage.gry
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) y321.c.i(j, obj);
        if (list instanceof h7y) {
            unmodifiableList = ((h7y) list).L0();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof i2f0) && (list instanceof nqw)) {
                o9 o9Var = (o9) ((nqw) list);
                if (o9Var.a) {
                    o9Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        y321.p(j, obj, unmodifiableList);
    }

    @Override // defpackage.gry
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) y321.c.i(j, obj2);
        List d = d(j, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        y321.p(j, obj, list);
    }

    @Override // defpackage.gry
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
