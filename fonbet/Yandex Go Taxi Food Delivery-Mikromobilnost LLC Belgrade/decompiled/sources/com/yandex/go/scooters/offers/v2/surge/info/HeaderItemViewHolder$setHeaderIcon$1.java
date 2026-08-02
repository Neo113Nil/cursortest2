package com.yandex.go.scooters.offers.v2.surge.info;

import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import defpackage.mam;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.HeaderItemViewHolder$setHeaderIcon$1", f = "ScootersSurgeInfoAdapter.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class HeaderItemViewHolder$setHeaderIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $iconColor;
    final /* synthetic */ String $iconUrl;
    final /* synthetic */ ImageView $imageView;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderItemViewHolder$setHeaderIcon$1(d dVar, String str, Integer num, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$iconUrl = str;
        this.$iconColor = num;
        this.$imageView = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HeaderItemViewHolder$setHeaderIcon$1(this.this$0, this.$iconUrl, this.$iconColor, this.$imageView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HeaderItemViewHolder$setHeaderIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.S;
            String str = this.$iconUrl;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
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
        Drawable drawable = (BitmapDrawable) obj;
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        mam.b(drawable, this.this$0.U, false);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        Integer num = this.$iconColor;
        paint.setColor(num != null ? num.intValue() : ru.yandex.taxi.design.utils.c.c(xng0.controlMinor, this.this$0.a));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawable});
        int i2 = this.this$0.U;
        layerDrawable.setLayerSize(0, i2, i2);
        layerDrawable.setLayerSize(1, drawable.getBounds().width(), drawable.getBounds().height());
        layerDrawable.setLayerGravity(1, 17);
        this.$imageView.setImageDrawable(layerDrawable);
        return zy11.a;
    }
}
