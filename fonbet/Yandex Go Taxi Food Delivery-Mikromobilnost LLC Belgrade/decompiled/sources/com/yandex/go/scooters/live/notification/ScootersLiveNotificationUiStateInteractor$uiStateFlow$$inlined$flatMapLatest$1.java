package com.yandex.go.scooters.live.notification;

import defpackage.axn0;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "ScootersLiveNotificationUiStateInteractor.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ axn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(Continuation continuation, axn0 axn0Var) {
        super(3, continuation);
        this.this$0 = axn0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new ScootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersLiveNotificationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r8, r0, r7) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r8 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1 scootersLiveNotificationUiStateInteractor$uiStateFlow$2$1 = new ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1(this.this$0, (zuo0) obj2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = bvf0.n(scootersLiveNotificationUiStateInteractor$uiStateFlow$2$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
