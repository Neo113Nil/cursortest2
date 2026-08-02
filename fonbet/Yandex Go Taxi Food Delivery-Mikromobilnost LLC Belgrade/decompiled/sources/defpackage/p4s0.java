package defpackage;

import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import ru.yandex.taxi.shortcuts.ui.shortcutview.a;

/* loaded from: classes10.dex */
public class p4s0 {
    public n4s0 a(v9g v9gVar, ShortcutViewSourceType shortcutViewSourceType) {
        if (shortcutViewSourceType == ShortcutViewSourceType.PRODUCTS) {
            return (a) v9gVar.B.get();
        }
        if (shortcutViewSourceType != ShortcutViewSourceType.RIDA_LOCAL_SOURCE) {
            kbs.f(shortcutViewSourceType, "Unsupported type: ");
            return null;
        }
        v9gVar.getClass();
        c4s0 c4s0Var = v9gVar.a;
        zuj0 c = c4s0Var.c();
        q5z.h(c);
        ck31 d1 = c4s0Var.d1();
        q5z.h(d1);
        return new com.yandex.go.shortcuts.impl.ui.interactors.a(c, d1);
    }
}
