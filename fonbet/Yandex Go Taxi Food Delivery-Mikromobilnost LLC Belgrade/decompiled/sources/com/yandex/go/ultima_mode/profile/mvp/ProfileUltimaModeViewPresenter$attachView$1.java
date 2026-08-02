package com.yandex.go.ultima_mode.profile.mvp;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wgf0;
import defpackage.wls;
import defpackage.ygf0;
import defpackage.zgf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeViewPresenter$attachView$1", f = "ProfileUltimaModeViewPresenter.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ProfileUltimaModeViewPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ wgf0 $mvpView;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeViewPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((wgf0) this.receiver).g1((zgf0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUltimaModeViewPresenter$attachView$1(a aVar, wgf0 wgf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mvpView = wgf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileUltimaModeViewPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileUltimaModeViewPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            tpr d = com.yandex.go.coroutines.b.d(e.n(aVar.A.c, aVar.B.d, aVar.x.a(), new ProfileUltimaModeViewPresenter$uiStateFlow$1(aVar, null)), new ProfileUltimaModeViewPresenter$uiStateFlow$$inlined$start$1(ygf0.a, null));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.$mvpView, wgf0.class, "render", "render(Lcom/yandex/go/ultima_mode/profile/state/ProfileUltimaModeUiState;)V", 4);
            this.label = 1;
            if (e.k(d, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
