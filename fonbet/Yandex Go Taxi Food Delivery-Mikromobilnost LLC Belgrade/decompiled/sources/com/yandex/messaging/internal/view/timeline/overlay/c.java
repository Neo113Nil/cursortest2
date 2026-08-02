package com.yandex.messaging.internal.view.timeline.overlay;

import defpackage.ad7;
import defpackage.g9v;
import defpackage.iai0;
import defpackage.jai0;
import defpackage.k9v;
import defpackage.sq60;
import defpackage.tje;

/* loaded from: classes15.dex */
public final class c extends k9v {
    public final /* synthetic */ jai0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ g9v c;

    public c(jai0 jai0Var, int i, g9v g9vVar) {
        this.a = jai0Var;
        this.b = i;
        this.c = g9vVar;
    }

    @Override // defpackage.k9v
    public final void d() {
        tje.e();
        this.a.f.d(this.b, this.c);
    }

    @Override // defpackage.k9v
    public final void e(ad7 ad7Var) {
        tje.e();
        jai0 jai0Var = this.a;
        jai0Var.e.d(this.b, ad7Var.a);
        tje.e();
        sq60 sq60Var = jai0Var.h;
        sq60Var.rewind();
        while (sq60Var.hasNext()) {
            ((ReactionsView$onAttachedToWindow$1) ((iai0) sq60Var.next()).a).invoke();
        }
    }
}
