package xsna;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ub9;

/* compiled from: WorkForeground.kt */
@b6l(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class pvx0 extends SuspendLambda implements wzs<yvj, spj<? super Void>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ v7s $foregroundUpdater;
    final /* synthetic */ fxx0 $spec;
    final /* synthetic */ androidx.work.b $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvx0(androidx.work.b bVar, fxx0 fxx0Var, v7s v7sVar, Context context, spj<? super pvx0> spjVar) {
        super(2, spjVar);
        this.$worker = bVar;
        this.$spec = fxx0Var;
        this.$foregroundUpdater = v7sVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pvx0(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Void> spjVar) {
        return ((pvx0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ugz<n7s> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            androidx.work.b bVar = this.$worker;
            this.label = 1;
            obj = bzx0.a(foregroundInfoAsync, bVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
        }
        n7s n7sVar = (n7s) obj;
        if (n7sVar == null) {
            throw new IllegalStateException(i5s.a(new StringBuilder("Worker was marked important ("), this.$spec.c, ") but did not provide ForegroundInfo"));
        }
        int i2 = qvx0.a;
        fxx0 fxx0Var = this.$spec;
        m100 c = m100.c();
        String str = fxx0Var.c;
        c.getClass();
        ub9.d a = this.$foregroundUpdater.a(this.$context, this.$worker.getId(), n7sVar);
        this.label = 2;
        Object a2 = ygz.a(a, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
