package com.yandex.passport.internal.autologin.ui;

import android.view.View;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.call.CallConfirmFragment;
import com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment;
import com.yandex.passport.internal.ui.domik.common.BaseSmsFragment;
import com.yandex.passport.internal.ui.domik.common.BaseUsernameInputFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AutologinSuccessView.lambda$17$lambda$16((AutologinSuccessView) obj, view);
                break;
            case 1:
                ((AutoLoginRetryActivity) obj).lambda$onCreate$1(view);
                break;
            case 2:
                ((DomikActivity) obj).lambda$onCreate$0(view);
                break;
            case 3:
                ((CallConfirmFragment) obj).validate();
                break;
            case 4:
                BasePhoneNumberFragment.onViewCreated$lambda$7((BasePhoneNumberFragment) obj, view);
                break;
            case 5:
                ((BaseSmsFragment) obj).lambda$onViewCreated$1(view);
                break;
            case 6:
                BaseUsernameInputFragment.onViewCreated$lambda$0((BaseUsernameInputFragment) obj, view);
                break;
            default:
                com.yandex.passport.internal.ui.util.a aVar = (com.yandex.passport.internal.ui.util.a) obj;
                aVar.e = true;
                aVar.a();
                if (aVar.f < System.currentTimeMillis()) {
                    aVar.b.invoke();
                    break;
                }
                break;
        }
    }
}
