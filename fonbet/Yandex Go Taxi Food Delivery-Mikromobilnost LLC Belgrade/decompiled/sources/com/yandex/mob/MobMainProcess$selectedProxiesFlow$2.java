package com.yandex.mob;

import com.yandex.mob.domain.s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ol20;
import defpackage.oo20;
import defpackage.rol0;
import defpackage.wls;
import defpackage.xo20;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzy11;", "it", "Ltpr;", "Lin20;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainProcess$selectedProxiesFlow$2", f = "MobMainProcess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainProcess$selectedProxiesFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ ol20[] $apiNames;
    final /* synthetic */ String $contour;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainProcess$selectedProxiesFlow$2(j jVar, String str, ol20[] ol20VarArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$contour = str;
        this.$apiNames = ol20VarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainProcess$selectedProxiesFlow$2(this.this$0, this.$contour, this.$apiNames, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainProcess$selectedProxiesFlow$2) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s sVar = (s) ((xo20) ((oo20) this.this$0.b.getValue())).B.getValue();
        String str = this.$contour;
        ol20[] ol20VarArr = this.$apiNames;
        return new rol0(new MobMainProcessKt$mapContourProvisions$1(sVar.a(str, (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length)), this.$contour, null));
    }
}
