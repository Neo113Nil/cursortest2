package yads;

import android.content.Context;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class uf1 extends SuspendLambda implements wzs {
    public final /* synthetic */ ag1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf1(ag1 ag1Var, spj spjVar) {
        super(2, spjVar);
        this.b = ag1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new uf1(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new uf1(this.b, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        ag1 ag1Var = this.b;
        vg0 vg0Var = ag1Var.c;
        Context context = ag1Var.a;
        vg0Var.getClass();
        File a = vg0.a(context, "mobileads-script-cache");
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }
}
