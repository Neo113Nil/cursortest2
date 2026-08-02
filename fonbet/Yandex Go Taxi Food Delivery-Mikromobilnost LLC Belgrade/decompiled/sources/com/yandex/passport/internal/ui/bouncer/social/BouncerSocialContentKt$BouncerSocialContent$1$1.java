package com.yandex.passport.internal.ui.bouncer.social;

import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.SocialContentData;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.social.BouncerSocialContentKt$BouncerSocialContent$1$1", f = "BouncerSocialContent.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BouncerSocialContentKt$BouncerSocialContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ BouncerUiState$SocialAction $data;
    final /* synthetic */ oz40 $hasLaunched$delegate;
    final /* synthetic */ yd00 $socialBrowserLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BouncerSocialContentKt$BouncerSocialContent$1$1(yd00 yd00Var, BouncerUiState$SocialAction bouncerUiState$SocialAction, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$socialBrowserLauncher = yd00Var;
        this.$data = bouncerUiState$SocialAction;
        this.$hasLaunched$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BouncerSocialContentKt$BouncerSocialContent$1$1(this.$socialBrowserLauncher, this.$data, this.$hasLaunched$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BouncerSocialContentKt$BouncerSocialContent$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, 120L);
            this.label = 1;
            if (kotlinx.coroutines.a.i(b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$socialBrowserLauncher.a(((SocialContentData.BrowserOnly) this.$data.getData()).getSocialUri());
        this.$hasLaunched$delegate.setValue(Boolean.TRUE);
        return zy11.a;
    }
}
