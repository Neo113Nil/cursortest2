package defpackage;

import com.yandex.go.superapp.orders.known.KnownOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class cd80 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public /* synthetic */ cd80(String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.w = str3;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        KnownOrder knownOrder = (KnownOrder) obj2;
                        if (!jl40.l(knownOrder.a, str2) || !jl40.l(knownOrder.b, str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    return Optional.of(a.o0(list, new KnownOrder(str2, str, this.w, 8)));
                }
                hst hstVar = jst.e;
                new Throwable(unr0.p("Order ", str2, " for service ", str, " is already known"));
                hstVar.getClass();
                return Optional.empty();
            default:
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        KnownOrder knownOrder2 = (KnownOrder) it2.next();
                        if (!jl40.l(knownOrder2.b, str) || !jl40.l(knownOrder2.a, str2)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                String str3 = this.w;
                if (i2 < 0) {
                    return Optional.of(a.o0(list, new KnownOrder(str2, str, str3, 24)));
                }
                KnownOrder knownOrder3 = (KnownOrder) list.get(i2);
                if (jl40.l(knownOrder3.c, str3)) {
                    return Optional.empty();
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i2, new KnownOrder(knownOrder3.a, knownOrder3.b, str3, knownOrder3.d, knownOrder3.e));
                return Optional.of(arrayList);
        }
    }
}
