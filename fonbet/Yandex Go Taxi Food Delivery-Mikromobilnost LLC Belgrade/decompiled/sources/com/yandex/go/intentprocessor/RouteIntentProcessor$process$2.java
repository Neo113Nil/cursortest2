package com.yandex.go.intentprocessor;

import com.adjust.sdk.Constants;
import defpackage.g8e;
import defpackage.h4l0;
import defpackage.jst;
import defpackage.k4l0;
import defpackage.mvg;
import defpackage.n4l0;
import defpackage.n7z;
import defpackage.ny61;
import defpackage.o7z;
import defpackage.r7z;
import defpackage.t7z;
import defpackage.tse;
import defpackage.u1l0;
import defpackage.u8w;
import defpackage.wls;
import defpackage.x4e;
import defpackage.xby;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.NotSupportedAddressException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lp4l0;", "<anonymous>", "(Ltse;)Lp4l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.RouteIntentProcessor$process$2", f = "RouteIntentProcessor.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RouteIntentProcessor$process$2 extends SuspendLambda implements wls {
    final /* synthetic */ t7z $model;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteIntentProcessor$process$2(p pVar, t7z t7zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$model = t7zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteIntentProcessor$process$2(this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteIntentProcessor$process$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        String dataString;
        String dataString2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.preorder.deeplinks.route.c cVar = this.this$0.b;
            t7z t7zVar = this.$model;
            this.label = 1;
            c = cVar.c(t7zVar, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        t7z t7zVar2 = this.$model;
        p pVar = this.this$0;
        String str = "";
        if (!(c instanceof Result.Failure)) {
            u1l0 u1l0Var = (u1l0) c;
            if (t7zVar2 instanceof r7z) {
                str = ((r7z) t7zVar2).a.a.toString();
            } else if (t7zVar2 instanceof o7z) {
                str = ((o7z) t7zVar2).a.toString();
            } else if ((t7zVar2 instanceof n7z) && (dataString2 = ((n7z) t7zVar2).a.getDataString()) != null) {
                str = dataString2;
            }
            pVar.d.a.a.a("LaunchIntentSuccess", x4e.p(Constants.DEEPLINK, h4l0.a(str)), 1, new HashMap());
            pVar.c.h = true;
            return new n4l0(u1l0Var);
        }
        Throwable a = Result.a(c);
        if (a != null) {
            if (t7zVar2 instanceof r7z) {
                str = ((r7z) t7zVar2).a.a.toString();
            } else if (t7zVar2 instanceof o7z) {
                str = ((o7z) t7zVar2).a.toString();
            } else if ((t7zVar2 instanceof n7z) && (dataString = ((n7z) t7zVar2).a.getDataString()) != null) {
                str = dataString;
            }
            u8w u8wVar = pVar.d.a;
            String a2 = h4l0.a(str);
            String message = a.getMessage();
            HashMap p = x4e.p(Constants.DEEPLINK, a2);
            if (message != null) {
                p.put("error", message);
            }
            u8wVar.a.a("LaunchIntentError", p, 1, new HashMap());
            xby.l(jst.e, "INTENT_PROCESSOR_ERROR:ROUTE", null, a, g8e.o("Error occurred while processing route data from order intent ", str), 2);
            if (a instanceof NotSupportedAddressException) {
                pVar.e.m(((NotSupportedAddressException) a).getNotSupportedAddress(), null);
            }
            if (pVar.f.e() == null) {
                pVar.g.a();
            }
        }
        return k4l0.a;
    }
}
