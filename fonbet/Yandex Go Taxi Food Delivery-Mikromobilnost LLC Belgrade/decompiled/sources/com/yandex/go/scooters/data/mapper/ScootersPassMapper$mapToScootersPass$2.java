package com.yandex.go.scooters.data.mapper;

import defpackage.bvf0;
import defpackage.fef;
import defpackage.g590;
import defpackage.i8w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sco0;
import defpackage.tl90;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsco0;", "<anonymous>", "(Ltse;)Lsco0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$mapToScootersPass$2", f = "ScootersPassMapper.kt", l = {72, 80}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$mapToScootersPass$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ boolean $depositExperimentEnabled;
    final /* synthetic */ g590 $packages;
    final /* synthetic */ tl90 $passes;
    final /* synthetic */ i8w0 $superPasses;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$mapToScootersPass$2(g590 g590Var, d dVar, fef fefVar, i8w0 i8w0Var, tl90 tl90Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$packages = g590Var;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
        this.$superPasses = i8w0Var;
        this.$passes = tl90Var;
        this.$depositExperimentEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassMapper$mapToScootersPass$2(this.$packages, this.this$0, this.$currencyRules, this.$superPasses, this.$passes, this.$depositExperimentEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$mapToScootersPass$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r12 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r12 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (sco0) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (sco0) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g590 g590Var = this.$packages;
        if (g590Var != null) {
            d dVar = this.this$0;
            fef fefVar = this.$currencyRules;
            i8w0 i8w0Var = this.$superPasses;
            String str = this.$passes.c;
            boolean z = this.$depositExperimentEnabled;
            this.label = 1;
            dVar.getClass();
            obj = bvf0.n(new ScootersPassMapper$buildMinutePackages$2(str, g590Var, dVar, fefVar, i8w0Var, z, null), this);
        } else {
            i8w0 i8w0Var2 = this.$superPasses;
            if (i8w0Var2 == null) {
                return null;
            }
            d dVar2 = this.this$0;
            fef fefVar2 = this.$currencyRules;
            String str2 = this.$passes.c;
            this.label = 2;
            dVar2.getClass();
            obj = bvf0.n(new ScootersPassMapper$whenSuperPassesAvailableOnly$2(fefVar2, i8w0Var2, dVar2, str2, null), this);
        }
        return coroutineSingletons;
    }
}
