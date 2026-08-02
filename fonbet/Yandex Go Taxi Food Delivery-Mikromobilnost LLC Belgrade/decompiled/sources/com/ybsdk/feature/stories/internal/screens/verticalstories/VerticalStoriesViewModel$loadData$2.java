package com.ybsdk.feature.stories.internal.screens.verticalstories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.og31;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.smu0;
import defpackage.tse;
import defpackage.v4b1;
import defpackage.vou0;
import defpackage.wls;
import defpackage.wou0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesViewModel$loadData$2", f = "VerticalStoriesViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class VerticalStoriesViewModel$loadData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalStoriesViewModel$loadData$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalStoriesViewModel$loadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalStoriesViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.ybsdk.feature.stories.internal.domain.a aVar = cVar.C;
            String startStoryId = cVar.B.getStartStoryId();
            this.label = 1;
            b = aVar.b(startStoryId, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        c cVar2 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            og31 og31Var = (og31) b;
            cVar2.getClass();
            Iterator it = og31Var.a.iterator();
            while (it.hasNext()) {
                for (wou0 wou0Var : ((smu0) it.next()).b) {
                    if (wou0Var instanceof vou0) {
                        v4b1.g(((vou0) wou0Var).h, cVar2.D);
                    }
                }
            }
            pz40 Y = cVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, b.a((b) value2, new r8j0(og31Var, null, 14), 0, 0, 0, 0, null, 62)));
        }
        c cVar3 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            pz40 Y2 = cVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, b.a((b) value, new s8j0(a), 0, 0, 0, 0, null, 62)));
        }
        return zy11.a;
    }
}
