package com.yandex.go.suggest.impl.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.cgw0;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.x7h0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$renderFloatingInputField$2$1", f = "FullscreenSuperappSuggestModalView.kt", l = {483}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class FullscreenSuperappSuggestModalView$renderFloatingInputField$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ FullscreenSuperappSuggestModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuperappSuggestModalView$renderFloatingInputField$2$1(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullscreenSuperappSuggestModalView;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullscreenSuperappSuggestModalView$renderFloatingInputField$2$1(this.this$0, this.$imageUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenSuperappSuggestModalView$renderFloatingInputField$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
        cgw0 binding;
        cgw0 binding2;
        cgw0 binding3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pavVar = this.this$0.imageLoader;
            g16 b = pavVar.b().b(this.$imageUrl);
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        Bitmap bitmap = (Bitmap) obj;
        zy11 zy11Var = zy11.a;
        if (bitmap != null) {
            binding = this.this$0.getBinding();
            Drawable drawable = binding.i.getDrawable();
            LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
            if (layerDrawable != null) {
                FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = this.this$0;
                layerDrawable.setDrawableByLayerId(x7h0.icon, new BitmapDrawable(fullscreenSuperappSuggestModalView.getResources(), bitmap));
                binding2 = fullscreenSuperappSuggestModalView.getBinding();
                binding2.i.setImageDrawable(layerDrawable);
                binding3 = fullscreenSuperappSuggestModalView.getBinding();
                binding3.i.invalidate();
            }
        }
        return zy11Var;
    }
}
