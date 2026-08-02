package xsna;

import com.vk.im.engine.models.dialogs.c;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: DialogThemeLoader.kt */
/* loaded from: classes2.dex */
public final class wkm {
    public final a1w a;
    public final cew b;
    public final c.C1124c c = c.C1124c.c;

    public wkm(a1w a1wVar, cew cewVar) {
        this.a = a1wVar;
        this.b = cewVar;
    }

    public final com.vk.im.engine.models.dialogs.c a(com.vk.im.engine.models.dialogs.c cVar) {
        boolean a = cVar.a();
        com.vk.im.engine.models.dialogs.c cVar2 = null;
        cew cewVar = this.b;
        if (a) {
            cewVar.getClass();
            if (cew.d()) {
                cewVar.getClass();
                String string = cew.h().getString("pref_cfg_chat_overriden_theme", c.g.c.a);
                if (string != null) {
                    CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
                    cVar2 = c.a.a(string);
                }
                return cVar2 == null ? cVar : cVar2;
            }
        }
        c.C1124c c1124c = c.C1124c.c;
        if (cVar.equals(c1124c)) {
            cewVar.getClass();
            String string2 = cew.h().getString("pref_cfg_chat_overriden_theme", c.g.c.a);
            if (string2 != null) {
                CopyOnWriteArraySet copyOnWriteArraySet2 = com.vk.im.engine.models.dialogs.c.b;
                cVar2 = c.a.a(string2);
            }
            return cVar2 == null ? c1124c : cVar2;
        }
    }
}
