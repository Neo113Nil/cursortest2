package com.yandex.go.flex.common.router.web_view;

import defpackage.gym;
import defpackage.j73;
import defpackage.jst;
import defpackage.k52;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.router.web_view.FlexWebApi$handleSendAnalyticsEvent$1", f = "FlexWebApi.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FlexWebApi$handleSendAnalyticsEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    int label;
    final /* synthetic */ FlexWebApi this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.common.router.web_view.FlexWebApi$handleSendAnalyticsEvent$1$1", f = "FlexWebApi.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.common.router.web_view.FlexWebApi$handleSendAnalyticsEvent$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String[] $params;
        int label;
        final /* synthetic */ FlexWebApi this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlexWebApi flexWebApi, Continuation continuation, String[] strArr) {
            super(2, continuation);
            this.$params = strArr;
            this.this$0 = flexWebApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation, this.$params);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object deserialize;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String[] strArr = this.$params;
            FlexWebApi flexWebApi = this.this$0;
            try {
                deserialize = flexWebApi.deserialize((String) j73.C(strArr), k52.Companion.serializer());
                ((j) ((b) ((gym) flexWebApi.getRouterCallbacks()).a).M.b).u((k52) deserialize);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                jst.e.c("FlexWebApi.handleSendAnalyticsEvent cant parse param = " + j73.D(strArr));
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexWebApi$handleSendAnalyticsEvent$1(FlexWebApi flexWebApi, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = flexWebApi;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlexWebApi$handleSendAnalyticsEvent$1(this.this$0, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlexWebApi$handleSendAnalyticsEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tt2 tt2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tt2Var = this.this$0.appDispatchers;
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null, this.$params);
            this.label = 1;
            if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
