package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.q5z;
import defpackage.v7p;

/* loaded from: classes15.dex */
public final class y implements v7p {
    public final /* synthetic */ int a;
    public final x b;

    public /* synthetic */ y(x xVar, int i) {
        this.a = i;
        this.b = xVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        x xVar = this.b;
        switch (i) {
            case 0:
                return xVar.a;
            default:
                SlothParams slothParams = xVar.b;
                q5z.i(slothParams);
                return slothParams;
        }
    }
}
