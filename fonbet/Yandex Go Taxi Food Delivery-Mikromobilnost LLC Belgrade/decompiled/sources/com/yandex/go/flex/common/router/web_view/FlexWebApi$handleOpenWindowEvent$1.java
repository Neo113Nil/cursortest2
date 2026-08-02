package com.yandex.go.flex.common.router.web_view;

import com.yandex.go.flex.common.router.web_view.FlexWebApi;
import com.yandex.go.flex.common.router.web_view.OpenWindowParams;
import com.yandex.go.flex.common.router.web_view.OpenWindowParamsV2;
import defpackage.gym;
import defpackage.j73;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.router.web_view.FlexWebApi$handleOpenWindowEvent$1", f = "FlexWebApi.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FlexWebApi$handleOpenWindowEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    int label;
    final /* synthetic */ FlexWebApi this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.common.router.web_view.FlexWebApi$handleOpenWindowEvent$1$1", f = "FlexWebApi.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.common.router.web_view.FlexWebApi$handleOpenWindowEvent$1$1, reason: invalid class name */
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            String str = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String[] strArr = this.$params;
            final FlexWebApi flexWebApi = this.this$0;
            final int i = 0;
            try {
                final String str2 = (String) j73.G(0, strArr);
                if (str2 != null) {
                    final int i2 = 1;
                    Iterator it = scc.g(new tls() { // from class: zmr
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            Object safeDeserialize;
                            OpenWindowParams.Payload payload;
                            Object safeDeserialize2;
                            int i3 = i;
                            String str3 = str2;
                            FlexWebApi flexWebApi2 = flexWebApi;
                            switch (i3) {
                                case 0:
                                    safeDeserialize = flexWebApi2.safeDeserialize(str3, OpenWindowParams.Companion.serializer());
                                    OpenWindowParams openWindowParams = (OpenWindowParams) safeDeserialize;
                                    if (openWindowParams == null || (payload = openWindowParams.a) == null) {
                                        return null;
                                    }
                                    return payload.a;
                                default:
                                    safeDeserialize2 = flexWebApi2.safeDeserialize(str3, OpenWindowParamsV2.Companion.serializer());
                                    OpenWindowParamsV2 openWindowParamsV2 = (OpenWindowParamsV2) safeDeserialize2;
                                    if (openWindowParamsV2 != null) {
                                        return openWindowParamsV2.a;
                                    }
                                    return null;
                            }
                        }
                    }, new tls() { // from class: zmr
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            Object safeDeserialize;
                            OpenWindowParams.Payload payload;
                            Object safeDeserialize2;
                            int i3 = i2;
                            String str3 = str2;
                            FlexWebApi flexWebApi2 = flexWebApi;
                            switch (i3) {
                                case 0:
                                    safeDeserialize = flexWebApi2.safeDeserialize(str3, OpenWindowParams.Companion.serializer());
                                    OpenWindowParams openWindowParams = (OpenWindowParams) safeDeserialize;
                                    if (openWindowParams == null || (payload = openWindowParams.a) == null) {
                                        return null;
                                    }
                                    return payload.a;
                                default:
                                    safeDeserialize2 = flexWebApi2.safeDeserialize(str3, OpenWindowParamsV2.Companion.serializer());
                                    OpenWindowParamsV2 openWindowParamsV2 = (OpenWindowParamsV2) safeDeserialize2;
                                    if (openWindowParamsV2 != null) {
                                        return openWindowParamsV2.a;
                                    }
                                    return null;
                            }
                        }
                    }).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) ((tls) it.next()).invoke(str2);
                        if (str3 != null) {
                            str = str3;
                            break;
                        }
                    }
                    if (str == null) {
                        str = "";
                    }
                    ((gym) flexWebApi.getRouterCallbacks()).m(str);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                jst.e.c("FlexWebApi.handleOpenWindowEvent cant parse params = " + strArr);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexWebApi$handleOpenWindowEvent$1(FlexWebApi flexWebApi, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = flexWebApi;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlexWebApi$handleOpenWindowEvent$1(this.this$0, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlexWebApi$handleOpenWindowEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
