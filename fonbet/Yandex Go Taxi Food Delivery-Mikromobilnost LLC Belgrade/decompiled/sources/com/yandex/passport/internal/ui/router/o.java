package com.yandex.passport.internal.ui.router;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.t40;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements u40, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginRouterActivity b;

    public /* synthetic */ o(LoginRouterActivity loginRouterActivity, int i) {
        this.a = i;
        this.b = loginRouterActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        LoginRouterActivity loginRouterActivity = this.b;
        switch (i) {
            case 0:
                loginRouterActivity.processBearResult((t40) obj);
                break;
            case 1:
                loginRouterActivity.processBearResult((t40) obj);
                break;
            default:
                loginRouterActivity.processResult((t40) obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof u40) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof u40) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof u40) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, this.b, LoginRouterActivity.class, "processBearResult", "processBearResult(Lcom/lightside/android/ActivityResult;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, this.b, LoginRouterActivity.class, "processBearResult", "processBearResult(Lcom/lightside/android/ActivityResult;)V", 0);
            default:
                return new FunctionReferenceImpl(1, this.b, LoginRouterActivity.class, "processResult", "processResult(Lcom/lightside/android/ActivityResult;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
