package androidx.work.impl.utils;

import android.content.Context;
import defpackage.euy;
import defpackage.fa51;
import defpackage.gl7;
import defpackage.hgz;
import defpackage.i3f;
import defpackage.jx81;
import defpackage.kuy;
import defpackage.m951;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.r8c0;
import defpackage.s2s;
import defpackage.tse;
import defpackage.u2s;
import defpackage.wls;
import defpackage.ya51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class WorkForegroundKt$workForeground$2 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ u2s $foregroundUpdater;
    final /* synthetic */ fa51 $spec;
    final /* synthetic */ kuy $worker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkForegroundKt$workForeground$2(kuy kuyVar, fa51 fa51Var, u2s u2sVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.$worker = kuyVar;
        this.$spec = fa51Var;
        this.$foregroundUpdater = u2sVar;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkForegroundKt$workForeground$2(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkForegroundKt$workForeground$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            euy foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
            kuy kuyVar = this.$worker;
            this.label = 1;
            obj = ya51.a(foregroundInfoAsync, kuyVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        s2s s2sVar = (s2s) obj;
        if (s2sVar == null) {
            ny61.r(oyr.t(new StringBuilder("Worker was marked important ("), this.$spec.c, ") but did not provide ForegroundInfo"));
            return null;
        }
        int i2 = a.a;
        fa51 fa51Var = this.$spec;
        hgz g = hgz.g();
        String str = fa51Var.c;
        g.getClass();
        u2s u2sVar = this.$foregroundUpdater;
        m951 m951Var = (m951) u2sVar;
        gl7 r = jx81.r(new i3f(6, m951Var.a.a, "setForegroundAsync", new r8c0(m951Var, this.$worker.getId(), s2sVar, this.$context, 18)));
        this.label = 2;
        Object e = ooc.e(r, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
