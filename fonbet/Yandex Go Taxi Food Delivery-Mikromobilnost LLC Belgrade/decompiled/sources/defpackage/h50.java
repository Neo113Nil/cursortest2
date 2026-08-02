package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class h50 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    @Override // defpackage.x40
    public final w40 b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr.length == 0) {
            return new w40(b.f());
        }
        for (String str : strArr) {
            if (qke.h(context, str) != 0) {
                return null;
            }
        }
        int d = gw00.d(strArr.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (String str2 : strArr) {
            Pair pair = new Pair(str2, Boolean.TRUE);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new w40(linkedHashMap);
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return b.f();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return b.s(a.P0(j73.A(stringArrayExtra), arrayList));
        }
        return b.f();
    }
}
