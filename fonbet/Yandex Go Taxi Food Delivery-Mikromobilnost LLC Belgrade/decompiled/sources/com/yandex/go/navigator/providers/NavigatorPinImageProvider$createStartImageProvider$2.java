package com.yandex.go.navigator.providers;

import defpackage.avj0;
import defpackage.b0c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.sq00;
import defpackage.tse;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbl00;", "<anonymous>", "(Ltse;)Lbl00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.providers.NavigatorPinImageProvider$createStartImageProvider$2", f = "NavigatorPinImageProvider.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorPinImageProvider$createStartImageProvider$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorPinImageProvider$createStartImageProvider$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorPinImageProvider$createStartImageProvider$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorPinImageProvider$createStartImageProvider$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        com.yandex.go.pin.api.widget.b bVar = aVar.b;
        sq00 sq00Var = new sq00(null, new b0c0(vng.t(v2h0.ic_pin_start, ((avj0) aVar.a).a), qje.t(xng0.controlMain, ((avj0) this.this$0.a).a)), true, null, null, null, null, false, false, null, null, 0.0f, 8185);
        this.label = 1;
        Object h = bVar.h(sq00Var, this);
        return h == coroutineSingletons ? coroutineSingletons : h;
    }
}
