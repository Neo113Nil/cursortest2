package com.yandex.passport.internal.ui;

import android.os.Bundle;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.samlsso.SamlSsoAuthFragment;
import com.yandex.passport.internal.ui.domik.sms.SmsFragment;
import com.yandex.passport.internal.ui.domik.smsauth.AuthBySmsFragment;
import com.yandex.passport.internal.ui.domik.username.UsernameInputFragment;
import defpackage.wwg;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$finishBindApplication$0;
        com.yandex.passport.internal.ui.autologin.c lambda$onCreate$2;
        BaseDomikFragment baseNewInstance;
        BaseDomikFragment baseNewInstance2;
        BaseDomikFragment baseNewInstance3;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lambda$finishBindApplication$0 = ((SocialApplicationBindActivity) obj2).lambda$finishBindApplication$0((Uid) obj);
                return lambda$finishBindApplication$0;
            case 1:
                lambda$onCreate$2 = ((AutoLoginRetryActivity) obj2).lambda$onCreate$2((PassportProcessGlobalComponent) obj);
                return lambda$onCreate$2;
            case 2:
                AuthBySmsFragment.Companion.getClass();
                baseNewInstance = BaseDomikFragment.baseNewInstance((AuthTrack) obj2, new com.yandex.passport.internal.ui.authbytrack.b(6));
                AuthBySmsFragment authBySmsFragment = (AuthBySmsFragment) baseNewInstance;
                authBySmsFragment.getArguments().putParcelable("phone_confirmation_result", (PhoneConfirmationResult) obj);
                return authBySmsFragment;
            case 3:
                com.yandex.passport.internal.ui.domik.samlsso.e eVar = SamlSsoAuthFragment.Companion;
                AuthTrack b = com.yandex.passport.internal.ui.domik.c.b(AuthTrack.Companion, ((com.yandex.passport.internal.ui.domik.q) obj2).c);
                eVar.getClass();
                SamlSsoAuthFragment samlSsoAuthFragment = new SamlSsoAuthFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable(BaseTrack.KEY_TRACK, b);
                bundle.putString("auth_url_param", (String) obj);
                samlSsoAuthFragment.setArguments(bundle);
                return samlSsoAuthFragment;
            case 4:
                SmsFragment.Companion.getClass();
                baseNewInstance2 = BaseDomikFragment.baseNewInstance((RegTrack) obj2, new com.yandex.passport.internal.ui.authbytrack.b(5));
                SmsFragment smsFragment = (SmsFragment) baseNewInstance2;
                smsFragment.getArguments().putParcelable("phone_confirmation_result", (PhoneConfirmationResult) obj);
                return smsFragment;
            default:
                UsernameInputFragment.Companion.getClass();
                baseNewInstance3 = BaseDomikFragment.baseNewInstance((RegTrack) obj2, new com.yandex.passport.internal.ui.authbytrack.b(7));
                UsernameInputFragment usernameInputFragment = (UsernameInputFragment) baseNewInstance3;
                usernameInputFragment.requireArguments().putBundle("master_account_key", wwg.g(new Pair("master-account", (ModernAccount) obj)));
                return usernameInputFragment;
        }
    }
}
