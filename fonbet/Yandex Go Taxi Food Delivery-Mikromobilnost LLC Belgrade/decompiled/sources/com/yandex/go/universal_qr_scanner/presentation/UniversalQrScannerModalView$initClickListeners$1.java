package com.yandex.go.universal_qr_scanner.presentation;

import defpackage.ibw0;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class UniversalQrScannerModalView$initClickListeners$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m206invoke() {
        d dVar = (d) this.receiver;
        tje.N(dVar.Jg(), null, null, new UniversalQrScannerPresenter$onTorchButtonClicked$1(dVar, null), 3);
        ibw0 ibw0Var = dVar.E.a;
        ibw0Var.getClass();
        ibw0Var.a.a("SuperappMain.UniversalQR.LumosTapped", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m206invoke();
        return zy11.a;
    }
}
