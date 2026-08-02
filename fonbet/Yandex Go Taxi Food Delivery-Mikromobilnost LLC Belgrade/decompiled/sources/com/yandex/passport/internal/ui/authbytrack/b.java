package com.yandex.passport.internal.ui.authbytrack;

import com.yandex.passport.internal.ui.domik.extaction.ExternalActionFragment;
import com.yandex.passport.internal.ui.domik.identifier.IdentifierCredentialManagerFragment;
import com.yandex.passport.internal.ui.domik.phone_number.PhoneNumberFragment;
import com.yandex.passport.internal.ui.domik.relogin.ReloginFragment;
import com.yandex.passport.internal.ui.domik.sms.SmsFragment;
import com.yandex.passport.internal.ui.domik.smsauth.AuthBySmsFragment;
import com.yandex.passport.internal.ui.domik.username.UsernameInputFragment;
import com.yandex.passport.internal.ui.social.gimap.ImapServerPrefsFragment;
import com.yandex.passport.internal.ui.social.gimap.SmtpServerPrefsFragment;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        f onCreate$lambda$0;
        switch (this.a) {
            case 0:
                onCreate$lambda$0 = AuthByTrackActivity.onCreate$lambda$0();
                return onCreate$lambda$0;
            case 1:
                return new ExternalActionFragment();
            case 2:
                return new IdentifierCredentialManagerFragment();
            case 3:
                return new PhoneNumberFragment();
            case 4:
                return new ReloginFragment();
            case 5:
                return new SmsFragment();
            case 6:
                return new AuthBySmsFragment();
            case 7:
                return new UsernameInputFragment();
            case 8:
                return SmtpServerPrefsFragment.newInstance();
            default:
                return ImapServerPrefsFragment.newInstance();
        }
    }
}
