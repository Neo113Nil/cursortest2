package com.yandex.go.tariffcard.ui;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yix0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/theme/ThemeType;", "isForceDark", "", DivkitThemeChangeListener.THEME_VARIABLE_NAME}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsFadeThemeInteractor$fadeThemeFlow$1", f = "TariffOptionsFadeThemeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsFadeThemeInteractor$fadeThemeFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ yix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsFadeThemeInteractor$fadeThemeFlow$1(yix0 yix0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = yix0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TariffOptionsFadeThemeInteractor$fadeThemeFlow$1 tariffOptionsFadeThemeInteractor$fadeThemeFlow$1 = new TariffOptionsFadeThemeInteractor$fadeThemeFlow$1(this.this$0, (Continuation) obj3);
        tariffOptionsFadeThemeInteractor$fadeThemeFlow$1.Z$0 = booleanValue;
        tariffOptionsFadeThemeInteractor$fadeThemeFlow$1.L$0 = (ThemeType) obj2;
        return tariffOptionsFadeThemeInteractor$fadeThemeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        ThemeType themeType = (ThemeType) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.c.h()) {
            return z ? ThemeType.DARK : themeType;
        }
        return null;
    }
}
