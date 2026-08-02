package com.yandex.passport.internal;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.base.BaseNextFragment;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.extaction.ExternalActionFragment;
import com.yandex.passport.internal.ui.domik.phone_number.PhoneNumberFragment;
import com.yandex.passport.internal.ui.social.gimap.MailGIMAPActivity;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String makeCheckAuthenticator;
        ModernAccount modernAccount;
        com.yandex.passport.internal.ui.base.h lambda$onCreate$0;
        Fragment lambda$showIdentifier$2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (com.yandex.passport.internal.ui.base.h) obj;
            case 1:
                return (Bitmap) obj;
            case 2:
                makeCheckAuthenticator = ((BaseActivity) obj).makeCheckAuthenticator();
                return makeCheckAuthenticator;
            case 3:
                modernAccount = ((SocialBindActivity) obj).getModernAccount();
                return modernAccount;
            case 4:
                lambda$onCreate$0 = ((BaseNextFragment) obj).lambda$onCreate$0();
                return lambda$onCreate$0;
            case 5:
                return PhoneNumberFragment.newInstance((RegTrack) obj);
            case 6:
                ExternalActionFragment.Companion.getClass();
                return (ExternalActionFragment) BaseDomikFragment.baseNewInstance((AuthTrack) obj, new com.yandex.passport.internal.ui.authbytrack.b(1));
            case 7:
                lambda$showIdentifier$2 = ((MailGIMAPActivity) obj).lambda$showIdentifier$2();
                return lambda$showIdentifier$2;
            default:
                return ((com.yandex.passport.internal.util.e) obj).a();
        }
    }
}
