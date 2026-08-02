package com.yandex.go.drive.mapselection;

import defpackage.fnx0;
import defpackage.rfu0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChangeMapObjectByTariffSelectionInteractorImpl$listenTariffSelection$3 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fnx0 fnx0Var = (fnx0) obj;
        Continuation continuation = (Continuation) obj2;
        a aVar = (a) this.receiver;
        aVar.getClass();
        return fnx0Var.c.u0 == TariffOrderFlow.DRIVE_FLOW ? aVar.a(fnx0Var, continuation) : rfu0.i;
    }
}
