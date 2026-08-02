package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.k631;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk631;", "velocity", "<anonymous>", "(Lk631;)Lk631;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {864, 867, 870}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements wls {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(y yVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((k631) obj).a;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        long j = ((k631) obj).a;
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, (Continuation) obj2);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = j;
        return scrollingLogic$onScrollStopped$performFling$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        long j;
        Object a;
        long j2;
        long j3;
        long j4;
        Object a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j5 = this.J$0;
            NestedScrollDispatcher nestedScrollDispatcher = this.this$0.f;
            this.J$0 = j5;
            this.label = 1;
            b = nestedScrollDispatcher.b(j5, this);
            if (b != coroutineSingletons) {
                j = j5;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            kotlin.b.b(obj);
            b = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j6 = this.J$1;
                long j7 = this.J$0;
                kotlin.b.b(obj);
                j2 = j7;
                j4 = j6;
                a2 = obj;
                return new k631(k631.e(j2, k631.e(j4, ((k631) a2).a)));
            }
            j3 = this.J$1;
            j2 = this.J$0;
            kotlin.b.b(obj);
            a = obj;
            long j8 = ((k631) a).a;
            NestedScrollDispatcher nestedScrollDispatcher2 = this.this$0.f;
            long e = k631.e(j3, j8);
            this.J$0 = j2;
            this.J$1 = j8;
            this.label = 3;
            j4 = j8;
            a2 = nestedScrollDispatcher2.a(e, j4, this);
        }
        long e2 = k631.e(j, ((k631) b).a);
        y yVar = this.this$0;
        this.J$0 = j;
        this.J$1 = e2;
        this.label = 2;
        a = yVar.a(e2, this);
        if (a != coroutineSingletons) {
            j2 = j;
            j3 = e2;
            long j82 = ((k631) a).a;
            NestedScrollDispatcher nestedScrollDispatcher22 = this.this$0.f;
            long e3 = k631.e(j3, j82);
            this.J$0 = j2;
            this.J$1 = j82;
            this.label = 3;
            j4 = j82;
            a2 = nestedScrollDispatcher22.a(e3, j4, this);
        }
        return coroutineSingletons;
    }
}
