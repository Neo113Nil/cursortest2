package xsna;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.va0;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class bb0 extends va0<String[], Map<String, Boolean>> {
    public static Map e(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return pn00.s(j5g.X0(rl3.I(stringArrayExtra), arrayList));
            }
        }
        return jgp.b;
    }

    @Override // xsna.va0
    public final Intent a(Context context, String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // xsna.va0
    public final /* bridge */ /* synthetic */ Map<String, Boolean> c(int i, Intent intent) {
        return e(i, intent);
    }

    @Override // xsna.va0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final va0.a<Map<String, Boolean>> b(Context context, String[] strArr) {
        if (strArr.length == 0) {
            return new va0.a<>(jgp.b);
        }
        for (String str : strArr) {
            if (anj.a(context, str) != 0) {
                return null;
            }
        }
        int e = on00.e(strArr.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (String str2 : strArr) {
            Pair pair = new Pair(str2, Boolean.TRUE);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return new va0.a<>(linkedHashMap);
    }
}
