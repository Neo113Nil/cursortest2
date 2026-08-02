package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.address.models.Address;
import defpackage.avj0;
import defpackage.d0l0;
import defpackage.f1h0;
import defpackage.gx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.vng;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld0l0;", "route", "Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lgx0;", "<anonymous>", "(Ld0l0;Lru/yandex/taxi/theme/ThemeType;)Lgx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.AddressIconsStateInteractor$stateFlow$1", f = "AddressIconsStateInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AddressIconsStateInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressIconsStateInteractor$stateFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AddressIconsStateInteractor$stateFlow$1 addressIconsStateInteractor$stateFlow$1 = new AddressIconsStateInteractor$stateFlow$1(this.this$0, (Continuation) obj3);
        addressIconsStateInteractor$stateFlow$1.L$0 = (d0l0) obj;
        addressIconsStateInteractor$stateFlow$1.L$1 = (ThemeType) obj2;
        return addressIconsStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        ThemeType themeType = (ThemeType) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Address h = d0l0Var.h();
            String str = h != null ? h.getAddress().n : null;
            this.L$0 = null;
            this.L$1 = themeType;
            this.label = 1;
            obj = a.a(aVar, str, themeType, this);
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
        return new gx0((UiStateDrawableWrapper) obj, pkf.g(vng.t(f1h0.ic_destination_pin_two_flag_24, ((avj0) this.this$0.b).a), "destination_two_flags", themeType));
    }
}
