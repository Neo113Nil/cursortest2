package com.yandex.fintechsdk.features.bdui.internal.presentation.action.plus;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.fke;
import defpackage.hk3;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.ns31;
import defpackage.q770;
import defpackage.qk3;
import defpackage.tje;
import defpackage.tse;
import defpackage.xk3;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final hk3 a;
    public final fke b;
    public final ns31 c;

    public a(hk3 hk3Var, fke fkeVar, DefaultEnvironment defaultEnvironment, ns31 ns31Var) {
        this.a = hk3Var;
        this.b = fkeVar;
        this.c = ns31Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        Context context;
        tse tseVar;
        if (!(ig5Var instanceof q770) || (context = (Context) this.b.a()) == null || (tseVar = (tse) this.c.a()) == null) {
            return;
        }
        xk3 xk3Var = (xk3) this.a.c.a.getValue();
        if (xk3Var instanceof qk3) {
            tje.N(tseVar, null, null, new OpenPlusActionHandler$handle$1(this, xk3Var, context, ig5Var, jh5Var, null), 3);
        }
    }
}
