package defpackage;

import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.order.map.controller.internal.Command$CommandType;

/* loaded from: classes6.dex */
public final class dk50 {
    public final crg a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final Set c = Collections.synchronizedSet(new j63(0));
    public volatile Set d;

    public dk50(crg crgVar) {
        this.a = crgVar;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                Set set = this.c;
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new flc((String) it.next(), Command$CommandType.Remove, null));
                }
                this.c.clear();
                this.b.g(new ylc(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(NearestDrivers nearestDrivers, Set set) {
        j63 j63Var;
        this.d = set;
        w53 w53Var = new w53();
        for (NearestDrivers.Driver driver : nearestDrivers.a) {
            String str = driver.b;
            List list = driver.d;
            if (!list.isEmpty() && str.length() > 0) {
                List<NearestDrivers.Position> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (NearestDrivers.Position position : list2) {
                    Date c = this.a.c(position.e);
                    if (c == null) {
                        c = new Date();
                    }
                    arrayList.add(new h001(new zzs(position.a, position.b, 0, null, null, 28), position.d, c, null, null));
                }
                w53Var.put(driver.a, new sjm(str, arrayList));
            }
        }
        j63 j63Var2 = new j63(w53Var.keySet());
        synchronized (this.c) {
            j63Var = new j63(this.c);
        }
        j63 j63Var3 = new j63((Collection) j63Var);
        int i = j63Var2.c;
        for (int i2 = 0; i2 < i; i2++) {
            j63Var3.remove(j63Var2.b[i2]);
        }
        j63 j63Var4 = new j63(j63Var2);
        j63Var4.removeAll(j63Var);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(j63Var3.c);
        r53 r53Var = new r53(j63Var3);
        while (r53Var.hasNext()) {
            String str2 = (String) r53Var.next();
            this.c.remove(str2);
            arrayList3.add(new flc(str2, Command$CommandType.Remove, null));
        }
        ycc.r(arrayList3, arrayList2);
        ArrayList arrayList4 = new ArrayList(j63Var4.c);
        r53 r53Var2 = new r53(j63Var4);
        while (r53Var2.hasNext()) {
            String str3 = (String) r53Var2.next();
            sjm sjmVar = (sjm) w53Var.get(str3);
            this.c.add(str3);
            if (sjmVar != null) {
                arrayList4.add(new flc(str3, Command$CommandType.Add, sjmVar));
            }
        }
        ycc.r(arrayList4, arrayList2);
        j63Var2.retainAll(j63Var);
        ArrayList arrayList5 = new ArrayList(w53Var.c);
        for (String str4 : w53Var.keySet()) {
            sjm sjmVar2 = (sjm) w53Var.get(str4);
            if (sjmVar2 != null) {
                arrayList5.add(new flc(str4, Command$CommandType.Update, sjmVar2));
            }
        }
        ycc.r(arrayList5, arrayList2);
        this.b.g(new ylc(arrayList2));
    }
}
