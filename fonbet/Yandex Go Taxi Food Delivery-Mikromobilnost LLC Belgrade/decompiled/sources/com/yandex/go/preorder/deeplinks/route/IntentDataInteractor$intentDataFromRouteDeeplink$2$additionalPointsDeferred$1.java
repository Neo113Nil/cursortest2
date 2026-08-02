package com.yandex.go.preorder.deeplinks.route;

import android.net.Uri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcb1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lzzs;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.IntentDataInteractor$intentDataFromRouteDeeplink$2$additionalPointsDeferred$1", f = "IntentDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class IntentDataInteractor$intentDataFromRouteDeeplink$2$additionalPointsDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentDataInteractor$intentDataFromRouteDeeplink$2$additionalPointsDeferred$1(b bVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntentDataInteractor$intentDataFromRouteDeeplink$2$additionalPointsDeferred$1(this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntentDataInteractor$intentDataFromRouteDeeplink$2$additionalPointsDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        Uri uri = this.$uri;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            Double d = tcb1.d(uri.getQueryParameter("mid" + i + "-lat"));
            Double d2 = tcb1.d(uri.getQueryParameter("mid" + i + "-lon"));
            if (d == null || d2 == null) {
                break;
            }
            arrayList.add(new zzs(d.doubleValue(), d2.doubleValue(), 0, null, null, 28));
            i++;
        }
        return arrayList;
    }
}
