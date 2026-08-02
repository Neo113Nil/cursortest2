package defpackage;

import com.yandex.runtime.recording.EventListener;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes7.dex */
public final class gv00 implements EventListener {
    public static final gv00 a = new gv00();
    public static boolean b;
    public static Set c;
    public static Set d;
    public static sc20 e;

    static {
        EmptySet emptySet = EmptySet.a;
        c = emptySet;
        d = emptySet;
    }

    @Override // com.yandex.runtime.recording.EventListener
    public final void onEvent(String str, Map map) {
        sc20 sc20Var;
        if (c.contains(str) || (sc20Var = e) == null || !d.contains(str)) {
            return;
        }
        sc20Var.invoke(str, map);
    }

    @Override // com.yandex.runtime.recording.EventListener
    public final void onFlush(boolean z) {
    }
}
