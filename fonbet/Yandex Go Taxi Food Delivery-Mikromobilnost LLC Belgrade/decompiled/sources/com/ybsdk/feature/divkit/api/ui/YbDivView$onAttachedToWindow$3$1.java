package com.ybsdk.feature.divkit.api.ui;

import com.yandex.div.core.Div2Context;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.hnl;
import defpackage.ij91;
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
@mvg(c = "com.ybsdk.feature.divkit.api.ui.YbDivView$onAttachedToWindow$3$1", f = "YbDivView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class YbDivView$onAttachedToWindow$3$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ YbDivView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbDivView$onAttachedToWindow$3$1(YbDivView ybDivView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ybDivView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbDivView$onAttachedToWindow$3$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        YbDivView$onAttachedToWindow$3$1 ybDivView$onAttachedToWindow$3$1 = (YbDivView$onAttachedToWindow$3$1) create((ThemeType) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ybDivView$onAttachedToWindow$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hnl themeVariable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Div2Context div2Context = this.this$0.divContext;
        themeVariable = this.this$0.getThemeVariable();
        ij91.c(div2Context, themeVariable);
        return zy11.a;
    }
}
