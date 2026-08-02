package defpackage;

import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.backendconfig.a;

/* loaded from: classes15.dex */
public final class nz01 {
    public final a a;
    public final lqo b;
    public final h3y c;

    public nz01(a aVar, lqo lqoVar, h3y h3yVar) {
        this.a = aVar;
        this.b = lqoVar;
        this.c = h3yVar;
    }

    public final boolean a(o1b0 o1b0Var) {
        return this.b.a(tz10.u) || xf4.c(this.a.a().getTranslationsConfig().getRestrictions(), o1b0Var);
    }

    public final boolean b(j3b j3bVar) {
        boolean z;
        r96 r96Var = tz10.t;
        lqo lqoVar = this.b;
        if (!lqoVar.a(r96Var)) {
            wbz0 wbz0Var = s8b.c;
            int i = j3bVar.i;
            wbz0Var.getClass();
            s8b s8bVar = new s8b(i);
            ChatRightsFlag chatRightsFlag = ChatRightsFlag.Translate;
            kgx kgxVar = s8b.d[16];
            if (!chatRightsFlag.c(s8bVar).booleanValue()) {
                z = false;
                return !z && (!lqoVar.a(tz10.u) || xf4.b(this.a.a().getTranslationsConfig().getRestrictions(), j3bVar));
            }
        }
        z = true;
        if (z) {
        }
    }
}
