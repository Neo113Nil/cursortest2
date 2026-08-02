package com.yandex.go.chargers.multiorder.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ButtonViewHolder$bindImageLoading$1$1", f = "ChargersMultiOrderAdapter.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ButtonViewHolder$bindImageLoading$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonViewHolder$bindImageLoading$1$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonViewHolder$bindImageLoading$1$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonViewHolder$bindImageLoading$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ButtonComponent buttonComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BitmapDrawable bitmapDrawable = null;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            int i2 = a.T;
            ButtonComponent buttonComponent2 = (ButtonComponent) ((View) aVar.R);
            g16 b = aVar.S.b().b(this.$url);
            this.L$0 = buttonComponent2;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonComponent = buttonComponent2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            buttonComponent = (ButtonComponent) this.L$0;
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            a aVar2 = this.this$0;
            int i3 = a.T;
            bitmapDrawable = new BitmapDrawable(((ButtonComponent) ((View) aVar2.R)).getResources(), bitmap);
        }
        buttonComponent.setTextIcon(bitmapDrawable);
        return zy11.a;
    }
}
