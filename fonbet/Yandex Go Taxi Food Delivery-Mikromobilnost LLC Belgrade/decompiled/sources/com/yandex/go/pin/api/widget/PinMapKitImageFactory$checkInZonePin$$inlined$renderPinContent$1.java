package com.yandex.go.pin.api.widget;

import android.graphics.drawable.Drawable;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import defpackage.c0c0;
import defpackage.ewb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tm91;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.widget.PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1", f = "PinMapKitImageFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ Drawable $drawable$inlined;
    final /* synthetic */ Drawable $drawable$inlined$1;
    final /* synthetic */ ewb0 $holder;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1(ewb0 ewb0Var, Continuation continuation, b bVar, Drawable drawable, Drawable drawable2) {
        super(2, continuation);
        this.$holder = ewb0Var;
        this.this$0 = bVar;
        this.$drawable$inlined = drawable;
        this.$drawable$inlined$1 = drawable2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1(this.$holder, continuation, this.this$0, this.$drawable$inlined, this.$drawable$inlined$1);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ewb0 ewb0Var = this.$holder;
        PinV1Component pinV1Component = ewb0Var.a;
        if (pinV1Component != null) {
            return tm91.c(pinV1Component, this.this$0.e.g(), false, Pin$State.IDLE, this.$drawable$inlined, "");
        }
        PinV2Component pinV2Component = ewb0Var.b;
        if (pinV2Component == null) {
            ny61.r("Missing pin render");
            return null;
        }
        return d.a(pinV2Component, this.this$0.e.i(), PinV2Component.Position.DEFAULT, new SourceOnMapControl.a(new c0c0(this.$drawable$inlined$1), null, null, false, false, null, null, 2046));
    }
}
