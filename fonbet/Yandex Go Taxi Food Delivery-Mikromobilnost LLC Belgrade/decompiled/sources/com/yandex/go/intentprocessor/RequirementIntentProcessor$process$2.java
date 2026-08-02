package com.yandex.go.intentprocessor;

import com.yandex.go.zone.model.Zone;
import defpackage.ffj0;
import defpackage.gfj0;
import defpackage.jst;
import defpackage.k4l0;
import defpackage.m4l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q7z;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lp4l0;", "<anonymous>", "(Ltse;)Lp4l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.RequirementIntentProcessor$process$2", f = "RequirementIntentProcessor.kt", l = {24, 27, 28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RequirementIntentProcessor$process$2 extends SuspendLambda implements wls {
    final /* synthetic */ q7z $requirementModel;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementIntentProcessor$process$2(m mVar, q7z q7zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$requirementModel = q7zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementIntentProcessor$process$2(this.this$0, this.$requirementModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementIntentProcessor$process$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r6.b(r1, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        m mVar;
        ffj0 ffj0Var;
        Zone zone;
        ffj0 ffj0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.preorder.deeplinks.requirement.a aVar = this.this$0.a;
            gfj0 gfj0Var = this.$requirementModel.a;
            this.label = 1;
            a = aVar.a(gfj0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ffj0Var2 = (ffj0) this.L$0;
                    kotlin.b.b(obj);
                    return new m4l0(ffj0Var2);
                }
                zone = (Zone) this.L$2;
                ffj0 ffj0Var3 = (ffj0) this.L$1;
                mVar = (m) this.L$0;
                kotlin.b.b(obj);
                ffj0Var = ffj0Var3;
                ru.yandex.taxi.personalstate.domain.interactor.j jVar = mVar.c;
                this.L$0 = ffj0Var;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (jVar.a(zone, this) != coroutineSingletons) {
                    ffj0Var2 = ffj0Var;
                    return new m4l0(ffj0Var2);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        mVar = this.this$0;
        if (a instanceof Result.Failure) {
            Throwable a2 = Result.a(a);
            if (a2 != null) {
                xby.l(jst.e, "INTENT_PROCESSOR_ERROR:REQUIREMENT", null, a2, "Error fetching data from requirement deeplink", 2);
            }
            return k4l0.a;
        }
        ffj0Var = (ffj0) a;
        zone = ffj0Var.a.b;
        com.yandex.go.taxi.tariffs.interactor.b bVar = mVar.b;
        this.L$0 = mVar;
        this.L$1 = ffj0Var;
        this.L$2 = zone;
        this.label = 2;
    }
}
