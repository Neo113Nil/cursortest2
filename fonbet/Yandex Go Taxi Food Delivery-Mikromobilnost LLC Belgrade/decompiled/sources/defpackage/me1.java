package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.feature.persistence.api.StorageType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class me1 implements ubg0, ug01, ls41 {
    public final /* synthetic */ int a;
    public final SharedPreferences b;

    public me1(a1b0 a1b0Var, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = ((c1b0) a1b0Var).a(StorageType.PERMISSIONS);
                break;
            case 4:
            default:
                this.b = ((c1b0) a1b0Var).a(StorageType.PERMISSIONS);
                break;
            case 5:
                this.b = ((c1b0) a1b0Var).a(StorageType.PERMISSIONS);
                break;
        }
    }

    public LinkedHashMap a() {
        Map<String, ?> all = this.b.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            linkedHashMap.put(key, entry.getValue());
        }
        return linkedHashMap;
    }

    public SharedPreferences b() {
        return this.b;
    }

    public SharedPreferences c() {
        switch (this.a) {
        }
        return this.b;
    }

    public /* synthetic */ me1(SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = sharedPreferences;
    }
}
