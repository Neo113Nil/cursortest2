package com.yandex.go.business.impl.router;

import defpackage.ag41;
import defpackage.bi41;
import defpackage.cu41;
import defpackage.i790;
import defpackage.m790;
import defpackage.scg;
import defpackage.vn51;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes12.dex */
public final class a implements bi41 {
    public final vn51 a;
    public final /* synthetic */ b b;

    public a(b bVar, vn51 vn51Var) {
        this.b = bVar;
        this.a = vn51Var;
    }

    @Override // defpackage.bi41
    public final void onPageFinished(String str) {
        b bVar = this.b;
        ((ag41) ((scg) bVar.S()).a()).c(cu41.c);
        SimpleSpinnerModalView simpleSpinnerModalView = bVar.I;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
    }

    @Override // defpackage.bi41
    public final void onPageLoadingError(m790 m790Var) {
        b bVar = this.b;
        ((ag41) ((scg) bVar.S()).a()).b(true);
        if (m790Var instanceof i790) {
            com.yandex.go.coroutines.b.g(bVar.o(), null, null, new YangoBusinessRouterImpl$InnerLoadingListener$onPageLoadingError$1(bVar, this, null), 3);
        }
        ((ag41) ((scg) bVar.S()).a()).c(cu41.d);
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        this.b.K.onPageStarted(str);
    }
}
