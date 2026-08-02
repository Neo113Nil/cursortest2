package xsna;

import com.vk.im.engine.models.dialogs.c;
import xsna.jsm;

/* compiled from: DialogThemeInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class tkm implements jsm.c {
    public final a1w a;
    public final zdw b;
    public final x9g0 c;

    public tkm(a1w a1wVar, zdw zdwVar, x9g0 x9g0Var) {
        this.a = a1wVar;
        this.b = zdwVar;
        this.c = x9g0Var;
    }

    @Override // xsna.jsm.c
    public final void a(com.vk.im.engine.models.dialogs.c cVar) {
        if (cVar == null) {
            return;
        }
        String str = cVar.a;
        zdw zdwVar = this.b;
        zdwVar.u.getClass();
        String string = cew.h().getString("pref_cfg_chat_overriden_theme", c.g.c.a);
        zdwVar.u.getClass();
        itg0.n(this.a.C(this, new clm(str, string, cew.d(), dhr0.M(), this.c)).q(asu0.a.c()));
    }
}
