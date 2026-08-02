package com.yandex.go.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7y;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.RepeatKt$repeatWhen$1", f = "Repeat.kt", l = {18, 21}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RepeatKt$repeatWhen$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $predicate;
    final /* synthetic */ tpr $this_repeatWhen;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatKt$repeatWhen$1(tpr tprVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_repeatWhen = tprVar;
        this.$predicate = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatKt$repeatWhen$1 repeatKt$repeatWhen$1 = new RepeatKt$repeatWhen$1(this.$this_repeatWhen, this.$predicate, continuation);
        repeatKt$repeatWhen$1.L$0 = obj;
        return repeatKt$repeatWhen$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatKt$repeatWhen$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        tpr tprVar;
        p7y p7yVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            j = 0;
            tprVar = this.$this_repeatWhen;
            p7yVar = new p7y(vprVar, 2);
            this.L$0 = vprVar;
            this.J$0 = j;
            this.I$0 = 0;
            this.label = 1;
            if (tprVar.collect(p7yVar, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            j = this.J$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                j++;
                i = 1;
            }
            if (i == 0) {
                return zy11.a;
            }
            tprVar = this.$this_repeatWhen;
            p7yVar = new p7y(vprVar, 2);
            this.L$0 = vprVar;
            this.J$0 = j;
            this.I$0 = 0;
            this.label = 1;
            if (tprVar.collect(p7yVar, this) != coroutineSingletons) {
                i = 0;
                wls wlsVar = this.$predicate;
                Long l = new Long(j);
                this.L$0 = vprVar;
                this.J$0 = j;
                this.I$0 = i;
                this.label = 2;
                obj = wlsVar.invoke(l, this);
            }
            return coroutineSingletons;
        }
        i = this.I$0;
        j = this.J$0;
        kotlin.b.b(obj);
        wls wlsVar2 = this.$predicate;
        Long l2 = new Long(j);
        this.L$0 = vprVar;
        this.J$0 = j;
        this.I$0 = i;
        this.label = 2;
        obj = wlsVar2.invoke(l2, this);
    }
}
