package com.yandex.go.ble.connection;

import android.bluetooth.BluetoothGatt;
import defpackage.bvf0;
import defpackage.cia1;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z16;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ble.connection.BleConnectionImpl$gattCallback$1$startHeartbeat$1", f = "BleConnectionImpl.kt", l = {175}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class BleConnectionImpl$gattCallback$1$startHeartbeat$1 extends SuspendLambda implements wls {
    final /* synthetic */ BluetoothGatt $this_startHeartbeat;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleConnectionImpl$gattCallback$1$startHeartbeat$1(a aVar, BluetoothGatt bluetoothGatt, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$this_startHeartbeat = bluetoothGatt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleConnectionImpl$gattCallback$1$startHeartbeat$1 bleConnectionImpl$gattCallback$1$startHeartbeat$1 = new BleConnectionImpl$gattCallback$1$startHeartbeat$1(this.this$0, this.$this_startHeartbeat, continuation);
        bleConnectionImpl$gattCallback$1$startHeartbeat$1.L$0 = obj;
        return bleConnectionImpl$gattCallback$1$startHeartbeat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BleConnectionImpl$gattCallback$1$startHeartbeat$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        while (bvf0.D(tseVar) && (this.this$0.d.a.getValue() instanceof z16)) {
            if (cia1.f(this.this$0.a)) {
                this.$this_startHeartbeat.readRemoteRssi();
            }
            long j = a.q;
            this.L$0 = tseVar;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        hst hstVar = jst.e;
        return zy11.a;
    }
}
