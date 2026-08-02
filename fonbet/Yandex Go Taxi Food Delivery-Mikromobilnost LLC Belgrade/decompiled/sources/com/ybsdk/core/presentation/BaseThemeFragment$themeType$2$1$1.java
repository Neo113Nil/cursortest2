package com.ybsdk.core.presentation;

import android.content.Context;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.jy00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/core/design/theme/ThemeType;", "it", "Lzy11;", "<anonymous>", "(Lcom/ybsdk/core/design/theme/ThemeType;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.presentation.BaseThemeFragment$themeType$2$1$1", f = "BaseThemeFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseThemeFragment$themeType$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseThemeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseThemeFragment$themeType$2$1$1(BaseThemeFragment baseThemeFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = baseThemeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseThemeFragment$themeType$2$1$1 baseThemeFragment$themeType$2$1$1 = new BaseThemeFragment$themeType$2$1$1(this.this$0, continuation);
        baseThemeFragment$themeType$2$1$1.L$0 = obj;
        return baseThemeFragment$themeType$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseThemeFragment$themeType$2$1$1 baseThemeFragment$themeType$2$1$1 = (BaseThemeFragment$themeType$2$1$1) create((ThemeType) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseThemeFragment$themeType$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ThemeType themeType = (ThemeType) this.L$0;
        context = this.this$0.appCompatContext;
        if (context != null) {
            jy00.c(themeType.getStyleRes(), context);
        }
        return zy11.a;
    }
}
