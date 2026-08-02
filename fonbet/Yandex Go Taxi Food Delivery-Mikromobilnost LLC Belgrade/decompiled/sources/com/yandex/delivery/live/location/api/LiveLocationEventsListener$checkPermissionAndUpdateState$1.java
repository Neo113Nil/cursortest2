package com.yandex.delivery.live.location.api;

import defpackage.ha2;
import defpackage.jl40;
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
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.live.location.api.LiveLocationEventsListener$checkPermissionAndUpdateState$1", f = "LiveLocationEventsListener.kt", l = {HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LiveLocationEventsListener$checkPermissionAndUpdateState$1 extends SuspendLambda implements wls {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationEventsListener$checkPermissionAndUpdateState$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LiveLocationEventsListener$checkPermissionAndUpdateState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveLocationEventsListener$checkPermissionAndUpdateState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r6.a(false, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            d = this.this$0.d.d();
            ha2 ha2Var = this.this$0.a.b;
            this.Z$0 = d;
            this.label = 1;
            obj = e.y(ha2Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            d = this.Z$0;
            b.b(obj);
        }
        Boolean bool = (Boolean) obj;
        if (!d && jl40.l(bool, Boolean.TRUE)) {
            com.yandex.delivery.live.location.impl.repository.b bVar = this.this$0.a;
            this.L$0 = null;
            this.Z$0 = d;
            this.label = 2;
        }
        return zy11.a;
    }
}
