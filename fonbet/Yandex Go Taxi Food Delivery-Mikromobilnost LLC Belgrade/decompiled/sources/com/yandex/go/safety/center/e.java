package com.yandex.go.safety.center;

import defpackage.j18;
import defpackage.nw7;
import defpackage.ny61;
import defpackage.v780;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes13.dex */
public final class e implements nw7 {
    public final j18 a;
    public final /* synthetic */ j b;

    public e(j jVar, j18 j18Var) {
        this.b = jVar;
        this.a = j18Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.nw7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v780 v780Var, Continuation continuation) {
        SafetyCenterProvider$OrderCancelResponseCallback$onResponse$1 safetyCenterProvider$OrderCancelResponseCallback$onResponse$1;
        int i;
        if (continuation instanceof SafetyCenterProvider$OrderCancelResponseCallback$onResponse$1) {
            safetyCenterProvider$OrderCancelResponseCallback$onResponse$1 = (SafetyCenterProvider$OrderCancelResponseCallback$onResponse$1) continuation;
            int i2 = safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.label;
                zy11 zy11Var = zy11.a;
                j18 j18Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DriveState driveState = v780Var.a.i;
                    if (driveState != DriveState.CANCELLED) {
                        j18Var.resumeWith(new Result.Failure(new IllegalStateException("Order not cancelled, state: " + driveState)));
                        return zy11Var;
                    }
                    j jVar = this.b;
                    com.yandex.go.taxi.order.provider.a aVar = jVar.k;
                    String str = jVar.d.b;
                    if (str == null) {
                        ny61.r("Required value was null.");
                        return null;
                    }
                    safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.L$0 = null;
                    safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.label = 1;
                    if (aVar.h(str, true, false, safetyCenterProvider$OrderCancelResponseCallback$onResponse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                j18Var.resumeWith(zy11Var);
                return zy11Var;
            }
        }
        safetyCenterProvider$OrderCancelResponseCallback$onResponse$1 = new SafetyCenterProvider$OrderCancelResponseCallback$onResponse$1(this, continuation);
        Object obj2 = safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterProvider$OrderCancelResponseCallback$onResponse$1.label;
        zy11 zy11Var2 = zy11.a;
        j18 j18Var2 = this.a;
        if (i != 0) {
        }
        j18Var2.resumeWith(zy11Var2);
        return zy11Var2;
    }

    @Override // defpackage.nw7
    public final void onError(Throwable th) {
        this.a.resumeWith(new Result.Failure(th));
    }
}
