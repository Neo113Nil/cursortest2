package defpackage;

import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class dfi extends vfx {
    public static final dfi a = new dfi();
    public static final String b = "type";
    public static final Map c;
    public static final LinkedHashMap d;
    public static final SerialDescriptor e;

    static {
        Map i = b.i(new Pair("comment", new Pair(dmc.class, dmc.Companion.serializer())), new Pair("porch", new Pair(uae0.class, uae0.Companion.serializer())), new Pair(ProxyPassportActivity.KEY_PHONE_NUMBER, new Pair(seb0.class, seb0.Companion.serializer())), new Pair("apartment_info", new Pair(im2.class, im2.Companion.serializer())), new Pair("doorphone", new Pair(u4m.class, u4m.Companion.serializer())));
        c = i;
        Set<Map.Entry> entrySet = i.entrySet();
        int d2 = gw00.d(tcc.n(entrySet, 10));
        if (d2 < 16) {
            d2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put((Class) ((Pair) entry.getValue()).c(), new Pair(entry.getKey(), ((Pair) entry.getValue()).f()));
        }
        d = linkedHashMap;
        e = kotlinx.serialization.json.b.Companion.serializer().getDescriptor();
    }

    public static afi c(sbx sbxVar, kotlinx.serialization.json.b bVar) {
        String str;
        myi myiVar;
        c m = qcx.m(bVar);
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) m.get(b);
        if (bVar2 == null || (str = qcx.g(qcx.n(bVar2))) == null) {
            str = "";
        }
        Pair pair = (Pair) c.get(str);
        if (pair == null || (myiVar = (KSerializer) pair.f()) == null) {
            return null;
        }
        return (afi) sbxVar.a(myiVar, m);
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        kotlinx.serialization.json.b t = ncxVar.t();
        if (!(t instanceof a)) {
            cfi.Companion.getClass();
            return cfi.b;
        }
        sbx d2 = ncxVar.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlinx.serialization.json.b bVar : ((a) t).a) {
            try {
                a.getClass();
                afi c2 = c(d2, bVar);
                if (c2 != null) {
                    linkedHashMap.put(c2.getClass(), c2);
                }
            } catch (Exception e2) {
                jst.e.j(e2);
            }
        }
        return new cfi(linkedHashMap);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        c cVar;
        Map map = ((cfi) obj).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            afi afiVar = (afi) ((Map.Entry) it.next()).getValue();
            sbx d2 = vcxVar.d();
            a.getClass();
            Pair pair = (Pair) d.get(afiVar.getClass());
            if (pair == null) {
                cVar = null;
            } else {
                KSerializer kSerializer = (KSerializer) pair.f();
                d2.getClass();
                cVar = new c(b.o(qcx.m(gwk0.J(d2, afiVar, kSerializer)), new Pair(b, qcx.c((String) pair.c()))));
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        vcxVar.p(new a(arrayList));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return e;
    }
}
