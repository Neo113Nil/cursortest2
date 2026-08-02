package com.yandex.mob;

import defpackage.idn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lin20;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainProcessKt$mapContourProvisions$1", f = "MobMainProcess.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainProcessKt$mapContourProvisions$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $contour;
    final /* synthetic */ tpr $this_mapContourProvisions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainProcessKt$mapContourProvisions$1(tpr tprVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_mapContourProvisions = tprVar;
        this.$contour = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MobMainProcessKt$mapContourProvisions$1 mobMainProcessKt$mapContourProvisions$1 = new MobMainProcessKt$mapContourProvisions$1(this.$this_mapContourProvisions, this.$contour, continuation);
        mobMainProcessKt$mapContourProvisions$1.L$0 = obj;
        return mobMainProcessKt$mapContourProvisions$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainProcessKt$mapContourProvisions$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_mapContourProvisions;
            idn idnVar = new idn(6, vprVar, this.$contour);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(idnVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
