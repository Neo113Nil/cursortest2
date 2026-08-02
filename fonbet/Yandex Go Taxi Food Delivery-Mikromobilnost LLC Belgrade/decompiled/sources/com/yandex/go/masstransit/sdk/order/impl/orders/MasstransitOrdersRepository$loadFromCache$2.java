package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.j310;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s00;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$loadFromCache$2", f = "MasstransitOrdersRepository.kt", l = {HProv.PP_BIO_STATISTICA_LEN, 106, BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MasstransitOrdersRepository$loadFromCache$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$loadFromCache$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitOrdersRepository$loadFromCache$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$loadFromCache$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r7 != r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.coroutines.flow.r0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        ?? r1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                xby.d.k(th, "Cannot load orders from cache");
                list = EmptyList.a;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            xby.d.k(th2, "Cannot load orders requestId from cache");
            str = null;
            r1 = i;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            j310 j310Var = this.this$0.g;
            this.label = 1;
            obj = j310Var.a();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.j.l((Map) obj);
                return zy11.a;
            }
            ?? r12 = (List) this.L$0;
            kotlin.b.b(obj);
            i = r12;
            str = (String) obj;
            r1 = i;
            this.this$0.k.l(r1);
            this.this$0.l.l(str);
            s00 s00Var = this.this$0.h;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = s00Var.a.a(this);
        }
        list = (List) obj;
        ?? r13 = list;
        j310 j310Var2 = this.this$0.g;
        this.L$0 = r13;
        this.label = 2;
        obj = j310Var2.b();
        i = r13;
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        str = (String) obj;
        r1 = i;
        this.this$0.k.l(r1);
        this.this$0.l.l(str);
        s00 s00Var2 = this.this$0.h;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        obj = s00Var2.a.a(this);
    }
}
