package com.yandex.go.trusted_contacts.ui;

import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import defpackage.rh11;
import defpackage.sh11;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ sh11 a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ErrorScreenAction errorScreenAction = (ErrorScreenAction) obj;
        int i = errorScreenAction == null ? -1 : rh11.c[errorScreenAction.ordinal()];
        if (i != -1 && i != 1 && i != 2) {
            if (i != 3) {
                w511.b();
                return null;
            }
            sh11 sh11Var = this.a;
            tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$onReloadTrustedContacts$1(sh11Var, null), 3);
        }
        return zy11.a;
    }
}
