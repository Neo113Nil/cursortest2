package com.yandex.div.core.view2;

import android.view.ViewGroup;
import defpackage.d0d;
import defpackage.dbl;
import defpackage.egk;
import defpackage.mmk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.pfi0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.core.view2.Div2View$complexRebind$$inlined$executeOnMainThreadBlocking$1", f = "Div2View.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class Div2View$complexRebind$$inlined$executeOnMainThreadBlocking$1 extends SuspendLambda implements wls {
    final /* synthetic */ omk $newData$inlined;
    final /* synthetic */ omk $oldData$inlined;
    final /* synthetic */ d0d $reporter$inlined;
    int label;
    final /* synthetic */ Div2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Div2View$complexRebind$$inlined$executeOnMainThreadBlocking$1(Continuation continuation, Div2View div2View, omk omkVar, d0d d0dVar, omk omkVar2) {
        super(2, continuation);
        this.this$0 = div2View;
        this.$newData$inlined = omkVar;
        this.$reporter$inlined = d0dVar;
        this.$oldData$inlined = omkVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Div2View$complexRebind$$inlined$executeOnMainThreadBlocking$1(continuation, this.this$0, this.$newData$inlined, this.$reporter$inlined, this.$oldData$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Div2View$complexRebind$$inlined$executeOnMainThreadBlocking$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String id;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        mmk stateToBind = this.this$0.getStateToBind(this.$newData$inlined);
        Div2View div2View = this.this$0;
        boolean z = false;
        if (stateToBind == null) {
            this.$reporter$inlined.getClass();
        } else {
            div2View.getHistogramReporter().f();
            this.this$0.set_divData(this.$newData$inlined);
            pfi0 pfi0Var = this.this$0.rebindTask;
            if (pfi0Var == null) {
                pfi0Var = this.this$0.createRebindTask(this.$reporter$inlined);
                this.this$0.rebindTask = pfi0Var;
            }
            this.this$0.getDiv2Component().getStateManager().c(this.this$0.getDataTag(), stateToBind.b, false);
            omk omkVar = this.$oldData$inlined;
            omk omkVar2 = this.$newData$inlined;
            ViewGroup viewGroup = (ViewGroup) this.this$0.getView().getChildAt(0);
            long j = stateToBind.b;
            egk d = stateToBind.a.d();
            if (d instanceof dbl) {
                dbl dblVar = (dbl) d;
                id = dblVar.p;
                if (id == null) {
                    id = dblVar.x;
                }
            } else {
                id = d.getId();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(id != null ? ":".concat(id) : "");
            if (pfi0Var.e(omkVar, omkVar2, viewGroup, new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8))) {
                this.this$0.requestLayout();
                this.this$0.getHistogramReporter().e();
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
