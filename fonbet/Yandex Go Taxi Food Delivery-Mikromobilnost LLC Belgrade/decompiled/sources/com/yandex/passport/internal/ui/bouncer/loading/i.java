package com.yandex.passport.internal.ui.bouncer.loading;

import android.widget.Button;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import defpackage.li91;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i implements vpr {
    public final /* synthetic */ j a;
    public final /* synthetic */ a2 b;

    public i(j jVar, a2 a2Var) {
        this.a = jVar;
        this.b = a2Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ((Boolean) obj).getClass();
        j jVar = this.a;
        Button button = jVar.E.z;
        if (!this.b.a) {
            li91.e(new WaitConnectionSlab$performBind$4$1$1(jVar, null), button);
            if (button.getVisibility() == 0) {
                button.setAlpha(0.0f);
                u.j(button);
            }
        }
        return zy11.a;
    }
}
