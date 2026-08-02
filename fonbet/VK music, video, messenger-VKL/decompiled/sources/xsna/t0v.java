package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: HealthPermissionsRequestContract.kt */
/* loaded from: classes12.dex */
public final class t0v extends va0<Set<? extends String>, Set<? extends String>> {
    public final va0<Set<String>, Set<String>> a;

    public t0v() {
        this.a = Build.VERSION.SDK_INT >= 34 ? new u0v() : new s0v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.va0
    public final Intent a(Context context, Set<? extends String> set) {
        Set<? extends String> set2 = set;
        Set<? extends String> set3 = set2;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                if (!brm0.B((String) it.next(), "android.permission.health.", false)) {
                    throw new IllegalArgumentException("Unsupported health connect permission");
                }
            }
        }
        if (set2.isEmpty()) {
            throw new IllegalArgumentException("At least one permission is required!");
        }
        return this.a.a(context, set2);
    }

    @Override // xsna.va0
    public final Set<? extends String> c(int i, Intent intent) {
        return this.a.c(i, intent);
    }
}
