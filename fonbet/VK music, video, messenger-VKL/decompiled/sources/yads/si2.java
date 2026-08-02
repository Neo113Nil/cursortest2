package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class si2 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ yi2 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ e13 e;
    public final /* synthetic */ rr1 f;
    public final /* synthetic */ MediatedAdapterPrefetcher g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si2(yi2 yi2Var, Context context, e13 e13Var, rr1 rr1Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, spj spjVar) {
        super(2, spjVar);
        this.c = yi2Var;
        this.d = context;
        this.e = e13Var;
        this.f = rr1Var;
        this.g = mediatedAdapterPrefetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new si2(this.c, this.d, this.e, this.f, this.g, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((si2) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
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
        ni2 ni2Var = this.c.d;
        Context context = this.d;
        e13 e13Var = this.e;
        rr1 rr1Var = this.f;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.g;
        this.b = 1;
        ni2Var.getClass();
        lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        try {
            Activity a = j1.a();
            if (a != null) {
                context = a;
            }
            HashMap hashMap = new HashMap(rr1Var.c);
            if (e13Var != null) {
                hashMap.put("width", String.valueOf(e13Var.getWidth()));
                hashMap.put("height", String.valueOf(e13Var.getHeight()));
            }
            mediatedAdapterPrefetcher.prefetchAd(context, hashMap, new mi2(ni2Var, rr1Var, lq9Var));
        } catch (Exception unused) {
            if (lq9Var.isActive()) {
                mediatedAdapterPrefetcher.onInvalidate();
                ki2 ki2Var = ni2Var.a;
                String str = rr1Var.b;
                ki2Var.getClass();
                lq9Var.resumeWith(ki2.a(str, null, null));
            }
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
