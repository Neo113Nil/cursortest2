package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oxo0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class ti2 extends SuspendLambda implements wzs {
    public rr1 b;
    public MediatedAdapterPrefetcher c;
    public int d;
    public final /* synthetic */ yi2 e;
    public final /* synthetic */ dt1 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ e00 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ e13 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti2(yi2 yi2Var, dt1 dt1Var, Context context, e00 e00Var, long j, e13 e13Var, spj spjVar) {
        super(2, spjVar);
        this.e = yi2Var;
        this.f = dt1Var;
        this.g = context;
        this.h = e00Var;
        this.i = j;
        this.j = e13Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new ti2(this.e, this.f, this.g, this.h, this.i, this.j, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((ti2) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher;
        rr1 rr1Var;
        Exception exc;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher2;
        si2 si2Var;
        rr1 rr1Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.d;
        try {
            if (r1 == 0) {
                kotlin.a.a(obj);
                oi2 oi2Var = this.e.e;
                dt1 dt1Var = this.f;
                oi2Var.getClass();
                String str = dt1Var.b;
                rr1Var = new rr1(str, dt1Var.c, null, null, null, null, null);
                try {
                    yi2.a(this.e, rr1Var);
                    Object a = this.e.c.a(this.g, rr1Var, com.monetization.ads.mediation.base.a.class);
                    mediatedAdapterPrefetcher = a instanceof MediatedAdapterPrefetcher ? (MediatedAdapterPrefetcher) a : null;
                    if (mediatedAdapterPrefetcher == null) {
                        ji2 a2 = kr1.a(str);
                        this.e.a.a(this.g, this.h, a2, null);
                        return a2;
                    }
                    mv mvVar = this.e.b;
                    mvVar.a.a();
                    mvVar.a.a(mvVar.c, null);
                    try {
                        try {
                            long j = this.i;
                            try {
                                si2Var = new si2(this.e, this.g, this.j, rr1Var, mediatedAdapterPrefetcher, null);
                                rr1Var = rr1Var;
                            } catch (Exception e) {
                                e = e;
                                rr1Var = rr1Var;
                            }
                            try {
                                this.b = rr1Var;
                                this.c = mediatedAdapterPrefetcher;
                                this.d = 1;
                                obj = oxo0.b(j, si2Var, this);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                rr1Var2 = rr1Var;
                                mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                            } catch (Exception e2) {
                                e = e2;
                                exc = e;
                                mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                                mv mvVar2 = this.e.b;
                                mvVar2.a.a(mvVar2.c, mvVar2.b, null);
                                Long a3 = this.e.b.a();
                                ji2 a4 = kr1.a(rr1Var.b, exc);
                                this.e.a.a(this.g, this.h, a4, a3);
                                mediatedAdapterPrefetcher2.onInvalidate();
                                return a4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediatedAdapterPrefetcher.onInvalidate();
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (IllegalArgumentException e4) {
                    return kr1.a(rr1Var.b, e4);
                }
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediatedAdapterPrefetcher2 = this.c;
                rr1Var2 = this.b;
                try {
                    kotlin.a.a(obj);
                } catch (Exception e5) {
                    exc = e5;
                    rr1Var = rr1Var2;
                    mv mvVar22 = this.e.b;
                    mvVar22.a.a(mvVar22.c, mvVar22.b, null);
                    Long a32 = this.e.b.a();
                    ji2 a42 = kr1.a(rr1Var.b, exc);
                    this.e.a.a(this.g, this.h, a42, a32);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return a42;
                }
            }
            ji2 ji2Var = (ji2) obj;
            mv mvVar3 = this.e.b;
            mvVar3.a.a(mvVar3.c, mvVar3.b, null);
            Long a5 = this.e.b.a();
            if (ji2Var != null) {
                this.e.a.a(this.g, this.h, ji2Var, a5);
            }
            mediatedAdapterPrefetcher2.onInvalidate();
            return ji2Var;
        } catch (Throwable th3) {
            th = th3;
            mediatedAdapterPrefetcher = r1;
        }
    }
}
