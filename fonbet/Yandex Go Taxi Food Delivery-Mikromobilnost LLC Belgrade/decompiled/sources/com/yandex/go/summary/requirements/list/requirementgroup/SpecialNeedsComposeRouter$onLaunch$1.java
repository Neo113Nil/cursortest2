package com.yandex.go.summary.requirements.list.requirementgroup;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jl40;
import defpackage.lmw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoe0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.requirements.list.requirementgroup.SpecialNeedsComposeRouter$onLaunch$1", f = "SpecialNeedsComposeRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SpecialNeedsComposeRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ qoe0 $preloadBannerInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsComposeRouter$onLaunch$1(qoe0 qoe0Var, Continuation continuation) {
        super(2, continuation);
        this.$preloadBannerInteractor = qoe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialNeedsComposeRouter$onLaunch$1(this.$preloadBannerInteractor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialNeedsComposeRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoe0 qoe0Var = this.$preloadBannerInteractor;
            this.label = 1;
            List<String> list = qoe0Var.a.b;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Iterator it = qoe0Var.b.getRequirements().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((lmw0) obj2).getName(), str)) {
                        break;
                    }
                }
                lmw0 lmw0Var = (lmw0) obj2;
                if (lmw0Var != null) {
                    arrayList.add(lmw0Var);
                }
            }
            if (qoe0Var.c.c.c(arrayList, this) == coroutineSingletons) {
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
