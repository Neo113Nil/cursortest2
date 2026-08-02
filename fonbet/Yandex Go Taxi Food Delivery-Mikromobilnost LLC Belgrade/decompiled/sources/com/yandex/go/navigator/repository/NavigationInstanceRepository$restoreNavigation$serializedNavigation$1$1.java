package com.yandex.go.navigator.repository;

import android.util.Base64;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.repository.NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1", f = "NavigationInstanceRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1(String str, Continuation continuation) {
        super(2, continuation);
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1(this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationInstanceRepository$restoreNavigation$serializedNavigation$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Base64.decode(this.$it, 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
