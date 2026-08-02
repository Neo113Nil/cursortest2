package com.yandex.go.scooters.domain;

import com.yandex.go.eboks.objects.api.MapObjectAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pxn0;
import defpackage.qxn0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yxn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/eboks/objects/api/MapObjectAction;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1", f = "ScootersEboksObjectsActionHandler.kt", l = {58, 64}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1 extends SuspendLambda implements wls {
    final /* synthetic */ pxn0 $action$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1(Continuation continuation, q qVar, pxn0 pxn0Var) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$action$inlined = pxn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1 scootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1 = new ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1(continuation, this.this$0, this.$action$inlined);
        scootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1.L$0 = obj;
        return scootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersEboksObjectsActionHandler$handleAction$$inlined$listenToMapSelection$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r7.a(r0, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L17;
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
            MapObjectAction mapObjectAction = MapObjectAction.SELECT;
            this.L$0 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        qxn0 a = this.this$0.b.a();
        if (a != null) {
            yxn0 yxn0Var = (yxn0) this.$action$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
