package com.ybsdk.core.utils.network.retryPolicy;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.c2k0;
import defpackage.cez0;
import defpackage.e3n;
import defpackage.f1k0;
import defpackage.fcy0;
import defpackage.i5z0;
import defpackage.lp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oyr;
import defpackage.qi4;
import defpackage.rez0;
import defpackage.tq11;
import defpackage.u0k0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcez0;", "Lkotlin/Result;", "<anonymous>", "(Lcez0;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.utils.network.retryPolicy.RetryPolicy$executeWithRetries$2", f = "RetryPolicy.kt", l = {54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 60, 67}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class RetryPolicy$executeWithRetries$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$IntRef $attempts;
    final /* synthetic */ zls $call;
    final /* synthetic */ List<Throwable> $exceptions;
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryPolicy$executeWithRetries$2(c cVar, zls zlsVar, String str, Ref$IntRef ref$IntRef, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$call = zlsVar;
        this.$id = str;
        this.$attempts = ref$IntRef;
        this.$exceptions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RetryPolicy$executeWithRetries$2 retryPolicy$executeWithRetries$2 = new RetryPolicy$executeWithRetries$2(this.this$0, this.$call, this.$id, this.$attempts, this.$exceptions, continuation);
        retryPolicy$executeWithRetries$2.L$0 = obj;
        return retryPolicy$executeWithRetries$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RetryPolicy$executeWithRetries$2) create((cez0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (kotlinx.coroutines.a.j(r8, r17) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0137 -> B:14:0x0170). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x015c -> B:8:0x0161). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cez0 cez0Var;
        long j;
        Object obj2;
        c cVar;
        Object obj3;
        f1k0 f1k0Var;
        Object obj4;
        Object a;
        cez0 cez0Var2;
        Object obj5;
        long e;
        long j2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 3;
        if (i == 0) {
            kotlin.b.b(obj);
            cez0Var = (cez0) this.L$0;
            o430 o430Var = e3n.b;
            j = 0;
            e = e3n.e(j) + ((rez0) cez0Var.b.invoke()).a;
            j2 = cez0Var.c;
            if (e != j2) {
            }
            this.L$0 = cez0Var;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
        } else if (i == 1) {
            cez0Var = (cez0) this.L$0;
            kotlin.b.b(obj);
            long j3 = this.this$0.b.d;
            long e2 = e3n.e(j3) + ((rez0) cez0Var.b.invoke()).a;
            long j4 = cez0Var.c;
            if (e2 != j4 && e2 > j4) {
                cez0Var.c = e2;
            }
            zls zlsVar = this.$call;
            c2k0 c2k0Var = new c2k0(this.$id);
            tq11 tq11Var = new tq11(this.$attempts.element);
            this.L$0 = cez0Var;
            this.label = 2;
            obj4 = zlsVar.invoke(c2k0Var, tq11Var, this);
        } else {
            if (i == 2) {
                cez0Var = (cez0) this.L$0;
                kotlin.b.b(obj);
                obj4 = obj;
                obj2 = ((Result) obj4).getValue();
                c cVar2 = this.this$0;
                if (obj2 instanceof Result.Failure) {
                    List<Throwable> list = this.$exceptions;
                    String str = this.$id;
                    Throwable a2 = Result.a(obj2);
                    if (a2 != null) {
                        list.add(a2);
                        i5z0.a.a(oyr.p("Call to ", cVar2.a, " failed, retrying"), new Object[0]);
                        this.L$0 = cez0Var;
                        this.L$1 = obj2;
                        this.L$2 = obj2;
                        this.label = 4;
                        a = c.a(cVar2, str, a2, this);
                        if (a != coroutineSingletons) {
                            cez0Var2 = cez0Var;
                            obj5 = obj2;
                            if (((Boolean) a).booleanValue()) {
                            }
                        }
                    }
                    qi4 qi4Var = this.this$0.b.b;
                    Ref$IntRef ref$IntRef = this.$attempts;
                    int i3 = ref$IntRef.element + 1;
                    ref$IntRef.element = i3;
                    j = qi4Var.a(i3);
                    i2 = 3;
                    e = e3n.e(j) + ((rez0) cez0Var.b.invoke()).a;
                    j2 = cez0Var.c;
                    if (e != j2) {
                        return null;
                    }
                    this.L$0 = cez0Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                } else {
                    i5z0.a.a(oyr.p("Call to ", cVar2.a, " successful"), new Object[0]);
                    b bVar = cVar2.d;
                    this.L$0 = obj2;
                    this.L$1 = cVar2;
                    this.label = i2;
                    obj3 = bVar.b(this);
                    if (obj3 != coroutineSingletons) {
                        cVar = cVar2;
                        f1k0Var = (f1k0) obj3;
                        if (f1k0Var != null) {
                        }
                        return new Result(obj2);
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                cVar = (c) this.L$1;
                Object obj6 = this.L$0;
                kotlin.b.b(obj);
                obj2 = obj6;
                obj3 = obj;
                f1k0Var = (f1k0) obj3;
                if (f1k0Var != null) {
                    lp50 lp50Var = cVar.c;
                    double b = f1k0Var.b();
                    double a3 = f1k0Var.a();
                    fcy0 fcy0Var = ((u0k0) lp50Var).a.m0;
                    double rint = Math.rint(b * 10.0d) / 10.0d;
                    double rint2 = Math.rint(a3 * 10.0d) / 10.0d;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                    linkedHashMap.put("amount", Double.valueOf(rint));
                    linkedHashMap.put("budget", Double.valueOf(rint2));
                    fcy0Var.a.a("tech.api_call.retry_bucket.token_added", linkedHashMap);
                }
                return new Result(obj2);
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj5 = this.L$1;
            cez0Var2 = (cez0) this.L$0;
            kotlin.b.b(obj);
            a = obj;
            if (((Boolean) a).booleanValue()) {
                return new Result(obj5);
            }
            cez0Var = cez0Var2;
            qi4 qi4Var2 = this.this$0.b.b;
            Ref$IntRef ref$IntRef2 = this.$attempts;
            int i32 = ref$IntRef2.element + 1;
            ref$IntRef2.element = i32;
            j = qi4Var2.a(i32);
            i2 = 3;
            e = e3n.e(j) + ((rez0) cez0Var.b.invoke()).a;
            j2 = cez0Var.c;
            if (e != j2 && e > j2) {
                return null;
            }
            this.L$0 = cez0Var;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
        }
    }
}
