package defpackage;

import flex.loader.DocumentFetchOrigin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class enr0 extends y8 {
    public final List a;
    public final uyg b;
    public final SerialDescriptor c = c.Companion.serializer().getDescriptor();

    public enr0(List list, uyg uygVar) {
        this.a = list;
        this.b = uygVar;
    }

    public static final ArrayList b(ArrayList arrayList, sbx sbxVar, b bVar, final enr0 enr0Var, final String str, final String str2) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bnr0 tryParse = ((fnr0) it.next()).tryParse(sbxVar, (c) bVar, new wls() { // from class: dnr0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    xez0 xez0Var = (xez0) obj;
                    String str3 = (String) obj2;
                    uyg uygVar = enr0.this.b;
                    if (uygVar != null) {
                        String str4 = str;
                        uygVar.logDecodingSharedDataSlice(String.format("FlexSharedDataParsingTime.%s.%s", Arrays.copyOf(new Object[]{str3, str4}, 2)), str4, xez0Var, kotlin.collections.b.i(new Pair("reqId", str2), new Pair("jsonType", str3)));
                    }
                    return zy11.a;
                }
            });
            if (tryParse != null) {
                arrayList2.add(tryParse);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        String str;
        Iterable iterable;
        String str2;
        u1m u1mVar;
        List list;
        uyg uygVar;
        u1m u1mVar2;
        String str3 = null;
        if (!(bVar instanceof c)) {
            ny61.g("Failed requirement.");
            return null;
        }
        w1m w1mVar = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
        if (w1mVar == null || (u1mVar2 = w1mVar.a) == null || (str = u1mVar2.a) == null) {
            str = "api/screen/unknown";
        }
        String str4 = str;
        lg90 lg90Var = (lg90) bvf0.A(sbxVar).c(qoi0.a(lg90.class));
        xez0 xez0Var = lg90Var != null ? lg90Var.a : null;
        e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        String str5 = e7j0Var != null ? e7j0Var.a : null;
        if (xez0Var != null && (uygVar = this.b) != null) {
            uygVar.logJsonCreationTimings(String.format("FlexSharedDataJsonCreation.%s", Arrays.copyOf(new Object[]{str4}, 1)), str4, xez0Var, kotlin.collections.b.i(new Pair("reqId", str5), new Pair("jsonType", "SharedData")));
        }
        List list2 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((fnr0) obj).getFlags().a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((fnr0) obj2).getFlags().a) {
                arrayList2.add(obj2);
            }
        }
        ArrayList m0 = a.m0(b(arrayList2, sbxVar, bVar, this, str4, str5), b(arrayList, sbxVar, bVar, this, str4, str5));
        cnr0 cnr0Var = cnr0.b;
        e7j0 e7j0Var2 = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
        if (e7j0Var2 == null || (str2 = e7j0Var2.a) == null) {
            iterable = EmptyList.a;
        } else {
            w1m w1mVar2 = (w1m) bvf0.A(sbxVar).c(qoi0.a(w1m.class));
            if (w1mVar2 != null && (u1mVar = w1mVar2.a) != null && (list = (List) u1mVar.b.get("pageToken")) != null) {
                str3 = (String) a.R(list);
            }
            MapBuilder y = qv10.y("reqId", str2);
            y.put("sourceType", DocumentFetchOrigin.Network.getValue());
            if (str3 != null) {
                y.put("pageToken", str3);
            }
            iterable = Collections.singletonList(new m631(y.j()));
        }
        return vez0.f(a.m0(iterable, m0));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
