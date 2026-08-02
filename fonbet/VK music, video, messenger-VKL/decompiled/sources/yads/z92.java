package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class z92 extends SuspendLambda implements wzs {
    public final /* synthetic */ aa2 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ep e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z92(aa2 aa2Var, CountDownLatch countDownLatch, ArrayList arrayList, ep epVar, spj spjVar) {
        super(2, spjVar);
        this.b = aa2Var;
        this.c = countDownLatch;
        this.d = arrayList;
        this.e = epVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new z92(this.b, this.c, this.d, this.e, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((z92) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        aa2 aa2Var = this.b;
        CountDownLatch countDownLatch = this.c;
        ArrayList arrayList = this.d;
        ep epVar = this.e;
        aa2Var.getClass();
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            epVar.a.set(true);
            synchronized (aa2Var.b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
