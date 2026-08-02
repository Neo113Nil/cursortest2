package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.u40;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements u40, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetComposeActivity b;

    public /* synthetic */ n(LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetComposeActivity;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = this.b;
        switch (i) {
            case 0:
                logoutBottomSheetComposeActivity.onDeleteResult((com.yandex.passport.api.r0) obj);
                break;
            case 1:
                logoutBottomSheetComposeActivity.onLogoutResult(((Number) obj).intValue());
                break;
            case 2:
                logoutBottomSheetComposeActivity.onDeleteResult((com.yandex.passport.api.r0) obj);
                break;
            default:
                logoutBottomSheetComposeActivity.onLogoutResult(((Number) obj).intValue());
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
            case 2:
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
                return new FunctionReferenceImpl(1, this.b, LogoutBottomSheetComposeActivity.class, "onDeleteResult", "onDeleteResult(Lcom/yandex/passport/api/PassportDeleteResult;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, this.b, LogoutBottomSheetComposeActivity.class, "onLogoutResult", "onLogoutResult(I)V", 0);
            case 2:
                return new FunctionReferenceImpl(1, this.b, LogoutBottomSheetComposeActivity.class, "onDeleteResult", "onDeleteResult(Lcom/yandex/passport/api/PassportDeleteResult;)V", 0);
            default:
                return new FunctionReferenceImpl(1, this.b, LogoutBottomSheetComposeActivity.class, "onLogoutResult", "onLogoutResult(I)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
