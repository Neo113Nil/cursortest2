package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONException;
import org.json.JSONObject;
import yads.hr1;
import yads.pf1;
import yads.qr1;
import yads.yo;
import yads.z9;

/* loaded from: classes7.dex */
public abstract class ej61 {
    public static final zcx a = xf71.a;

    public static String a(String str) {
        return g8e.o("BiddingSettingsAdUnitIdsInfo_", str);
    }

    public static yo b(pf1 pf1Var) {
        Set set = EmptySet.a;
        Set a2 = pf1Var.a("BiddingSettingsAdUnitIdsSet", set);
        if (a2 == null) {
            a2 = set;
        }
        Set a3 = pf1Var.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (a3 != null) {
            set = a3;
        }
        h291 h291Var = new h291();
        ArrayList arrayList = new ArrayList(a2.size());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String c = pf1Var.c(a((String) it.next()));
            if (c != null && c.length() != 0) {
                try {
                    z9 a4 = h291Var.a(new JSONObject(c));
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        long b = pf1Var.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String c2 = pf1Var.c(d((String) it2.next()));
            if (c2 != null) {
                zcx zcxVar = a;
                zcxVar.getClass();
                hr1 hr1Var = (hr1) zcxVar.b(qke.n(hr1.CREATOR.serializer()), c2);
                if (hr1Var != null) {
                    arrayList2.add(hr1Var);
                }
            }
        }
        qr1 qr1Var = new qr1(b, arrayList2);
        if (arrayList.isEmpty() && set.isEmpty()) {
            return null;
        }
        return new yo(arrayList, qr1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v0, types: [yads.pf1] */
    public static void c(pf1 pf1Var, yo yoVar) {
        List<hr1> list;
        ArrayList<z9> arrayList = yoVar.b;
        HashSet hashSet = new HashSet(arrayList.size());
        for (z9 z9Var : arrayList) {
            String str = z9Var.b;
            String str2 = z9Var.d;
            hashSet.add(str);
            pf1Var.a(a(str), str2);
        }
        EmptySet<String> emptySet = EmptySet.a;
        Set<String> a2 = pf1Var.a("BiddingSettingsAdUnitIdsSet", emptySet);
        if (a2 == null) {
            a2 = emptySet;
        }
        for (String str3 : a2) {
            if (!hashSet.contains(str3)) {
                pf1Var.d(a(str3));
            }
        }
        pf1Var.a("BiddingSettingsAdUnitIdsSet", hashSet);
        qr1 qr1Var = yoVar.c;
        long j = qr1Var != null ? qr1Var.b : 0L;
        if (qr1Var == null || (list = qr1Var.c) == null) {
            list = EmptyList.a;
        }
        HashSet hashSet2 = new HashSet(list.size());
        for (hr1 hr1Var : list) {
            hashSet2.add(hr1Var.b);
            String d = d(hr1Var.b);
            zcx zcxVar = a;
            zcxVar.getClass();
            pf1Var.a(d, zcxVar.c(hr1Var, hr1.CREATOR.serializer()));
        }
        ?? a3 = pf1Var.a("MediationPrefetchSettingsAdUnitIdsSet", emptySet);
        if (a3 != 0) {
            emptySet = a3;
        }
        for (String str4 : emptySet) {
            if (!hashSet2.contains(str4)) {
                pf1Var.d(d(str4));
            }
        }
        pf1Var.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        pf1Var.a("MediationPrefetchLoadTimeoutMillis", j);
    }

    public static String d(String str) {
        return g8e.o("MediationPrefetchSettingsAdUnitIdsInfo_", str);
    }

    public static void e(pf1 pf1Var) {
        Set set = EmptySet.a;
        Set a2 = pf1Var.a("BiddingSettingsAdUnitIdsSet", set);
        if (a2 == null) {
            a2 = set;
        }
        Set a3 = pf1Var.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (a3 != null) {
            set = a3;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            pf1Var.d(a((String) it.next()));
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            pf1Var.d(d((String) it2.next()));
        }
        pf1Var.d("BiddingSettingsAdUnitIdsSet");
        pf1Var.d("MediationPrefetchSettingsAdUnitIdsSet");
    }
}
