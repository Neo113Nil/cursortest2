package com.yandex.go.tariffcard.ui;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardHeaderFactory$getBackgroundImage$2", f = "TariffOptionsCardHeaderFactory.kt", l = {309}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardHeaderFactory$getBackgroundImage$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $backgroundImageTag;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardHeaderFactory$getBackgroundImage$2(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$backgroundImageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffOptionsCardHeaderFactory$getBackgroundImage$2(this.this$0, this.$backgroundImageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardHeaderFactory$getBackgroundImage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.c;
            String str = this.$backgroundImageTag;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, this, 6);
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
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            if (bitmapDrawable.getIntrinsicWidth() == 0) {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && bitmapDrawable.getIntrinsicHeight() != 0) {
                return bitmapDrawable;
            }
        }
        return null;
    }
}
