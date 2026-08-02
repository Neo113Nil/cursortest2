package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RegistrationScreenFieldsHolder.kt */
/* loaded from: classes.dex */
public final class jrf0 {
    public final ConcurrentHashMap<SchemeStatSak$EventScreen, ArrayList<SchemeStatSak$RegistrationFieldItem>> a = new ConcurrentHashMap<>();
    public final Set<SchemeStatSak$RegistrationFieldItem> b = Collections.synchronizedSet(new LinkedHashSet());

    public final ArrayList<SchemeStatSak$RegistrationFieldItem> a(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$EventScreen schemeStatSak$EventScreen2, ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ConcurrentHashMap<SchemeStatSak$EventScreen, ArrayList<SchemeStatSak$RegistrationFieldItem>> concurrentHashMap = this.a;
        if (schemeStatSak$EventScreen != null) {
            ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList3 = concurrentHashMap.get(schemeStatSak$EventScreen);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>();
            }
            arrayList2.addAll(arrayList3);
        }
        if (schemeStatSak$EventScreen2 != null) {
            ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList4 = concurrentHashMap.get(schemeStatSak$EventScreen2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList<>();
            }
            arrayList2.addAll(arrayList4);
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        arrayList2.addAll(this.b);
        return p4g.q(j5g.R(arrayList2));
    }
}
