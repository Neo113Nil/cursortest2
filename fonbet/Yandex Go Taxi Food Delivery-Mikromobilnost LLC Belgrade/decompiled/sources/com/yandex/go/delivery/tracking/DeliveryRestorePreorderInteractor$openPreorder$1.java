package com.yandex.go.delivery.tracking;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.DeliveryRestorePreorderInteractor$openPreorder$1", f = "DeliveryRestorePreorderInteractor.kt", l = {41, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRestorePreorderInteractor$openPreorder$1 extends SuspendLambda implements wls {
    final /* synthetic */ UUID $uuid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRestorePreorderInteractor$openPreorder$1(a aVar, UUID uuid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uuid = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryRestorePreorderInteractor$openPreorder$1(this.this$0, this.$uuid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryRestorePreorderInteractor$openPreorder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (com.yandex.go.delivery.tracking.a.a(r1, r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d dVar = this.this$0.c;
            String uuid = this.$uuid.toString();
            this.label = 1;
            obj = dVar.b.c(uuid, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a aVar = this.this$0;
        UUID uuid2 = this.$uuid;
        if (booleanValue) {
            String uuid3 = uuid2.toString();
            this.label = 2;
        } else {
            aVar.b.b(aVar.a.b(uuid2), false);
        }
        return zy11.a;
    }
}
