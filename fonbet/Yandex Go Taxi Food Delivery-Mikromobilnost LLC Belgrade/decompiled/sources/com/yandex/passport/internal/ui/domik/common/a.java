package com.yandex.passport.internal.ui.domik.common;

import android.app.PendingIntent;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePhoneNumberFragment b;

    public /* synthetic */ a(BasePhoneNumberFragment basePhoneNumberFragment, int i) {
        this.a = i;
        this.b = basePhoneNumberFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 startPhoneNumberHint$lambda$1;
        zy11 onViewCreated$lambda$8;
        int i = this.a;
        BasePhoneNumberFragment basePhoneNumberFragment = this.b;
        switch (i) {
            case 0:
                startPhoneNumberHint$lambda$1 = BasePhoneNumberFragment.startPhoneNumberHint$lambda$1(basePhoneNumberFragment, (PendingIntent) obj);
                return startPhoneNumberHint$lambda$1;
            default:
                onViewCreated$lambda$8 = BasePhoneNumberFragment.onViewCreated$lambda$8(basePhoneNumberFragment, ((Boolean) obj).booleanValue());
                return onViewCreated$lambda$8;
        }
    }
}
