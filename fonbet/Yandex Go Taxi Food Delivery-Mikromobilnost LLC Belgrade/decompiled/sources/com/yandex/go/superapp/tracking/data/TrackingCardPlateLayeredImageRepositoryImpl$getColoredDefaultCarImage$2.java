package com.yandex.go.superapp.tracking.data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import defpackage.gic;
import defpackage.kdc;
import defpackage.m810;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rug0;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.z48;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.tracking.data.TrackingCardPlateLayeredImageRepositoryImpl$getColoredDefaultCarImage$2", f = "TrackingCardPlateLayeredImageRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardPlateLayeredImageRepositoryImpl$getColoredDefaultCarImage$2 extends SuspendLambda implements tls {
    final /* synthetic */ kdc $color;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardPlateLayeredImageRepositoryImpl$getColoredDefaultCarImage$2(a aVar, kdc kdcVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$color = kdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TrackingCardPlateLayeredImageRepositoryImpl$getColoredDefaultCarImage$2(this.this$0, this.$color, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TrackingCardPlateLayeredImageRepositoryImpl$getColoredDefaultCarImage$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int r = tje.r(rug0.superapp_tracking_card_car_image_width, this.this$0.a);
        int r2 = tje.r(rug0.superapp_tracking_card_car_image_height, this.this$0.a);
        int r3 = tje.r(rug0.superapp_tracking_card_car_image_car_width, this.this$0.a);
        a aVar = this.this$0;
        List<Pair> list = aVar.d.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Pair pair : list) {
            arrayList.add(new z48((CarIconPart$Layer) pair.getFirst(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(aVar.a.getResources(), ((Number) pair.getSecond()).intValue()), r3, m810.b((r3 / r4.getWidth()) * r4.getHeight()), true)));
        }
        a aVar2 = this.this$0;
        gic gicVar = aVar2.e;
        int m = s8o.m(this.$color, aVar2.a);
        int r4 = tje.r(rug0.superapp_tracking_card_car_image_left_padding, this.this$0.a);
        int r5 = tje.r(rug0.superapp_tracking_card_car_image_top_padding, this.this$0.a);
        gicVar.getClass();
        return new BitmapDrawable(this.this$0.a.getResources(), Bitmap.createScaledBitmap(gic.a(m, r, r2, r4, r5, arrayList), -r, r2, true));
    }
}
