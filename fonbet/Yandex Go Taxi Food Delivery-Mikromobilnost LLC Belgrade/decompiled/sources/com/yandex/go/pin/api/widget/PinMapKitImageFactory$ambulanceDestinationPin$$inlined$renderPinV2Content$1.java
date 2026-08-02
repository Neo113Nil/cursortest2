package com.yandex.go.pin.api.widget;

import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import defpackage.c0c0;
import defpackage.f1h0;
import defpackage.i1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.widget.PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1", f = "PinMapKitImageFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1 extends SuspendLambda implements wls {
    final /* synthetic */ PinV2Component $pin;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1(PinV2Component pinV2Component, Continuation continuation, b bVar) {
        super(2, continuation);
        this.$pin = pinV2Component;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1(this.$pin, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return d.a(this.$pin, new i1c0(qje.t(xng0.textInvert, this.this$0.a), qje.t(xng0.error, this.this$0.a)), PinV2Component.Position.DEFAULT, new SourceOnMapControl.a(new c0c0(tje.y(f1h0.ic_flasher_fill_24, this.this$0.b.a)), null, null, false, false, null, null, 2046));
    }
}
