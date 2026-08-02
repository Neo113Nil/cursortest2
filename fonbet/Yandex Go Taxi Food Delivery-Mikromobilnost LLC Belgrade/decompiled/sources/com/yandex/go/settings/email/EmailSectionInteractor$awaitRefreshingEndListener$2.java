package com.yandex.go.settings.email;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isRefreshing"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.settings.email.EmailSectionInteractor$awaitRefreshingEndListener$2", f = "EmailSectionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class EmailSectionInteractor$awaitRefreshingEndListener$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EmailSectionInteractor$awaitRefreshingEndListener$2 emailSectionInteractor$awaitRefreshingEndListener$2 = new EmailSectionInteractor$awaitRefreshingEndListener$2(2, continuation);
        emailSectionInteractor$awaitRefreshingEndListener$2.Z$0 = ((Boolean) obj).booleanValue();
        return emailSectionInteractor$awaitRefreshingEndListener$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((EmailSectionInteractor$awaitRefreshingEndListener$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
