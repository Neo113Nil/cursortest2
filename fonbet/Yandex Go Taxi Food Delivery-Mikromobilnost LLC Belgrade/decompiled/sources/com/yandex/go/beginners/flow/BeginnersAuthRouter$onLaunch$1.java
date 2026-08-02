package com.yandex.go.beginners.flow;

import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import defpackage.jbh;
import defpackage.mvg;
import defpackage.mw2;
import defpackage.ny61;
import defpackage.qzj0;
import defpackage.rqo;
import defpackage.rx3;
import defpackage.tse;
import defpackage.um3;
import defpackage.wls;
import defpackage.xan;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.experiments.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.flow.BeginnersAuthRouter$onLaunch$1", f = "BeginnersAuthRouter.kt", l = {37, 43, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersAuthRouter$onLaunch$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersAuthRouter$onLaunch$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersAuthRouter$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersAuthRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r14 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        if (r14 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment;
        BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment2;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            q d = ((jbh) this.this$0.G).d(xan.h);
            this.label = 1;
            obj = d.b(this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    beginnersAuthPostloadExperiment2 = (BeginnersAuthPostloadExperiment) this.L$1;
                    kotlin.b.b(obj);
                    if (!((List) obj).isEmpty()) {
                        z = true;
                        b bVar = this.this$0;
                        bVar.D.c(new um3(Events$Zalogin$LoginContext.PRELOAD, new qzj0(new mw2(26, bVar, beginnersAuthPostloadExperiment2), new rx3(bVar, beginnersAuthPostloadExperiment2, z, 1)), beginnersAuthPostloadExperiment2.c, z, 16));
                        return zy11.a;
                    }
                    beginnersAuthPostloadExperiment = beginnersAuthPostloadExperiment2;
                    beginnersAuthPostloadExperiment2 = beginnersAuthPostloadExperiment;
                    z = false;
                    b bVar2 = this.this$0;
                    bVar2.D.c(new um3(Events$Zalogin$LoginContext.PRELOAD, new qzj0(new mw2(26, bVar2, beginnersAuthPostloadExperiment2), new rx3(bVar2, beginnersAuthPostloadExperiment2, z, 1)), beginnersAuthPostloadExperiment2.c, z, 16));
                    return zy11.a;
                }
                i = this.I$0;
                kotlin.b.b(obj);
                beginnersAuthPostloadExperiment = (BeginnersAuthPostloadExperiment) obj;
                if (i != 0) {
                    ru.yandex.taxi.am.internal.d dVar = this.this$0.H;
                    this.L$0 = null;
                    this.L$1 = beginnersAuthPostloadExperiment;
                    this.I$0 = i;
                    this.label = 3;
                    Object b = dVar.b(this);
                    if (b != coroutineSingletons) {
                        beginnersAuthPostloadExperiment2 = beginnersAuthPostloadExperiment;
                        obj = b;
                        if (!((List) obj).isEmpty()) {
                        }
                    }
                    return coroutineSingletons;
                }
                beginnersAuthPostloadExperiment2 = beginnersAuthPostloadExperiment;
                z = false;
                b bVar22 = this.this$0;
                bVar22.D.c(new um3(Events$Zalogin$LoginContext.PRELOAD, new qzj0(new mw2(26, bVar22, beginnersAuthPostloadExperiment2), new rx3(bVar22, beginnersAuthPostloadExperiment2, z, 1)), beginnersAuthPostloadExperiment2.c, z, 16));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        xan xanVar = (xan) obj;
        i = (xanVar.b && xanVar.c) ? 1 : 0;
        rqo rqoVar = this.this$0.G;
        BeginnersAuthPostloadExperiment.Companion.getClass();
        q d2 = ((jbh) rqoVar).d(BeginnersAuthPostloadExperiment.i);
        this.L$0 = null;
        this.I$0 = i;
        this.label = 2;
        obj = d2.b(this);
    }
}
