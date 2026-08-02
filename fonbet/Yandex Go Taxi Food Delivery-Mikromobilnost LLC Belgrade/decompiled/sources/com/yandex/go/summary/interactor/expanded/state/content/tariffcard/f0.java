package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.design.compose.toolbar.StatusBarType;
import defpackage.f6v;
import defpackage.h6v;
import defpackage.krl;
import defpackage.lrl;
import defpackage.m8u0;
import defpackage.ny61;
import defpackage.pdu;
import defpackage.qdu;
import defpackage.rcx0;
import defpackage.rdu;
import defpackage.scc;
import defpackage.sdu;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f0 implements vpr {
    public final /* synthetic */ vpr a;

    public f0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1 tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1;
        int i;
        rcx0 krlVar;
        StatusBarType statusBarType;
        if (continuation instanceof TariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1) {
            tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1 = (TariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1) continuation;
            int i2 = tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f6v f6vVar = (f6v) obj;
                    h6v h6vVar = f6vVar.a;
                    sdu sduVar = (sdu) f6vVar.b;
                    boolean z = sduVar instanceof pdu;
                    if (z) {
                        krlVar = new lrl(((pdu) sduVar).a, true);
                    } else {
                        if (!(sduVar instanceof qdu) && !(sduVar instanceof rdu)) {
                            w511.b();
                            return null;
                        }
                        krlVar = new krl(sduVar.getId(), true);
                    }
                    List g = scc.g(sduVar, krlVar);
                    if (z) {
                        statusBarType = StatusBarType.ForceDark;
                    } else {
                        if (!(sduVar instanceof qdu) && !(sduVar instanceof rdu)) {
                            w511.b();
                            return null;
                        }
                        statusBarType = StatusBarType.SyncWithTheme;
                    }
                    f6v f6vVar2 = new f6v(h6vVar, new Pair(new m8u0(statusBarType), g));
                    tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.L$0 = null;
                    tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.L$1 = null;
                    tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.L$2 = null;
                    tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.L$3 = null;
                    tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                    if (this.a.emit(f6vVar2, tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1 = new TariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1(this, continuation);
        Object obj22 = tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$statusBarAndHeaderWithDividerFlow$$inlined$mapIdentifiable$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
