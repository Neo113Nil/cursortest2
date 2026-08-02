package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.models.ShortcutClickInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8x;
import defpackage.tse;
import defpackage.vez0;
import defpackage.w4j0;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ClickedProductsInteractorImpl$addShortcutClickedJob$1", f = "ClickedProductsInteractorImpl.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ClickedProductsInteractorImpl$addShortcutClickedJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ yaf0 $screenType;
    final /* synthetic */ ShortcutClickInfo $shortcutClickInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickedProductsInteractorImpl$addShortcutClickedJob$1(a aVar, ShortcutClickInfo shortcutClickInfo, yaf0 yaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$shortcutClickInfo = shortcutClickInfo;
        this.$screenType = yaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClickedProductsInteractorImpl$addShortcutClickedJob$1(this.this$0, this.$shortcutClickInfo, this.$screenType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClickedProductsInteractorImpl$addShortcutClickedJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.shortcuts.impl.preferences.a aVar = this.this$0.b;
            ShortcutClickInfo shortcutClickInfo = this.$shortcutClickInfo;
            this.label = 1;
            if (aVar.a(shortcutClickInfo, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ru.yandex.taxi.jobs.b bVar = this.this$0.c;
        r8x r8xVar = new r8x();
        r8xVar.f("PRODUCT_SCREEN_TYPE_VALUE_ARG", vez0.D(this.$screenType));
        bVar.e(new w4j0("send_clicked_products", 0L, r8xVar, null, null, false, false, 0L, null, 2040));
        return zy11.a;
    }
}
