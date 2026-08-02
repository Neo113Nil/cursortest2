package com.yandex.go.scooters.passes.data;

import com.yandex.go.scooters.passes.data.model.PassUpdateAutorenewParams;
import com.yandex.go.scooters.passes.model.PassPayment;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.data.ScootersPassesRepositoryImpl$updateAutorenew$2", f = "ScootersPassesRepositoryImpl.kt", l = {66, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesRepositoryImpl$updateAutorenew$2 extends SuspendLambda implements tls {
    final /* synthetic */ boolean $autorenew;
    final /* synthetic */ String $passId;
    final /* synthetic */ PassPayment $payment;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesRepositoryImpl$updateAutorenew$2(d dVar, String str, boolean z, PassPayment passPayment, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$passId = str;
        this.$autorenew = z;
        this.$payment = passPayment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersPassesRepositoryImpl$updateAutorenew$2(this.this$0, this.$passId, this.$autorenew, this.$payment, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersPassesRepositoryImpl$updateAutorenew$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r9, null, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r9 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersPassesApi scootersPassesApi;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            scootersPassesApi = dVar.b;
            ru.yandex.taxi.scooters.data.a aVar = dVar.d;
            this.L$0 = scootersPassesApi;
            this.label = 1;
            obj = aVar.a(false, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            scootersPassesApi = (ScootersPassesApi) this.L$0;
            kotlin.b.b(obj);
        }
        cmt<zy11> f = scootersPassesApi.f((Map) obj, new PassUpdateAutorenewParams(this.$passId, this.$autorenew, this.$payment));
        this.L$0 = null;
        this.label = 2;
    }
}
