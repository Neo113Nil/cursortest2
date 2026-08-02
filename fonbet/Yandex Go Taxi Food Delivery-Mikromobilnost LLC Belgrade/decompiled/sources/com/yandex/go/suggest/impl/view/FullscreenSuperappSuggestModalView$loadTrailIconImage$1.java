package com.yandex.go.suggest.impl.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$loadTrailIconImage$1", f = "FullscreenSuperappSuggestModalView.kt", l = {RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class FullscreenSuperappSuggestModalView$loadTrailIconImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ ImageView $view;
    int label;
    final /* synthetic */ FullscreenSuperappSuggestModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuperappSuggestModalView$loadTrailIconImage$1(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, String str, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullscreenSuperappSuggestModalView;
        this.$imageUrl = str;
        this.$view = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullscreenSuperappSuggestModalView$loadTrailIconImage$1(this.this$0, this.$imageUrl, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenSuperappSuggestModalView$loadTrailIconImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
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
        if (bitmap == null) {
            return zy11Var;
        }
        this.$view.setImageBitmap(bitmap);
        return zy11Var;
    }
}
