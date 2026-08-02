package com.yandex.passport.internal.ui.router;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.t40;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class e implements u40, jms {
    public final /* synthetic */ GlobalRouterActivity a;

    public e(GlobalRouterActivity globalRouterActivity) {
        this.a = globalRouterActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        this.a.processResult((t40) obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u40) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, GlobalRouterActivity.class, "processResult", "processResult(Lcom/lightside/android/ActivityResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
