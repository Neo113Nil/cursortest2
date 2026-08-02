package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public class gw00 extends fw00 {
    public static MapBuilder b(MapBuilder mapBuilder) {
        return mapBuilder.j();
    }

    public static MapBuilder c() {
        return new MapBuilder();
    }

    public static int d(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map e(Pair pair) {
        return Collections.singletonMap(pair.c(), pair.f());
    }
}
