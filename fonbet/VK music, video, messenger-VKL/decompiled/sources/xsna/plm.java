package xsna;

import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import java.util.Map;
import kotlin.Pair;

/* compiled from: DialogThemesProvider.kt */
/* loaded from: classes.dex */
public interface plm {
    default Map a(npo0 npo0Var, npo0 npo0Var2) {
        return null;
    }

    default Pair<com.vk.im.engine.models.dialogs.c, DialogTheme> b(String str, npo0 npo0Var, npo0 npo0Var2) {
        return null;
    }

    Map<com.vk.im.engine.models.dialogs.c, DialogTheme> c();

    default Pair<com.vk.im.engine.models.dialogs.c, Map<VKTheme, DialogThemeImpl>> d() {
        return null;
    }
}
