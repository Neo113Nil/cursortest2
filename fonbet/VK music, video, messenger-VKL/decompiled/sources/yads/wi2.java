package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c5g;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class wi2 extends SuspendLambda implements wzs {
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ yi2 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ e00 f;
    public final /* synthetic */ e13 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi2(long j, Context context, e00 e00Var, e13 e13Var, yi2 yi2Var, List list, spj spjVar) {
        super(2, spjVar);
        this.c = list;
        this.d = yi2Var;
        this.e = context;
        this.f = e00Var;
        this.g = e13Var;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        List list = this.c;
        yi2 yi2Var = this.d;
        wi2 wi2Var = new wi2(this.h, this.e, this.f, this.g, yi2Var, list, spjVar);
        wi2Var.b = obj;
        return wi2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((wi2) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        yvj yvjVar = (yvj) this.b;
        List<dt1> list = this.c;
        yi2 yi2Var = this.d;
        Context context = this.e;
        e00 e00Var = this.f;
        e13 e13Var = this.g;
        long j = this.h;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (dt1 dt1Var : list) {
            yi2Var.getClass();
            arrayList.add(myc0.b(yvjVar, null, null, new ti2(yi2Var, dt1Var, context, e00Var, j, e13Var, null), 3));
        }
        return arrayList;
    }
}
