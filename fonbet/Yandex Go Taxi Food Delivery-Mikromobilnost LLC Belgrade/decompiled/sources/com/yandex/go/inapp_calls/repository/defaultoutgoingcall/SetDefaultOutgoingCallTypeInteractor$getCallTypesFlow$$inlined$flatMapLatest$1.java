package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import defpackage.g92;
import defpackage.kw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.repository.defaultoutgoingcall.SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1", f = "SetDefaultOutgoingCallTypeInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1(Continuation continuation, g gVar) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1 setDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1 = new SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        setDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        setDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return setDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kw kwVar;
        tpr fVar;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem;
        Map b;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem2;
        Map b2;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem3;
        Map b3;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem4;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) obj2;
            this.this$0.getClass();
            InAppCallExperiment.RememberMyChoice rememberMyChoice = inAppCallExperiment.o;
            InAppCallExperiment.RememberMyChoice rememberMyChoice2 = inAppCallExperiment.o;
            if ((rememberMyChoice != null ? rememberMyChoice.b : null) != null) {
                String i2 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice == null || (settingCardItem4 = rememberMyChoice.b) == null) ? null : settingCardItem4.getA());
                if (i2 != null) {
                    String i3 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice2 == null || (settingCardItem3 = rememberMyChoice2.b) == null || (b3 = settingCardItem3.getB()) == null) ? null : (String) b3.get("voip"));
                    if (i3 != null) {
                        String i4 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice2 == null || (settingCardItem2 = rememberMyChoice2.b) == null || (b2 = settingCardItem2.getB()) == null) ? null : (String) b2.get("phone"));
                        if (i4 != null) {
                            String i5 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice2 == null || (settingCardItem = rememberMyChoice2.b) == null || (b = settingCardItem.getB()) == null) ? null : (String) b.get("always_ask"));
                            if (i5 != null) {
                                kwVar = new kw(i2, i4, i3, i5, false);
                                if (kwVar != null) {
                                    fVar = new g92(2, null);
                                } else {
                                    g gVar = this.this$0;
                                    fVar = new f(gVar.a.d, kwVar, gVar);
                                }
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 1;
                                if (kotlinx.coroutines.flow.e.u(fVar, vprVar, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                }
            }
            kwVar = null;
            if (kwVar != null) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(fVar, vprVar, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
