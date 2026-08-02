package yads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.go9;
import xsna.j8y;
import xsna.xn8;

/* loaded from: classes10.dex */
public abstract class jp {
    public static final j8y a = je1.a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    public static hp a(sh1 sh1Var) {
        EmptySet emptySet = EmptySet.b;
        uh1 uh1Var = (uh1) sh1Var;
        Set a2 = uh1Var.a("BiddingSettingsAdUnitIdsSet", emptySet);
        if (a2 == null) {
            a2 = emptySet;
        }
        ?? a3 = uh1Var.a("MediationPrefetchSettingsAdUnitIdsSet", emptySet);
        if (a3 != 0) {
            emptySet = a3;
        }
        ip ipVar = new ip();
        ArrayList arrayList = new ArrayList(a2.size());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String c = uh1Var.c(a((String) it.next()));
            if (c != null && c.length() != 0) {
                try {
                    gb a4 = ipVar.a(new JSONObject(c));
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        long b = uh1Var.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(emptySet.size());
        Iterator it2 = emptySet.iterator();
        while (it2.hasNext()) {
            String c2 = uh1Var.c(b((String) it2.next()));
            if (c2 != null) {
                j8y j8yVar = a;
                j8yVar.getClass();
                ys1 ys1Var = (ys1) j8yVar.a(xn8.a(ys1.Companion.serializer()), c2);
                if (ys1Var != null) {
                    arrayList2.add(ys1Var);
                }
            }
        }
        ht1 ht1Var = new ht1(b, arrayList2);
        if (arrayList.isEmpty() && emptySet.isEmpty()) {
            return null;
        }
        return new hp(arrayList, ht1Var);
    }

    public static String b(String str) {
        return go9.b("MediationPrefetchSettingsAdUnitIdsInfo_", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    public static void b(sh1 sh1Var) {
        EmptySet emptySet = EmptySet.b;
        uh1 uh1Var = (uh1) sh1Var;
        Set a2 = uh1Var.a("BiddingSettingsAdUnitIdsSet", emptySet);
        if (a2 == null) {
            a2 = emptySet;
        }
        ?? a3 = uh1Var.a("MediationPrefetchSettingsAdUnitIdsSet", emptySet);
        if (a3 != 0) {
            emptySet = a3;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            uh1Var.d(a((String) it.next()));
        }
        Iterator it2 = emptySet.iterator();
        while (it2.hasNext()) {
            uh1Var.d(b((String) it2.next()));
        }
        uh1Var.d("BiddingSettingsAdUnitIdsSet");
        uh1Var.d("MediationPrefetchSettingsAdUnitIdsSet");
    }

    public static String a(String str) {
        return go9.b("BiddingSettingsAdUnitIdsInfo_", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    public static void a(sh1 sh1Var, hp hpVar) {
        List<ys1> list;
        List<gb> list2 = hpVar.b;
        HashSet hashSet = new HashSet(list2.size());
        for (gb gbVar : list2) {
            String str = gbVar.b;
            String str2 = gbVar.d;
            hashSet.add(str);
            ((uh1) sh1Var).a(a(str), str2);
        }
        EmptySet<String> emptySet = EmptySet.b;
        uh1 uh1Var = (uh1) sh1Var;
        ?? a2 = uh1Var.a("BiddingSettingsAdUnitIdsSet", emptySet);
        if (a2 != 0) {
            emptySet = a2;
        }
        for (String str3 : emptySet) {
            if (!hashSet.contains(str3)) {
                uh1Var.d(a(str3));
            }
        }
        uh1Var.a("BiddingSettingsAdUnitIdsSet", hashSet);
        ht1 ht1Var = hpVar.c;
        long j = ht1Var != null ? ht1Var.b : 0L;
        if (ht1Var == null || (list = ht1Var.c) == null) {
            list = EmptyList.b;
        }
        HashSet hashSet2 = new HashSet(list.size());
        for (ys1 ys1Var : list) {
            hashSet2.add(ys1Var.b);
            String b = b(ys1Var.b);
            j8y j8yVar = a;
            j8yVar.getClass();
            uh1Var.a(b, j8yVar.b(ys1.Companion.serializer(), ys1Var));
        }
        EmptySet<String> emptySet2 = EmptySet.b;
        ?? a3 = uh1Var.a("MediationPrefetchSettingsAdUnitIdsSet", emptySet2);
        if (a3 != 0) {
            emptySet2 = a3;
        }
        for (String str4 : emptySet2) {
            if (!hashSet2.contains(str4)) {
                uh1Var.d(b(str4));
            }
        }
        uh1Var.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        uh1Var.a("MediationPrefetchLoadTimeoutMillis", j);
    }
}
