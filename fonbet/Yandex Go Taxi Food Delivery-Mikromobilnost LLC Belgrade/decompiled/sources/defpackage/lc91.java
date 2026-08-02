package defpackage;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.internal.common.zzg;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes11.dex */
public final class lc91 {
    public final Map a = Collections.synchronizedMap(new w53());
    public int b = 0;
    public Bundle c;

    public final void a(String str, b bVar) {
        Map map = this.a;
        if (map.containsKey(str)) {
            ny61.g(unr0.r(new StringBuilder(String.valueOf(str).length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, bVar);
        if (this.b > 0) {
            new zzg(Looper.getMainLooper()).post(new ju61(this, bVar, str, false, 3));
        }
    }

    public final void b(Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((b) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((b) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
