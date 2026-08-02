package com.yandex.plus.home.feature.webviews.internal;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pb;
import defpackage.r0d0;
import defpackage.skd0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.PlusWebPresenterDelegate$onAttachView$1", f = "PlusWebPresenterDelegate.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusWebPresenterDelegate$onAttachView$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.plus.home.feature.webviews.internal.PlusWebPresenterDelegate$onAttachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            a aVar = (a) this.receiver;
            aVar.getClass();
            skd0.b(PlusLogTag.UI, "handleAuthorizationStateChanged() openedForAuthorizationState=" + aVar.j + " isAuthorized=" + booleanValue);
            aVar.a(new zo1(aVar, booleanValue, 14));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebPresenterDelegate$onAttachView$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusWebPresenterDelegate$onAttachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusWebPresenterDelegate$onAttachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            com.yandex.plus.home.auth.b bVar = aVar2.b;
            this.L$0 = aVar2;
            this.label = 1;
            Object f = bVar.f(this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj = f;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        aVar.j = (Boolean) obj;
        int i2 = 10;
        tpr t = e.t(new pb(this.this$0.b.a.h, i2));
        a aVar3 = this.this$0;
        com.yandex.plus.home.common.utils.c.c(t, aVar3.h, new AnonymousClass1(2, aVar3, a.class, "handleIsAuthorizedChanged", "handleIsAuthorizedChanged(Z)V", 4));
        a aVar4 = this.this$0;
        aVar4.a(new r0d0(i2, aVar4));
        return zy11.a;
    }
}
