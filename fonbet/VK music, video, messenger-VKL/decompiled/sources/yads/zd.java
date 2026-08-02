package yads;

import android.content.Context;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.oxo0;
import xsna.s3q0;
import xsna.spj;
import xsna.vhn0;
import xsna.wgl;
import xsna.whn0;
import xsna.wzs;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class zd extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(Context context, spj spjVar) {
        super(2, spjVar);
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new zd(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return new zd(this.c, (spj) obj2).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yd ydVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        Context context = this.c;
        yd ydVar2 = yd.e;
        if (ydVar2 == null) {
            synchronized (yd.d) {
                ydVar = yd.e;
                if (ydVar == null) {
                    x10 x10Var = new x10();
                    vhn0 a = whn0.a();
                    bdn bdnVar = bdn.a;
                    ydVar = new yd(zvj.a(d.a.a(a, wgl.c).plus(x10Var)), new le(), new ie(context));
                    yd.e = ydVar;
                }
            }
            ydVar2 = ydVar;
        }
        this.b = 1;
        Object c = oxo0.c(((Number) ydVar2.b.b.getValue()).longValue(), new xd(ydVar2, null), this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
