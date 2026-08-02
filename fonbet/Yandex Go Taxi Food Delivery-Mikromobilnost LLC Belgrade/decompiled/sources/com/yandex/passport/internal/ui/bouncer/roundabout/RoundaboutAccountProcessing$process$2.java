package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.internal.report.t4;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6b;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.RoundaboutAccountProcessing$process$2", f = "RoundaboutAccountProcessing.kt", l = {40, 42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RoundaboutAccountProcessing$process$2 extends SuspendLambda implements wls {
    final /* synthetic */ y1 $data;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundaboutAccountProcessing$process$2(e eVar, y1 y1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$data = y1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoundaboutAccountProcessing$process$2(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoundaboutAccountProcessing$process$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r10 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            y1 y1Var = this.$data;
            this.label = 1;
            obj = tje.k0(((com.yandex.passport.common.coroutine.b) eVar.a).c, new RoundaboutAccountProcessing$transform$2(eVar, y1Var, null), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        com.yandex.passport.internal.report.reporters.n nVar = this.this$0.c;
        nVar.getClass();
        nVar.f(t4.w, new com.yandex.passport.internal.report.a(list.size(), 18));
        l lVar = this.this$0.b;
        this.label = 2;
        lVar.getClass();
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        lVar.submitList(new ArrayList(list), new r6b(j18Var, 1));
        Object s = j18Var.s();
        if (s != coroutineSingletons) {
            s = zy11Var;
        }
        return s == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
