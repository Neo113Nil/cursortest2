package com.yandex.passport.internal.ui.sloth.screen;

import android.content.Context;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.c0;
import defpackage.q5z;
import defpackage.v7p;
import defpackage.yvf0;

/* loaded from: classes15.dex */
public final class c implements v7p {
    public final /* synthetic */ int a;
    public final b b;
    public final yvf0 c;

    public /* synthetic */ c(b bVar, yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.sloth.h hVar = (com.yandex.passport.internal.sloth.h) yvf0Var.get();
                bVar.getClass();
                return hVar.a();
            case 1:
                Context context = (Context) yvf0Var.get();
                bVar.getClass();
                return new com.yandex.passport.internal.ui.sloth.h(context);
            case 2:
                com.yandex.passport.sloth.dependencies.b bVar2 = (com.yandex.passport.sloth.dependencies.b) yvf0Var.get();
                bVar.getClass();
                com.yandex.passport.sloth.dependencies.h hVar2 = bVar2.d;
                q5z.i(hVar2);
                return hVar2;
            default:
                SlothParams slothParams = (SlothParams) yvf0Var.get();
                bVar.getClass();
                c0 variant = slothParams.getVariant();
                q5z.i(variant);
                return variant;
        }
    }
}
