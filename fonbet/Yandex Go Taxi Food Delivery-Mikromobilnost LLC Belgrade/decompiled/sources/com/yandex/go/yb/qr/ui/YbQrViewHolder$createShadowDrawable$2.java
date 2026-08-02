package com.yandex.go.yb.qr.ui;

import android.graphics.drawable.Drawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yqg0;
import defpackage.zsg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.qr.ui.YbQrViewHolder$createShadowDrawable$2", f = "YbQrViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbQrViewHolder$createShadowDrawable$2 extends SuspendLambda implements wls {
    final /* synthetic */ Drawable $original;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbQrViewHolder$createShadowDrawable$2(a aVar, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$original = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbQrViewHolder$createShadowDrawable$2(this.this$0, this.$original, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbQrViewHolder$createShadowDrawable$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return this.this$0.f.e(this.$original, 0.0f, 0.0f, c.d(zsg0.yb_qr_button_shadow_radius, r8.a), c.a(yqg0.yb_qr_button_shadow_color, this.this$0.a), false);
    }
}
