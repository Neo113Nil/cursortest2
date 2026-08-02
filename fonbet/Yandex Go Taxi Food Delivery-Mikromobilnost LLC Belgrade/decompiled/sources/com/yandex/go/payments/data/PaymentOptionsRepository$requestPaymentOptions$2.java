package com.yandex.go.payments.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bei;
import defpackage.dc7;
import defpackage.dqh;
import defpackage.ec7;
import defpackage.fty;
import defpackage.h0a0;
import defpackage.jl40;
import defpackage.ky90;
import defpackage.l76;
import defpackage.lfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Loea0;", "<anonymous>", "(Ltse;)Loea0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.data.PaymentOptionsRepository$requestPaymentOptions$2", f = "PaymentOptionsRepository.kt", l = {61, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentOptionsRepository$requestPaymentOptions$2 extends SuspendLambda implements wls {
    final /* synthetic */ ky90 $context;
    final /* synthetic */ dqh $delegate;
    final /* synthetic */ boolean $forceUpdate;
    final /* synthetic */ h0a0 $geoContext;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsRepository$requestPaymentOptions$2(g gVar, ky90 ky90Var, dqh dqhVar, h0a0 h0a0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$context = ky90Var;
        this.$delegate = dqhVar;
        this.$geoContext = h0a0Var;
        this.$forceUpdate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentOptionsRepository$requestPaymentOptions$2(this.this$0, this.$context, this.$delegate, this.$geoContext, this.$forceUpdate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentOptionsRepository$requestPaymentOptions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r13 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r13 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        fty ftyVar = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (oea0) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (oea0) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.h = new lfa0(this.$context, this.$delegate, this.$geoContext);
        boolean z = this.$forceUpdate;
        g gVar = this.this$0;
        h0a0 h0a0Var = this.$geoContext;
        if (z) {
            ky90 ky90Var = this.$context;
            dqh dqhVar = this.$delegate;
            this.label = 1;
            obj = gVar.f(h0a0Var, ky90Var, dqhVar, this);
        } else {
            ky90 ky90Var2 = this.$context;
            dqh dqhVar2 = this.$delegate;
            this.label = 2;
            ec7 ec7Var = gVar.i;
            ConcurrentHashMap concurrentHashMap = gVar.f;
            if (ec7Var instanceof dc7) {
                zzs zzsVar2 = h0a0Var.a;
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    fty ftyVar2 = (fty) entry.getValue();
                    try {
                        zzsVar = (zzs) ((xnt) gVar.d).c(str, zzs.Companion.serializer());
                    } catch (SerializationException unused) {
                        zzsVar = null;
                    }
                    if (zzsVar != null && ru.yandex.taxi.map.utils.a.j(zzsVar, zzsVar2) <= ((dc7) ec7Var).a) {
                        ftyVar = ftyVar2;
                        break;
                    }
                }
            } else if (jl40.l(ec7Var, l76.y)) {
                ftyVar = (fty) concurrentHashMap.get(h0a0Var.b);
            } else if (!jl40.l(ec7Var, bei.z)) {
                w511.b();
                return null;
            }
            obj = ftyVar == null ? gVar.f(h0a0Var, ky90Var2, dqhVar2, this) : gVar.c(ky90Var2, dqhVar2, ftyVar);
        }
        return coroutineSingletons;
    }
}
