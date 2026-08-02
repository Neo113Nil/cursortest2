package xsna;

import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.jpo0;

/* compiled from: ThemeItemListBuilder.kt */
/* loaded from: classes2.dex */
public final class lpo0 {
    public final ArrayList a = new ArrayList();
    public String b = "";

    public final void a(List list) {
        Pair j = bu00.j();
        VKTheme vKTheme = (VKTheme) j.d();
        VKTheme vKTheme2 = (VKTheme) j.g();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DialogTheme dialogTheme = (DialogTheme) it.next();
            com.vk.im.engine.models.dialogs.c cVar = dialogTheme.b;
            DialogBackground dialogBackground = dialogTheme.c;
            this.a.add(new jpo0.c(cVar.a, jeq0.g(dialogBackground.c), jeq0.g(dialogBackground.d), dialogTheme.Ab(vKTheme, 0L, false).D, dialogTheme.Ab(vKTheme2, 0L, false).D, dialogTheme.e, false));
        }
    }
}
