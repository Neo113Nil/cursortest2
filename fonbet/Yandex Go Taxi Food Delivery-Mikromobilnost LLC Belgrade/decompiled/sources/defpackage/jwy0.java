package defpackage;

import com.yandex.messaging.ui.settings.theme.ThemeVariant;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class jwy0 extends yr31 {
    public final r0 b;

    public jwy0(rz10 rz10Var, dwy0 dwy0Var) {
        Object obj;
        rz10Var.i.getClass();
        wwy0 wwy0Var = ThemeVariant.Companion;
        int b = dwy0Var.b();
        wwy0Var.getClass();
        Iterator<E> it = ThemeVariant.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ThemeVariant) obj).getThemeResId() == b) {
                    break;
                }
            }
        }
        ThemeVariant themeVariant = (ThemeVariant) obj;
        this.b = bvf0.c(new kwy0(themeVariant == null ? ThemeVariant.System : themeVariant, false));
        new di9(sb2.a(0, null, null, 7));
    }
}
