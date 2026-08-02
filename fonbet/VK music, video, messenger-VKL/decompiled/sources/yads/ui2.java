package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class ui2 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ yi2 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ e00 e;
    public final /* synthetic */ e13 f;
    public final /* synthetic */ List g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui2(long j, Context context, e00 e00Var, e13 e13Var, yi2 yi2Var, List list, spj spjVar) {
        super(2, spjVar);
        this.c = yi2Var;
        this.d = context;
        this.e = e00Var;
        this.f = e13Var;
        this.g = list;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        yi2 yi2Var = this.c;
        return new ui2(this.h, this.d, this.e, this.f, yi2Var, this.g, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((ui2) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        yi2 yi2Var = this.c;
        Context context = this.d;
        e00 e00Var = this.e;
        e13 e13Var = this.f;
        List list = this.g;
        long j = this.h;
        this.b = 1;
        Object a = yi2.a(j, context, e00Var, e13Var, yi2Var, list, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
