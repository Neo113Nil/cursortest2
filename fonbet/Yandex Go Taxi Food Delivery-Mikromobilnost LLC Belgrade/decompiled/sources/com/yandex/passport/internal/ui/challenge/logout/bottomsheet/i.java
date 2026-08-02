package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Intent;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements u40, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;

    public /* synthetic */ i(LogoutBottomSheetActivity logoutBottomSheetActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                logoutBottomSheetActivity.deleteCallback((com.yandex.passport.api.r0) obj);
                break;
            case 1:
                logoutBottomSheetActivity.deleteCallback((com.yandex.passport.api.r0) obj);
                break;
            default:
                logoutBottomSheetActivity.setResult(((Number) obj).intValue(), new Intent());
                logoutBottomSheetActivity.finish();
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
                return new FunctionReferenceImpl(1, this.b, LogoutBottomSheetActivity.class, "deleteCallback", "deleteCallback(Lcom/yandex/passport/api/PassportDeleteResult;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, this.b, LogoutBottomSheetActivity.class, "deleteCallback", "deleteCallback(Lcom/yandex/passport/api/PassportDeleteResult;)V", 0);
            default:
                return new FunctionReferenceImpl(1, this.b, com.yandex.passport.internal.ui.c.class, "finishWithCode", "finishWithCode(Landroid/app/Activity;I)V", 1);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
