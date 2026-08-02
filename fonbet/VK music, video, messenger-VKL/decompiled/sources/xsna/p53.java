package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AppIntent.kt */
/* loaded from: classes6.dex */
public abstract class p53 {
    public final String a;

    /* compiled from: AppIntent.kt */
    public static final class a {
        public static ArrayList a(List list) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((p53) it.next()).a);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add((String) next)) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }

        public static ArrayList b(List list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof b) {
                    arrayList.add(obj);
                }
            }
            Collection collection = EmptyList.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collection = j5g.u0(((b) it.next()).b, collection);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collection) {
                if (hashSet.add(Integer.valueOf(((Number) obj2).intValue()))) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }

        public static ArrayList c(List list, List list2) {
            p53 bVar;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int hashCode = str.hashCode();
                if (hashCode == -530947637) {
                    if (str.equals("confirmed_notification")) {
                        bVar = new b(list2 == null ? EmptyList.b : list2);
                    }
                    bVar = null;
                } else if (hashCode != 152543721) {
                    if (hashCode == 591047963 && str.equals("non_promo_newsletter")) {
                        bVar = c.b;
                    }
                    bVar = null;
                } else {
                    if (str.equals("promo_newsletter")) {
                        bVar = d.b;
                    }
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: AppIntent.kt */
    public static final class b extends p53 {
        public final List<Integer> b;

        public b(List<Integer> list) {
            super("confirmed_notification");
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ConfirmedNotification(subscribeIds="), this.b);
        }
    }

    /* compiled from: AppIntent.kt */
    public static final class c extends p53 {
        public static final c b = new c("non_promo_newsletter");
    }

    /* compiled from: AppIntent.kt */
    public static final class d extends p53 {
        public static final d b = new d("promo_newsletter");
    }

    public p53(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
