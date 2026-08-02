package xsna;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.core.native_loader.NativeLibLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tv50 implements Callable {
    public final /* synthetic */ boolean b;

    public /* synthetic */ tv50(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = this.b;
        NativeLibLoader nativeLibLoader = NativeLibLoader.a;
        HashMap hashMap = NativeLibLoader.g;
        if (hashMap != null) {
            return hashMap;
        }
        HashSet hashSet = new HashSet();
        try {
            nativeLibLoader.getClass();
            hashSet.addAll(NativeLibLoader.c());
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.addAll(NativeLibLoader.e(0, (String) it.next()));
            }
            hashSet.clear();
            hashSet.addAll(hashSet2);
            Context context = NativeLibLoader.h;
            if (context == null) {
                context = null;
            }
            hashSet.addAll(nativeLibLoader.d(context, z));
        } catch (Throwable unused) {
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str = (String) next;
            Set<String> set = NativeLibLoader.c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    if (brm0.B(str, (String) it3.next(), false)) {
                        break;
                    }
                }
            }
            if (!drm0.N(str)) {
                arrayList.add(next);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            String str2 = (String) it4.next();
            int O = drm0.O(0, 6, str2, DomExceptionUtils.SEPARATOR);
            String substring = str2.substring(0, new k9x(0, O, 1).c + 1);
            k9x q = swe0.q(O + 1, str2.length());
            String substring2 = str2.substring(q.b, q.c + 1);
            if (substring2.length() != 0) {
                Collection collection = (Collection) hashMap2.get(substring);
                if (collection == null || collection.isEmpty()) {
                    hashMap2.put(substring, e43.o(substring2));
                } else {
                    List list = (List) hashMap2.get(substring);
                    if (list != null) {
                        list.add(substring2);
                    }
                }
            }
        }
        NativeLibLoader.g = hashMap2;
        return hashMap2;
    }
}
