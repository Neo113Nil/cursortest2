package com.yandex.go.taxi.order.change.source.pin;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ b b;
    public final /* synthetic */ DriveState c;

    public a(tpr[] tprVarArr, b bVar, DriveState driveState) {
        this.a = tprVarArr;
        this.b = bVar;
        this.c = driveState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1 changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1) {
            changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1 = (ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1) continuation;
            int i2 = changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 10);
                    ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3 changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3 = new ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3(null, this.b, this.c);
                    changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.L$0 = null;
                    changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.L$1 = null;
                    changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.L$2 = null;
                    changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, v10Var, changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3, changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1 = new ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
