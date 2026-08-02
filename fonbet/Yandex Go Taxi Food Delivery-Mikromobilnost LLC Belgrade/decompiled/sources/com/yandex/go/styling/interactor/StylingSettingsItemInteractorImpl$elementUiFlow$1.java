package com.yandex.go.styling.interactor;

import defpackage.dob1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8r0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;
import ru.yandex.taxi.themes.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/themes/experiments/DarkThemeSwitchExperiment;", "exp", "Lru/yandex/taxi/themes/ThemeChangeMode;", "themeMode", "Lr8r0;", "<anonymous>", "(Lru/yandex/taxi/themes/experiments/DarkThemeSwitchExperiment;Lru/yandex/taxi/themes/ThemeChangeMode;)Lr8r0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.styling.interactor.StylingSettingsItemInteractorImpl$elementUiFlow$1", f = "StylingSettingsItemInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class StylingSettingsItemInteractorImpl$elementUiFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylingSettingsItemInteractorImpl$elementUiFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StylingSettingsItemInteractorImpl$elementUiFlow$1 stylingSettingsItemInteractorImpl$elementUiFlow$1 = new StylingSettingsItemInteractorImpl$elementUiFlow$1(this.this$0, (Continuation) obj3);
        stylingSettingsItemInteractorImpl$elementUiFlow$1.L$0 = (DarkThemeSwitchExperiment) obj;
        stylingSettingsItemInteractorImpl$elementUiFlow$1.L$1 = (ThemeChangeMode) obj2;
        return stylingSettingsItemInteractorImpl$elementUiFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DarkThemeSwitchExperiment darkThemeSwitchExperiment = (DarkThemeSwitchExperiment) this.L$0;
        ThemeChangeMode themeChangeMode = (ThemeChangeMode) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!darkThemeSwitchExperiment.b) {
            return new r8r0(false, 0);
        }
        ((g) this.this$0.c.get()).getClass();
        return new r8r0(true, dob1.a(g.b(darkThemeSwitchExperiment, themeChangeMode)));
    }
}
