package com.yandex.go.scooters.discovery.shortcuts;

import com.yandex.mapkit.geometry.Polyline;
import defpackage.ah00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xvo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luc4;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.discovery.shortcuts.ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3", f = "ScootersShortcutsRequestTriggerRepository.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xvo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3(xvo0 xvo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xvo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3 scootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3 = new ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3(this.this$0, continuation);
        scootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3.L$0 = obj;
        return scootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShortcutsRequestTriggerRepository$listenInnerCameraBbox$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            ah00 ah00Var = this.this$0.a;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = ru.yandex.taxi.map.utils.a.K(ah00Var, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
