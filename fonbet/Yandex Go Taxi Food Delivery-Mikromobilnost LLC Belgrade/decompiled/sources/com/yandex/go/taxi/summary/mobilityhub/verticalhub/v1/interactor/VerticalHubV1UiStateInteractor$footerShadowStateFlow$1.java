package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.h0s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zug0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lh0s;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)Lh0s;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor.VerticalHubV1UiStateInteractor$footerShadowStateFlow$1", f = "VerticalHubV1UiStateInteractor.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV1UiStateInteractor$footerShadowStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV1UiStateInteractor$footerShadowStateFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalHubV1UiStateInteractor$footerShadowStateFlow$1 verticalHubV1UiStateInteractor$footerShadowStateFlow$1 = new VerticalHubV1UiStateInteractor$footerShadowStateFlow$1(this.this$0, continuation);
        verticalHubV1UiStateInteractor$footerShadowStateFlow$1.L$0 = obj;
        return verticalHubV1UiStateInteractor$footerShadowStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubV1UiStateInteractor$footerShadowStateFlow$1) create((ThemeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType = (ThemeType) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.design.utils.b bVar = this.this$0.d;
            int i2 = zug0.buttons_container_top_radius;
            this.L$0 = themeType;
            this.label = 1;
            obj = bVar.f(i2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new h0s((Drawable) obj, themeType);
    }
}
