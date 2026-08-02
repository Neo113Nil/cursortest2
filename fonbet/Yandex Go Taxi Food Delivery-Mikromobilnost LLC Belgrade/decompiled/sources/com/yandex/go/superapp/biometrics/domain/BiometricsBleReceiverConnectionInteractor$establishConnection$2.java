package com.yandex.go.superapp.biometrics.domain;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import defpackage.hlm0;
import defpackage.ilm0;
import defpackage.jl40;
import defpackage.jlm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tse;
import defpackage.vbo;
import defpackage.w3f;
import defpackage.w511;
import defpackage.wbo;
import defpackage.wls;
import defpackage.wy5;
import defpackage.x3f;
import defpackage.xy5;
import defpackage.y16;
import defpackage.y3f;
import defpackage.z3f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxbo;", "<anonymous>", "(Ltse;)Lxbo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.domain.BiometricsBleReceiverConnectionInteractor$establishConnection$2", f = "BiometricsBleReceiverConnectionInteractor.kt", l = {60, 72, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricsBleReceiverConnectionInteractor$establishConnection$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $serviceUuid;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsBleReceiverConnectionInteractor$establishConnection$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$serviceUuid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricsBleReceiverConnectionInteractor$establishConnection$2(this.this$0, this.$serviceUuid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricsBleReceiverConnectionInteractor$establishConnection$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f1, code lost:
    
        if (r10 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        if (r10 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0061, code lost:
    
        if (r10 == r1) goto L58;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vbo vboVar = vbo.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        w3f w3fVar = w3f.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.superapp.biometrics.data.a aVar = this.this$0.d;
            String str = this.$serviceUuid;
            xy5 xy5Var = (xy5) aVar.c.getValue();
            if (!(xy5Var instanceof wy5) || !jl40.l(((wy5) xy5Var).a, str)) {
                com.yandex.go.ble.domain.a aVar2 = this.this$0.a;
                String str2 = this.$serviceUuid;
                this.label = 1;
                obj = aVar2.a(str2, this);
            }
            return wbo.a;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return vbo.c;
                }
                return wbo.a;
            }
            kotlin.b.b(obj);
            z3f z3fVar = (z3f) obj;
            if (jl40.l(z3fVar, w3fVar)) {
                return vbo.a;
            }
            if (!(z3fVar instanceof y3f)) {
                if (!(z3fVar instanceof x3f)) {
                    w511.b();
                    return null;
                }
                com.yandex.go.ble.connection.a aVar3 = ((x3f) z3fVar).a;
                com.yandex.go.superapp.biometrics.data.a aVar4 = this.this$0.d;
                String str3 = this.$serviceUuid;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                obj = aVar4.c(str3, aVar3, this);
            }
            return vboVar;
        }
        kotlin.b.b(obj);
        jlm0 jlm0Var = (jlm0) obj;
        if (jl40.l(jlm0Var, hlm0.c) || jl40.l(jlm0Var, hlm0.e)) {
            return vbo.f;
        }
        if (jl40.l(jlm0Var, hlm0.d)) {
            return vbo.e;
        }
        if (jl40.l(jlm0Var, hlm0.a)) {
            return vbo.b;
        }
        if (!jl40.l(jlm0Var, hlm0.b)) {
            if (!(jlm0Var instanceof ilm0)) {
                w511.b();
                return null;
            }
            String str4 = ((ilm0) jlm0Var).a;
            y16 y16Var = this.this$0.b;
            this.L$0 = null;
            this.label = 2;
            Context context = y16Var.a;
            BluetoothAdapter r = qje.r(context);
            if (r == null) {
                obj = w3fVar;
            } else {
                BluetoothDevice remoteDevice = r.getRemoteDevice(str4);
                obj = remoteDevice == null ? y3f.a : new x3f(new com.yandex.go.ble.connection.a(context, remoteDevice));
            }
        }
        return vboVar;
    }
}
