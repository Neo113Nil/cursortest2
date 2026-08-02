package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.ybsdk.core.common.utils.preferences.LazySharedPreferences;
import com.ybsdk.feature.persistence.api.StorageType;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class c1b0 implements a1b0 {
    public final Context a;
    public final Object b = new Object();
    public final HashMap c = new HashMap();

    public c1b0(Context context) {
        this.a = context;
    }

    public final SharedPreferences a(StorageType storageType) {
        SharedPreferences sharedPreferences;
        synchronized (this.b) {
            try {
                HashMap hashMap = this.c;
                Object obj = hashMap.get(storageType);
                if (obj == null) {
                    obj = new LazySharedPreferences(new l2z(14, storageType, this));
                    hashMap.put(storageType, obj);
                }
                sharedPreferences = (SharedPreferences) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
