package com.yandex.go.trusted_contacts.ui;

import defpackage.sh11;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class TrustedContactsModalView$onAttachedToWindow$3 extends FunctionReferenceImpl implements tls {
    public final void i(String str) {
        sh11 sh11Var = (sh11) this.receiver;
        tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$onDeleteTrustingContactButtonClicked$1(sh11Var, str, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
