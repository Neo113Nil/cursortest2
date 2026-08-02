package com.yandex.passport.internal.ui.bouncer.loading;

import android.widget.Button;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.li91;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public abstract class b extends com.lightside.slab.a {
    public final t E;
    public boolean F;

    public b(t tVar) {
        this.E = tVar;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        x1 x1Var = (x1) obj;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, this + ".performBind(" + x1Var + ')', 8);
        }
        a n = n();
        Button button = ((e) n).y;
        boolean z = button.getVisibility() == 0;
        boolean z2 = x1Var.a;
        if (z != z2) {
            button.setVisibility(z2 ? 0 : 8);
            if (button.getVisibility() == 0) {
                button.setAlpha(0.0f);
                u.j(((e) n).y);
            }
        }
        li91.e(new AbstractLoadingSlab$performBind$3$1$1(this, null), button);
        boolean z3 = this.F;
        zy11 zy11Var = zy11.a;
        if (z3) {
            return zy11Var;
        }
        u.j(n.getProgress());
        this.F = true;
        return zy11Var;
    }

    public abstract a n();

    @Override // com.lightside.slab.a, defpackage.ins0, defpackage.lns0
    public final void onDetach() {
        super.onDetach();
        this.F = false;
    }
}
