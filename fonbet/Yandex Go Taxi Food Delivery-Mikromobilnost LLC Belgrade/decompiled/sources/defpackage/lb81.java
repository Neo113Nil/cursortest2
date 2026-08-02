package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import org.json.JSONObject;
import yads.h01;

/* loaded from: classes7.dex */
public final class lb81 {
    public static no61 a(Map map) {
        List W;
        Set N0;
        Long l;
        String b = ob71.b(map, h01.n);
        String str = "";
        if (b == null) {
            b = "";
        }
        String b2 = ob71.b(map, h01.L);
        if (b2 == null) {
            N0 = EmptySet.a;
        } else {
            try {
                str = new JSONObject(b2).optString("test_ids", "");
            } catch (Throwable unused) {
            }
            W = evu0.W(str, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
            ArrayList arrayList = new ArrayList();
            Iterator it = W.iterator();
            while (it.hasNext()) {
                try {
                    l = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    l = null;
                }
                if (l != null) {
                    arrayList.add(l);
                }
            }
            N0 = a.N0(arrayList);
        }
        return new no61(b, N0);
    }
}
