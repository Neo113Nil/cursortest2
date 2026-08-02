package com.yandex.passport.common.util;

import android.graphics.BitmapFactory;
import android.view.View;
import com.yandex.passport.internal.ui.AccountNotAuthorizedActivity;
import com.yandex.passport.internal.ui.AutoLoginActivity;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.authsdk.TurboAppFragment;
import com.yandex.passport.internal.ui.base.BaseNotificationActivity;
import com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment;
import com.yandex.passport.legacy.lx.j;
import defpackage.bx60;
import defpackage.iy60;
import defpackage.n751;
import defpackage.t070;
import defpackage.u1w;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements bx60, j, iy60, t070, com.yandex.passport.legacy.lx.a {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: a, reason: collision with other method in class */
    public void mo290a(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 4:
                AccountNotAuthorizedActivity.onCreate$lambda$2(th);
                break;
            case 5:
                AutoLoginActivity.onCreate$lambda$2(th);
                break;
            case 6:
                BaseActivity.lambda$runCheckAuthenticator$1(th);
                break;
            case 7:
                TurboAppFragment.showAccount$lambda$16(th);
                break;
            case 8:
                TurboAppFragment.showContent$lambda$12(th);
                break;
            default:
                com.yandex.passport.legacy.a.c("Failed to get debug information", th);
                break;
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 onCreate$lambda$2;
        switch (this.a) {
            case 0:
                u1w g = n751Var.a.g(647);
                view.setPadding(g.a, g.b, g.c, g.d);
                return n751.b;
            default:
                onCreate$lambda$2 = BaseNotificationActivity.onCreate$lambda$2(view, n751Var);
                return onCreate$lambda$2;
        }
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 2:
                com.yandex.passport.legacy.a.c("Error starting sms retriever", exc);
                break;
            default:
                BasePhoneNumberFragment.startPhoneNumberHint$lambda$4(exc);
                break;
        }
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        com.yandex.passport.legacy.a.a("Success starting sms retriever");
    }

    @Override // com.yandex.passport.legacy.lx.j
    public Object a(Object obj) {
        byte[] bArr = (byte[]) obj;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }
}
