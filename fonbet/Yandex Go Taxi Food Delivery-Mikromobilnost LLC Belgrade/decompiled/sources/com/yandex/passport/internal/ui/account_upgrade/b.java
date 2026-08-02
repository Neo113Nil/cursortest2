package com.yandex.passport.internal.ui.account_upgrade;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.t40;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements u40, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ AccountUpgraderActivity b;

    public /* synthetic */ b(AccountUpgraderActivity accountUpgraderActivity, int i) {
        this.a = i;
        this.b = accountUpgraderActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        AccountUpgraderActivity accountUpgraderActivity = this.b;
        switch (i) {
            case 0:
                accountUpgraderActivity.processResult((t40) obj);
                break;
            default:
                accountUpgraderActivity.processResult((t40) obj);
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
        return new FunctionReferenceImpl(1, this.b, AccountUpgraderActivity.class, "processResult", "processResult(Lcom/lightside/android/ActivityResult;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
