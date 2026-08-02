package defpackage;

import android.graphics.Rect;
import com.yandex.go.taxi.summary.verticalsummary.repository.MarginSource;
import com.yandex.go.taxi.summary.verticalsummary.repository.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class lh31 {
    public final r0 a;
    public final c b;

    public lh31() {
        r0 c = bvf0.c(b.f());
        this.a = c;
        this.b = new c(c);
    }

    public static void a(lh31 lh31Var, MarginSource marginSource, Integer num, Integer num2, int i) {
        Object value;
        LinkedHashMap linkedHashMap;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        r0 r0Var = lh31Var.a;
        do {
            value = r0Var.getValue();
            Map map = (Map) value;
            Rect rect = (Rect) map.get(marginSource);
            if (rect == null) {
                rect = new Rect();
            }
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(marginSource, new Rect(rect.left, num != null ? num.intValue() : rect.top, rect.right, num2 != null ? num2.intValue() : rect.bottom));
        } while (!r0Var.k(value, linkedHashMap));
    }
}
