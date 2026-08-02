package com.yandex.go.taxi.order.support.ui.support_menu;

import defpackage.piw0;
import defpackage.rjw0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SupportMenuModalView$onAttachedToWindow$2 extends FunctionReferenceImpl implements tls {
    public final void i(String str) {
        rjw0 rjw0Var = (rjw0) this.receiver;
        piw0 piw0Var = rjw0Var.A;
        piw0Var.b.set(false);
        piw0Var.b(piw0.a("MainScreen", "ListItemTapped"), new Pair("name", str));
        tje.N(rjw0Var.Jg(), null, null, new SupportMenuPresenter$onActionClick$1(rjw0Var, str, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
