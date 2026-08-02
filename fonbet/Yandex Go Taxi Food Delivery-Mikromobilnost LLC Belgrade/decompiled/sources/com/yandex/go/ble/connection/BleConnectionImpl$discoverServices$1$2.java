package com.yandex.go.ble.connection;

import android.bluetooth.BluetoothGatt;
import defpackage.cia1;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ble.connection.BleConnectionImpl$discoverServices$1$2", f = "BleConnectionImpl.kt", l = {372}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BleConnectionImpl$discoverServices$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ BluetoothGatt $gatt;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleConnectionImpl$discoverServices$1$2(a aVar, BluetoothGatt bluetoothGatt, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$gatt = bluetoothGatt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleConnectionImpl$discoverServices$1$2(this.this$0, this.$gatt, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BleConnectionImpl$discoverServices$1$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0041 -> B:5:0x0044). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        a aVar;
        BluetoothGatt bluetoothGatt;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            b.b(obj);
            i = 10;
            aVar = this.this$0;
            bluetoothGatt = this.$gatt;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            i = this.I$0;
            bluetoothGatt = (BluetoothGatt) this.L$1;
            aVar = (a) this.L$0;
            b.b(obj);
            hst hstVar = jst.e;
            if (!(!cia1.f(aVar.a) ? bluetoothGatt.discoverServices() : false)) {
                return Boolean.TRUE;
            }
            i2++;
            if (i2 < i) {
                return Boolean.FALSE;
            }
            long j = a.p;
            this.L$0 = aVar;
            this.L$1 = bluetoothGatt;
            this.I$0 = i;
            this.I$1 = i2;
            this.I$2 = i2;
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            hst hstVar2 = jst.e;
            if (!(!cia1.f(aVar.a) ? bluetoothGatt.discoverServices() : false)) {
            }
        }
    }
}
