package com.yandex.go.tariffcard.ui;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o58;
import defpackage.rxy;
import defpackage.wls;
import defpackage.zg21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardHeaderFactory$getMapRoutes$2", f = "TariffOptionsCardHeaderFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardHeaderFactory$getMapRoutes$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardHeaderFactory$getMapRoutes$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffOptionsCardHeaderFactory$getMapRoutes$2 tariffOptionsCardHeaderFactory$getMapRoutes$2 = new TariffOptionsCardHeaderFactory$getMapRoutes$2(this.this$0, continuation);
        tariffOptionsCardHeaderFactory$getMapRoutes$2.L$0 = obj;
        return tariffOptionsCardHeaderFactory$getMapRoutes$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffOptionsCardHeaderFactory$getMapRoutes$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String b = this.this$0.l.b(str);
        e eVar = this.this$0;
        rxy rxyVar = eVar.k;
        return new BitmapDrawable(this.this$0.a.getResources(), new zg21(rxyVar.a, b, new o58(4, eVar, str)).get$image());
    }
}
