package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes13.dex */
public final class i32 {
    public final lb20 a;
    public final oa1 b;
    public final l22 c = new l22();

    public i32(lb20 lb20Var, oa1 oa1Var) {
        this.a = lb20Var;
        this.b = oa1Var;
    }

    public final void a(String str, Map map) {
        ((mb20) this.a).b(str, map);
    }

    public final void b(Pair pair, String[] strArr) {
        Map f;
        Objects.toString(pair);
        Arrays.asList(strArr).toString();
        if (strArr.length == 0) {
            return;
        }
        String str = strArr[0];
        int length = strArr.length;
        if (length == 1) {
            f = b.f();
        } else {
            if (length != 2) {
                Arrays.asList(strArr).toString();
                return;
            }
            f = com.yandex.go.platform.utils.b.a(strArr[1]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f);
        if (pair != null) {
            linkedHashMap.put(pair.c(), pair.f());
        }
        linkedHashMap.toString();
        ((mb20) this.a).b(str, linkedHashMap);
    }
}
