package androidx.compose.foundation.lazy.layout;

import defpackage.j5y;
import defpackage.k5y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qar;
import defpackage.tse;
import defpackage.twt0;
import defpackage.wls;
import defpackage.z5w;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements wls {
    final /* synthetic */ qar $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(b bVar, qar qarVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$spec = qarVar;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (androidx.compose.animation.core.a.d(r5, r6, r1, null, r9, r10, 4) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qar qarVar;
        LazyLayoutItemAnimation$animatePlacementDelta$1 lazyLayoutItemAnimation$animatePlacementDelta$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) this.this$0.o.e.getValue()).booleanValue();
            qarVar = this.$spec;
            if (booleanValue) {
                qarVar = qarVar instanceof twt0 ? (twt0) qarVar : k5y.a;
            }
            if (!((Boolean) this.this$0.o.e.getValue()).booleanValue()) {
                androidx.compose.animation.core.a aVar = this.this$0.o;
                z5w z5wVar = new z5w(this.$totalDelta);
                this.L$0 = qarVar;
                this.label = 1;
                if (aVar.f(z5wVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            long b = z5w.b(((z5w) this.this$0.o.e()).a, this.$totalDelta);
            b bVar = this.this$0;
            androidx.compose.animation.core.a aVar2 = bVar.o;
            z5w z5wVar2 = new z5w(b);
            j5y j5yVar = new j5y(bVar, b, i2);
            this.L$0 = null;
            this.label = 2;
            lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
                lazyLayoutItemAnimation$animatePlacementDelta$1.this$0.h.setValue(Boolean.FALSE);
                lazyLayoutItemAnimation$animatePlacementDelta$1.this$0.g = false;
                return zy11.a;
            }
            qarVar = (qar) this.L$0;
            kotlin.b.b(obj);
        }
        this.this$0.c.invoke();
        long b2 = z5w.b(((z5w) this.this$0.o.e()).a, this.$totalDelta);
        b bVar2 = this.this$0;
        androidx.compose.animation.core.a aVar22 = bVar2.o;
        z5w z5wVar22 = new z5w(b2);
        j5y j5yVar2 = new j5y(bVar2, b2, i2);
        this.L$0 = null;
        this.label = 2;
        lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
    }
}
