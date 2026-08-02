package com.yandex.go.taxi.order.chat.data;

import com.yandex.go.taxi.order.chat.api.data.model.OrderChatResponse;
import defpackage.a3y0;
import defpackage.cmt;
import defpackage.hst;
import defpackage.hzx0;
import defpackage.jst;
import defpackage.mpx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.x3y0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.launch.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.data.TaxiOrderChatRepository$makeRequest$2", f = "TaxiOrderChatRepository.kt", l = {182, 185, 186, 192}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderChatRepository$makeRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ hzx0 $params;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderChatRepository$makeRequest$2(b bVar, hzx0 hzx0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$params = hzx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderChatRepository$makeRequest$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderChatRepository$makeRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0161 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.taxi.order.chat.data.b, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        b bVar;
        hzx0 hzx0Var;
        b bVar2;
        hzx0 hzx0Var2;
        b bVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            x3y0 x3y0Var = r1.s;
            a3y0 a3y0Var = r1.i;
            a aVar = r1.x;
            x3y0Var.a();
            r1.n.l(r1.d());
            if (s8o.x(th)) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 4;
                Integer M = s8o.M(th);
                if (M != null) {
                    int intValue = M.intValue();
                    Long I = s8o.I(th);
                    long longValue = I != null ? I.longValue() : 5000L;
                    if (intValue == 404) {
                        aVar.cancel();
                    } else if (intValue != 409) {
                        aVar.b(longValue);
                    } else {
                        a3y0Var.getClass();
                        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                        hst hstVar = jst.e;
                        obj2 = r1.f(r1.j(), this);
                        if (obj2 != coroutineSingletons) {
                        }
                    }
                }
                obj2 = zy11Var;
                if (obj2 != coroutineSingletons) {
                }
            } else {
                aVar.b(5000L);
                a3y0Var.b("makeRequest", th, new mpx0(10));
            }
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            this.this$0.i.getClass();
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            hst hstVar2 = jst.e;
            bVar = this.this$0;
            hzx0 hzx0Var3 = this.$params;
            c cVar = bVar.f;
            this.L$0 = bVar;
            this.L$1 = hzx0Var3;
            this.L$2 = bVar;
            this.label = 1;
            Object c = cVar.c(this);
            if (c != coroutineSingletons) {
                hzx0Var = hzx0Var3;
                obj = c;
                bVar2 = bVar;
            }
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 == 3) {
                        kotlin.b.b(obj);
                    } else {
                        if (r1 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                }
                bVar = (b) this.L$2;
                hzx0Var2 = (hzx0) this.L$1;
                bVar3 = (b) this.L$0;
                kotlin.b.b(obj);
                this.L$0 = bVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
                return b.b(bVar3, (r1e0) obj, hzx0Var2, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            bVar = (b) this.L$2;
            hzx0Var = (hzx0) this.L$1;
            bVar2 = (b) this.L$0;
            kotlin.b.b(obj);
        }
        cmt<OrderChatResponse> a = bVar2.d.a(b.a(bVar2, (String) obj, bVar2.b, hzx0Var), hzx0Var.b != null ? bVar2.k : bVar2.j);
        this.L$0 = bVar2;
        this.L$1 = hzx0Var;
        this.L$2 = bVar;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
        obj = ru.yandex.taxi.network.api.a.c(a, null, this);
        if (obj != coroutineSingletons) {
            hzx0Var2 = hzx0Var;
            bVar3 = bVar2;
            this.L$0 = bVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
            if (b.b(bVar3, (r1e0) obj, hzx0Var2, this) != coroutineSingletons) {
            }
        }
    }
}
