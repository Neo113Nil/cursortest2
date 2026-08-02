package xsna;

import android.text.TextUtils;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class q63 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        boolean z;
        String valueOf = String.valueOf(BuildInfo.e);
        String string = Preference.j().getString("app_update_versions", "");
        if (TextUtils.isEmpty(string)) {
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putString("app_update_versions", valueOf);
            aVar.a();
            return;
        }
        int i = 0;
        List a = n6j.a(0, "\\s+", string);
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = j5g.H0(a, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.b;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        ArrayList arrayList = new ArrayList(e43.l(Arrays.copyOf(strArr, strArr.length)));
        StringBuilder sb = new StringBuilder();
        if (arrayList.isEmpty() || TextUtils.equals((String) xy9.b(1, arrayList), valueOf)) {
            z = false;
        } else {
            if (arrayList.size() == 3) {
                arrayList.remove(0);
            }
            arrayList.add(valueOf);
            z = true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            sb.append((String) next);
            if (i < arrayList.size() - 1) {
                sb.append(" ");
            }
            i = i2;
        }
        String sb2 = sb.toString();
        if (z) {
            ky6.a aVar2 = (ky6.a) Preference.j().edit();
            aVar2.putString("app_update_versions", sb2);
            aVar2.a();
        }
    }
}
