package xsna;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xsna.va0;

/* compiled from: HealthPermissionsRequestModuleContract.kt */
/* loaded from: classes12.dex */
public final class u0v extends va0<Set<? extends String>, Set<? extends String>> {
    public final bb0 a = new bb0();

    @Override // xsna.va0
    public final Intent a(Context context, Set<? extends String> set) {
        String[] strArr = (String[]) set.toArray(new String[0]);
        this.a.getClass();
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // xsna.va0
    public final va0.a<Set<? extends String>> b(Context context, Set<? extends String> set) {
        va0.a<Map<String, Boolean>> b = this.a.b(context, (String[]) set.toArray(new String[0]));
        if (b == null) {
            return null;
        }
        Map<String, Boolean> map = b.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new va0.a<>(linkedHashMap.keySet());
    }

    @Override // xsna.va0
    public final Set<? extends String> c(int i, Intent intent) {
        this.a.getClass();
        Map e = bb0.e(i, intent);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : e.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }
}
