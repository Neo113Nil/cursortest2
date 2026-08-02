package com.yandex.go.sharing_personal_goals;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import com.yandex.go.sharing_personal_goals.data.model.SharingServiceNameDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qsr0;
import defpackage.rsr0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkrr0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1", f = "SharingPersonalGoalsUiStateInteractor.kt", l = {31, 32}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1 extends SuspendLambda implements wls {
    final /* synthetic */ SharingPersonalGoalsServiceName $serviceName;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ rsr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1(rsr0 rsr0Var, SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rsr0Var;
        this.$serviceName = sharingPersonalGoalsServiceName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1 sharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1 = new SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1(this.this$0, this.$serviceName, continuation);
        sharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1.L$0 = obj;
        return sharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsUiStateInteractor$listenSharingPersonalGoals$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r0.emit((defpackage.krr0) r8, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SharingServiceNameDto sharingServiceNameDto;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.sharing_personal_goals.data.a aVar = this.this$0.a;
            int i2 = qsr0.a[this.$serviceName.ordinal()];
            if (i2 == 1) {
                sharingServiceNameDto = SharingServiceNameDto.SCOOTERS;
            } else if (i2 == 2) {
                sharingServiceNameDto = SharingServiceNameDto.CHARGERS;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                sharingServiceNameDto = SharingServiceNameDto.DRIVE;
            }
            this.L$0 = vprVar;
            this.label = 1;
            obj = aVar.b(sharingServiceNameDto, this);
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
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
