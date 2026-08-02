package com.ybsdk.core.utils.ext;

import android.content.Context;
import defpackage.b7u;
import defpackage.i5z0;
import defpackage.o400;
import defpackage.qk31;
import defpackage.qwt;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vnj;

/* loaded from: classes2.dex */
public final class d {
    public final Context a;
    public final boolean b;
    public b7u c = new vnj();

    public d(Context context, tpr tprVar, tse tseVar, boolean z) {
        this.a = context;
        this.b = z;
        sjh sjhVar = uyj.a;
        tje.N(tseVar, o400.a.x, null, new FlowExtKt$collectIn$2(tprVar, new qwt(1, this), null), 2);
    }

    public final void a(qk31 qk31Var) {
        i5z0.a.a("Vibrate pattern " + qk31Var + " in " + this.c, new Object[0]);
        this.c.b(qk31Var);
    }
}
