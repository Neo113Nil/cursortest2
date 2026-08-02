package com.yandex.go.flex.common.ui.theme;

import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/flex/common/api/FeedSdkTheme;", "themeType", "Lru/yandex/taxi/theme/ThemeType;", "appearanceMode", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.flex.common.ui.theme.FeedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1", f = "FeedSdkThemeInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class FeedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FeedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1 feedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1 = new FeedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1(3, (Continuation) obj3);
        feedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1.L$0 = (ThemeType) obj;
        feedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1.L$1 = (String) obj2;
        return feedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType = (ThemeType) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return d6z.O(themeType, str);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
