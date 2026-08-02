package com.yandex.go.taxi.tariffs.internal.routestats.factory;

import defpackage.coe0;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sxg;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyne0;", "<anonymous>", "(Ltse;)Lyne0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.factory.PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2$1$1", f = "PrefetchRouteStatsParamBuilderImpl.kt", l = {100, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $defaultTimeoutMillis;
    final /* synthetic */ coe0 $dest;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2$1$1(a aVar, long j, coe0 coe0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$defaultTimeoutMillis = j;
        this.$dest = coe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2$1$1(this.this$0, this.$defaultTimeoutMillis, this.$dest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        coe0 coe0Var = this.label;
        try {
            if (coe0Var == 0) {
                b.b(obj);
                a aVar = this.this$0;
                coe0 coe0Var2 = this.$dest;
                ru.yandex.taxi.shortcuts.interactors.a aVar2 = aVar.e;
                zzs zzsVar = coe0Var2.a;
                String str = coe0Var2.b;
                this.L$0 = coe0Var2;
                this.label = 1;
                obj = aVar2.a(zzsVar, str, null, false, this);
                coe0Var = coe0Var2;
                if (obj == coroutineSingletons) {
                }
            } else {
                if (coe0Var != 1) {
                    if (coe0Var != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                coe0 coe0Var3 = (coe0) this.L$0;
                b.b(obj);
                coe0Var = coe0Var3;
            }
            sxg sxgVar = (sxg) obj;
            a aVar3 = this.this$0;
            long j = this.$defaultTimeoutMillis;
            this.L$0 = null;
            this.label = 2;
            Object a = a.a(aVar3, sxgVar, j, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            hst hstVar = jst.e;
            zzs zzsVar2 = coe0Var.a;
            double d = zzsVar2.a;
            double d2 = zzsVar2.b;
            StringBuilder u = oyr.u(d, "Failed to decode address ", Extension.FIX_SPACE);
            u.append(d2);
            xby.l(hstVar, "RouteStats.Prefetch.BuildParams", null, null, u.toString(), 6);
            return null;
        }
    }
}
