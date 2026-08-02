package androidx.lifecycle;

import defpackage.bvf0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ g050 $mutex;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(g050 g050Var, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$mutex = g050Var;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.$mutex, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        if (r7.a(r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        wls wlsVar;
        Throwable th;
        g050 g050Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g050Var = this.$mutex;
                wlsVar = this.$block;
                this.L$0 = g050Var;
                this.L$1 = wlsVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        g050Var2.d(null);
                        return zy11.a;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var2.d(null);
                        throw th;
                    }
                }
                wlsVar = (wls) this.L$1;
                g050 g050Var3 = (g050) this.L$0;
                kotlin.b.b(obj);
                g050Var = g050Var3;
            }
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(wlsVar, null);
            this.L$0 = g050Var;
            this.L$1 = null;
            this.label = 2;
            if (bvf0.n(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                g050Var2 = g050Var;
                g050Var2.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var4 = g050Var;
            th = th3;
            g050Var2 = g050Var4;
            g050Var2.d(null);
            throw th;
        }
    }
}
