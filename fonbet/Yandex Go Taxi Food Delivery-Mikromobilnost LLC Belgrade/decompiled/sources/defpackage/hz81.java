package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class hz81 {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    public final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final gz81 b = new gz81(this);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.z.set(null);
            synchronized (basePendingResult.a) {
                try {
                    if (((yst) basePendingResult.c.get()) != null) {
                        if (!basePendingResult.F) {
                        }
                        synchronized (basePendingResult.a) {
                            z = basePendingResult.D;
                        }
                    }
                    basePendingResult.e();
                    synchronized (basePendingResult.a) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.a.remove(basePendingResult);
            }
        }
    }
}
