package androidx.compose.foundation.gestures;

import defpackage.hb30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", f = "MouseWheelScrollingLogic.kt", l = {109, 112}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MouseWheelScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingEvents$1(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1 = new MouseWheelScrollingLogic$startReceivingEvents$1(this.this$0, continuation);
        mouseWheelScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingEvents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$startReceivingEvents$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (androidx.compose.foundation.gestures.q.c(r5, r6, r7, r8, r9, r10) != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007c, blocks: (B:5:0x0031, B:8:0x003d, B:13:0x0050), top: B:4:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:4:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1;
        tse tseVar;
        Throwable th2;
        tse tseVar2;
        boolean p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            try {
                if (i == 1) {
                    tseVar = (tse) this.L$0;
                    kotlin.b.b(obj);
                    hb30 hb30Var = (hb30) obj;
                    float w0 = this.this$0.c.w0(6.0f);
                    float w02 = this.this$0.c.w0(1.0f);
                    q qVar = this.this$0;
                    y yVar = qVar.a;
                    this.L$0 = tseVar;
                    this.label = 2;
                    mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tseVar = (tse) this.L$0;
                    kotlin.b.b(obj);
                    mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                    try {
                        tseVar2 = tseVar;
                        p = kotlinx.coroutines.a.p(tseVar2.getCoroutineContext());
                        q qVar2 = this.this$0;
                        if (p) {
                            qVar2.h = null;
                            return zy11.a;
                        }
                        kotlinx.coroutines.channels.a aVar = qVar2.g;
                        this.L$0 = tseVar2;
                        this.label = 1;
                        try {
                            aVar.getClass();
                            Object J = kotlinx.coroutines.channels.a.J(aVar, this);
                            if (J != coroutineSingletons) {
                                try {
                                    tseVar = tseVar2;
                                    obj = J;
                                    hb30 hb30Var2 = (hb30) obj;
                                    float w03 = this.this$0.c.w0(6.0f);
                                    float w022 = this.this$0.c.w0(1.0f);
                                    q qVar3 = this.this$0;
                                    y yVar2 = qVar3.a;
                                    this.L$0 = tseVar;
                                    this.label = 2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    th = th2;
                                    mouseWheelScrollingLogic$startReceivingEvents$1.this$0.h = null;
                                    throw th;
                                }
                                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                            th = th4;
                            mouseWheelScrollingLogic$startReceivingEvents$1.this$0.h = null;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                        th = th2;
                        mouseWheelScrollingLogic$startReceivingEvents$1.this$0.h = null;
                        throw th;
                    }
                    this = mouseWheelScrollingLogic$startReceivingEvents$1;
                }
            } catch (Throwable th6) {
                th = th6;
                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                mouseWheelScrollingLogic$startReceivingEvents$1.this$0.h = null;
                throw th;
            }
        } else {
            kotlin.b.b(obj);
            tseVar2 = (tse) this.L$0;
            p = kotlinx.coroutines.a.p(tseVar2.getCoroutineContext());
            q qVar22 = this.this$0;
            if (p) {
            }
        }
    }
}
