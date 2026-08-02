package xsna;

import android.content.Context;
import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: AssetsDialogThemesProvider.kt */
/* loaded from: classes2.dex */
public abstract class cx3 implements plm {
    public final Context a;
    public final List<VKTheme> b;
    public final bpn0 c = new bpn0(new j1(this, 5));

    public cx3(Context context, List<VKTheme> list) {
        this.a = context;
        this.b = list;
    }

    @Override // xsna.plm
    public final Map a(npo0 npo0Var, npo0 npo0Var2) {
        return null;
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, DialogTheme> b(String str, npo0 npo0Var, npo0 npo0Var2) {
        return null;
    }

    @Override // xsna.plm
    public final Map<com.vk.im.engine.models.dialogs.c, DialogTheme> c() {
        return (Map) this.c.getValue();
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, Map<VKTheme, DialogThemeImpl>> d() {
        return null;
    }
}
