package com.yandex.go.suggest.impl.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.cgw0;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$applyCartButtonState$1$1$1", f = "FullscreenSuperappSuggestModalView.kt", l = {396}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class FullscreenSuperappSuggestModalView$applyCartButtonState$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $iconTag;
    Object L$0;
    int label;
    final /* synthetic */ FullscreenSuperappSuggestModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuperappSuggestModalView$applyCartButtonState$1$1$1(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullscreenSuperappSuggestModalView;
        this.$iconTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullscreenSuperappSuggestModalView$applyCartButtonState$1$1$1(this.this$0, this.$iconTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenSuperappSuggestModalView$applyCartButtonState$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cgw0 binding;
        pav pavVar;
        ButtonComponent buttonComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            binding = this.this$0.getBinding();
            ButtonComponent buttonComponent2 = binding.b;
            pavVar = this.this$0.imageLoader;
            g16 b = pavVar.b().b(this.$iconTag);
            this.L$0 = buttonComponent2;
            this.label = 1;
            Object b2 = ru.yandex.taxi.utils.a.b(b, this);
            if (b2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonComponent = buttonComponent2;
            obj = b2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buttonComponent = (ButtonComponent) this.L$0;
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        buttonComponent.setTextIcon(bitmap != null ? new BitmapDrawable(this.this$0.getResources(), bitmap) : null);
        return zy11.a;
    }
}
