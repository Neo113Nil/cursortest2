package xsna;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class npz0 {
    public final SparseIntArray a = new SparseIntArray();
    public final com.google.android.gms.common.a b;

    public npz0(@NonNull com.google.android.gms.common.a aVar) {
        exc0.i(aVar);
        this.b = aVar;
    }

    public final int a(@NonNull Context context, @NonNull a.f fVar) {
        int i;
        exc0.i(context);
        exc0.i(fVar);
        int i2 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(minApkVersion, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = this.a;
        synchronized (sparseIntArray2) {
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= sparseIntArray2.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i3);
                    if (keyAt > minApkVersion && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = this.b.c(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, i2);
        }
        return i2;
    }
}
