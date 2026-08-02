package com.yandex.go.address.search.common.presenter;

import android.net.Uri;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w4v0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.CompositeSuggestionsPresenter$processDeeplink$1", f = "CompositeSuggestionsPresenter.kt", l = {679}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompositeSuggestionsPresenter$processDeeplink$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeSuggestionsPresenter$processDeeplink$1(a aVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deeplink = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositeSuggestionsPresenter$processDeeplink$1(this.this$0, this.$deeplink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeSuggestionsPresenter$processDeeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                Uri uri = this.$deeplink;
                com.yandex.go.address.search.common.deeplink.a aVar3 = aVar2.E;
                this.L$0 = aVar2;
                this.label = 1;
                Object a = aVar3.a(uri, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                aVar = aVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                kotlin.b.b(obj);
            }
            a.uh(aVar, (w4v0) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "deeplink handling error");
        }
        return zy11.a;
    }
}
