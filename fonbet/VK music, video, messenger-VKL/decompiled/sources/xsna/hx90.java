package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: PerformanceStorage.kt */
/* loaded from: classes.dex */
public final class hx90 {
    public static boolean b;
    public static final SharedPreferences a = Preference.f("device_performance");
    public static final ArrayList c = new ArrayList();

    public static final Collection<Integer> a() {
        try {
            SharedPreferences sharedPreferences = a;
            EmptySet emptySet = EmptySet.b;
            Set<String> stringSet = sharedPreferences.getStringSet("last_network_quality_records", emptySet);
            if (stringSet == null) {
                return emptySet;
            }
            Set<String> set = stringSet;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            return arrayList;
        } catch (Exception unused) {
            return EmptySet.b;
        }
    }

    public static final void b(int i) {
        Integer valueOf = Integer.valueOf(i);
        SharedPreferences sharedPreferences = a;
        qaj0.c(sharedPreferences, "network_quality", valueOf);
        boolean z = b;
        ArrayList arrayList = c;
        if (z) {
            arrayList.set(e43.h(arrayList), Integer.valueOf(i));
        } else {
            b = true;
            arrayList.addAll(a());
            if (arrayList.size() == 3) {
                arrayList.remove(0);
            }
            arrayList.add(Integer.valueOf(i));
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kq.d((Number) it.next(), arrayList2);
        }
        qaj0.c(sharedPreferences, "last_network_quality_records", j5g.S0(arrayList2));
    }
}
