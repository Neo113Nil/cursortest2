package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.jl40;
import defpackage.lqi0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ozi0;
import defpackage.r780;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wzi0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ReorderHandler$reorder$1", f = "ReorderHandler.kt", l = {39, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ReorderHandler$reorder$1 extends SuspendLambda implements wls {
    final /* synthetic */ wzi0 $callback;
    final /* synthetic */ String $decisionId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderHandler$reorder$1(wzi0 wzi0Var, g0 g0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$callback = wzi0Var;
        this.this$0 = g0Var;
        this.$decisionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReorderHandler$reorder$1(this.$callback, this.this$0, this.$decisionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReorderHandler$reorder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(1:(1:(10:6|7|8|9|10|11|(1:13)(1:19)|14|15|16)(2:22|23))(3:24|25|26))(5:47|48|49|(1:51)|37)|27|10|11|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d0 A[Catch: all -> 0x00e2, CancellationException -> 0x0107, TryCatch #0 {all -> 0x00e2, blocks: (B:11:0x00be, B:13:0x00d0, B:14:0x00da, B:19:0x00d4), top: B:10:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4 A[Catch: all -> 0x00e2, CancellationException -> 0x0107, TryCatch #0 {all -> 0x00e2, blocks: (B:11:0x00be, B:13:0x00d0, B:14:0x00da, B:19:0x00d4), top: B:10:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        Object obj2;
        String str;
        g0 g0Var2;
        String str2;
        g0 g0Var3;
        Throwable th;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        g0 g0Var4;
        g0 g0Var5;
        TaxiOrder taxiOrder;
        boolean l;
        Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    obj2 = this.$callback;
                    g0 g0Var6 = this.this$0;
                    str = this.$decisionId;
                    try {
                        ozi0 ozi0Var = g0Var6.c;
                        String str3 = g0Var6.b;
                        this.L$0 = obj2;
                        this.L$1 = g0Var6;
                        this.L$2 = str;
                        this.L$3 = g0Var6;
                        this.L$4 = obj2;
                        this.label = 1;
                        ozi0Var.a.getClass();
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(mdh.b, new ReorderController$reorder$2(ozi0Var, str3, str, null), this);
                        if (k0 != obj7) {
                            g0Var2 = g0Var6;
                            obj4 = obj2;
                            obj = k0;
                            g0Var = g0Var2;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th2) {
                        g0Var2 = g0Var6;
                        str2 = str;
                        g0Var3 = g0Var2;
                        th = th2;
                        obj3 = obj2;
                        String str4 = g0Var2.b;
                        this.L$0 = obj2;
                        this.L$1 = g0Var2;
                        this.L$2 = g0Var3;
                        this.L$3 = obj3;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        obj = g0.a(g0Var2, str4, str2, th, this);
                        if (obj != obj7) {
                            obj5 = obj2;
                            obj6 = obj3;
                            g0Var4 = g0Var3;
                            g0Var5 = g0Var2;
                            taxiOrder = (TaxiOrder) obj;
                            obj4 = obj5;
                            g0Var = g0Var4;
                            g0Var2 = g0Var5;
                            obj2 = obj6;
                            String str5 = g0Var2.b;
                            String str6 = taxiOrder.a;
                            r780 r780Var = (r780) obj4;
                            r780Var.getClass();
                            l = jl40.l(str5, str6);
                            y yVar = r780Var.b;
                            if (l) {
                            }
                            ((r780) obj4).a.invoke(taxiOrder);
                            return zy11.a;
                        }
                        return obj7;
                    }
                    return obj7;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj6 = (wzi0) this.L$3;
                    g0Var4 = (g0) this.L$2;
                    g0Var5 = (g0) this.L$1;
                    obj5 = (wzi0) this.L$0;
                    kotlin.b.b(obj);
                    taxiOrder = (TaxiOrder) obj;
                    obj4 = obj5;
                    g0Var = g0Var4;
                    g0Var2 = g0Var5;
                    obj2 = obj6;
                    String str52 = g0Var2.b;
                    String str62 = taxiOrder.a;
                    r780 r780Var2 = (r780) obj4;
                    r780Var2.getClass();
                    l = jl40.l(str52, str62);
                    y yVar2 = r780Var2.b;
                    if (l) {
                        yVar2.j(0L, str52);
                    } else {
                        yVar2.m(0L, str62);
                        yVar2.n(0L, str52, "reorder");
                    }
                    ((r780) obj4).a.invoke(taxiOrder);
                    return zy11.a;
                }
                obj2 = (wzi0) this.L$4;
                g0Var = (g0) this.L$3;
                str = (String) this.L$2;
                g0Var2 = (g0) this.L$1;
                obj4 = (wzi0) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    g0 g0Var7 = g0Var;
                    obj3 = obj2;
                    obj2 = obj4;
                    str2 = str;
                    g0Var3 = g0Var7;
                    try {
                        String str42 = g0Var2.b;
                        this.L$0 = obj2;
                        this.L$1 = g0Var2;
                        this.L$2 = g0Var3;
                        this.L$3 = obj3;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        obj = g0.a(g0Var2, str42, str2, th, this);
                        if (obj != obj7) {
                        }
                        return obj7;
                    } catch (Throwable th4) {
                        th = th4;
                        obj7 = obj3;
                        r1 = g0Var3;
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            g0Var = r1;
                            obj2 = obj7;
                            g0Var.g.b("reorder", th, new lqi0(10));
                            ((r780) obj2).b.n(0L, g0Var.b, "reorder fail");
                            return zy11.a;
                        }
                    }
                }
                taxiOrder = (TaxiOrder) obj;
                String str522 = g0Var2.b;
                String str622 = taxiOrder.a;
                r780 r780Var22 = (r780) obj4;
                r780Var22.getClass();
                l = jl40.l(str522, str622);
                y yVar22 = r780Var22.b;
                if (l) {
                }
                ((r780) obj4).a.invoke(taxiOrder);
                return zy11.a;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
