package com.yandex.passport.internal.ui.authsdk;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements u40, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ AuthSdkActivity b;

    public /* synthetic */ d(AuthSdkActivity authSdkActivity, int i) {
        this.a = i;
        this.b = authSdkActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        AuthSdkActivity authSdkActivity = this.b;
        switch (i) {
            case 0:
                authSdkActivity.onAuthSdkResult((com.yandex.passport.internal.ui.sloth.authsdk.g) obj);
                break;
            default:
                authSdkActivity.onAuthSdkResult((com.yandex.passport.internal.ui.sloth.authsdk.g) obj);
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
        }
        return new FunctionReferenceImpl(1, this.b, AuthSdkActivity.class, "onAuthSdkResult", "onAuthSdkResult(Lcom/yandex/passport/internal/ui/sloth/authsdk/AuthSdkResult;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
