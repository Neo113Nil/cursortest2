package com.yandex.go.trusted_contacts.ui;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.DialogButton;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import defpackage.avj0;
import defpackage.gsh;
import defpackage.kyh0;
import defpackage.og11;
import defpackage.rh11;
import defpackage.sh11;
import defpackage.tje;
import defpackage.tls;
import defpackage.wg11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class TrustedContactsPresenter$showDialogWarning$2 extends FunctionReferenceImpl implements tls {
    public final void i(DialogButton dialogButton) {
        gsh gshVar;
        String str;
        sh11 sh11Var = (sh11) this.receiver;
        sh11Var.getClass();
        int i = dialogButton == null ? -1 : rh11.a[dialogButton.ordinal()];
        TrustedContactDto trustedContactDto = null;
        if (i == 1) {
            tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$confirmDeletion$1(sh11Var, null), 3);
            return;
        }
        if (i != 2) {
            return;
        }
        tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$cancelDeleteMode$1(sh11Var, null), 3);
        com.yandex.go.trusted_contacts.data.repositories.a aVar = sh11Var.y.a;
        og11 og11Var = aVar.i;
        if (og11Var != null && (gshVar = og11Var.g) != null && (str = gshVar.b) != null) {
            trustedContactDto = aVar.d(str);
        }
        if (trustedContactDto != null) {
            sh11Var.x.a(trustedContactDto, ShareSettingsMode.EDIT);
        } else {
            avj0 avj0Var = (avj0) sh11Var.A;
            sh11Var.Kg(new wg11(avj0Var.h(kyh0.error_occurred), avj0Var.h(kyh0.unknown_error_description), avj0Var.h(kyh0.try_again), ErrorScreenAction.TRY_AGAIN));
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((DialogButton) obj);
        return zy11.a;
    }
}
