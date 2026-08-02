package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class dwb implements cwb {
    public final c a;

    public dwb(c cVar) {
        this.a = cVar;
    }

    public final List a() {
        return this.a.c().b;
    }

    public final boolean b() {
        return this.a.c().b.size() > 1;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        List list = this.a.c().b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((Address) obj).q0())) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == 1;
    }

    public final Address d() {
        return this.a.g();
    }

    public final boolean e() {
        c cVar = this.a;
        List b = cVar.b();
        if (!(b instanceof Collection) || !b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                String q0 = ((Address) it.next()).q0();
                if (q0 == null || q0.length() == 0) {
                    return false;
                }
            }
        }
        List b2 = cVar.b();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (hashSet.add(((Address) obj).q0())) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }
}
