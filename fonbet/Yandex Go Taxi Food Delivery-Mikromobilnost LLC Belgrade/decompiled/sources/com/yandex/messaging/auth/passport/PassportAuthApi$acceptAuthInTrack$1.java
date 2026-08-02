package com.yandex.messaging.auth.passport;

import android.net.Uri;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.internal.impl.f;
import defpackage.jjo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wl3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.auth.passport.PassportAuthApi$acceptAuthInTrack$1", f = "PassportAuthApi.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PassportAuthApi$acceptAuthInTrack$1 extends SuspendLambda implements wls {
    final /* synthetic */ wl3 $currentUid;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAuthApi$acceptAuthInTrack$1(b bVar, wl3 wl3Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentUid = wl3Var;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportAuthApi$acceptAuthInTrack$1(this.this$0, this.$currentUid, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportAuthApi$acceptAuthInTrack$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.b;
            PassportUidImpl f = jjo.f(this.$currentUid);
            Uri uri = this.$uri;
            this.label = 1;
            B = fVar.B(f, uri, this);
            if (B == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            B = ((Result) obj).getValue();
        }
        return new Result(B);
    }
}
