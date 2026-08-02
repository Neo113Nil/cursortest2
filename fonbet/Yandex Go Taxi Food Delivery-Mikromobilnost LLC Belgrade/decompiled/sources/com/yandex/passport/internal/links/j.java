package com.yandex.passport.internal.links;

import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.domik.common.BaseSmsFragment;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements com.yandex.passport.internal.ui.util.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LinksHandlingActivity.onCreate$lambda$5((LinksHandlingActivity) obj2, (e) obj);
                break;
            case 1:
                ((AutoLoginRetryActivity) obj2).showProgress(((Boolean) obj).booleanValue());
                break;
            case 2:
                ((BaseSmsFragment) obj2).lambda$onViewCreated$5((PhoneConfirmationResult) obj);
                break;
            default:
                MailPasswordLoginFragment.onViewCreated$lambda$1((MailPasswordLoginFragment) obj2, (ModernAccount) obj);
                break;
        }
    }
}
