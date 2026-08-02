package com.yandex.go.trusted_contacts.ui;

import defpackage.flr0;
import defpackage.gdj;
import defpackage.glr0;
import defpackage.ih11;
import defpackage.jl40;
import defpackage.kh11;
import defpackage.lh11;
import defpackage.mh11;
import defpackage.nh11;
import defpackage.sh11;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ sh11 a;

    public c(sh11 sh11Var) {
        this.a = sh11Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        nh11 nh11Var = (nh11) obj;
        boolean l = jl40.l(nh11Var, kh11.a);
        sh11 sh11Var = this.a;
        if (l) {
            sh11Var.x.b();
        } else if (nh11Var instanceof lh11) {
            gdj gdjVar = ((lh11) nh11Var).a;
            tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$showDialogWarning$1(sh11Var, null), 3);
            ih11 ih11Var = sh11Var.x;
            TrustedContactsPresenter$showDialogWarning$2 trustedContactsPresenter$showDialogWarning$2 = new TrustedContactsPresenter$showDialogWarning$2(1, sh11Var, sh11.class, "onDialogButtonClick", "onDialogButtonClick(Lcom/yandex/go/trusted_contacts/domain/entities/DialogButton;)V", 0);
            glr0 glr0Var = ih11Var.a;
            glr0Var.z(glr0Var.G.a(gdjVar), new flr0(1, trustedContactsPresenter$showDialogWarning$2));
        } else if (nh11Var instanceof mh11) {
            sh11Var.Kg(((mh11) nh11Var).a);
        } else if (!jl40.l(nh11Var, kh11.b)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
