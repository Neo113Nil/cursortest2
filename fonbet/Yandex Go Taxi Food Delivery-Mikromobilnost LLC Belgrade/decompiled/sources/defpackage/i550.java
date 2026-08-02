package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.NavBackStackEntryState;
import androidx.view.fragment.NavHostFragment;
import androidx.view.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final /* synthetic */ class i550 implements f2m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i550(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.f2m0
    public final Bundle a() {
        Bundle bundle;
        int i;
        int i2;
        Pair[] pairArr;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                g550 g550Var = (g550) obj;
                LinkedHashMap linkedHashMap = g550Var.m;
                LinkedHashMap linkedHashMap2 = g550Var.l;
                x43 x43Var = g550Var.g;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : b.t(g550Var.u.a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle h = ((j) entry.getValue()).h();
                    if (h != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, h);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                if (!x43Var.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[x43Var.size()];
                    Iterator<E> it = x43Var.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i4] = new NavBackStackEntryState((androidx.view.b) it.next());
                        i4++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i5 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i5] = intValue;
                        arrayList2.add(str2);
                        i5++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        x43 x43Var2 = (x43) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[x43Var2.size()];
                        Iterator it2 = x43Var2.iterator();
                        int i6 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                scc.m();
                                throw null;
                            }
                            parcelableArr2[i6] = (NavBackStackEntryState) next;
                            i6 = i7;
                        }
                        bundle.putParcelableArray(g8e.o("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (g550Var.f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", g550Var.f);
                }
                return bundle == null ? Bundle.EMPTY : bundle;
            case 1:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                i = navHostFragment.graphId;
                if (i == 0) {
                    return Bundle.EMPTY;
                }
                i2 = navHostFragment.graphId;
                return wwg.g(new Pair(NavHostFragment.KEY_GRAPH_ID, Integer.valueOf(i2)));
            case 2:
                w1m0 w1m0Var = (w1m0) obj;
                for (Map.Entry entry4 : b.t(w1m0Var.d).entrySet()) {
                    w1m0Var.d((String) entry4.getKey(), ((r0) ((pz40) entry4.getValue())).getValue());
                }
                for (Map.Entry entry5 : b.t(w1m0Var.b).entrySet()) {
                    w1m0Var.d((String) entry5.getKey(), ((f2m0) entry5.getValue()).a());
                }
                LinkedHashMap linkedHashMap3 = w1m0Var.a;
                if (linkedHashMap3.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        arrayList4.add(new Pair((String) entry6.getKey(), entry6.getValue()));
                    }
                    pairArr = (Pair[]) arrayList4.toArray(new Pair[0]);
                }
                return wwg.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            default:
                ind0 a = ((drx0) obj).b.a.a();
                return wwg.g(new Pair("CURRENT_PURCHASE", a.b), new Pair("PURCHASES_HISTORY", a.c));
        }
    }
}
