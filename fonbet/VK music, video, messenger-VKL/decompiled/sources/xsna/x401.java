package xsna;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class x401 {
    public final Map a = Collections.synchronizedMap(new zk3());
    public int b = 0;

    @Nullable
    public Bundle c;

    public final void a(String str, c4z c4zVar) {
        Map map = this.a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(tdj.a(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, c4zVar);
        if (this.b > 0) {
            new com.google.android.gms.internal.common.zzg(Looper.getMainLooper()).post(new y001(this, c4zVar, str));
        }
    }

    public final void b(@Nullable Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((c4z) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((c4z) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
